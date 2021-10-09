// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.Context;

/** Samples for InvoiceSections ListByBillingProfile. */
public final class InvoiceSectionsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/InvoiceSectionsListByBillingProfile.json
     */
    /**
     * Sample code: InvoiceSectionsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoiceSectionsListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.invoiceSections().listByBillingProfile("{billingAccountName}", "{billingProfileName}", Context.NONE);
    }
}
