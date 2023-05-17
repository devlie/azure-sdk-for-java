// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.resourcemanager.devcenter.models.DomainJoinType;

/** Samples for NetworkConnections CreateOrUpdate. */
public final class NetworkConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2023-04-01/examples/NetworkConnections_Put.json
     */
    /**
     * Sample code: NetworkConnections_CreateOrUpdate.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void networkConnectionsCreateOrUpdate(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager
            .networkConnections()
            .define("uswest3network")
            .withRegion("centralus")
            .withExistingResourceGroup("rg1")
            .withNetworkingResourceGroupName("NetworkInterfaces")
            .withDomainJoinType(DomainJoinType.HYBRID_AZURE_ADJOIN)
            .withSubnetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/ExampleRG/providers/Microsoft.Network/virtualNetworks/ExampleVNet/subnets/default")
            .withDomainName("mydomaincontroller.local")
            .withDomainUsername("testuser@mydomaincontroller.local")
            .withDomainPassword("Password value for user")
            .create();
    }
}
