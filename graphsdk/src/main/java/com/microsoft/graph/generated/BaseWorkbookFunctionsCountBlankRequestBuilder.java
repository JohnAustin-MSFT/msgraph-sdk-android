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
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Count Blank Request Builder.
 */
public class BaseWorkbookFunctionsCountBlankRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCountBlank
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsCountBlankRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement range) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("range", range);
    }

    /**
     * Creates the IWorkbookFunctionsCountBlankRequest
     *
     * @return The IWorkbookFunctionsCountBlankRequest instance
     */
    public IWorkbookFunctionsCountBlankRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCountBlankRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsCountBlankRequest instance
     */
    public IWorkbookFunctionsCountBlankRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsCountBlankRequest request = new WorkbookFunctionsCountBlankRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("range")) {
            request.mBody.range = getParameter("range");
        }
  
        return request;
    }
}