// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for ActiveDirectoryAuth.
 */
public final class ActiveDirectoryAuth extends ExpandableStringEnum<ActiveDirectoryAuth> {
    /**
     * Static value enabled for ActiveDirectoryAuth.
     */
    public static final ActiveDirectoryAuth ENABLED = fromString("enabled");

    /**
     * Static value disabled for ActiveDirectoryAuth.
     */
    public static final ActiveDirectoryAuth DISABLED = fromString("disabled");

    /**
     * Creates a new instance of ActiveDirectoryAuth value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ActiveDirectoryAuth() {
    }

    /**
     * Creates or finds a ActiveDirectoryAuth from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ActiveDirectoryAuth.
     */
    @JsonCreator
    public static ActiveDirectoryAuth fromString(String name) {
        return fromString(name, ActiveDirectoryAuth.class);
    }

    /**
     * Gets known ActiveDirectoryAuth values.
     * 
     * @return known ActiveDirectoryAuth values.
     */
    public static Collection<ActiveDirectoryAuth> values() {
        return values(ActiveDirectoryAuth.class);
    }
}
