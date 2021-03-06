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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base List Item Request.
 */
public interface IBaseListItemRequest extends IHttpRequest {

    /**
     * Gets the ListItem from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ListItem> callback);

    /**
     * Gets the ListItem from the service
     * @return The ListItem from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ListItem get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ListItem with a source
     * @param sourceListItem The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ListItem sourceListItem, final ICallback<ListItem> callback);

    /**
     * Patches this ListItem with a source
     * @param sourceListItem The source object with updates
     * @return The updated ListItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ListItem patch(final ListItem sourceListItem) throws ClientException;

    /**
     * Posts a ListItem with a new object
     * @param newListItem The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ListItem newListItem, final ICallback<ListItem> callback);

    /**
     * Posts a ListItem with a new object
     * @param newListItem The new object to create
     * @return The created ListItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ListItem post(final ListItem newListItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseListItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseListItemRequest expand(final String value);

}

