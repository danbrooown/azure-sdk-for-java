/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The properties of a step resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "stepType", defaultImpl = StepProperties.class)
@JsonTypeName("StepProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "HealthCheck", value = HealthCheckStepProperties.class),
    @JsonSubTypes.Type(name = "Wait", value = WaitStepProperties.class)
})
public class StepProperties {
}