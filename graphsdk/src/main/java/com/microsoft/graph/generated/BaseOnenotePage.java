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
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Onenote Page.
 */
public class BaseOnenotePage extends OnenoteEntitySchemaObjectModel implements IJsonBackedObject {


    public BaseOnenotePage() {
        oDataType = "microsoft.graph.onenotePage";
    }

    /**
     * The Title.
	 * 
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Created By App Id.
	 * 
     */
    @SerializedName("createdByAppId")
    @Expose
    public String createdByAppId;

    /**
     * The Links.
	 * 
     */
    @SerializedName("links")
    @Expose
    public PageLinks links;

    /**
     * The Content Url.
	 * 
     */
    @SerializedName("contentUrl")
    @Expose
    public String contentUrl;

    /**
     * The Last Modified Date Time.
	 * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Level.
	 * 
     */
    @SerializedName("level")
    @Expose
    public Integer level;

    /**
     * The Order.
	 * 
     */
    @SerializedName("order")
    @Expose
    public Integer order;

    /**
     * The User Tags.
	 * 
     */
    @SerializedName("userTags")
    @Expose
    public java.util.List<String> userTags;

    /**
     * The Parent Section.
	 * 
     */
    @SerializedName("parentSection")
    @Expose
    public OnenoteSection parentSection;

    /**
     * The Parent Notebook.
	 * 
     */
    @SerializedName("parentNotebook")
    @Expose
    public Notebook parentNotebook;


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

    }
}
