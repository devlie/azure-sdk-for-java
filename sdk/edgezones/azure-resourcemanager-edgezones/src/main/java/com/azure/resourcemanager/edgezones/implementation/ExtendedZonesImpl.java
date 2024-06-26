// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgezones.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.edgezones.fluent.ExtendedZonesClient;
import com.azure.resourcemanager.edgezones.fluent.models.ExtendedZoneInner;
import com.azure.resourcemanager.edgezones.models.ExtendedZone;
import com.azure.resourcemanager.edgezones.models.ExtendedZones;

public final class ExtendedZonesImpl implements ExtendedZones {
    private static final ClientLogger LOGGER = new ClientLogger(ExtendedZonesImpl.class);

    private final ExtendedZonesClient innerClient;

    private final com.azure.resourcemanager.edgezones.EdgeZonesManager serviceManager;

    public ExtendedZonesImpl(ExtendedZonesClient innerClient,
        com.azure.resourcemanager.edgezones.EdgeZonesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ExtendedZone> list() {
        PagedIterable<ExtendedZoneInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ExtendedZoneImpl(inner1, this.manager()));
    }

    public PagedIterable<ExtendedZone> list(Context context) {
        PagedIterable<ExtendedZoneInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ExtendedZoneImpl(inner1, this.manager()));
    }

    public Response<ExtendedZone> getWithResponse(String extendedZoneName, Context context) {
        Response<ExtendedZoneInner> inner = this.serviceClient().getWithResponse(extendedZoneName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExtendedZoneImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExtendedZone get(String extendedZoneName) {
        ExtendedZoneInner inner = this.serviceClient().get(extendedZoneName);
        if (inner != null) {
            return new ExtendedZoneImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExtendedZone> registerWithResponse(String extendedZoneName, Context context) {
        Response<ExtendedZoneInner> inner = this.serviceClient().registerWithResponse(extendedZoneName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExtendedZoneImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExtendedZone register(String extendedZoneName) {
        ExtendedZoneInner inner = this.serviceClient().register(extendedZoneName);
        if (inner != null) {
            return new ExtendedZoneImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExtendedZone> unregisterWithResponse(String extendedZoneName, Context context) {
        Response<ExtendedZoneInner> inner = this.serviceClient().unregisterWithResponse(extendedZoneName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExtendedZoneImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExtendedZone unregister(String extendedZoneName) {
        ExtendedZoneInner inner = this.serviceClient().unregister(extendedZoneName);
        if (inner != null) {
            return new ExtendedZoneImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ExtendedZonesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.edgezones.EdgeZonesManager manager() {
        return this.serviceManager;
    }
}
