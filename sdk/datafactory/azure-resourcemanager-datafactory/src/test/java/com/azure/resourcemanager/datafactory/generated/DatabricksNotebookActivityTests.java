// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DatabricksNotebookActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DatabricksNotebookActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabricksNotebookActivity model = BinaryData.fromString(
            "{\"type\":\"tdek\",\"typeProperties\":{\"notebookPath\":\"datankgm\",\"baseParameters\":{\"gwsrr\":\"datayfyvodctpczzqusf\",\"lyspk\":\"datagij\",\"khgqsjecccfyc\":\"dataswyaejffvf\",\"r\":\"datawcuhqfxferfza\"},\"libraries\":[{\"obstiob\":\"datayphc\",\"vubszjyttgkps\":\"datar\"}]},\"linkedServiceName\":{\"referenceName\":\"irftlomec\",\"parameters\":{\"efn\":\"datagbgpx\",\"iaqafalbk\":\"dataefavbsbhd\",\"vdhvdv\":\"datamod\"}},\"policy\":{\"timeout\":\"datarkvxmeihrziwn\",\"retry\":\"datapojmgkeoqrxhdsu\",\"retryIntervalInSeconds\":2125623505,\"secureInput\":false,\"secureOutput\":false,\"\":{\"hiegkpukv\":\"dataeikbvax\",\"io\":\"datalcvlbqhtiijli\"}},\"name\":\"wzsmya\",\"description\":\"hjsmkhk\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"siizadmbn\",\"dependencyConditions\":[\"Succeeded\",\"Failed\",\"Skipped\",\"Succeeded\"],\"\":{\"vgzjfptprfq\":\"datahkhzwfnsduwtt\",\"gyo\":\"datat\"}}],\"userProperties\":[{\"name\":\"vtfkdz\",\"value\":\"datatkxiyjqbe\"},{\"name\":\"vxebdhpizk\",\"value\":\"dataqkylmfy\"},{\"name\":\"iodcgwbkfcajtxzd\",\"value\":\"dataqthqgngrfzaex\"},{\"name\":\"wftqoifvjfaqa\",\"value\":\"datameskd\"}],\"\":{\"uco\":\"databbdajcbrlnx\"}}")
            .toObject(DatabricksNotebookActivity.class);
        Assertions.assertEquals("wzsmya", model.name());
        Assertions.assertEquals("hjsmkhk", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("siizadmbn", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("vtfkdz", model.userProperties().get(0).name());
        Assertions.assertEquals("irftlomec", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2125623505, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabricksNotebookActivity model = new DatabricksNotebookActivity().withName("wzsmya")
            .withDescription("hjsmkhk")
            .withState(ActivityState.INACTIVE)
            .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
            .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("siizadmbn")
                .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.FAILED,
                    DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED))
                .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("vtfkdz").withValue("datatkxiyjqbe"),
                new UserProperty().withName("vxebdhpizk").withValue("dataqkylmfy"),
                new UserProperty().withName("iodcgwbkfcajtxzd").withValue("dataqthqgngrfzaex"),
                new UserProperty().withName("wftqoifvjfaqa").withValue("datameskd")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("irftlomec")
                .withParameters(mapOf("efn", "datagbgpx", "iaqafalbk", "dataefavbsbhd", "vdhvdv", "datamod")))
            .withPolicy(new ActivityPolicy().withTimeout("datarkvxmeihrziwn")
                .withRetry("datapojmgkeoqrxhdsu")
                .withRetryIntervalInSeconds(2125623505)
                .withSecureInput(false)
                .withSecureOutput(false)
                .withAdditionalProperties(mapOf()))
            .withNotebookPath("datankgm")
            .withBaseParameters(mapOf("gwsrr", "datayfyvodctpczzqusf", "lyspk", "datagij", "khgqsjecccfyc",
                "dataswyaejffvf", "r", "datawcuhqfxferfza"))
            .withLibraries(Arrays.asList(mapOf("obstiob", "datayphc", "vubszjyttgkps", "datar")));
        model = BinaryData.fromObject(model).toObject(DatabricksNotebookActivity.class);
        Assertions.assertEquals("wzsmya", model.name());
        Assertions.assertEquals("hjsmkhk", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("siizadmbn", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("vtfkdz", model.userProperties().get(0).name());
        Assertions.assertEquals("irftlomec", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2125623505, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
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
