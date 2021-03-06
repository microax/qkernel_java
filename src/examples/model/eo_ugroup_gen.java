/* eo_ugroup_gen.java
 *
 * THE FOLLOWING CODE IS AUTO GENERATED BY GENDB SCRIPT 
 * !!!!!!!!!!!!  DO NOT MODIFY THIS FILE !!!!!!!!!!!
 */
package com.qkernel.examples.model;

import java.lang.*;
import java.sql.*;
import java.util.*;

import com.qkernel.*;


@SuppressWarnings({"unchecked", "fallthrough", "serial" })
/************************************************************
 * An entity object for the db table ugroup
 * 
 * 
 * @author Initially created by EntityObjectBuilder
 * @version $Revision$ 
 ************************************************************
 */
public abstract class eo_ugroup_gen extends EntityObject
{

    public final static String FIELD_UGROUPID = "ugroupId";
    public final static String FIELD_UGROUPNAME = "ugroupName";

    /****************************************************
     * find(): This method implements find by primary key
     * key for the table ugroup.
     * If it doesn't find the object in the existing 
     * cache, it loads the necessary data from the db.
     *
     * @param id The primary key value for the record we
     *  searching for
     * @return a vo_ugroup object, representing
     *  the record
     ****************************************************
     */
    public vo_ugroup find(int id)
    {
        vo_ugroup e = findInCache(id);

        if(e == null)
        {
            // Try to load cache first
            load(id);
            return(findInCache(id));
        }
        else 
        {
            // return cache value
            return(e);
        }
    }

    /*****************************************************
     * This method checks the cache for the requested item
     *
     * @param id the primary key of the record we're 
     *  looking for
     *
     * @return a vo_ugroup that represents the 
     *  record or null, if it doesn't exist
     *
     *****************************************************
     */
    public vo_ugroup findInCache(int id)
    {
        vo_ugroup e = null;
        e = (vo_ugroup)entityCache.get(new Integer(id));
        return(e);
    }

    /****************************************************
     * find(): This method implements find by primary key
     * key for the table ugroup.
     * If it doesn't find the object in the existing 
     * cache, it loads the necessary data from the db.
     *
     * @param id The primary key value for the record we
     *  searching for
     * @return a vo_ugroup object, representing
     *  the record
     ****************************************************
     */
    public vo_ugroup find(String id)
    {
        vo_ugroup e = findInCache(id);

        if(e == null)
        {
            // Try to load cache first
            load(id);
            return(findInCache(id));
        }
        else 
        {
            // return cache value
            return(e);
        }
    }

    /*****************************************************
     * This method checks the cache for the requested item
     *
     * @param id the primary key of the record we're 
     *  looking for
     *
     * @return a vo_ugroup that represents the 
     *  record or null, if it doesn't exist
     *
     *****************************************************
     */
    public vo_ugroup findInCache(String id)
    {
        vo_ugroup e = null;
        e = (vo_ugroup)entityCache.get(id);
        return(e);
    }

    /*****************************************************
     * This function returns an ArrayList  of all Value 
     * Objects in this Entity Object
     * @return an ArrayList of all the vo_ugroup 
     *  objects
     *
     *****************************************************
     */
    public ArrayList find()
    {
        String query = "SELECT * FROM ugroup ";
        ArrayList al = new ArrayList();
        executeQuery(query, "setEntity", al);
        return al;
    }

    /*****************************************************
     * This function returns an ArrayList  of all Value 
     * Objects based on query
     * @return an ArrayList of all the vo_ugroup 
     *  objects
     *
     *****************************************************
     */
    public ArrayList executeQueryList(String query)
    {
        ArrayList al = new ArrayList();
        executeQuery(query, "setEntity", al);
        return al;
    }

    /*****************************************************
     * This function returns an ArrayList  of all Value 
     * Objects based on query
     * @return an ArrayList of all the vo_ugroup 
     *  objects
     *
     *****************************************************
     */
    public ArrayList executeQueryList(String query, String mapper)
    {
        ArrayList al = new ArrayList();
        executeQuery(query, mapper, al);
        return al;
    }

    /****************************************************
     * executeQueryObject(): This method implements 
     * executeQuery for the table ugroup.
     * -- and returns vo_ugroup  
     * @param query string
     * @return a vo_ugroup object
     ****************************************************
     */
    public vo_ugroup executeQueryObject(String query)
    {
        Vector vec = new Vector();
        executeQuery(query, "setEntityV", vec );
        Enumeration enm = vec.elements();
        if(enm.hasMoreElements())
            return((vo_ugroup)enm.nextElement());
        else
            return(null);
    }

    /****************************************************
     * executeQueryObject(): This method implements 
     * executeQuery for the table ugroup.
     * -- and returns vo_ugroup  
     * @param query string
     * @return a vo_ugroup object
     ****************************************************
     */
    public vo_ugroup executeQueryObject(String query, String mapper)
    {
        Vector vec = new Vector();
        executeQuery(query, mapper, vec );
        Enumeration enm = vec.elements();
        if(enm.hasMoreElements())
            return((vo_ugroup)enm.nextElement());
        else
            return(null);
    }

    /*****************************************************
     * This function takes the current row in a ResultSet,
     * creates a vo_ugroup object with the data, 
     * @param rs A result set of a query on the ugroup table
     *****************************************************
     */
     public void setEntity(ResultSet rs, ArrayList al) throws SQLException
     {
         vo_ugroup e = entityRow(rs);
         al.add(e);
     }

    /*****************************************************
     * This function takes the current row in a ResultSet,
     * creates a vo_ugroup object with the data, 
     * @param rs A result set of a query on the ugroup table
     *****************************************************
     */
     public void setEntityV(ResultSet rs, Vector vec) throws SQLException
     {
         vo_ugroup e = entityRow(rs);
         vec.addElement(e);
     }

    /*****************************************************
     * This function is similar to the setEntity() method.
     * It takes the current row in a ResultSet,
     * creates a vo_ugroup object with the data, 
     * but instead of placing it in the cache,
     * it places it in the ArrayList that is passed in.
    *
     * @param al An ArrayList to place the resulting vo_ugroup object into.
     * @param rs A result set of a query on the ugroup table
     * @see #setEntity()
     ****************************************************
     */
    public void setEntityC(ResultSet rs) throws SQLException
    {
        vo_ugroup e = entityRow(rs);
        entityCache.put(new Integer(e.ugroupId), e);
     }

    /****************************************************
     * This function maps an SQL row to a Value Object
     *
     * @param rs a ResultSet that contains the record to be mapped
     * @return a vo_ugroup value object
     ****************************************************
     */
    public vo_ugroup entityRow(ResultSet rs) throws SQLException
    {
        vo_ugroup e = new vo_ugroup();
        e.ugroupId= rs.getInt(FIELD_UGROUPID);
        e.ugroupName= rs.getString(FIELD_UGROUPNAME);
        return(e);
    }

    /****************************************************
     * This method inserts a new record into the table,
     * but DOES NOT return the new ID or a reference object
     * @param vo_ugroup a value object to be written
     *  to the DB
     * @see #insert2()
     ****************************************************
     */
    public void insert(vo_ugroup e){
        StringBuffer qsb=new StringBuffer();
        qsb.append("INSERT INTO ugroup(");
        qsb.append(FIELD_UGROUPNAME+")");
        qsb.append("VALUES(");
        qsb.append("'").append(SqlSafe.sqlSafe( e.ugroupName)).append("')");


        executeUpdate(qsb.toString());
    }

    /****************************************************
     * This method inserts a new record into the table,
     * using the local entityQueue
     * @param vo_ugroup a value object to be written
     *  to the DB
     * @see #insert2()
     ****************************************************
     */
    public void insertQueue(vo_ugroup e){
        StringBuffer qsb=new StringBuffer();
        qsb.append("INSERT INTO ugroup(");
        qsb.append(FIELD_UGROUPNAME+")");
        qsb.append("VALUES(");
        qsb.append("'").append(SqlSafe.sqlSafe( e.ugroupName)).append("')");


        entityQueue.put(qsb.toString());
    }

    /****************************************************
     * This method inserts a new record into the table,
     * AND returns a reference object with the new
     * auto-generated PK;
     *
     * @param vo_ugroup a value object to be written to the DB
      * @return a vo_ugroup object that represents
     *  the original object, with the addition of the primary key
     * @see #insert()
     ****************************************************
     */
    public vo_ugroup insert2(vo_ugroup e)
    {
        vo_ugroup e1=(vo_ugroup) e.clone();

        StringBuffer qsb=new StringBuffer();
        qsb.append("INSERT INTO ugroup(");
        qsb.append(FIELD_UGROUPNAME+")");
        qsb.append("VALUES(");
        qsb.append("'").append(SqlSafe.sqlSafe( e.ugroupName)).append("')");


        try
        {
            Connection conn    = entityDbPool.getConnection();
            Statement stmt     = conn.createStatement();
            stmt.executeUpdate(qsb.toString());
            //------------------------------------------------------------------
            // Retrieve new AUTO_INCREMENT ugroupId 
            //------------------------------------------------------------------
            ResultSet r = stmt.executeQuery("SELECT LAST_INSERT_ID() AS cId");
            r.next();
            e1.ugroupId= r.getInt("cId");
            stmt.close();
            entityDbPool.freeConnection(conn);
        }
        catch(Exception ept)
        {
            daemon.eventLog.sendMessage(ept);
        }
        return(e1);
    }

    /****************************************************
     * This function updates the record in the database
     * who's primary key matches the 
     * ugroupId value of the passed-in 
     * vo_ugroup object.
     *
     * @param e a vo_ugroup object
     ****************************************************
     */
    public void update(vo_ugroup e)
    {
        StringBuffer qsb=new StringBuffer();
        qsb.append("UPDATE ugroup ").append("SET ");
        qsb.append(FIELD_UGROUPNAME+"='").append(SqlSafe.sqlSafe( e.ugroupName)).append("'");
        qsb.append(" WHERE ");
                qsb.append("ugroupId="+e.ugroupId);

        executeUpdate(qsb.toString());
    }

    /****************************************************
     * This function updates the record in the database
     * who's primary key matches the 
     * ugroupId value of the passed-in 
     * vo_ugroup object.
     *
     * @param e a vo_ugroup object
     ****************************************************
     */
    public void updateQueue(vo_ugroup e)
    {
        StringBuffer qsb=new StringBuffer();
        qsb.append("UPDATE ugroup ").append("SET ");
        qsb.append(FIELD_UGROUPNAME+"='").append(SqlSafe.sqlSafe( e.ugroupName)).append("'");
        qsb.append(" WHERE ");
                qsb.append("ugroupId="+e.ugroupId);

        entityQueue.put(qsb.toString());
    }

    /****************************************************
     * delete(id): This method deletes the object in the
     * who's primary ket matches the value passed in
     * 
     * @param id a Int representing the primary key
     ****************************************************
     */
    public void delete(int id)
    {
        String query;
        query="DELETE FROM ugroup WHERE ugroupId="+id;
        executeUpdate(query);
    }

    /****************************************************
     * This is the default load method that is called by
     * the container at startup
     ****************************************************
     */
    public void load()
    {
         //This is empty for now

    }

    /****************************************************
     * This function loads an individual record into the
     * cache
     *
     * @param id The primary key to use for record lookup
     ****************************************************
     */
    public void load(int id)
    {
       String qs=
           "SELECT * FROM ugroup WHERE ugroupId="+id;

       executeQuery(qs,"setEntityC");
    }

    /****************************************************
     * This function loads an individual record into the
     * cache
     *
     * @param id The  key to use for record lookup
     ****************************************************
     */
    public void load(String id)
    {
         //Override this method to implement cache scheme

    }

    /****************************************************
     * This function returns the number of records
     * in the table represented by this entity. 
     * 
     * @return The number of records in the table
     ****************************************************
     */
    public int getCount()
    {
        int count=0;
        String qs=
            "SELECT COUNT(ugroupId) AS Count FROM ugroup ";
        ResultSet r=executeQuery(qs);
        try
        {
            r.next();
            count=r.getInt("Count");
            closeResultSet(r);
        }
        catch(Exception e)
         {
            daemon.event_log.sendMessage("Can't retrieve ResultSet because: "+e.getMessage());
        }
        return(count);
    }

    /****************************************************
     * This function is called by the daemon when this 
     * Entity Object is initialized
     * Sub-class should invoke super.init() then:
     * entityCache.start(t)
     * useLocalEntityQueue() (if you want a local queue)
     ****************************************************
     */
    public void init()
    {
        entityQueue.start();          // Start Global Entity Queue
        //entityCache.start(30);      // Start Entity Cache
        //useLocalEntityQueue();      // Set and Start Local Entity Queue
    }

}

