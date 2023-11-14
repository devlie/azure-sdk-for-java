// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.MigrationNameAvailabilityResourceInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationNameAvailabilityResource;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ResourceProviders;

public final class ResourceProvidersImpl implements ResourceProviders {
    private static final ClientLogger LOGGER = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<MigrationNameAvailabilityResource> checkMigrationNameAvailabilityWithResponse(
        String subscriptionId,
        String resourceGroupName,
        String targetDbServerName,
        MigrationNameAvailabilityResourceInner parameters,
        Context context) {
        Response<MigrationNameAvailabilityResourceInner> inner =
            this
                .serviceClient()
                .checkMigrationNameAvailabilityWithResponse(
                    subscriptionId, resourceGroupName, targetDbServerName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MigrationNameAvailabilityResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MigrationNameAvailabilityResource checkMigrationNameAvailability(
        String subscriptionId,
        String resourceGroupName,
        String targetDbServerName,
        MigrationNameAvailabilityResourceInner parameters) {
        MigrationNameAvailabilityResourceInner inner =
            this
                .serviceClient()
                .checkMigrationNameAvailability(subscriptionId, resourceGroupName, targetDbServerName, parameters);
        if (inner != null) {
            return new MigrationNameAvailabilityResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
