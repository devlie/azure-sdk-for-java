// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data encryption properties of a server. */
@Fluent
public final class DataEncryption {
    /*
     * URI for the key in keyvault for data encryption of the primary server.
     */
    @JsonProperty(value = "primaryKeyURI")
    private String primaryKeyUri;

    /*
     * Resource Id for the User assigned identity to be used for data encryption of the primary server.
     */
    @JsonProperty(value = "primaryUserAssignedIdentityId")
    private String primaryUserAssignedIdentityId;

    /*
     * URI for the key in keyvault for data encryption for geo-backup of server.
     */
    @JsonProperty(value = "geoBackupKeyURI")
    private String geoBackupKeyUri;

    /*
     * Resource Id for the User assigned identity to be used for data encryption for geo-backup of server.
     */
    @JsonProperty(value = "geoBackupUserAssignedIdentityId")
    private String geoBackupUserAssignedIdentityId;

    /*
     * Data encryption type to depict if it is System Managed vs Azure Key vault.
     */
    @JsonProperty(value = "type")
    private ArmServerKeyType type;

    /*
     * Primary encryption key status for Data encryption enabled server.
     */
    @JsonProperty(value = "primaryEncryptionKeyStatus")
    private KeyStatusEnum primaryEncryptionKeyStatus;

    /*
     * Geo-backup encryption key status for Data encryption enabled server.
     */
    @JsonProperty(value = "geoBackupEncryptionKeyStatus")
    private KeyStatusEnum geoBackupEncryptionKeyStatus;

    /** Creates an instance of DataEncryption class. */
    public DataEncryption() {
    }

    /**
     * Get the primaryKeyUri property: URI for the key in keyvault for data encryption of the primary server.
     *
     * @return the primaryKeyUri value.
     */
    public String primaryKeyUri() {
        return this.primaryKeyUri;
    }

    /**
     * Set the primaryKeyUri property: URI for the key in keyvault for data encryption of the primary server.
     *
     * @param primaryKeyUri the primaryKeyUri value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withPrimaryKeyUri(String primaryKeyUri) {
        this.primaryKeyUri = primaryKeyUri;
        return this;
    }

    /**
     * Get the primaryUserAssignedIdentityId property: Resource Id for the User assigned identity to be used for data
     * encryption of the primary server.
     *
     * @return the primaryUserAssignedIdentityId value.
     */
    public String primaryUserAssignedIdentityId() {
        return this.primaryUserAssignedIdentityId;
    }

    /**
     * Set the primaryUserAssignedIdentityId property: Resource Id for the User assigned identity to be used for data
     * encryption of the primary server.
     *
     * @param primaryUserAssignedIdentityId the primaryUserAssignedIdentityId value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withPrimaryUserAssignedIdentityId(String primaryUserAssignedIdentityId) {
        this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
        return this;
    }

    /**
     * Get the geoBackupKeyUri property: URI for the key in keyvault for data encryption for geo-backup of server.
     *
     * @return the geoBackupKeyUri value.
     */
    public String geoBackupKeyUri() {
        return this.geoBackupKeyUri;
    }

    /**
     * Set the geoBackupKeyUri property: URI for the key in keyvault for data encryption for geo-backup of server.
     *
     * @param geoBackupKeyUri the geoBackupKeyUri value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withGeoBackupKeyUri(String geoBackupKeyUri) {
        this.geoBackupKeyUri = geoBackupKeyUri;
        return this;
    }

    /**
     * Get the geoBackupUserAssignedIdentityId property: Resource Id for the User assigned identity to be used for data
     * encryption for geo-backup of server.
     *
     * @return the geoBackupUserAssignedIdentityId value.
     */
    public String geoBackupUserAssignedIdentityId() {
        return this.geoBackupUserAssignedIdentityId;
    }

    /**
     * Set the geoBackupUserAssignedIdentityId property: Resource Id for the User assigned identity to be used for data
     * encryption for geo-backup of server.
     *
     * @param geoBackupUserAssignedIdentityId the geoBackupUserAssignedIdentityId value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withGeoBackupUserAssignedIdentityId(String geoBackupUserAssignedIdentityId) {
        this.geoBackupUserAssignedIdentityId = geoBackupUserAssignedIdentityId;
        return this;
    }

    /**
     * Get the type property: Data encryption type to depict if it is System Managed vs Azure Key vault.
     *
     * @return the type value.
     */
    public ArmServerKeyType type() {
        return this.type;
    }

    /**
     * Set the type property: Data encryption type to depict if it is System Managed vs Azure Key vault.
     *
     * @param type the type value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withType(ArmServerKeyType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the primaryEncryptionKeyStatus property: Primary encryption key status for Data encryption enabled server.
     *
     * @return the primaryEncryptionKeyStatus value.
     */
    public KeyStatusEnum primaryEncryptionKeyStatus() {
        return this.primaryEncryptionKeyStatus;
    }

    /**
     * Set the primaryEncryptionKeyStatus property: Primary encryption key status for Data encryption enabled server.
     *
     * @param primaryEncryptionKeyStatus the primaryEncryptionKeyStatus value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withPrimaryEncryptionKeyStatus(KeyStatusEnum primaryEncryptionKeyStatus) {
        this.primaryEncryptionKeyStatus = primaryEncryptionKeyStatus;
        return this;
    }

    /**
     * Get the geoBackupEncryptionKeyStatus property: Geo-backup encryption key status for Data encryption enabled
     * server.
     *
     * @return the geoBackupEncryptionKeyStatus value.
     */
    public KeyStatusEnum geoBackupEncryptionKeyStatus() {
        return this.geoBackupEncryptionKeyStatus;
    }

    /**
     * Set the geoBackupEncryptionKeyStatus property: Geo-backup encryption key status for Data encryption enabled
     * server.
     *
     * @param geoBackupEncryptionKeyStatus the geoBackupEncryptionKeyStatus value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withGeoBackupEncryptionKeyStatus(KeyStatusEnum geoBackupEncryptionKeyStatus) {
        this.geoBackupEncryptionKeyStatus = geoBackupEncryptionKeyStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
