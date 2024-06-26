// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.mysqlflexibleserver.models.PrivateEndpoint;
import com.azure.resourcemanager.mysqlflexibleserver.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.mysqlflexibleserver.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model = BinaryData.fromString(
            "{\"groupIds\":[\"dmoh\",\"tbqvudw\",\"dndnvow\"],\"privateEndpoint\":{\"id\":\"jugwdkcglhsl\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"yggdtjixh\",\"actionsRequired\":\"uofqwe\"},\"provisioningState\":\"Failed\"}")
            .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("yggdtjixh", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("uofqwe", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model
            = new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("yggdtjixh")
                        .withActionsRequired("uofqwe"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("yggdtjixh", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("uofqwe", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
