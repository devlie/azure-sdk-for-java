// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.MarketoLinkedServiceTypeProperties;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import org.junit.jupiter.api.Test;

public final class MarketoLinkedServiceTypePropertiesTests {
    @Test
    public void testDeserialize() {
        MarketoLinkedServiceTypeProperties model =
            BinaryData
                .fromString("{\"clientSecret\":{\"type\":\"SecretBase\"}}")
                .toObject(MarketoLinkedServiceTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        MarketoLinkedServiceTypeProperties model =
            new MarketoLinkedServiceTypeProperties().withClientSecret(new SecretBase());
        model = BinaryData.fromObject(model).toObject(MarketoLinkedServiceTypeProperties.class);
    }
}