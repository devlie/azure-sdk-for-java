// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for Images Get. */
public final class ImagesGetSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-08-01-preview/examples/Images_Get.json
     */
    /**
     * Sample code: Images_Get.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void imagesGet(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.images().getWithResponse("rg1", "Contoso", "DefaultDevGallery", "{imageName}", Context.NONE);
    }
}