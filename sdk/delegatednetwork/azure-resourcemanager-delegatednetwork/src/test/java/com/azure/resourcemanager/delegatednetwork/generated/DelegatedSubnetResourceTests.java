// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.delegatednetwork.models.DelegatedSubnetResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DelegatedSubnetResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DelegatedSubnetResource model =
            BinaryData
                .fromString(
                    "{\"location\":\"big\",\"tags\":{\"kanyktzlcuiywg\":\"qfbow\",\"nhzgpphrcgyn\":\"ywgndrv\",\"fsxlzevgbmqjqa\":\"ocpecfvmmco\"},\"id\":\"c\",\"name\":\"pmivkwlzu\",\"type\":\"ccfwnfnbacfion\"}")
                .toObject(DelegatedSubnetResource.class);
        Assertions.assertEquals("big", model.location());
        Assertions.assertEquals("qfbow", model.tags().get("kanyktzlcuiywg"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DelegatedSubnetResource model =
            new DelegatedSubnetResource()
                .withLocation("big")
                .withTags(mapOf("kanyktzlcuiywg", "qfbow", "nhzgpphrcgyn", "ywgndrv", "fsxlzevgbmqjqa", "ocpecfvmmco"));
        model = BinaryData.fromObject(model).toObject(DelegatedSubnetResource.class);
        Assertions.assertEquals("big", model.location());
        Assertions.assertEquals("qfbow", model.tags().get("kanyktzlcuiywg"));
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
