// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.clienttelemetry;

import com.azure.cosmos.ConnectionMode;
import com.azure.cosmos.implementation.Configs;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.HdrHistogram.ConcurrentDoubleHistogram;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@JsonSerialize(using = ClientTelemetrySerializer.class)
public class ClientTelemetryInfo {
    private String timeStamp;
    private String machineId;
    private String clientId;
    private String processId;
    private String userAgent;
    private ConnectionMode connectionMode;
    private String globalDatabaseAccountName;
    private String applicationRegion;
    private String hostEnvInfo;
    private Boolean acceleratedNetworking;
    private int aggregationIntervalInSec;
    private List<String> preferredRegions;
    private Map<ReportPayload, ConcurrentDoubleHistogram> systemInfoMap;
    private Map<ReportPayload, ConcurrentDoubleHistogram> cacheRefreshInfoMap;
    private Map<ReportPayload, ConcurrentDoubleHistogram> operationInfoMap;

    public ClientTelemetryInfo(String machineId,
                               String clientId,
                               String processId,
                               String userAgent,
                               ConnectionMode connectionMode,
                               String globalDatabaseAccountName,
                               String applicationRegion,
                               String hostEnvInfo,
                               Boolean acceleratedNetworking,
                               List<String> preferredRegions) {
        this.machineId = machineId;
        this.clientId = clientId;
        this.processId = processId;
        this.userAgent = userAgent;
        this.connectionMode = connectionMode;
        this.globalDatabaseAccountName = globalDatabaseAccountName;
        this.applicationRegion = applicationRegion;
        this.hostEnvInfo = hostEnvInfo;
        this.acceleratedNetworking = acceleratedNetworking;
        this.systemInfoMap = new ConcurrentHashMap<>();
        this.cacheRefreshInfoMap = new ConcurrentHashMap<>();
        this.operationInfoMap = new ConcurrentHashMap<>();
        this.aggregationIntervalInSec = Configs.getClientTelemetrySchedulingInSec();
        this.preferredRegions = preferredRegions;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public ConnectionMode getConnectionMode() {
        return connectionMode;
    }

    public void setConnectionMode(ConnectionMode connectionMode) {
        this.connectionMode = connectionMode;
    }

    public String getGlobalDatabaseAccountName() {
        return globalDatabaseAccountName;
    }

    public void setGlobalDatabaseAccountName(String globalDatabaseAccountName) {
        this.globalDatabaseAccountName = globalDatabaseAccountName;
    }

    public String getApplicationRegion() {
        return applicationRegion;
    }

    public void setApplicationRegion(String applicationRegion) {
        this.applicationRegion = applicationRegion;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getHostEnvInfo() {
        return hostEnvInfo;
    }

    public void setHostEnvInfo(String hostEnvInfo) {
        this.hostEnvInfo = hostEnvInfo;
    }

    public Boolean getAcceleratedNetworking() {
        return acceleratedNetworking;
    }

    public void setAcceleratedNetworking(Boolean acceleratedNetworking) {
        this.acceleratedNetworking = acceleratedNetworking;
    }

    public int getAggregationIntervalInSec() {
        return aggregationIntervalInSec;
    }

    public void setAggregationIntervalInSec(int aggregationIntervalInSec) {
        this.aggregationIntervalInSec = aggregationIntervalInSec;
    }

    public List<String> getPreferredRegions() {
        return preferredRegions;
    }

    public void setPreferredRegions(List<String> preferredRegions) {
        this.preferredRegions = preferredRegions;
    }

    public Map<ReportPayload, ConcurrentDoubleHistogram> getSystemInfoMap() {
        return systemInfoMap;
    }

    public void setSystemInfoMap(Map<ReportPayload, ConcurrentDoubleHistogram> systemInfoMap) {
        this.systemInfoMap = systemInfoMap;
    }

    public Map<ReportPayload, ConcurrentDoubleHistogram> getCacheRefreshInfoMap() {
        return cacheRefreshInfoMap;
    }

    public void setCacheRefreshInfoMap(Map<ReportPayload, ConcurrentDoubleHistogram> cacheRefreshInfoMap) {
        this.cacheRefreshInfoMap = cacheRefreshInfoMap;
    }

    public Map<ReportPayload, ConcurrentDoubleHistogram> getOperationInfoMap() {
        return operationInfoMap;
    }

    public void setOperationInfoMap(Map<ReportPayload, ConcurrentDoubleHistogram> operationInfoMap) {
        this.operationInfoMap = operationInfoMap;
    }
}
