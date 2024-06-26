// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base class for backup schedule.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "schedulePolicyType",
    defaultImpl = SchedulePolicy.class,
    visible = true)
@JsonTypeName("SchedulePolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "LogSchedulePolicy", value = LogSchedulePolicy.class),
    @JsonSubTypes.Type(name = "LongTermSchedulePolicy", value = LongTermSchedulePolicy.class),
    @JsonSubTypes.Type(name = "SimpleSchedulePolicy", value = SimpleSchedulePolicy.class),
    @JsonSubTypes.Type(name = "SimpleSchedulePolicyV2", value = SimpleSchedulePolicyV2.class) })
@Immutable
public class SchedulePolicy {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     */
    @JsonTypeId
    @JsonProperty(value = "schedulePolicyType", required = true)
    private String schedulePolicyType;

    /**
     * Creates an instance of SchedulePolicy class.
     */
    public SchedulePolicy() {
        this.schedulePolicyType = "SchedulePolicy";
    }

    /**
     * Get the schedulePolicyType property: This property will be used as the discriminator for deciding the specific
     * types in the polymorphic chain of types.
     * 
     * @return the schedulePolicyType value.
     */
    public String schedulePolicyType() {
        return this.schedulePolicyType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
