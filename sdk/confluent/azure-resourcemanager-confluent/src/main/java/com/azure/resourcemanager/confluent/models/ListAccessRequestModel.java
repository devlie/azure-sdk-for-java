// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * List Access Request Model.
 */
@Fluent
public final class ListAccessRequestModel {
    /*
     * Search filters for the request
     */
    @JsonProperty(value = "searchFilters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> searchFilters;

    /**
     * Creates an instance of ListAccessRequestModel class.
     */
    public ListAccessRequestModel() {
    }

    /**
     * Get the searchFilters property: Search filters for the request.
     * 
     * @return the searchFilters value.
     */
    public Map<String, String> searchFilters() {
        return this.searchFilters;
    }

    /**
     * Set the searchFilters property: Search filters for the request.
     * 
     * @param searchFilters the searchFilters value to set.
     * @return the ListAccessRequestModel object itself.
     */
    public ListAccessRequestModel withSearchFilters(Map<String, String> searchFilters) {
        this.searchFilters = searchFilters;
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
