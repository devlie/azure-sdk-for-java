// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for AppServiceCertificateOrders DeleteCertificate. */
public final class AppServiceCertificateOrdersDeleteCertificateSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2022-03-01/examples/DeleteAppServiceCertificate.json
     */
    /**
     * Sample code: Delete App Service Certificate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAppServiceCertificate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getAppServiceCertificateOrders()
            .deleteCertificateWithResponse("testrg123", "SampleCertificateOrderName", "SampleCertName1", Context.NONE);
    }
}