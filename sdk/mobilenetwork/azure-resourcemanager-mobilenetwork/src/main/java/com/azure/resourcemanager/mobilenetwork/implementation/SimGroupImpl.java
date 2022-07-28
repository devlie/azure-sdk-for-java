// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimGroupInner;
import com.azure.resourcemanager.mobilenetwork.models.KeyVaultKey;
import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentity;
import com.azure.resourcemanager.mobilenetwork.models.MobileNetworkResourceId;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.SimGroup;
import com.azure.resourcemanager.mobilenetwork.models.TagsObject;
import java.util.Collections;
import java.util.Map;

public final class SimGroupImpl implements SimGroup, SimGroup.Definition, SimGroup.Update {
    private SimGroupInner innerObject;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

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

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public KeyVaultKey encryptionKey() {
        return this.innerModel().encryptionKey();
    }

    public MobileNetworkResourceId mobileNetwork() {
        return this.innerModel().mobileNetwork();
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

    public SimGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String simGroupName;

    private TagsObject updateParameters;

    public SimGroupImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public SimGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSimGroups()
                .createOrUpdate(resourceGroupName, simGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public SimGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSimGroups()
                .createOrUpdate(resourceGroupName, simGroupName, this.innerModel(), context);
        return this;
    }

    SimGroupImpl(String name, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = new SimGroupInner();
        this.serviceManager = serviceManager;
        this.simGroupName = name;
    }

    public SimGroupImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public SimGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSimGroups()
                .updateTagsWithResponse(resourceGroupName, simGroupName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public SimGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSimGroups()
                .updateTagsWithResponse(resourceGroupName, simGroupName, updateParameters, context)
                .getValue();
        return this;
    }

    SimGroupImpl(
        SimGroupInner innerObject, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.simGroupName = Utils.getValueFromIdByName(innerObject.id(), "simGroups");
    }

    public SimGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSimGroups()
                .getByResourceGroupWithResponse(resourceGroupName, simGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public SimGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSimGroups()
                .getByResourceGroupWithResponse(resourceGroupName, simGroupName, context)
                .getValue();
        return this;
    }

    public SimGroupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SimGroupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SimGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public SimGroupImpl withIdentity(ManagedServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public SimGroupImpl withEncryptionKey(KeyVaultKey encryptionKey) {
        this.innerModel().withEncryptionKey(encryptionKey);
        return this;
    }

    public SimGroupImpl withMobileNetwork(MobileNetworkResourceId mobileNetwork) {
        this.innerModel().withMobileNetwork(mobileNetwork);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}