/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2018_05_01.implementation;

import java.util.List;
import com.microsoft.azure.management.policy.v2018_05_01.PolicySku;
import com.microsoft.azure.management.policy.v2018_05_01.Identity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The policy assignment.
 */
@JsonFlatten
public class PolicyAssignmentInner extends ProxyResource {
    /**
     * The display name of the policy assignment.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The ID of the policy definition or policy set definition being assigned.
     */
    @JsonProperty(value = "properties.policyDefinitionId")
    private String policyDefinitionId;

    /**
     * The scope for the policy assignment.
     */
    @JsonProperty(value = "properties.scope")
    private String scopeProperty;

    /**
     * The policy's excluded scopes.
     */
    @JsonProperty(value = "properties.notScopes")
    private List<String> notScopes;

    /**
     * Required if a parameter is used in policy rule.
     */
    @JsonProperty(value = "properties.parameters")
    private Object parameters;

    /**
     * This message will be part of response in case of policy violation.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The policy assignment metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /**
     * The policy sku. This property is optional, obsolete, and will be
     * ignored.
     */
    @JsonProperty(value = "sku")
    private PolicySku sku;

    /**
     * The location of the policy assignment. Only required when utilizing
     * managed identity.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The managed identity associated with the policy assignment.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Get the display name of the policy assignment.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the policy assignment.
     *
     * @param displayName the displayName value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the ID of the policy definition or policy set definition being assigned.
     *
     * @return the policyDefinitionId value
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the ID of the policy definition or policy set definition being assigned.
     *
     * @param policyDefinitionId the policyDefinitionId value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get the scope for the policy assignment.
     *
     * @return the scopeProperty value
     */
    public String scopeProperty() {
        return this.scopeProperty;
    }

    /**
     * Set the scope for the policy assignment.
     *
     * @param scopeProperty the scopeProperty value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withScopeProperty(String scopeProperty) {
        this.scopeProperty = scopeProperty;
        return this;
    }

    /**
     * Get the policy's excluded scopes.
     *
     * @return the notScopes value
     */
    public List<String> notScopes() {
        return this.notScopes;
    }

    /**
     * Set the policy's excluded scopes.
     *
     * @param notScopes the notScopes value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withNotScopes(List<String> notScopes) {
        this.notScopes = notScopes;
        return this;
    }

    /**
     * Get required if a parameter is used in policy rule.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set required if a parameter is used in policy rule.
     *
     * @param parameters the parameters value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get this message will be part of response in case of policy violation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set this message will be part of response in case of policy violation.
     *
     * @param description the description value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the policy assignment metadata.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the policy assignment metadata.
     *
     * @param metadata the metadata value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the policy sku. This property is optional, obsolete, and will be ignored.
     *
     * @return the sku value
     */
    public PolicySku sku() {
        return this.sku;
    }

    /**
     * Set the policy sku. This property is optional, obsolete, and will be ignored.
     *
     * @param sku the sku value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withSku(PolicySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the location of the policy assignment. Only required when utilizing managed identity.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the policy assignment. Only required when utilizing managed identity.
     *
     * @param location the location value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the managed identity associated with the policy assignment.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the managed identity associated with the policy assignment.
     *
     * @param identity the identity value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

}