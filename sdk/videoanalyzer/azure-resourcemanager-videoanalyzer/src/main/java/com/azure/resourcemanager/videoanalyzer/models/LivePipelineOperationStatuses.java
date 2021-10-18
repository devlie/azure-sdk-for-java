// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LivePipelineOperationStatuses. */
public interface LivePipelineOperationStatuses {
    /**
     * Get the operation status of a live pipeline.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param livePipelineName Live pipeline unique identifier.
     * @param operationId The operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status of a live pipeline.
     */
    LivePipelineOperationStatus get(
        String resourceGroupName, String accountName, String livePipelineName, String operationId);

    /**
     * Get the operation status of a live pipeline.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param livePipelineName Live pipeline unique identifier.
     * @param operationId The operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status of a live pipeline.
     */
    Response<LivePipelineOperationStatus> getWithResponse(
        String resourceGroupName, String accountName, String livePipelineName, String operationId, Context context);
}
