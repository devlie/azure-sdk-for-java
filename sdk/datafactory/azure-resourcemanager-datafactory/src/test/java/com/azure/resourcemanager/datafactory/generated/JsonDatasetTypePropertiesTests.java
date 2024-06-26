// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.JsonDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import java.util.HashMap;
import java.util.Map;

public final class JsonDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonDatasetTypeProperties model = BinaryData.fromString(
            "{\"location\":{\"type\":\"vcmlaexbzbquf\",\"folderPath\":\"dataezs\",\"fileName\":\"dataaymldrorhyogzms\",\"\":{\"m\":\"datahtcuuwdhtqqhyhn\",\"wnwngh\":\"datatnsugisno\",\"cjixxf\":\"datajovkeyym\"}},\"encodingName\":\"datapcrtn\",\"compression\":{\"type\":\"datauefxxijtebdveywe\",\"level\":\"datarhlolmcnwepfg\",\"\":{\"qdljnpe\":\"databv\",\"n\":\"datal\",\"dxljzvdovbrble\":\"datadetawevxehue\",\"c\":\"datalprdaqccddcbnygd\"}}}")
            .toObject(JsonDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonDatasetTypeProperties model = new JsonDatasetTypeProperties()
            .withLocation(new DatasetLocation().withFolderPath("dataezs")
                .withFileName("dataaymldrorhyogzms")
                .withAdditionalProperties(mapOf("type", "vcmlaexbzbquf")))
            .withEncodingName("datapcrtn")
            .withCompression(new DatasetCompression().withType("datauefxxijtebdveywe")
                .withLevel("datarhlolmcnwepfg")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(JsonDatasetTypeProperties.class);
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
