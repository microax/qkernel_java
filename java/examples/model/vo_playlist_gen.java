/* vo_playlist_gen 
 *
 * THE FOLLOWING CODE IS AUTO GENERATED BY GENDB SCRIPT 
 * !!!!!!!!!!!!  DO NOT MODIFY THIS FILE !!!!!!!!!!!
 */
package com.qkernel.examples.model;

import com.qkernel.*;

@SuppressWarnings({"unchecked", "fallthrough", "serial" })
/************************************************************
 * A ValueObject for the db table playlist
 * @author Initially created by ValueObjectBuilder
 * @version $Revision$ 
 ************************************************************
 */
public abstract class vo_playlist_gen extends CloneableObject
{

    /** playlistId database type:INT */
    public int playlistId=0;

    /** userId database type:INT */
    public int userId=0;

    /** mediaId database type:INT */
    public int mediaId=0;

    /** playlistUserId database type:INT */
    public int playlistUserId=0;

    /** playlistOrder database type:INT */
    public int playlistOrder=0;

    /** playlistCreated database type:DATETIME */
    public String playlistCreated="";

    /** playlistModified database type:DATETIME */
    public String playlistModified="";

    /** playlistStatus database type:VARCHAR */
    public String playlistStatus="";

    /**
     * Gets a string representation of the requested field, or an empty string if not available
     * @param field - field name being requested (matching defined field name in the entity object)
     * @return String representation of the field requested
     */
    public String getString(String field)
    {
        if(field.equals(eo_playlist.FIELD_PLAYLISTID)) {return Integer.toString(playlistId);}
        if(field.equals(eo_playlist.FIELD_USERID)) {return Integer.toString(userId);}
        if(field.equals(eo_playlist.FIELD_MEDIAID)) {return Integer.toString(mediaId);}
        if(field.equals(eo_playlist.FIELD_PLAYLISTUSERID)) {return Integer.toString(playlistUserId);}
        if(field.equals(eo_playlist.FIELD_PLAYLISTORDER)) {return Integer.toString(playlistOrder);}
        if(field.equals(eo_playlist.FIELD_PLAYLISTCREATED)) {return playlistCreated==null ? "" : playlistCreated;}
        if(field.equals(eo_playlist.FIELD_PLAYLISTMODIFIED)) {return playlistModified==null ? "" : playlistModified;}
        if(field.equals(eo_playlist.FIELD_PLAYLISTSTATUS)) {return playlistStatus==null ? "" : playlistStatus;}
        return "";
    }

    /**
     * Sets the field value if it is available in the given Hashtable
     * @param values - list of fields and their associated values to be set
     */
    public void setFields(QMessage values)
    {
        if(values.containsKey(eo_playlist.FIELD_PLAYLISTID)) { playlistId = values.getInt(eo_playlist.FIELD_PLAYLISTID);}
        if(values.containsKey(eo_playlist.FIELD_USERID)) { userId = values.getInt(eo_playlist.FIELD_USERID);}
        if(values.containsKey(eo_playlist.FIELD_MEDIAID)) { mediaId = values.getInt(eo_playlist.FIELD_MEDIAID);}
        if(values.containsKey(eo_playlist.FIELD_PLAYLISTUSERID)) { playlistUserId = values.getInt(eo_playlist.FIELD_PLAYLISTUSERID);}
        if(values.containsKey(eo_playlist.FIELD_PLAYLISTORDER)) { playlistOrder = values.getInt(eo_playlist.FIELD_PLAYLISTORDER);}
        if(values.containsKey(eo_playlist.FIELD_PLAYLISTCREATED)) { playlistCreated = values.getString(eo_playlist.FIELD_PLAYLISTCREATED);}
        if(values.containsKey(eo_playlist.FIELD_PLAYLISTMODIFIED)) { playlistModified = values.getString(eo_playlist.FIELD_PLAYLISTMODIFIED);}
        if(values.containsKey(eo_playlist.FIELD_PLAYLISTSTATUS)) { playlistStatus = values.getString(eo_playlist.FIELD_PLAYLISTSTATUS);}
    }

}

