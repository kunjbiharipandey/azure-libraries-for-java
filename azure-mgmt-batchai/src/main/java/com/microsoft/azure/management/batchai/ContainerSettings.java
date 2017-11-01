/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for the container to be downloaded.
 */
public class ContainerSettings {
    /**
     * Registry to download the container from.
     */
    @JsonProperty(value = "imageSourceRegistry", required = true)
    private ImageSourceRegistry imageSourceRegistry;

    /**
     * Get the imageSourceRegistry value.
     *
     * @return the imageSourceRegistry value
     */
    public ImageSourceRegistry imageSourceRegistry() {
        return this.imageSourceRegistry;
    }

    /**
     * Set the imageSourceRegistry value.
     *
     * @param imageSourceRegistry the imageSourceRegistry value to set
     * @return the ContainerSettings object itself.
     */
    public ContainerSettings withImageSourceRegistry(ImageSourceRegistry imageSourceRegistry) {
        this.imageSourceRegistry = imageSourceRegistry;
        return this;
    }

}