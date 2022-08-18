// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.models.FieldDefinition;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Properties of the connection type. */
@Fluent
public final class ConnectionTypeProperties {
    /*
     * Gets or sets a Boolean value to indicate if the connection type is global.
     */
    @JsonProperty(value = "isGlobal")
    private Boolean isGlobal;

    /*
     * Gets the field definitions of the connection type.
     */
    @JsonProperty(value = "fieldDefinitions", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, FieldDefinition> fieldDefinitions;

    /*
     * Gets the creation time.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "lastModifiedTime")
    private OffsetDateTime lastModifiedTime;

    /*
     * Gets or sets the description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the isGlobal property: Gets or sets a Boolean value to indicate if the connection type is global.
     *
     * @return the isGlobal value.
     */
    public Boolean isGlobal() {
        return this.isGlobal;
    }

    /**
     * Set the isGlobal property: Gets or sets a Boolean value to indicate if the connection type is global.
     *
     * @param isGlobal the isGlobal value to set.
     * @return the ConnectionTypeProperties object itself.
     */
    public ConnectionTypeProperties withIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }

    /**
     * Get the fieldDefinitions property: Gets the field definitions of the connection type.
     *
     * @return the fieldDefinitions value.
     */
    public Map<String, FieldDefinition> fieldDefinitions() {
        return this.fieldDefinitions;
    }

    /**
     * Get the creationTime property: Gets the creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the ConnectionTypeProperties object itself.
     */
    public ConnectionTypeProperties withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description.
     *
     * @param description the description value to set.
     * @return the ConnectionTypeProperties object itself.
     */
    public ConnectionTypeProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fieldDefinitions() != null) {
            fieldDefinitions()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}