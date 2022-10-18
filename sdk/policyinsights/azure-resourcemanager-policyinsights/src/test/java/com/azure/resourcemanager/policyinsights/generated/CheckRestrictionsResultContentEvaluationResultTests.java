// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.CheckRestrictionsResultContentEvaluationResult;
import com.azure.resourcemanager.policyinsights.models.PolicyEvaluationResult;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class CheckRestrictionsResultContentEvaluationResultTests {
    @Test
    public void testDeserialize() {
        CheckRestrictionsResultContentEvaluationResult model =
            BinaryData
                .fromString(
                    "{\"policyEvaluations\":[{\"policyInfo\":{\"policyDefinitionId\":\"mpsbzkfzbeyv\",\"policySetDefinitionId\":\"qi\",\"policyDefinitionReferenceId\":\"invkjjxdxrbuu\",\"policyAssignmentId\":\"clewyhm\"},\"evaluationResult\":\"paztzpofncck\",\"evaluationDetails\":{\"evaluatedExpressions\":[]}},{\"policyInfo\":{\"policyDefinitionId\":\"hxx\",\"policySetDefinitionId\":\"yq\",\"policyDefinitionReferenceId\":\"zfeqztppri\",\"policyAssignmentId\":\"xorjaltolmncwsob\"},\"evaluationResult\":\"csdbnwdcfhuc\",\"evaluationDetails\":{\"evaluatedExpressions\":[]}},{\"policyInfo\":{\"policyDefinitionId\":\"glsbjjc\",\"policySetDefinitionId\":\"vxb\",\"policyDefinitionReferenceId\":\"vudutncor\",\"policyAssignmentId\":\"lxqtvcofudfl\"},\"evaluationResult\":\"gj\",\"evaluationDetails\":{\"evaluatedExpressions\":[]}}]}")
                .toObject(CheckRestrictionsResultContentEvaluationResult.class);
    }

    @Test
    public void testSerialize() {
        CheckRestrictionsResultContentEvaluationResult model =
            new CheckRestrictionsResultContentEvaluationResult()
                .withPolicyEvaluations(
                    Arrays
                        .asList(
                            new PolicyEvaluationResult(), new PolicyEvaluationResult(), new PolicyEvaluationResult()));
        model = BinaryData.fromObject(model).toObject(CheckRestrictionsResultContentEvaluationResult.class);
    }
}