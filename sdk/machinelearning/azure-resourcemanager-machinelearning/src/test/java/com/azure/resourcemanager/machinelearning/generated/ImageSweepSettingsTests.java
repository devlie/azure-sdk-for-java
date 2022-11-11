// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.EarlyTerminationPolicy;
import com.azure.resourcemanager.machinelearning.models.ImageSweepSettings;
import com.azure.resourcemanager.machinelearning.models.SamplingAlgorithmType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageSweepSettingsTests {
    @Test
    public void testDeserialize() {
        ImageSweepSettings model =
            BinaryData
                .fromString(
                    "{\"earlyTermination\":{\"policyType\":\"EarlyTerminationPolicy\",\"delayEvaluation\":790899458,\"evaluationInterval\":2024803970},\"samplingAlgorithm\":\"Grid\"}")
                .toObject(ImageSweepSettings.class);
        Assertions.assertEquals(790899458, model.earlyTermination().delayEvaluation());
        Assertions.assertEquals(2024803970, model.earlyTermination().evaluationInterval());
        Assertions.assertEquals(SamplingAlgorithmType.GRID, model.samplingAlgorithm());
    }

    @Test
    public void testSerialize() {
        ImageSweepSettings model =
            new ImageSweepSettings()
                .withEarlyTermination(
                    new EarlyTerminationPolicy().withDelayEvaluation(790899458).withEvaluationInterval(2024803970))
                .withSamplingAlgorithm(SamplingAlgorithmType.GRID);
        model = BinaryData.fromObject(model).toObject(ImageSweepSettings.class);
        Assertions.assertEquals(790899458, model.earlyTermination().delayEvaluation());
        Assertions.assertEquals(2024803970, model.earlyTermination().evaluationInterval());
        Assertions.assertEquals(SamplingAlgorithmType.GRID, model.samplingAlgorithm());
    }
}