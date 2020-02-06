/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_11_09.implementation;

import com.microsoft.azure.management.kusto.v2019_11_09.ProvisioningState;
import java.util.List;
import com.microsoft.azure.management.kusto.v2019_11_09.DefaultPrincipalsModificationKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Class representing an attached database configuration.
 */
@JsonFlatten
public class AttachedDatabaseConfigurationInner extends ProxyResource {
    /**
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The provisioned state of the resource. Possible values include:
     * 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Moving'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the database which you would like to attach, use * if you
     * want to follow all current and future databases.
     */
    @JsonProperty(value = "properties.databaseName", required = true)
    private String databaseName;

    /**
     * The resource id of the cluster where the databases you would like to
     * attach reside.
     */
    @JsonProperty(value = "properties.clusterResourceId", required = true)
    private String clusterResourceId;

    /**
     * The list of databases from the clusterResourceId which are currently
     * attached to the cluster.
     */
    @JsonProperty(value = "properties.attachedDatabaseNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> attachedDatabaseNames;

    /**
     * The default principals modification kind. Possible values include:
     * 'Union', 'Replace', 'None'.
     */
    @JsonProperty(value = "properties.defaultPrincipalsModificationKind", required = true)
    private DefaultPrincipalsModificationKind defaultPrincipalsModificationKind;

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the provisioned state of the resource. Possible values include: 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Moving'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the database which you would like to attach, use * if you want to follow all current and future databases.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database which you would like to attach, use * if you want to follow all current and future databases.
     *
     * @param databaseName the databaseName value to set
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the resource id of the cluster where the databases you would like to attach reside.
     *
     * @return the clusterResourceId value
     */
    public String clusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * Set the resource id of the cluster where the databases you would like to attach reside.
     *
     * @param clusterResourceId the clusterResourceId value to set
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withClusterResourceId(String clusterResourceId) {
        this.clusterResourceId = clusterResourceId;
        return this;
    }

    /**
     * Get the list of databases from the clusterResourceId which are currently attached to the cluster.
     *
     * @return the attachedDatabaseNames value
     */
    public List<String> attachedDatabaseNames() {
        return this.attachedDatabaseNames;
    }

    /**
     * Get the default principals modification kind. Possible values include: 'Union', 'Replace', 'None'.
     *
     * @return the defaultPrincipalsModificationKind value
     */
    public DefaultPrincipalsModificationKind defaultPrincipalsModificationKind() {
        return this.defaultPrincipalsModificationKind;
    }

    /**
     * Set the default principals modification kind. Possible values include: 'Union', 'Replace', 'None'.
     *
     * @param defaultPrincipalsModificationKind the defaultPrincipalsModificationKind value to set
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withDefaultPrincipalsModificationKind(DefaultPrincipalsModificationKind defaultPrincipalsModificationKind) {
        this.defaultPrincipalsModificationKind = defaultPrincipalsModificationKind;
        return this;
    }

}