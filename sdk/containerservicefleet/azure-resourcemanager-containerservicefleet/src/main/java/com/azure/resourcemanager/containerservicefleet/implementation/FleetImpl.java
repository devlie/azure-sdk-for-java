// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetInner;
import com.azure.resourcemanager.containerservicefleet.models.Fleet;
import com.azure.resourcemanager.containerservicefleet.models.FleetCredentialResults;
import com.azure.resourcemanager.containerservicefleet.models.FleetHubProfile;
import com.azure.resourcemanager.containerservicefleet.models.FleetPatch;
import com.azure.resourcemanager.containerservicefleet.models.FleetProvisioningState;
import java.util.Collections;
import java.util.Map;

public final class FleetImpl implements Fleet, Fleet.Definition, Fleet.Update {
    private FleetInner innerObject;

    private final com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public FleetProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public FleetHubProfile hubProfile() {
        return this.innerModel().hubProfile();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public FleetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String fleetName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    private FleetPatch updateProperties;

    public FleetImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Fleet create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFleets()
                .createOrUpdate(
                    resourceGroupName, fleetName, this.innerModel(), createIfMatch, createIfNoneMatch, Context.NONE);
        return this;
    }

    public Fleet create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFleets()
                .createOrUpdate(
                    resourceGroupName, fleetName, this.innerModel(), createIfMatch, createIfNoneMatch, context);
        return this;
    }

    FleetImpl(
        String name, com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager serviceManager) {
        this.innerObject = new FleetInner();
        this.serviceManager = serviceManager;
        this.fleetName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public FleetImpl update() {
        this.updateIfMatch = null;
        this.updateProperties = new FleetPatch();
        return this;
    }

    public Fleet apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFleets()
                .updateWithResponse(resourceGroupName, fleetName, updateProperties, updateIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public Fleet apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFleets()
                .updateWithResponse(resourceGroupName, fleetName, updateProperties, updateIfMatch, context)
                .getValue();
        return this;
    }

    FleetImpl(
        FleetInner innerObject,
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.fleetName = Utils.getValueFromIdByName(innerObject.id(), "fleets");
    }

    public Fleet refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFleets()
                .getByResourceGroupWithResponse(resourceGroupName, fleetName, Context.NONE)
                .getValue();
        return this;
    }

    public Fleet refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFleets()
                .getByResourceGroupWithResponse(resourceGroupName, fleetName, context)
                .getValue();
        return this;
    }

    public Response<FleetCredentialResults> listCredentialsWithResponse(Context context) {
        return serviceManager.fleets().listCredentialsWithResponse(resourceGroupName, fleetName, context);
    }

    public FleetCredentialResults listCredentials() {
        return serviceManager.fleets().listCredentials(resourceGroupName, fleetName);
    }

    public FleetImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public FleetImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public FleetImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public FleetImpl withHubProfile(FleetHubProfile hubProfile) {
        this.innerModel().withHubProfile(hubProfile);
        return this;
    }

    public FleetImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    public FleetImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
