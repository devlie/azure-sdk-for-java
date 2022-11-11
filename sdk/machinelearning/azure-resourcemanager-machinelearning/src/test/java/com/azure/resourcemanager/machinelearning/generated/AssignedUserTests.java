// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AssignedUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssignedUserTests {
    @Test
    public void testDeserialize() {
        AssignedUser model =
            BinaryData
                .fromString("{\"objectId\":\"mykyujxsglhs\",\"tenantId\":\"rryejylmbkzudnig\"}")
                .toObject(AssignedUser.class);
        Assertions.assertEquals("mykyujxsglhs", model.objectId());
        Assertions.assertEquals("rryejylmbkzudnig", model.tenantId());
    }

    @Test
    public void testSerialize() {
        AssignedUser model = new AssignedUser().withObjectId("mykyujxsglhs").withTenantId("rryejylmbkzudnig");
        model = BinaryData.fromObject(model).toObject(AssignedUser.class);
        Assertions.assertEquals("mykyujxsglhs", model.objectId());
        Assertions.assertEquals("rryejylmbkzudnig", model.tenantId());
    }
}