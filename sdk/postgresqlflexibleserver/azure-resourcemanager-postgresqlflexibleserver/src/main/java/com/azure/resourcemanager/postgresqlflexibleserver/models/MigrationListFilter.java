// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MigrationListFilter. */
public final class MigrationListFilter extends ExpandableStringEnum<MigrationListFilter> {
    /** Static value Active for MigrationListFilter. */
    public static final MigrationListFilter ACTIVE = fromString("Active");

    /** Static value All for MigrationListFilter. */
    public static final MigrationListFilter ALL = fromString("All");

    /**
     * Creates a new instance of MigrationListFilter value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MigrationListFilter() {
    }

    /**
     * Creates or finds a MigrationListFilter from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MigrationListFilter.
     */
    @JsonCreator
    public static MigrationListFilter fromString(String name) {
        return fromString(name, MigrationListFilter.class);
    }

    /**
     * Gets known MigrationListFilter values.
     *
     * @return known MigrationListFilter values.
     */
    public static Collection<MigrationListFilter> values() {
        return values(MigrationListFilter.class);
    }
}
