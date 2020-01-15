/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation.DeploymentManagerManager;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation.ArtifactSourceInner;

/**
 * Type representing ArtifactSource.
 */
public interface ArtifactSource extends HasInner<ArtifactSourceInner>, Resource, GroupableResourceCore<DeploymentManagerManager, ArtifactSourceInner>, HasResourceGroup, Refreshable<ArtifactSource>, Updatable<ArtifactSource.Update>, HasManager<DeploymentManagerManager> {
    /**
     * @return the artifactRoot value.
     */
    String artifactRoot();

    /**
     * @return the authentication value.
     */
    Authentication authentication();

    /**
     * @return the sourceType value.
     */
    String sourceType();

    /**
     * The entirety of the ArtifactSource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithAuthentication, DefinitionStages.WithSourceType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ArtifactSource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ArtifactSource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ArtifactSource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithAuthentication> {
        }

        /**
         * The stage of the artifactsource definition allowing to specify Authentication.
         */
        interface WithAuthentication {
           /**
            * Specifies authentication.
            * @param authentication The authentication method to use to access the artifact source
            * @return the next definition stage
*/
            WithSourceType withAuthentication(Authentication authentication);
        }

        /**
         * The stage of the artifactsource definition allowing to specify SourceType.
         */
        interface WithSourceType {
           /**
            * Specifies sourceType.
            * @param sourceType The type of artifact source used
            * @return the next definition stage
*/
            WithCreate withSourceType(String sourceType);
        }

        /**
         * The stage of the artifactsource definition allowing to specify ArtifactRoot.
         */
        interface WithArtifactRoot {
            /**
             * Specifies artifactRoot.
             * @param artifactRoot The path from the location that the 'authentication' property [say, a SAS URI to the blob container] refers to, to the location of the artifacts. This can be used to differentiate different versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced by the authentication property concatenated with this optional artifactRoot path forms the artifact source location where the artifacts are expected to be found
             * @return the next definition stage
             */
            WithCreate withArtifactRoot(String artifactRoot);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ArtifactSource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithArtifactRoot {
        }
    }
    /**
     * The template for a ArtifactSource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ArtifactSource>, Resource.UpdateWithTags<Update>, UpdateStages.WithArtifactRoot {
    }

    /**
     * Grouping of ArtifactSource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the artifactsource update allowing to specify ArtifactRoot.
         */
        interface WithArtifactRoot {
            /**
             * Specifies artifactRoot.
             * @param artifactRoot The path from the location that the 'authentication' property [say, a SAS URI to the blob container] refers to, to the location of the artifacts. This can be used to differentiate different versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced by the authentication property concatenated with this optional artifactRoot path forms the artifact source location where the artifacts are expected to be found
             * @return the next update stage
             */
            Update withArtifactRoot(String artifactRoot);
        }

    }
}