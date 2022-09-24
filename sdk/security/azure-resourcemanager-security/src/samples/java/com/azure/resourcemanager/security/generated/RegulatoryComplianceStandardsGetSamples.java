// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for RegulatoryComplianceStandards Get. */
public final class RegulatoryComplianceStandardsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2019-01-01-preview/examples/RegulatoryCompliance/getRegulatoryComplianceStandard_example.json
     */
    /**
     * Sample code: Get selected regulatory compliance standard details and state.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getSelectedRegulatoryComplianceStandardDetailsAndState(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.regulatoryComplianceStandards().getWithResponse("PCI-DSS-3.2", Context.NONE);
    }
}