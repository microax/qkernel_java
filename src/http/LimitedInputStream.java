package com.qkernel.http;

import java.io.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.net.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;

/**
 * The {@code LimitedInputStream} provides access to a limited number
 * of consecutive bytes from the underlying InputStream, starting at its
 * current position. If this limit is reached, it behaves as though the end
 * of stream has been reached (although the underlying stream remains open
 * and may contain additional data).
 */
public static class LimitedInputStream extends FilterInputStream
{

    protected long limit; // decremented when read, until it reaches zero
    protected boolean prematureEndException;

    /**
     * Constructs a LimitedInputStream with the given underlying
     * input stream and limit.
     *
     * @param in the underlying input stream
     * @param limit the maximum number of bytes that may be consumed from
     *        the underlying stream before this stream ends. If zero or
     *        negative, this stream will be at its end from initialization.
     * @param prematureEndException specifies the stream's behavior when
     *        the underlying stream end is reached before the limit is
     *        reached: if true, an exception is thrown, otherwise this
     *        stream reaches its end as well (i.e. read() returns -1)
     * @throws NullPointerException if the given stream is null
     */
    public LimitedInputStream(InputStream in, long limit, boolean prematureEndException)
    {
        super(in);
        if (in == null)
            throw new NullPointerException("input stream is null");
        this.limit = limit < 0 ? 0 : limit;
        this.prematureEndException = prematureEndException;
    }

    @Override
    public int read() throws IOException
    {
        int res = limit == 0 ? -1 : in.read();
        if (res == -1 && limit > 0 && prematureEndException)
            throw new IOException("unexpected end of stream");
        limit = res == -1 ? 0 : limit - 1;
        return res;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException
    {
        int res = limit == 0 ? -1 : in.read(b, off, len > limit ? (int)limit : len);
        if (res == -1 && limit > 0 && prematureEndException)
            throw new IOException("unexpected end of stream");
        limit = res == -1 ? 0 : limit - res;
        return res;
    }

    @Override
    public long skip(long n) throws IOException
    {
        long res = in.skip(n > limit ? limit : n);
        limit -= res;
        return res;
    }

    @Override
    public int available() throws IOException
    {
        int res = in.available();
        return res > limit ? (int)limit : res;
    }

    @Override
    public boolean markSupported()
    {
        return false;
    }

    @Override
    public void close()
    {
        limit = 0; // end this stream, but don't close the underlying stream
    }
}
