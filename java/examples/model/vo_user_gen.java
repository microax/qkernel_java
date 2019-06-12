/* vo_user_gen 
 *
 * THE FOLLOWING CODE IS AUTO GENERATED BY GENDB SCRIPT 
 * !!!!!!!!!!!!  DO NOT MODIFY THIS FILE !!!!!!!!!!!
 */
package com.qkernel.examples.model;

import com.qkernel.*;

@SuppressWarnings({"unchecked", "fallthrough", "serial" })
/************************************************************
 * A ValueObject for the db table user
 * @author Initially created by ValueObjectBuilder
 * @version $Revision$ 
 ************************************************************
 */
public abstract class vo_user_gen extends CloneableObject
{

    /** userId database type:INT */
    public int userId=0;

    /** accountId database type:INT */
    public int accountId=0;

    /** userName database type:VARCHAR */
    public String userName="";

    /** userPassword database type:BLOB */
    public String userPassword="";

    /** userPasscode database type:VARCHAR */
    public String userPasscode="";

    /** userFirstName database type:VARCHAR */
    public String userFirstName="";

    /** userLastName database type:VARCHAR */
    public String userLastName="";

    /** userIsJukebox database type:VARCHAR */
    public String userIsJukebox="";

    /** userNickName database type:VARCHAR */
    public String userNickName="";

    /** userLikes database type:VARCHAR */
    public String userLikes="";

    /** userWorkplace database type:VARCHAR */
    public String userWorkplace="";

    /** userWorkHours database type:VARCHAR */
    public String userWorkHours="";

    /** userPhoto database type:VARCHAR */
    public String userPhoto="";

    /** userLongitude database type:VARCHAR */
    public String userLongitude="";

    /** userLatitude database type:VARCHAR */
    public String userLatitude="";

    /** userLastLogin database type:DATETIME */
    public String userLastLogin="";

    /** userCreated database type:DATETIME */
    public String userCreated="";

    /** userModified database type:DATETIME */
    public String userModified="";

    /** userStatus database type:VARCHAR */
    public String userStatus="";

    /**
     * Gets a string representation of the requested field, or an empty string if not available
     * @param field - field name being requested (matching defined field name in the entity object)
     * @return String representation of the field requested
     */
    public String getString(String field)
    {
        if(field.equals(eo_user.FIELD_USERID)) {return Integer.toString(userId);}
        if(field.equals(eo_user.FIELD_ACCOUNTID)) {return Integer.toString(accountId);}
        if(field.equals(eo_user.FIELD_USERNAME)) {return userName==null ? "" : userName;}
        if(field.equals(eo_user.FIELD_USERPASSWORD)) {return userPassword==null ? "" : userPassword;}
        if(field.equals(eo_user.FIELD_USERPASSCODE)) {return userPasscode==null ? "" : userPasscode;}
        if(field.equals(eo_user.FIELD_USERFIRSTNAME)) {return userFirstName==null ? "" : userFirstName;}
        if(field.equals(eo_user.FIELD_USERLASTNAME)) {return userLastName==null ? "" : userLastName;}
        if(field.equals(eo_user.FIELD_USERISJUKEBOX)) {return userIsJukebox==null ? "" : userIsJukebox;}
        if(field.equals(eo_user.FIELD_USERNICKNAME)) {return userNickName==null ? "" : userNickName;}
        if(field.equals(eo_user.FIELD_USERLIKES)) {return userLikes==null ? "" : userLikes;}
        if(field.equals(eo_user.FIELD_USERWORKPLACE)) {return userWorkplace==null ? "" : userWorkplace;}
        if(field.equals(eo_user.FIELD_USERWORKHOURS)) {return userWorkHours==null ? "" : userWorkHours;}
        if(field.equals(eo_user.FIELD_USERPHOTO)) {return userPhoto==null ? "" : userPhoto;}
        if(field.equals(eo_user.FIELD_USERLONGITUDE)) {return userLongitude==null ? "" : userLongitude;}
        if(field.equals(eo_user.FIELD_USERLATITUDE)) {return userLatitude==null ? "" : userLatitude;}
        if(field.equals(eo_user.FIELD_USERLASTLOGIN)) {return userLastLogin==null ? "" : userLastLogin;}
        if(field.equals(eo_user.FIELD_USERCREATED)) {return userCreated==null ? "" : userCreated;}
        if(field.equals(eo_user.FIELD_USERMODIFIED)) {return userModified==null ? "" : userModified;}
        if(field.equals(eo_user.FIELD_USERSTATUS)) {return userStatus==null ? "" : userStatus;}
        return "";
    }

    /**
     * Sets the field value if it is available in the given Hashtable
     * @param values - list of fields and their associated values to be set
     */
    public void setFields(QMessage values)
    {
        if(values.containsKey(eo_user.FIELD_USERID)) { userId = values.getInt(eo_user.FIELD_USERID);}
        if(values.containsKey(eo_user.FIELD_ACCOUNTID)) { accountId = values.getInt(eo_user.FIELD_ACCOUNTID);}
        if(values.containsKey(eo_user.FIELD_USERNAME)) { userName = values.getString(eo_user.FIELD_USERNAME);}
        if(values.containsKey(eo_user.FIELD_USERPASSWORD)) { userPassword = values.getString(eo_user.FIELD_USERPASSWORD);}
        if(values.containsKey(eo_user.FIELD_USERPASSCODE)) { userPasscode = values.getString(eo_user.FIELD_USERPASSCODE);}
        if(values.containsKey(eo_user.FIELD_USERFIRSTNAME)) { userFirstName = values.getString(eo_user.FIELD_USERFIRSTNAME);}
        if(values.containsKey(eo_user.FIELD_USERLASTNAME)) { userLastName = values.getString(eo_user.FIELD_USERLASTNAME);}
        if(values.containsKey(eo_user.FIELD_USERISJUKEBOX)) { userIsJukebox = values.getString(eo_user.FIELD_USERISJUKEBOX);}
        if(values.containsKey(eo_user.FIELD_USERNICKNAME)) { userNickName = values.getString(eo_user.FIELD_USERNICKNAME);}
        if(values.containsKey(eo_user.FIELD_USERLIKES)) { userLikes = values.getString(eo_user.FIELD_USERLIKES);}
        if(values.containsKey(eo_user.FIELD_USERWORKPLACE)) { userWorkplace = values.getString(eo_user.FIELD_USERWORKPLACE);}
        if(values.containsKey(eo_user.FIELD_USERWORKHOURS)) { userWorkHours = values.getString(eo_user.FIELD_USERWORKHOURS);}
        if(values.containsKey(eo_user.FIELD_USERPHOTO)) { userPhoto = values.getString(eo_user.FIELD_USERPHOTO);}
        if(values.containsKey(eo_user.FIELD_USERLONGITUDE)) { userLongitude = values.getString(eo_user.FIELD_USERLONGITUDE);}
        if(values.containsKey(eo_user.FIELD_USERLATITUDE)) { userLatitude = values.getString(eo_user.FIELD_USERLATITUDE);}
        if(values.containsKey(eo_user.FIELD_USERLASTLOGIN)) { userLastLogin = values.getString(eo_user.FIELD_USERLASTLOGIN);}
        if(values.containsKey(eo_user.FIELD_USERCREATED)) { userCreated = values.getString(eo_user.FIELD_USERCREATED);}
        if(values.containsKey(eo_user.FIELD_USERMODIFIED)) { userModified = values.getString(eo_user.FIELD_USERMODIFIED);}
        if(values.containsKey(eo_user.FIELD_USERSTATUS)) { userStatus = values.getString(eo_user.FIELD_USERSTATUS);}
    }

}

