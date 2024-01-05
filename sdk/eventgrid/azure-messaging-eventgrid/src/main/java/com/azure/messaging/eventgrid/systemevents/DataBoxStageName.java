// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Schema of DataBox Stage Name enumeration.
 */
public final class DataBoxStageName extends ExpandableStringEnum<DataBoxStageName> {
    /**
     * Copy has started.
     */
    public static final DataBoxStageName COPY_STARTED = fromString("CopyStarted");

    /**
     * Copy has completed.
     */
    public static final DataBoxStageName COPY_COMPLETED = fromString("CopyCompleted");

    /**
     * Order has been completed.
     */
    public static final DataBoxStageName ORDER_COMPLETED = fromString("OrderCompleted");

    /**
     * Creates a new instance of DataBoxStageName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataBoxStageName() {
    }

    /**
     * Creates or finds a DataBoxStageName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataBoxStageName.
     */
    public static DataBoxStageName fromString(String name) {
        return fromString(name, DataBoxStageName.class);
    }

    /**
     * Gets known DataBoxStageName values.
     * 
     * @return known DataBoxStageName values.
     */
    public static Collection<DataBoxStageName> values() {
        return values(DataBoxStageName.class);
    }
}
