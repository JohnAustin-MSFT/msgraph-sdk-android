// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Contact.
 */
public class BaseContact extends OutlookItem implements IJsonBackedObject {


    public BaseContact() {
        oDataType = "microsoft.graph.contact";
    }

    /**
     * The Parent Folder Id.
     */
    @SerializedName("parentFolderId")
    @Expose
    public String parentFolderId;

    /**
     * The Birthday.
     */
    @SerializedName("birthday")
    @Expose
    public java.util.Calendar birthday;

    /**
     * The File As.
     */
    @SerializedName("fileAs")
    @Expose
    public String fileAs;

    /**
     * The Display Name.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Given Name.
     */
    @SerializedName("givenName")
    @Expose
    public String givenName;

    /**
     * The Initials.
     */
    @SerializedName("initials")
    @Expose
    public String initials;

    /**
     * The Middle Name.
     */
    @SerializedName("middleName")
    @Expose
    public String middleName;

    /**
     * The Nick Name.
     */
    @SerializedName("nickName")
    @Expose
    public String nickName;

    /**
     * The Surname.
     */
    @SerializedName("surname")
    @Expose
    public String surname;

    /**
     * The Title.
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Yomi Given Name.
     */
    @SerializedName("yomiGivenName")
    @Expose
    public String yomiGivenName;

    /**
     * The Yomi Surname.
     */
    @SerializedName("yomiSurname")
    @Expose
    public String yomiSurname;

    /**
     * The Yomi Company Name.
     */
    @SerializedName("yomiCompanyName")
    @Expose
    public String yomiCompanyName;

    /**
     * The Generation.
     */
    @SerializedName("generation")
    @Expose
    public String generation;

    /**
     * The Email Addresses.
     */
    @SerializedName("emailAddresses")
    @Expose
    public List<EmailAddress> emailAddresses;

    /**
     * The Im Addresses.
     */
    @SerializedName("imAddresses")
    @Expose
    public List<String> imAddresses;

    /**
     * The Job Title.
     */
    @SerializedName("jobTitle")
    @Expose
    public String jobTitle;

    /**
     * The Company Name.
     */
    @SerializedName("companyName")
    @Expose
    public String companyName;

    /**
     * The Department.
     */
    @SerializedName("department")
    @Expose
    public String department;

    /**
     * The Office Location.
     */
    @SerializedName("officeLocation")
    @Expose
    public String officeLocation;

    /**
     * The Profession.
     */
    @SerializedName("profession")
    @Expose
    public String profession;

    /**
     * The Business Home Page.
     */
    @SerializedName("businessHomePage")
    @Expose
    public String businessHomePage;

    /**
     * The Assistant Name.
     */
    @SerializedName("assistantName")
    @Expose
    public String assistantName;

    /**
     * The Manager.
     */
    @SerializedName("manager")
    @Expose
    public String manager;

    /**
     * The Home Phones.
     */
    @SerializedName("homePhones")
    @Expose
    public List<String> homePhones;

    /**
     * The Mobile Phone.
     */
    @SerializedName("mobilePhone")
    @Expose
    public String mobilePhone;

    /**
     * The Business Phones.
     */
    @SerializedName("businessPhones")
    @Expose
    public List<String> businessPhones;

    /**
     * The Home Address.
     */
    @SerializedName("homeAddress")
    @Expose
    public PhysicalAddress homeAddress;

    /**
     * The Business Address.
     */
    @SerializedName("businessAddress")
    @Expose
    public PhysicalAddress businessAddress;

    /**
     * The Other Address.
     */
    @SerializedName("otherAddress")
    @Expose
    public PhysicalAddress otherAddress;

    /**
     * The Spouse Name.
     */
    @SerializedName("spouseName")
    @Expose
    public String spouseName;

    /**
     * The Personal Notes.
     */
    @SerializedName("personalNotes")
    @Expose
    public String personalNotes;

    /**
     * The Children.
     */
    @SerializedName("children")
    @Expose
    public List<String> children;

    /**
     * The Extensions.
     */
    public transient ExtensionCollectionPage extensions;

    /**
     * The Single Value Extended Properties.
     */
    public transient SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;

    /**
     * The Multi Value Extended Properties.
     */
    public transient MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Photo.
     */
    @SerializedName("photo")
    @Expose
    public ProfilePhoto photo;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;


        if (json.has("extensions")) {
            final BaseExtensionCollectionResponse response = new BaseExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("singleValueExtendedProperties")) {
            final BaseSingleValueLegacyExtendedPropertyCollectionResponse response = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("singleValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("singleValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), JsonObject[].class);
            final SingleValueLegacyExtendedProperty[] array = new SingleValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SingleValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            singleValueExtendedProperties = new SingleValueLegacyExtendedPropertyCollectionPage(response, null);
        }

        if (json.has("multiValueExtendedProperties")) {
            final BaseMultiValueLegacyExtendedPropertyCollectionResponse response = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("multiValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("multiValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), JsonObject[].class);
            final MultiValueLegacyExtendedProperty[] array = new MultiValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MultiValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            multiValueExtendedProperties = new MultiValueLegacyExtendedPropertyCollectionPage(response, null);
        }
    }
}
