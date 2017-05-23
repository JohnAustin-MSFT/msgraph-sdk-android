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
 * The class for the Base Onenote Page Request Builder.
 */
public class BaseOnenotePageRequestBuilder extends BaseRequestBuilder implements IBaseOnenotePageRequestBuilder {

    /**
     * The request builder for the OnenotePage
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseOnenotePageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IOnenotePageRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IOnenotePageRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new OnenotePageRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for OnenoteSection.
     */
    public IOnenoteSectionRequestBuilder getParentSection() {
        return new OnenoteSectionRequestBuilder(getRequestUrlWithAdditionalSegment("parentSection"), getClient(), null);
    }

    /**
     * Gets the request builder for Notebook.
     */
    public INotebookRequestBuilder getParentNotebook() {
        return new NotebookRequestBuilder(getRequestUrlWithAdditionalSegment("parentNotebook"), getClient(), null);
    }

    public IOnenotePageStreamRequestBuilder getMsgraph_Content() {
        return new OnenotePageStreamRequestBuilder(getRequestUrlWithAdditionalSegment("content"), getClient(), null);
    }

    public IOnenotePageStreamRequestBuilder getContent() {
        return new OnenotePageStreamRequestBuilder(getRequestUrlWithAdditionalSegment("$value"), getClient(), null);
    }

    public IOnenotePageOnenotePatchContentRequestBuilder getOnenotePatchContent(final java.util.List<OnenotePatchContentCommand> commands) {
        return new OnenotePageOnenotePatchContentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.onenotePatchContent"), getClient(), null, commands);
    }

    public IOnenotePageCopyToSectionRequestBuilder getCopyToSection(final String id, final String groupId) {
        return new OnenotePageCopyToSectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copyToSection"), getClient(), null, id, groupId);
    }

    public IOnenotePagePreviewRequestBuilder getPreview() {
        return new OnenotePagePreviewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.preview"), getClient(), null);
    }
}
