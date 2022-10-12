// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesPropertiesHciStorageProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesPropertiesStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesPropertiesStatusProvisioningStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesPropertiesVmwareStorageProfile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class StorageSpacesPropertiesTests {
    @Test
    public void testDeserialize() {
        StorageSpacesProperties model =
            BinaryData
                .fromString(
                    "{\"hciStorageProfile\":{\"mocGroup\":\"cxnavv\",\"mocLocation\":\"qiby\",\"mocStorageContainer\":\"nyowxwlmdjrkvfg\"},\"vmwareStorageProfile\":{\"datacenter\":\"vpdbodaciz\",\"datastore\":\"q\",\"folder\":\"krribdeibqi\",\"resourcePool\":\"kghv\"},\"provisioningState\":\"Updating\",\"status\":{\"provisioningStatus\":{\"operationId\":\"refajpjorwkqnyh\",\"phase\":\"ij\",\"status\":\"ivfxzsjabibsyst\"}}}")
                .toObject(StorageSpacesProperties.class);
        Assertions.assertEquals("cxnavv", model.hciStorageProfile().mocGroup());
        Assertions.assertEquals("qiby", model.hciStorageProfile().mocLocation());
        Assertions.assertEquals("nyowxwlmdjrkvfg", model.hciStorageProfile().mocStorageContainer());
        Assertions.assertEquals("vpdbodaciz", model.vmwareStorageProfile().datacenter());
        Assertions.assertEquals("q", model.vmwareStorageProfile().datastore());
        Assertions.assertEquals("krribdeibqi", model.vmwareStorageProfile().folder());
        Assertions.assertEquals("kghv", model.vmwareStorageProfile().resourcePool());
        Assertions.assertEquals("refajpjorwkqnyh", model.status().provisioningStatus().operationId());
        Assertions.assertEquals("ij", model.status().provisioningStatus().phase());
        Assertions.assertEquals("ivfxzsjabibsyst", model.status().provisioningStatus().status());
    }

    @Test
    public void testSerialize() {
        StorageSpacesProperties model =
            new StorageSpacesProperties()
                .withHciStorageProfile(
                    new StorageSpacesPropertiesHciStorageProfile()
                        .withMocGroup("cxnavv")
                        .withMocLocation("qiby")
                        .withMocStorageContainer("nyowxwlmdjrkvfg"))
                .withVmwareStorageProfile(
                    new StorageSpacesPropertiesVmwareStorageProfile()
                        .withDatacenter("vpdbodaciz")
                        .withDatastore("q")
                        .withFolder("krribdeibqi")
                        .withResourcePool("kghv"))
                .withStatus(
                    new StorageSpacesPropertiesStatus()
                        .withProvisioningStatus(
                            new StorageSpacesPropertiesStatusProvisioningStatus()
                                .withOperationId("refajpjorwkqnyh")
                                .withPhase("ij")
                                .withStatus("ivfxzsjabibsyst")));
        model = BinaryData.fromObject(model).toObject(StorageSpacesProperties.class);
        Assertions.assertEquals("cxnavv", model.hciStorageProfile().mocGroup());
        Assertions.assertEquals("qiby", model.hciStorageProfile().mocLocation());
        Assertions.assertEquals("nyowxwlmdjrkvfg", model.hciStorageProfile().mocStorageContainer());
        Assertions.assertEquals("vpdbodaciz", model.vmwareStorageProfile().datacenter());
        Assertions.assertEquals("q", model.vmwareStorageProfile().datastore());
        Assertions.assertEquals("krribdeibqi", model.vmwareStorageProfile().folder());
        Assertions.assertEquals("kghv", model.vmwareStorageProfile().resourcePool());
        Assertions.assertEquals("refajpjorwkqnyh", model.status().provisioningStatus().operationId());
        Assertions.assertEquals("ij", model.status().provisioningStatus().phase());
        Assertions.assertEquals("ivfxzsjabibsyst", model.status().provisioningStatus().status());
    }
}