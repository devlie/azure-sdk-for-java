// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.fluent.UsagesClient;
import com.azure.resourcemanager.labservices.fluent.models.UsageInner;
import com.azure.resourcemanager.labservices.models.Usage;
import com.azure.resourcemanager.labservices.models.Usages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UsagesImpl implements Usages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsagesImpl.class);

    private final UsagesClient innerClient;

    private final com.azure.resourcemanager.labservices.LabServicesManager serviceManager;

    public UsagesImpl(
        UsagesClient innerClient, com.azure.resourcemanager.labservices.LabServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Usage> listByLocation(String location) {
        PagedIterable<UsageInner> inner = this.serviceClient().listByLocation(location);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listByLocation(String location, String filter, Context context) {
        PagedIterable<UsageInner> inner = this.serviceClient().listByLocation(location, filter, context);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.labservices.LabServicesManager manager() {
        return this.serviceManager;
    }
}
