/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Connection state snapshot.
 */
public class ConnectionStateSnapshot {
    /**
     * The connection state. Possible values include: 'Reachable',
     * 'Unreachable', 'Unknown'.
     */
    @JsonProperty(value = "connectionState")
    private ConnectionState connectionState;

    /**
     * The start time of the connection snapshot.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The end time of the connection snapshot.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Connectivity analysis evaluation state. Possible values include:
     * 'NotStarted', 'InProgress', 'Completed'.
     */
    @JsonProperty(value = "evaluationState")
    private EvaluationState evaluationState;

    /**
     * Average latency in ms.
     */
    @JsonProperty(value = "avgLatencyInMs")
    private Integer avgLatencyInMs;

    /**
     * Minimum latency in ms.
     */
    @JsonProperty(value = "minLatencyInMs")
    private Integer minLatencyInMs;

    /**
     * Maximum latency in ms.
     */
    @JsonProperty(value = "maxLatencyInMs")
    private Integer maxLatencyInMs;

    /**
     * The number of sent probes.
     */
    @JsonProperty(value = "probesSent")
    private Integer probesSent;

    /**
     * The number of failed probes.
     */
    @JsonProperty(value = "probesFailed")
    private Integer probesFailed;

    /**
     * List of hops between the source and the destination.
     */
    @JsonProperty(value = "hops", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectivityHop> hops;

    /**
     * Get the connection state. Possible values include: 'Reachable', 'Unreachable', 'Unknown'.
     *
     * @return the connectionState value
     */
    public ConnectionState connectionState() {
        return this.connectionState;
    }

    /**
     * Set the connection state. Possible values include: 'Reachable', 'Unreachable', 'Unknown'.
     *
     * @param connectionState the connectionState value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * Get the start time of the connection snapshot.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time of the connection snapshot.
     *
     * @param startTime the startTime value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the end time of the connection snapshot.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the end time of the connection snapshot.
     *
     * @param endTime the endTime value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get connectivity analysis evaluation state. Possible values include: 'NotStarted', 'InProgress', 'Completed'.
     *
     * @return the evaluationState value
     */
    public EvaluationState evaluationState() {
        return this.evaluationState;
    }

    /**
     * Set connectivity analysis evaluation state. Possible values include: 'NotStarted', 'InProgress', 'Completed'.
     *
     * @param evaluationState the evaluationState value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withEvaluationState(EvaluationState evaluationState) {
        this.evaluationState = evaluationState;
        return this;
    }

    /**
     * Get average latency in ms.
     *
     * @return the avgLatencyInMs value
     */
    public Integer avgLatencyInMs() {
        return this.avgLatencyInMs;
    }

    /**
     * Set average latency in ms.
     *
     * @param avgLatencyInMs the avgLatencyInMs value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withAvgLatencyInMs(Integer avgLatencyInMs) {
        this.avgLatencyInMs = avgLatencyInMs;
        return this;
    }

    /**
     * Get minimum latency in ms.
     *
     * @return the minLatencyInMs value
     */
    public Integer minLatencyInMs() {
        return this.minLatencyInMs;
    }

    /**
     * Set minimum latency in ms.
     *
     * @param minLatencyInMs the minLatencyInMs value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withMinLatencyInMs(Integer minLatencyInMs) {
        this.minLatencyInMs = minLatencyInMs;
        return this;
    }

    /**
     * Get maximum latency in ms.
     *
     * @return the maxLatencyInMs value
     */
    public Integer maxLatencyInMs() {
        return this.maxLatencyInMs;
    }

    /**
     * Set maximum latency in ms.
     *
     * @param maxLatencyInMs the maxLatencyInMs value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withMaxLatencyInMs(Integer maxLatencyInMs) {
        this.maxLatencyInMs = maxLatencyInMs;
        return this;
    }

    /**
     * Get the number of sent probes.
     *
     * @return the probesSent value
     */
    public Integer probesSent() {
        return this.probesSent;
    }

    /**
     * Set the number of sent probes.
     *
     * @param probesSent the probesSent value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withProbesSent(Integer probesSent) {
        this.probesSent = probesSent;
        return this;
    }

    /**
     * Get the number of failed probes.
     *
     * @return the probesFailed value
     */
    public Integer probesFailed() {
        return this.probesFailed;
    }

    /**
     * Set the number of failed probes.
     *
     * @param probesFailed the probesFailed value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withProbesFailed(Integer probesFailed) {
        this.probesFailed = probesFailed;
        return this;
    }

    /**
     * Get list of hops between the source and the destination.
     *
     * @return the hops value
     */
    public List<ConnectivityHop> hops() {
        return this.hops;
    }

}
