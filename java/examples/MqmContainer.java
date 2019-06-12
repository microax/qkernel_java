/* MqmContainer.java
 *
 * THE FOLLOWING CODE IS AUTO GENERATED BY GENDB SCRIPT 
 * !!!!!!!!!!!!  DO NOT MODIFY THIS FILE !!!!!!!!!!!
 */
package com.qkernel.examples;

import com.qkernel.*;
import com.qkernel.examples.model.*;


@SuppressWarnings({"unchecked", "fallthrough", "serial" })
/***********************************************************************
 * Creates/loads all of the EnityObjects for the Business server.
 * The <code>load()</code> method must be implemented.
 * <code>load()</code> must do the following for each EnityObject:
 *     <li> Instantiate each entity via "new"
 *     <li> Invoke the create method on the EnityObject
 * </ol>
 ***********************************************************************
 */
public class MqmContainer extends EntityContainer
{

    public static eo_account account;
    public static eo_contact contact;
    public static eo_faq faq;
    public static eo_media media;
    public static eo_permission permission;
    public static eo_playlist playlist;
    public static eo_ugroup ugroup;
    public static eo_ugroup_permission ugroup_permission;
    public static eo_upload upload;
    public static eo_user user;
    public static eo_user_ugroup user_ugroup;
   /**
    * Here is where we create Mqm EnityObjects...
    * Invoke in the following way:
    * <BR><BR>
    * <PRE>
    *          Obj = new ObjClass();
    *          Obj.create(this, "name");
    *          Obj.load();
    * </PRE>
    */
    public void load()
    {
        account = new eo_account();
        account.create(this, "eo_account");
        account.load();

        contact = new eo_contact();
        contact.create(this, "eo_contact");
        contact.load();

        faq = new eo_faq();
        faq.create(this, "eo_faq");
        faq.load();

        media = new eo_media();
        media.create(this, "eo_media");
        media.load();

        permission = new eo_permission();
        permission.create(this, "eo_permission");
        permission.load();

        playlist = new eo_playlist();
        playlist.create(this, "eo_playlist");
        playlist.load();

        ugroup = new eo_ugroup();
        ugroup.create(this, "eo_ugroup");
        ugroup.load();

        ugroup_permission = new eo_ugroup_permission();
        ugroup_permission.create(this, "eo_ugroup_permission");
        ugroup_permission.load();

        upload = new eo_upload();
        upload.create(this, "eo_upload");
        upload.load();

        user = new eo_user();
        user.create(this, "eo_user");
        user.load();

        user_ugroup = new eo_user_ugroup();
        user_ugroup.create(this, "eo_user_ugroup");
        user_ugroup.load();

    }
}

