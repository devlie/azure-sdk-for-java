// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Secret store based authentication credentials.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("SecretStoreBasedAuthCredentials")
@Fluent
public final class SecretStoreBasedAuthCredentials extends AuthCredentials {
    /*
     * Secret store resource
     */
    @JsonProperty(value = "secretStoreResource")
    private SecretStoreResource secretStoreResource;

    /**
     * Creates an instance of SecretStoreBasedAuthCredentials class.
     */
    public SecretStoreBasedAuthCredentials() {
    }

    /**
     * Get the secretStoreResource property: Secret store resource.
     * 
     * @return the secretStoreResource value.
     */
    public SecretStoreResource secretStoreResource() {
        return this.secretStoreResource;
    }

    /**
     * Set the secretStoreResource property: Secret store resource.
     * 
     * @param secretStoreResource the secretStoreResource value to set.
     * @return the SecretStoreBasedAuthCredentials object itself.
     */
    public SecretStoreBasedAuthCredentials withSecretStoreResource(SecretStoreResource secretStoreResource) {
        this.secretStoreResource = secretStoreResource;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (secretStoreResource() != null) {
            secretStoreResource().validate();
        }
    }
}
