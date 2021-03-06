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
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Profile Photo Collection Request.
 */
public class BaseProfilePhotoCollectionRequest extends BaseCollectionRequest<BaseProfilePhotoCollectionResponse, IProfilePhotoCollectionPage> implements IBaseProfilePhotoCollectionRequest {

    /**
     * The request builder for this collection of ProfilePhoto
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseProfilePhotoCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseProfilePhotoCollectionResponse.class, IProfilePhotoCollectionPage.class);
    }

    public void get(final ICallback<IProfilePhotoCollectionPage> callback) {
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

    public IProfilePhotoCollectionPage get() throws ClientException {
        final BaseProfilePhotoCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ProfilePhoto newProfilePhoto, final ICallback<ProfilePhoto> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ProfilePhotoRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newProfilePhoto, callback);
    }

    public ProfilePhoto post(final ProfilePhoto newProfilePhoto) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ProfilePhotoRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newProfilePhoto);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IProfilePhotoCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ProfilePhotoCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IProfilePhotoCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ProfilePhotoCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IProfilePhotoCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ProfilePhotoCollectionRequest)this;
    }

    public IProfilePhotoCollectionPage buildFromResponse(final BaseProfilePhotoCollectionResponse response) {
        final IProfilePhotoCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ProfilePhotoCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ProfilePhotoCollectionPage page = new ProfilePhotoCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
