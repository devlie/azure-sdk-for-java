// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.Applicability;
import com.azure.resourcemanager.appcontainers.models.AvailableWorkloadProfileProperties;
import com.azure.resourcemanager.appcontainers.models.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AvailableWorkloadProfilePropertiesTests {
    @Test
    public void testDeserialize() {
        AvailableWorkloadProfileProperties model =
            BinaryData
                .fromString(
                    "{\"billingMeterCategory\":\"PremiumSkuGeneralPurpose\",\"applicability\":\"LocationDefault\",\"cores\":1792442027,\"memoryGiB\":296401749,\"displayName\":\"gomfgbeglq\"}")
                .toObject(AvailableWorkloadProfileProperties.class);
        Assertions.assertEquals(Category.PREMIUM_SKU_GENERAL_PURPOSE, model.billingMeterCategory());
        Assertions.assertEquals(Applicability.LOCATION_DEFAULT, model.applicability());
        Assertions.assertEquals(1792442027, model.cores());
        Assertions.assertEquals(296401749, model.memoryGiB());
        Assertions.assertEquals("gomfgbeglq", model.displayName());
    }

    @Test
    public void testSerialize() {
        AvailableWorkloadProfileProperties model =
            new AvailableWorkloadProfileProperties()
                .withBillingMeterCategory(Category.PREMIUM_SKU_GENERAL_PURPOSE)
                .withApplicability(Applicability.LOCATION_DEFAULT)
                .withCores(1792442027)
                .withMemoryGiB(296401749)
                .withDisplayName("gomfgbeglq");
        model = BinaryData.fromObject(model).toObject(AvailableWorkloadProfileProperties.class);
        Assertions.assertEquals(Category.PREMIUM_SKU_GENERAL_PURPOSE, model.billingMeterCategory());
        Assertions.assertEquals(Applicability.LOCATION_DEFAULT, model.applicability());
        Assertions.assertEquals(1792442027, model.cores());
        Assertions.assertEquals(296401749, model.memoryGiB());
        Assertions.assertEquals("gomfgbeglq", model.displayName());
    }
}