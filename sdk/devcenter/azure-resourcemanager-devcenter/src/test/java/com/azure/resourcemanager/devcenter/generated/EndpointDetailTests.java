// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.EndpointDetail;

public final class EndpointDetailTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointDetail model = BinaryData.fromString("{\"port\":1781178234}").toObject(EndpointDetail.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointDetail model = new EndpointDetail();
        model = BinaryData.fromObject(model).toObject(EndpointDetail.class);
    }
}
