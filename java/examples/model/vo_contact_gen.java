/* vo_contact_gen 
 *
 * THE FOLLOWING CODE IS AUTO GENERATED BY GENDB SCRIPT 
 * !!!!!!!!!!!!  DO NOT MODIFY THIS FILE !!!!!!!!!!!
 */
package com.qkernel.examples.model;

import com.qkernel.*;

@SuppressWarnings({"unchecked", "fallthrough", "serial" })
/************************************************************
 * A ValueObject for the db table contact
 * @author Initially created by ValueObjectBuilder
 * @version $Revision$ 
 ************************************************************
 */
public abstract class vo_contact_gen extends CloneableObject
{

    /** contactId database type:INT */
    public int contactId=0;

    /** contactName database type:VARCHAR */
    public String contactName="";

    /** contactEmail database type:VARCHAR */
    public String contactEmail="";

    /** contactPhone database type:VARCHAR */
    public String contactPhone="";

    /** contactCompany database type:VARCHAR */
    public String contactCompany="";

    /** contactSubject database type:VARCHAR */
    public String contactSubject="";

    /** contactMessage database type:BLOB */
    public String contactMessage="";

    /** contactSource database type:VARCHAR */
    public String contactSource="";

    /** contactCreated database type:DATETIME */
    public String contactCreated="";

    /** contactModified database type:DATETIME */
    public String contactModified="";

    /** contactStatus database type:VARCHAR */
    public String contactStatus="";

    /**
     * Gets a string representation of the requested field, or an empty string if not available
     * @param field - field name being requested (matching defined field name in the entity object)
     * @return String representation of the field requested
     */
    public String getString(String field)
    {
        if(field.equals(eo_contact.FIELD_CONTACTID)) {return Integer.toString(contactId);}
        if(field.equals(eo_contact.FIELD_CONTACTNAME)) {return contactName==null ? "" : contactName;}
        if(field.equals(eo_contact.FIELD_CONTACTEMAIL)) {return contactEmail==null ? "" : contactEmail;}
        if(field.equals(eo_contact.FIELD_CONTACTPHONE)) {return contactPhone==null ? "" : contactPhone;}
        if(field.equals(eo_contact.FIELD_CONTACTCOMPANY)) {return contactCompany==null ? "" : contactCompany;}
        if(field.equals(eo_contact.FIELD_CONTACTSUBJECT)) {return contactSubject==null ? "" : contactSubject;}
        if(field.equals(eo_contact.FIELD_CONTACTMESSAGE)) {return contactMessage==null ? "" : contactMessage;}
        if(field.equals(eo_contact.FIELD_CONTACTSOURCE)) {return contactSource==null ? "" : contactSource;}
        if(field.equals(eo_contact.FIELD_CONTACTCREATED)) {return contactCreated==null ? "" : contactCreated;}
        if(field.equals(eo_contact.FIELD_CONTACTMODIFIED)) {return contactModified==null ? "" : contactModified;}
        if(field.equals(eo_contact.FIELD_CONTACTSTATUS)) {return contactStatus==null ? "" : contactStatus;}
        return "";
    }

    /**
     * Sets the field value if it is available in the given Hashtable
     * @param values - list of fields and their associated values to be set
     */
    public void setFields(QMessage values)
    {
        if(values.containsKey(eo_contact.FIELD_CONTACTID)) { contactId = values.getInt(eo_contact.FIELD_CONTACTID);}
        if(values.containsKey(eo_contact.FIELD_CONTACTNAME)) { contactName = values.getString(eo_contact.FIELD_CONTACTNAME);}
        if(values.containsKey(eo_contact.FIELD_CONTACTEMAIL)) { contactEmail = values.getString(eo_contact.FIELD_CONTACTEMAIL);}
        if(values.containsKey(eo_contact.FIELD_CONTACTPHONE)) { contactPhone = values.getString(eo_contact.FIELD_CONTACTPHONE);}
        if(values.containsKey(eo_contact.FIELD_CONTACTCOMPANY)) { contactCompany = values.getString(eo_contact.FIELD_CONTACTCOMPANY);}
        if(values.containsKey(eo_contact.FIELD_CONTACTSUBJECT)) { contactSubject = values.getString(eo_contact.FIELD_CONTACTSUBJECT);}
        if(values.containsKey(eo_contact.FIELD_CONTACTMESSAGE)) { contactMessage = values.getString(eo_contact.FIELD_CONTACTMESSAGE);}
        if(values.containsKey(eo_contact.FIELD_CONTACTSOURCE)) { contactSource = values.getString(eo_contact.FIELD_CONTACTSOURCE);}
        if(values.containsKey(eo_contact.FIELD_CONTACTCREATED)) { contactCreated = values.getString(eo_contact.FIELD_CONTACTCREATED);}
        if(values.containsKey(eo_contact.FIELD_CONTACTMODIFIED)) { contactModified = values.getString(eo_contact.FIELD_CONTACTMODIFIED);}
        if(values.containsKey(eo_contact.FIELD_CONTACTSTATUS)) { contactStatus = values.getString(eo_contact.FIELD_CONTACTSTATUS);}
    }

}

