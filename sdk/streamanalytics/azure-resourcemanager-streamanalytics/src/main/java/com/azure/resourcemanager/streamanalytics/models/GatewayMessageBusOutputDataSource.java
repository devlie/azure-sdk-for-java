// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.fluent.models.GatewayMessageBusOutputDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a Gateway Message Bus output data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("GatewayMessageBus")
@Fluent
public final class GatewayMessageBusOutputDataSource extends OutputDataSource {
    /*
     * The properties that are associated with a Gateway Message Bus output. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties")
    private GatewayMessageBusOutputDataSourceProperties innerProperties;

    /**
     * Creates an instance of GatewayMessageBusOutputDataSource class.
     */
    public GatewayMessageBusOutputDataSource() {
    }

    /**
     * Get the innerProperties property: The properties that are associated with a Gateway Message Bus output. Required
     * on PUT (CreateOrReplace) requests.
     * 
     * @return the innerProperties value.
     */
    private GatewayMessageBusOutputDataSourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the topic property: The name of the Service Bus topic.
     * 
     * @return the topic value.
     */
    public String topic() {
        return this.innerProperties() == null ? null : this.innerProperties().topic();
    }

    /**
     * Set the topic property: The name of the Service Bus topic.
     * 
     * @param topic the topic value to set.
     * @return the GatewayMessageBusOutputDataSource object itself.
     */
    public GatewayMessageBusOutputDataSource withTopic(String topic) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GatewayMessageBusOutputDataSourceProperties();
        }
        this.innerProperties().withTopic(topic);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
