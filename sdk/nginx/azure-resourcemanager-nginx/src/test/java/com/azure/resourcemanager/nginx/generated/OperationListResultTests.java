// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.fluent.models.OperationResultInner;
import com.azure.resourcemanager.nginx.models.OperationDisplay;
import com.azure.resourcemanager.nginx.models.OperationListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationListResultTests {
    @Test
    public void testDeserialize() {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"pnpulexxbczwtru\",\"display\":{\"provider\":\"zb\",\"resource\":\"vsovmyokac\",\"operation\":\"kwlhzdo\",\"description\":\"xjmflbvv\"},\"isDataAction\":false}],\"nextLink\":\"kcciwwzjuqkhr\"}")
                .toObject(OperationListResult.class);
        Assertions.assertEquals("pnpulexxbczwtru", model.value().get(0).name());
        Assertions.assertEquals("zb", model.value().get(0).display().provider());
        Assertions.assertEquals("vsovmyokac", model.value().get(0).display().resource());
        Assertions.assertEquals("kwlhzdo", model.value().get(0).display().operation());
        Assertions.assertEquals("xjmflbvv", model.value().get(0).display().description());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
        Assertions.assertEquals("kcciwwzjuqkhr", model.nextLink());
    }

    @Test
    public void testSerialize() {
        OperationListResult model =
            new OperationListResult()
                .withValue(
                    Arrays
                        .asList(
                            new OperationResultInner()
                                .withName("pnpulexxbczwtru")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("zb")
                                        .withResource("vsovmyokac")
                                        .withOperation("kwlhzdo")
                                        .withDescription("xjmflbvv"))
                                .withIsDataAction(false)))
                .withNextLink("kcciwwzjuqkhr");
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals("pnpulexxbczwtru", model.value().get(0).name());
        Assertions.assertEquals("zb", model.value().get(0).display().provider());
        Assertions.assertEquals("vsovmyokac", model.value().get(0).display().resource());
        Assertions.assertEquals("kwlhzdo", model.value().get(0).display().operation());
        Assertions.assertEquals("xjmflbvv", model.value().get(0).display().description());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
        Assertions.assertEquals("kcciwwzjuqkhr", model.nextLink());
    }
}