/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2019_02_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appconfiguration.v2019_02_01_preview.implementation.AppConfigurationManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appconfiguration.v2019_02_01_preview.implementation.ConfigurationStoreInner;

/**
 * Type representing ConfigurationStore.
 */
public interface ConfigurationStore extends HasInner<ConfigurationStoreInner>, Resource, GroupableResourceCore<AppConfigurationManager, ConfigurationStoreInner>, HasResourceGroup, Refreshable<ConfigurationStore>, Updatable<ConfigurationStore.Update>, HasManager<AppConfigurationManager> {
    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * The entirety of the ConfigurationStore definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ConfigurationStore definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ConfigurationStore definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ConfigurationStore definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ConfigurationStore>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a ConfigurationStore update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ConfigurationStore>, Resource.UpdateWithTags<Update>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of ConfigurationStore update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the configurationstore update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The properties for updating a configuration store
             * @return the next update stage
             */
            Update withProperties(Object properties);
        }

    }
}