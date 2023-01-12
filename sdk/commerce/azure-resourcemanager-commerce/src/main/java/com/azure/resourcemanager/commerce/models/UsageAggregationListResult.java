// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.commerce.fluent.models.UsageAggregationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Get UsageAggregates operation response. */
@Fluent
public final class UsageAggregationListResult {
    /*
     * Gets or sets details for the requested aggregation.
     */
    @JsonProperty(value = "value")
    private List<UsageAggregationInner> value;

    /*
     * Gets or sets the link to the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of UsageAggregationListResult class. */
    public UsageAggregationListResult() {
    }

    /**
     * Get the value property: Gets or sets details for the requested aggregation.
     *
     * @return the value value.
     */
    public List<UsageAggregationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets details for the requested aggregation.
     *
     * @param value the value value to set.
     * @return the UsageAggregationListResult object itself.
     */
    public UsageAggregationListResult withValue(List<UsageAggregationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets the link to the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets the link to the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the UsageAggregationListResult object itself.
     */
    public UsageAggregationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
