// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DynamicsCrmSink;
import com.azure.resourcemanager.datafactory.models.DynamicsSinkWriteBehavior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DynamicsCrmSinkTests {
    @Test
    public void testDeserialize() {
        DynamicsCrmSink model =
            BinaryData
                .fromString("{\"type\":\"DynamicsCrmSink\",\"writeBehavior\":\"Upsert\",\"\":{}}")
                .toObject(DynamicsCrmSink.class);
        Assertions.assertEquals(DynamicsSinkWriteBehavior.UPSERT, model.writeBehavior());
    }

    @Test
    public void testSerialize() {
        DynamicsCrmSink model = new DynamicsCrmSink().withWriteBehavior(DynamicsSinkWriteBehavior.UPSERT);
        model = BinaryData.fromObject(model).toObject(DynamicsCrmSink.class);
        Assertions.assertEquals(DynamicsSinkWriteBehavior.UPSERT, model.writeBehavior());
    }
}