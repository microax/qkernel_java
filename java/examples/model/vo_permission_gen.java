/* vo_permission_gen 
 *
 * THE FOLLOWING CODE IS AUTO GENERATED BY GENDB SCRIPT 
 * !!!!!!!!!!!!  DO NOT MODIFY THIS FILE !!!!!!!!!!!
 */
package com.qkernel.examples.model;

import com.qkernel.*;

@SuppressWarnings({"unchecked", "fallthrough", "serial" })
/************************************************************
 * A ValueObject for the db table permission
 * @author Initially created by ValueObjectBuilder
 * @version $Revision$ 
 ************************************************************
 */
public abstract class vo_permission_gen extends CloneableObject
{

    /** permissionId database type:INT */
    public int permissionId=0;

    /** permissionName database type:VARCHAR */
    public String permissionName="";

    /**
     * Gets a string representation of the requested field, or an empty string if not available
     * @param field - field name being requested (matching defined field name in the entity object)
     * @return String representation of the field requested
     */
    public String getString(String field)
    {
        if(field.equals(eo_permission.FIELD_PERMISSIONID)) {return Integer.toString(permissionId);}
        if(field.equals(eo_permission.FIELD_PERMISSIONNAME)) {return permissionName==null ? "" : permissionName;}
        return "";
    }

    /**
     * Sets the field value if it is available in the given Hashtable
     * @param values - list of fields and their associated values to be set
     */
    public void setFields(QMessage values)
    {
        if(values.containsKey(eo_permission.FIELD_PERMISSIONID)) { permissionId = values.getInt(eo_permission.FIELD_PERMISSIONID);}
        if(values.containsKey(eo_permission.FIELD_PERMISSIONNAME)) { permissionName = values.getString(eo_permission.FIELD_PERMISSIONNAME);}
    }

}

