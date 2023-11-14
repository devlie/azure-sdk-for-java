// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Name property for quota usage. */
@Fluent
public final class NameProperty {
    /*
     * Name value
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Localized name
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /** Creates an instance of NameProperty class. */
    public NameProperty() {
    }

    /**
     * Get the value property: Name value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Name value.
     *
     * @param value the value value to set.
     * @return the NameProperty object itself.
     */
    public NameProperty withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: Localized name.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: Localized name.
     *
     * @param localizedValue the localizedValue value to set.
     * @return the NameProperty object itself.
     */
    public NameProperty withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
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
