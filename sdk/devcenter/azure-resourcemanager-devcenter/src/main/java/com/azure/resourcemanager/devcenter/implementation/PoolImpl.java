// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.PoolInner;
import com.azure.resourcemanager.devcenter.models.LicenseType;
import com.azure.resourcemanager.devcenter.models.LocalAdminStatus;
import com.azure.resourcemanager.devcenter.models.Pool;
import com.azure.resourcemanager.devcenter.models.PoolUpdate;
import java.util.Collections;
import java.util.Map;

public final class PoolImpl implements Pool, Pool.Definition, Pool.Update {
    private PoolInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String devBoxDefinitionName() {
        return this.innerModel().devBoxDefinitionName();
    }

    public String networkConnectionName() {
        return this.innerModel().networkConnectionName();
    }

    public LicenseType licenseType() {
        return this.innerModel().licenseType();
    }

    public LocalAdminStatus localAdministrator() {
        return this.innerModel().localAdministrator();
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

    public PoolInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String projectName;

    private String poolName;

    private PoolUpdate updateBody;

    public PoolImpl withExistingProject(String resourceGroupName, String projectName) {
        this.resourceGroupName = resourceGroupName;
        this.projectName = projectName;
        return this;
    }

    public Pool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .createOrUpdate(resourceGroupName, projectName, poolName, this.innerModel(), Context.NONE);
        return this;
    }

    public Pool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .createOrUpdate(resourceGroupName, projectName, poolName, this.innerModel(), context);
        return this;
    }

    PoolImpl(String name, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = new PoolInner();
        this.serviceManager = serviceManager;
        this.poolName = name;
    }

    public PoolImpl update() {
        this.updateBody = new PoolUpdate();
        return this;
    }

    public Pool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .update(resourceGroupName, projectName, poolName, updateBody, Context.NONE);
        return this;
    }

    public Pool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .update(resourceGroupName, projectName, poolName, updateBody, context);
        return this;
    }

    PoolImpl(PoolInner innerObject, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.projectName = Utils.getValueFromIdByName(innerObject.id(), "projects");
        this.poolName = Utils.getValueFromIdByName(innerObject.id(), "pools");
    }

    public Pool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .getWithResponse(resourceGroupName, projectName, poolName, Context.NONE)
                .getValue();
        return this;
    }

    public Pool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPools()
                .getWithResponse(resourceGroupName, projectName, poolName, context)
                .getValue();
        return this;
    }

    public PoolImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PoolImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public PoolImpl withDevBoxDefinitionName(String devBoxDefinitionName) {
        if (isInCreateMode()) {
            this.innerModel().withDevBoxDefinitionName(devBoxDefinitionName);
            return this;
        } else {
            this.updateBody.withDevBoxDefinitionName(devBoxDefinitionName);
            return this;
        }
    }

    public PoolImpl withNetworkConnectionName(String networkConnectionName) {
        if (isInCreateMode()) {
            this.innerModel().withNetworkConnectionName(networkConnectionName);
            return this;
        } else {
            this.updateBody.withNetworkConnectionName(networkConnectionName);
            return this;
        }
    }

    public PoolImpl withLicenseType(LicenseType licenseType) {
        if (isInCreateMode()) {
            this.innerModel().withLicenseType(licenseType);
            return this;
        } else {
            this.updateBody.withLicenseType(licenseType);
            return this;
        }
    }

    public PoolImpl withLocalAdministrator(LocalAdminStatus localAdministrator) {
        if (isInCreateMode()) {
            this.innerModel().withLocalAdministrator(localAdministrator);
            return this;
        } else {
            this.updateBody.withLocalAdministrator(localAdministrator);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}