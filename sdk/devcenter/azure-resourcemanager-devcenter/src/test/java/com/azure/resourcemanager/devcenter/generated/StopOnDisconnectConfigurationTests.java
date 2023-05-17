// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.StopOnDisconnectConfiguration;
import com.azure.resourcemanager.devcenter.models.StopOnDisconnectEnableStatus;
import org.junit.jupiter.api.Assertions;

public final class StopOnDisconnectConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StopOnDisconnectConfiguration model =
            BinaryData
                .fromString("{\"status\":\"Disabled\",\"gracePeriodMinutes\":1747128451}")
                .toObject(StopOnDisconnectConfiguration.class);
        Assertions.assertEquals(StopOnDisconnectEnableStatus.DISABLED, model.status());
        Assertions.assertEquals(1747128451, model.gracePeriodMinutes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StopOnDisconnectConfiguration model =
            new StopOnDisconnectConfiguration()
                .withStatus(StopOnDisconnectEnableStatus.DISABLED)
                .withGracePeriodMinutes(1747128451);
        model = BinaryData.fromObject(model).toObject(StopOnDisconnectConfiguration.class);
        Assertions.assertEquals(StopOnDisconnectEnableStatus.DISABLED, model.status());
        Assertions.assertEquals(1747128451, model.gracePeriodMinutes());
    }
}
