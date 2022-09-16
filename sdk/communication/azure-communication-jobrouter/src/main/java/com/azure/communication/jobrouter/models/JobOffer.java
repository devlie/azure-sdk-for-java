// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An offer of a job to a worker. */
@Fluent
public final class JobOffer {
    /*
     * The Id of the offer.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The Id of the job.
     */
    @JsonProperty(value = "jobId", required = true)
    private String jobId;

    /*
     * The capacity cost consumed by the job offer.
     */
    @JsonProperty(value = "capacityCost", required = true)
    private int capacityCost;

    /*
     * The time the offer was created.
     */
    @JsonProperty(value = "offerTimeUtc")
    private OffsetDateTime offerTimeUtc;

    /*
     * The time that the offer will expire.
     */
    @JsonProperty(value = "expiryTimeUtc")
    private OffsetDateTime expiryTimeUtc;

    /**
     * Get the id property: The Id of the offer.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The Id of the offer.
     *
     * @param id the id value to set.
     * @return the JobOffer object itself.
     */
    public JobOffer setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the jobId property: The Id of the job.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: The Id of the job.
     *
     * @param jobId the jobId value to set.
     * @return the JobOffer object itself.
     */
    public JobOffer setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the capacityCost property: The capacity cost consumed by the job offer.
     *
     * @return the capacityCost value.
     */
    public int getCapacityCost() {
        return this.capacityCost;
    }

    /**
     * Set the capacityCost property: The capacity cost consumed by the job offer.
     *
     * @param capacityCost the capacityCost value to set.
     * @return the JobOffer object itself.
     */
    public JobOffer setCapacityCost(int capacityCost) {
        this.capacityCost = capacityCost;
        return this;
    }

    /**
     * Get the offerTimeUtc property: The time the offer was created.
     *
     * @return the offerTimeUtc value.
     */
    public OffsetDateTime getOfferTimeUtc() {
        return this.offerTimeUtc;
    }

    /**
     * Set the offerTimeUtc property: The time the offer was created.
     *
     * @param offerTimeUtc the offerTimeUtc value to set.
     * @return the JobOffer object itself.
     */
    public JobOffer setOfferTimeUtc(OffsetDateTime offerTimeUtc) {
        this.offerTimeUtc = offerTimeUtc;
        return this;
    }

    /**
     * Get the expiryTimeUtc property: The time that the offer will expire.
     *
     * @return the expiryTimeUtc value.
     */
    public OffsetDateTime getExpiryTimeUtc() {
        return this.expiryTimeUtc;
    }

    /**
     * Set the expiryTimeUtc property: The time that the offer will expire.
     *
     * @param expiryTimeUtc the expiryTimeUtc value to set.
     * @return the JobOffer object itself.
     */
    public JobOffer setExpiryTimeUtc(OffsetDateTime expiryTimeUtc) {
        this.expiryTimeUtc = expiryTimeUtc;
        return this;
    }
}