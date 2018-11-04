/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of build properties that can be updated.
 */
public class BuildUpdateParameters {
    /**
     * The value that indicates whether archiving is enabled or not.
     */
    @JsonProperty(value = "isArchiveEnabled")
    private Boolean isArchiveEnabled;

    /**
     * Get the isArchiveEnabled value.
     *
     * @return the isArchiveEnabled value
     */
    public Boolean isArchiveEnabled() {
        return this.isArchiveEnabled;
    }

    /**
     * Set the isArchiveEnabled value.
     *
     * @param isArchiveEnabled the isArchiveEnabled value to set
     * @return the BuildUpdateParameters object itself.
     */
    public BuildUpdateParameters withIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.isArchiveEnabled = isArchiveEnabled;
        return this;
    }

}