// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.agrifood.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.agrifood.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.agrifood.models.PrivateEndpointConnection;
import com.azure.resourcemanager.agrifood.models.PrivateEndpointConnections;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.agrifood.AgriFoodManager serviceManager;

    public PrivateEndpointConnectionsImpl(
        PrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.agrifood.AgriFoodManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PrivateEndpointConnection get(
        String resourceGroupName, String farmBeatsResourceName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().get(resourceGroupName, farmBeatsResourceName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, farmBeatsResourceName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String farmBeatsResourceName, String privateEndpointConnectionName) {
        this.serviceClient().delete(resourceGroupName, farmBeatsResourceName, privateEndpointConnectionName);
    }

    public void delete(
        String resourceGroupName, String farmBeatsResourceName, String privateEndpointConnectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, farmBeatsResourceName, privateEndpointConnectionName, context);
    }

    public PagedIterable<PrivateEndpointConnection> listByResource(
        String resourceGroupName, String farmBeatsResourceName) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listByResource(resourceGroupName, farmBeatsResourceName);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> listByResource(
        String resourceGroupName, String farmBeatsResourceName, Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listByResource(resourceGroupName, farmBeatsResourceName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PrivateEndpointConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String farmBeatsResourceName = Utils.getValueFromIdByName(id, "farmBeats");
        if (farmBeatsResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'farmBeats'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, farmBeatsResourceName, privateEndpointConnectionName, Context.NONE)
            .getValue();
    }

    public Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String farmBeatsResourceName = Utils.getValueFromIdByName(id, "farmBeats");
        if (farmBeatsResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'farmBeats'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, farmBeatsResourceName, privateEndpointConnectionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String farmBeatsResourceName = Utils.getValueFromIdByName(id, "farmBeats");
        if (farmBeatsResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'farmBeats'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        this.delete(resourceGroupName, farmBeatsResourceName, privateEndpointConnectionName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String farmBeatsResourceName = Utils.getValueFromIdByName(id, "farmBeats");
        if (farmBeatsResourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'farmBeats'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        this.delete(resourceGroupName, farmBeatsResourceName, privateEndpointConnectionName, context);
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.agrifood.AgriFoodManager manager() {
        return this.serviceManager;
    }

    public PrivateEndpointConnectionImpl define(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }
}