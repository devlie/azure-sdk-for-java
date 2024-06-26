// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.models.WaitStatisticsInput;
import java.time.OffsetDateTime;

/** Samples for WaitStatistics ListByServer. */
public final class WaitStatisticsListByServerSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2018-06-01/examples/WaitStatisticsListByServer.json
     */
    /**
     * Sample code: WaitStatisticsListByServer.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void waitStatisticsListByServer(com.azure.resourcemanager.mysql.MySqlManager manager) {
        manager
            .waitStatistics()
            .listByServer(
                "testResourceGroupName",
                "testServerName",
                new WaitStatisticsInput()
                    .withObservationStartTime(OffsetDateTime.parse("2019-05-01T20:00:00.000Z"))
                    .withObservationEndTime(OffsetDateTime.parse("2019-05-07T20:00:00.000Z"))
                    .withAggregationWindow("PT15M"),
                Context.NONE);
    }
}
