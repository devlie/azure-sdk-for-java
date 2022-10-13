// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.securitydevops.models.GitHubRepo;

/** Samples for GitHubRepo Update. */
public final class GitHubRepoUpdateSamples {
    /*
     * x-ms-original-file: specification/securitydevops/resource-manager/Microsoft.SecurityDevOps/preview/2022-09-01-preview/examples/GitHubRepoUpdate.json
     */
    /**
     * Sample code: GitHubRepo_Update.
     *
     * @param manager Entry point to SecuritydevopsManager.
     */
    public static void gitHubRepoUpdate(com.azure.resourcemanager.securitydevops.SecuritydevopsManager manager) {
        GitHubRepo resource =
            manager
                .gitHubRepoes()
                .getWithResponse("westusrg", "testconnector", "Azure", "azure-rest-api-specs", Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
