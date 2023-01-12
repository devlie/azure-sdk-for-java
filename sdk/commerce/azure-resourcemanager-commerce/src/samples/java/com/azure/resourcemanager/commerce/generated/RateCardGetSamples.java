// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.generated;

/** Samples for RateCard Get. */
public final class RateCardGetSamples {
    /*
     * x-ms-original-file: specification/commerce/resource-manager/Microsoft.Commerce/preview/2015-06-01-preview/examples/GetRateCard.json
     */
    /**
     * Sample code: GetRateCard.
     *
     * @param manager Entry point to UsageManager.
     */
    public static void getRateCard(com.azure.resourcemanager.commerce.UsageManager manager) {
        manager
            .rateCards()
            .getWithResponse(
                "OfferDurableId eq 'MS-AZR-0003P' and Currency eq 'USD' and Locale eq 'en-US' and RegionInfo eq 'US'",
                com.azure.core.util.Context.NONE);
    }
}
