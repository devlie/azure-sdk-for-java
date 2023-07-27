// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.CapabilityTypePropertiesRuntimeProperties;

public final class CapabilityTypePropertiesRuntimePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapabilityTypePropertiesRuntimeProperties model =
            BinaryData
                .fromString("{\"kind\":\"uhmuouqfprwzwbn\"}")
                .toObject(CapabilityTypePropertiesRuntimeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapabilityTypePropertiesRuntimeProperties model = new CapabilityTypePropertiesRuntimeProperties();
        model = BinaryData.fromObject(model).toObject(CapabilityTypePropertiesRuntimeProperties.class);
    }
}
