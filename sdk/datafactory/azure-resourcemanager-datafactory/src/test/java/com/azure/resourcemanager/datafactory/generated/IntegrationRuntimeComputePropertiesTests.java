// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CopyComputeScaleProperties;
import com.azure.resourcemanager.datafactory.models.DataFlowComputeType;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeComputeProperties;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDataFlowProperties;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeVNetProperties;
import com.azure.resourcemanager.datafactory.models.PipelineExternalComputeScaleProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeComputePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeComputeProperties model = BinaryData.fromString(
            "{\"location\":\"ha\",\"nodeSize\":\"ytuecmgu\",\"numberOfNodes\":2137117317,\"maxParallelExecutionsPerNode\":1491172911,\"dataFlowProperties\":{\"computeType\":\"MemoryOptimized\",\"coreCount\":613256770,\"timeToLive\":776631813,\"cleanup\":true,\"customProperties\":[{\"name\":\"qzq\",\"value\":\"seujcmtcid\"},{\"name\":\"b\",\"value\":\"xhcxct\"},{\"name\":\"xoef\",\"value\":\"orylx\"},{\"name\":\"nwkjzvq\",\"value\":\"ymtupyjtrxxzwdsn\"}],\"\":{\"sdlul\":\"dataefnakdmtpj\",\"ttl\":\"datatjxhxwt\",\"lynvpdvctqdapyds\":\"datavukvupuplug\",\"pj\":\"datap\"}},\"vNetProperties\":{\"vNetId\":\"lbnru\",\"subnet\":\"ehy\",\"publicIPs\":[\"mjrgfbmp\"],\"subnetId\":\"wkbcstzuw\",\"\":{\"maxdwxrwq\":\"datae\"}},\"copyComputeScaleProperties\":{\"dataIntegrationUnit\":315112243,\"timeToLive\":768261244,\"\":{\"pghhuluqyfvgpq\":\"datakxyrlkgjhomywl\"}},\"pipelineExternalComputeScaleProperties\":{\"timeToLive\":595808141,\"numberOfPipelineNodes\":266503485,\"numberOfExternalNodes\":821047302,\"\":{\"mc\":\"datambuihtqfvyq\",\"joxsehj\":\"datauguvlieegjnqwh\",\"xdl\":\"datacgqcrwaucftotedh\",\"axrhljwqu\":\"datauhffjjqvjyqmpmsk\"}},\"\":{\"jvwfijfdj\":\"datapypboqlefxfpwm\",\"lbqntdde\":\"datarvsvhmsmrihddnb\"}}")
            .toObject(IntegrationRuntimeComputeProperties.class);
        Assertions.assertEquals("ha", model.location());
        Assertions.assertEquals("ytuecmgu", model.nodeSize());
        Assertions.assertEquals(2137117317, model.numberOfNodes());
        Assertions.assertEquals(1491172911, model.maxParallelExecutionsPerNode());
        Assertions.assertEquals(DataFlowComputeType.MEMORY_OPTIMIZED, model.dataFlowProperties().computeType());
        Assertions.assertEquals(613256770, model.dataFlowProperties().coreCount());
        Assertions.assertEquals(776631813, model.dataFlowProperties().timeToLive());
        Assertions.assertEquals(true, model.dataFlowProperties().cleanup());
        Assertions.assertEquals("qzq", model.dataFlowProperties().customProperties().get(0).name());
        Assertions.assertEquals("seujcmtcid", model.dataFlowProperties().customProperties().get(0).value());
        Assertions.assertEquals("lbnru", model.vNetProperties().vNetId());
        Assertions.assertEquals("ehy", model.vNetProperties().subnet());
        Assertions.assertEquals("mjrgfbmp", model.vNetProperties().publicIPs().get(0));
        Assertions.assertEquals("wkbcstzuw", model.vNetProperties().subnetId());
        Assertions.assertEquals(315112243, model.copyComputeScaleProperties().dataIntegrationUnit());
        Assertions.assertEquals(768261244, model.copyComputeScaleProperties().timeToLive());
        Assertions.assertEquals(595808141, model.pipelineExternalComputeScaleProperties().timeToLive());
        Assertions.assertEquals(266503485, model.pipelineExternalComputeScaleProperties().numberOfPipelineNodes());
        Assertions.assertEquals(821047302, model.pipelineExternalComputeScaleProperties().numberOfExternalNodes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeComputeProperties model = new IntegrationRuntimeComputeProperties().withLocation("ha")
            .withNodeSize("ytuecmgu")
            .withNumberOfNodes(2137117317)
            .withMaxParallelExecutionsPerNode(1491172911)
            .withDataFlowProperties(new IntegrationRuntimeDataFlowProperties()
                .withComputeType(DataFlowComputeType.MEMORY_OPTIMIZED)
                .withCoreCount(613256770)
                .withTimeToLive(776631813)
                .withCleanup(true)
                .withCustomProperties(Arrays.asList(
                    new IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem().withName("qzq")
                        .withValue("seujcmtcid"),
                    new IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem().withName("b").withValue("xhcxct"),
                    new IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem().withName("xoef").withValue("orylx"),
                    new IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem().withName("nwkjzvq")
                        .withValue("ymtupyjtrxxzwdsn")))
                .withAdditionalProperties(mapOf()))
            .withVNetProperties(new IntegrationRuntimeVNetProperties().withVNetId("lbnru")
                .withSubnet("ehy")
                .withPublicIPs(Arrays.asList("mjrgfbmp"))
                .withSubnetId("wkbcstzuw")
                .withAdditionalProperties(mapOf()))
            .withCopyComputeScaleProperties(new CopyComputeScaleProperties().withDataIntegrationUnit(315112243)
                .withTimeToLive(768261244)
                .withAdditionalProperties(mapOf()))
            .withPipelineExternalComputeScaleProperties(
                new PipelineExternalComputeScaleProperties().withTimeToLive(595808141)
                    .withNumberOfPipelineNodes(266503485)
                    .withNumberOfExternalNodes(821047302)
                    .withAdditionalProperties(mapOf()))
            .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeComputeProperties.class);
        Assertions.assertEquals("ha", model.location());
        Assertions.assertEquals("ytuecmgu", model.nodeSize());
        Assertions.assertEquals(2137117317, model.numberOfNodes());
        Assertions.assertEquals(1491172911, model.maxParallelExecutionsPerNode());
        Assertions.assertEquals(DataFlowComputeType.MEMORY_OPTIMIZED, model.dataFlowProperties().computeType());
        Assertions.assertEquals(613256770, model.dataFlowProperties().coreCount());
        Assertions.assertEquals(776631813, model.dataFlowProperties().timeToLive());
        Assertions.assertEquals(true, model.dataFlowProperties().cleanup());
        Assertions.assertEquals("qzq", model.dataFlowProperties().customProperties().get(0).name());
        Assertions.assertEquals("seujcmtcid", model.dataFlowProperties().customProperties().get(0).value());
        Assertions.assertEquals("lbnru", model.vNetProperties().vNetId());
        Assertions.assertEquals("ehy", model.vNetProperties().subnet());
        Assertions.assertEquals("mjrgfbmp", model.vNetProperties().publicIPs().get(0));
        Assertions.assertEquals("wkbcstzuw", model.vNetProperties().subnetId());
        Assertions.assertEquals(315112243, model.copyComputeScaleProperties().dataIntegrationUnit());
        Assertions.assertEquals(768261244, model.copyComputeScaleProperties().timeToLive());
        Assertions.assertEquals(595808141, model.pipelineExternalComputeScaleProperties().timeToLive());
        Assertions.assertEquals(266503485, model.pipelineExternalComputeScaleProperties().numberOfPipelineNodes());
        Assertions.assertEquals(821047302, model.pipelineExternalComputeScaleProperties().numberOfExternalNodes());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
