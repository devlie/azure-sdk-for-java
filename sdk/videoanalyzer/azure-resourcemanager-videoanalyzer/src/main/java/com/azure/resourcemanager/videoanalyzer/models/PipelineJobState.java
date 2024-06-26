// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PipelineJobState. */
public final class PipelineJobState extends ExpandableStringEnum<PipelineJobState> {
    /** Static value Processing for PipelineJobState. */
    public static final PipelineJobState PROCESSING = fromString("Processing");

    /** Static value Canceled for PipelineJobState. */
    public static final PipelineJobState CANCELED = fromString("Canceled");

    /** Static value Completed for PipelineJobState. */
    public static final PipelineJobState COMPLETED = fromString("Completed");

    /** Static value Failed for PipelineJobState. */
    public static final PipelineJobState FAILED = fromString("Failed");

    /**
     * Creates or finds a PipelineJobState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PipelineJobState.
     */
    @JsonCreator
    public static PipelineJobState fromString(String name) {
        return fromString(name, PipelineJobState.class);
    }

    /**
     * Gets known PipelineJobState values.
     *
     * @return known PipelineJobState values.
     */
    public static Collection<PipelineJobState> values() {
        return values(PipelineJobState.class);
    }
}
