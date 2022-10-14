// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securitydevops.fluent.models.OperationInner;
import com.azure.resourcemanager.securitydevops.models.OperationDisplay;
import org.junit.jupiter.api.Test;

public final class OperationInnerTests {
    @Test
    public void testDeserialize() {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"mkqsleyyv\",\"isDataAction\":true,\"display\":{\"provider\":\"k\",\"resource\":\"t\",\"operation\":\"ngj\",\"description\":\"cczsq\"},\"origin\":\"user\",\"actionType\":\"Internal\"}")
                .toObject(OperationInner.class);
    }

    @Test
    public void testSerialize() {
        OperationInner model = new OperationInner().withDisplay(new OperationDisplay());
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
    }
}