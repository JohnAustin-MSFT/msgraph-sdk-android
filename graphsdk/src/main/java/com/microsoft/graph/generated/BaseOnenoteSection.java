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
 * The class for the Base Onenote Section.
 */
public class BaseOnenoteSection extends OnenoteEntityHierarchyModel implements IJsonBackedObject {


    public BaseOnenoteSection() {
        oDataType = "microsoft.graph.onenoteSection";
    }

    /**
     * The Is Default.
     * Indicates whether this is the user's default section. Read-only.
     */
    @SerializedName("isDefault")
    @Expose
    public Boolean isDefault;

    /**
     * The Links.
     * Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote Online.
     */
    @SerializedName("links")
    @Expose
    public SectionLinks links;

    /**
     * The Pages Url.
     * The pages endpoint where you can get details for all the pages in the section. Read-only.
     */
    @SerializedName("pagesUrl")
    @Expose
    public String pagesUrl;

    /**
     * The Parent Notebook.
     * The notebook that contains the section.  Read-only.
     */
    @SerializedName("parentNotebook")
    @Expose
    public Notebook parentNotebook;

    /**
     * The Parent Section Group.
     * The section group that contains the section.  Read-only.
     */
    @SerializedName("parentSectionGroup")
    @Expose
    public SectionGroup parentSectionGroup;

    /**
     * The Pages.
     * The collection of pages in the section.  Read-only. Nullable.
     */
    public transient OnenotePageCollectionPage pages;


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


        if (json.has("pages")) {
            final BaseOnenotePageCollectionResponse response = new BaseOnenotePageCollectionResponse();
            if (json.has("pages@odata.nextLink")) {
                response.nextLink = json.get("pages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("pages").toString(), JsonObject[].class);
            final OnenotePage[] array = new OnenotePage[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnenotePage.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            pages = new OnenotePageCollectionPage(response, null);
        }
    }
}
