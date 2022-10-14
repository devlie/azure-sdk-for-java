// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.EntityReference;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeEntityReferenceType;
import com.azure.resourcemanager.datafactory.models.PackageStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PackageStoreTests {
    @Test
    public void testDeserialize() {
        PackageStore model =
            BinaryData
                .fromString(
                    "{\"name\":\"kyrdnqodx\",\"packageStoreLinkedService\":{\"type\":\"IntegrationRuntimeReference\",\"referenceName\":\"hqfaqnvz\"}}")
                .toObject(PackageStore.class);
        Assertions.assertEquals("kyrdnqodx", model.name());
        Assertions
            .assertEquals(
                IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE,
                model.packageStoreLinkedService().type());
        Assertions.assertEquals("hqfaqnvz", model.packageStoreLinkedService().referenceName());
    }

    @Test
    public void testSerialize() {
        PackageStore model =
            new PackageStore()
                .withName("kyrdnqodx")
                .withPackageStoreLinkedService(
                    new EntityReference()
                        .withType(IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE)
                        .withReferenceName("hqfaqnvz"));
        model = BinaryData.fromObject(model).toObject(PackageStore.class);
        Assertions.assertEquals("kyrdnqodx", model.name());
        Assertions
            .assertEquals(
                IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE,
                model.packageStoreLinkedService().type());
        Assertions.assertEquals("hqfaqnvz", model.packageStoreLinkedService().referenceName());
    }
}