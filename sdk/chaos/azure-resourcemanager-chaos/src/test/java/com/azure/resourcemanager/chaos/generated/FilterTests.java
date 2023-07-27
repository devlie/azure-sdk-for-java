// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.Filter;

public final class FilterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Filter model = BinaryData.fromString("{\"type\":\"Filter\"}").toObject(Filter.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Filter model = new Filter();
        model = BinaryData.fromObject(model).toObject(Filter.class);
    }
}
