/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PrivateLinkConnection properties for the network interface.
 */
public class NetworkInterfaceIPConfigurationPrivateLinkConnectionProperties {
    /**
     * The group ID for current private link connection.
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /**
     * The required member name for current private link connection.
     */
    @JsonProperty(value = "requiredMemberName", access = JsonProperty.Access.WRITE_ONLY)
    private String requiredMemberName;

    /**
     * List of FQDNs for current private link connection.
     */
    @JsonProperty(value = "fqdns", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> fqdns;

    /**
     * Get the group ID for current private link connection.
     *
     * @return the groupId value
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the required member name for current private link connection.
     *
     * @return the requiredMemberName value
     */
    public String requiredMemberName() {
        return this.requiredMemberName;
    }

    /**
     * Get list of FQDNs for current private link connection.
     *
     * @return the fqdns value
     */
    public List<String> fqdns() {
        return this.fqdns;
    }

}