// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ServerBlobAuditingPolicies ListByServer. */
public final class ServerBlobAuditingPoliciesListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-03-01-preview/examples/ServerAuditingSettingsList.json
     */
    /**
     * Sample code: List auditing settings of a server.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAuditingSettingsOfAServer(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerBlobAuditingPolicies()
            .listByServer("blobauditingtest-4799", "blobauditingtest-6440", Context.NONE);
    }
}