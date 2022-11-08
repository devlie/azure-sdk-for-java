// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.FeatureSupportRequest;
import org.junit.jupiter.api.Test;

public final class FeatureSupportRequestTests {
    @Test
    public void testDeserialize() {
        FeatureSupportRequest model =
            BinaryData.fromString("{\"featureType\":\"FeatureSupportRequest\"}").toObject(FeatureSupportRequest.class);
    }

    @Test
    public void testSerialize() {
        FeatureSupportRequest model = new FeatureSupportRequest();
        model = BinaryData.fromObject(model).toObject(FeatureSupportRequest.class);
    }
}