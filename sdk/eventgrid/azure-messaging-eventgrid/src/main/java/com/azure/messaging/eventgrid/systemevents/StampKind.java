// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Kind of environment where app service plan is.
 */
public final class StampKind extends ExpandableStringEnum<StampKind> {
    /**
     * App Service Plan is running on a public stamp.
     */
    public static final StampKind PUBLIC = fromString("Public");

    /**
     * App Service Plan is running on an App Service Environment V1.
     */
    public static final StampKind ASE_V1 = fromString("AseV1");

    /**
     * App Service Plan is running on an App Service Environment V2.
     */
    public static final StampKind ASE_V2 = fromString("AseV2");

    /**
     * Creates a new instance of StampKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StampKind() {
    }

    /**
     * Creates or finds a StampKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StampKind.
     */
    public static StampKind fromString(String name) {
        return fromString(name, StampKind.class);
    }

    /**
     * Gets known StampKind values.
     * 
     * @return known StampKind values.
     */
    public static Collection<StampKind> values() {
        return values(StampKind.class);
    }
}
