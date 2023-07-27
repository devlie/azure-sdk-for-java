// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.ResourceIdentity;
import com.azure.resourcemanager.chaos.models.ResourceIdentityType;
import com.azure.resourcemanager.chaos.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ResourceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceIdentity model =
            BinaryData
                .fromString(
                    "{\"type\":\"None\",\"userAssignedIdentities\":{\"mkfssxqukkfplgm\":{\"principalId\":\"6999b89d-259f-44cf-ad3c-6d5076e3df83\",\"clientId\":\"326a00cb-dd9f-43b5-9b3f-416045e6fc59\"},\"nkjzkdeslpvlop\":{\"principalId\":\"3e8374dc-0257-4d89-a7ff-a9bd17a713d7\",\"clientId\":\"a9819cbc-ee4b-42dc-b115-cf907ae81f14\"}},\"principalId\":\"yighxpk\",\"tenantId\":\"zb\"}")
                .toObject(ResourceIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceIdentity model =
            new ResourceIdentity()
                .withType(ResourceIdentityType.NONE)
                .withUserAssignedIdentities(
                    mapOf("mkfssxqukkfplgm", new UserAssignedIdentity(), "nkjzkdeslpvlop", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ResourceIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
