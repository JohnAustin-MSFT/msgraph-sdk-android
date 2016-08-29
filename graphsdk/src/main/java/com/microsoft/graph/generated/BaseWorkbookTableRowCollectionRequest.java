// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Row Collection Request.
 */
public class BaseWorkbookTableRowCollectionRequest extends BaseCollectionRequest<BaseWorkbookTableRowCollectionResponse, IWorkbookTableRowCollectionPage> implements IBaseWorkbookTableRowCollectionRequest {

    /**
     * The request builder for this collection of WorkbookTableRow
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseWorkbookTableRowCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseWorkbookTableRowCollectionResponse.class, IWorkbookTableRowCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookTableRowCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkbookTableRowCollectionPage get() throws ClientException {
        final BaseWorkbookTableRowCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookTableRow newWorkbookTableRow, final ICallback<WorkbookTableRow> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookTableRowRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newWorkbookTableRow, callback);
    }

    public WorkbookTableRow post(final WorkbookTableRow newWorkbookTableRow) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookTableRowRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newWorkbookTableRow);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookTableRowCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (WorkbookTableRowCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookTableRowCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (WorkbookTableRowCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IWorkbookTableRowCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (WorkbookTableRowCollectionRequest)this;
    }

    public IWorkbookTableRowCollectionPage buildFromResponse(final BaseWorkbookTableRowCollectionResponse response) {
        final IWorkbookTableRowCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookTableRowCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookTableRowCollectionPage page = new WorkbookTableRowCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}