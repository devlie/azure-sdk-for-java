// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.Context;

/** Samples for GitHubConnector ListByResourceGroup. */
public final class GitHubConnectorListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/securitydevops/resource-manager/Microsoft.SecurityDevOps/preview/2022-09-01-preview/examples/GitHubConnectorListByResourceGroup.json
     */
    /**
     * Sample code: GitHubConnector_ListByResourceGroup.
     *
     * @param manager Entry point to SecuritydevopsManager.
     */
    public static void gitHubConnectorListByResourceGroup(
        com.azure.resourcemanager.securitydevops.SecuritydevopsManager manager) {
        manager.gitHubConnectors().listByResourceGroup("westusrg", Context.NONE);
    }
}
