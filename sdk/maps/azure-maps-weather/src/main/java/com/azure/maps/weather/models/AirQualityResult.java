// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Get Air Quality call. */
@Fluent
public final class AirQualityResult {
    /*
     * A list of all air quality results for the queried location.
     */
    @JsonProperty(value = "results")
    private List<AirQuality> airQualityResults;

    /*
     * The is the link to the next page of the features returned. If it's the last page, no this field.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Set default AirQualityResult constructor to private */
    private AirQualityResult() {}

    /**
     * Get the airQualityResults property: A list of all air quality results for the queried location.
     *
     * @return the airQualityResults value.
     */
    public List<AirQuality> getAirQualityResults() {
        return this.airQualityResults;
    }

    /**
     * Get the nextLink property: The is the link to the next page of the features returned. If it's the last page, no
     * this field.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
