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
 * The class for the Base Group Setting.
 */
public class BaseGroupSetting extends Entity implements IJsonBackedObject {


    public BaseGroupSetting() {
        oDataType = "microsoft.graph.groupSetting";
    }

    /**
     * The Display Name.
     * Display name of this group of settings, which comes from the associated template.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Template Id.
     * Unique identifier for the template used to create this group of settings. Read-only.
     */
    @SerializedName("templateId")
    @Expose
    public String templateId;

    /**
     * The Values.
     * Collection of name value pairs. Must contain and set all the settings defined in the template.
     */
    @SerializedName("values")
    @Expose
    public java.util.List<SettingValue> values;


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
