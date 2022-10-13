// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.Context;

/** Samples for GitHubRepo ListByConnector. */
public final class GitHubRepoListByConnectorSamples {
    /*
     * x-ms-original-file: specification/securitydevops/resource-manager/Microsoft.SecurityDevOps/preview/2022-09-01-preview/examples/GitHubRepoListByConnector.json
     */
    /**
     * Sample code: GitHubRepo_ListByConnector.
     *
     * @param manager Entry point to SecuritydevopsManager.
     */
    public static void gitHubRepoListByConnector(
        com.azure.resourcemanager.securitydevops.SecuritydevopsManager manager) {
        manager.gitHubRepoes().listByConnector("westusrg", "testconnector", Context.NONE);
    }
}
