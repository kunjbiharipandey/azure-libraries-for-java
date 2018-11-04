/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BuildStatus.
 */
public final class BuildStatus extends ExpandableStringEnum<BuildStatus> {
    /** Static value Queued for BuildStatus. */
    public static final BuildStatus QUEUED = fromString("Queued");

    /** Static value Started for BuildStatus. */
    public static final BuildStatus STARTED = fromString("Started");

    /** Static value Running for BuildStatus. */
    public static final BuildStatus RUNNING = fromString("Running");

    /** Static value Succeeded for BuildStatus. */
    public static final BuildStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for BuildStatus. */
    public static final BuildStatus FAILED = fromString("Failed");

    /** Static value Canceled for BuildStatus. */
    public static final BuildStatus CANCELED = fromString("Canceled");

    /** Static value Error for BuildStatus. */
    public static final BuildStatus ERROR = fromString("Error");

    /** Static value Timeout for BuildStatus. */
    public static final BuildStatus TIMEOUT = fromString("Timeout");

    /**
     * Creates or finds a BuildStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding BuildStatus
     */
    @JsonCreator
    public static BuildStatus fromString(String name) {
        return fromString(name, BuildStatus.class);
    }

    /**
     * @return known BuildStatus values
     */
    public static Collection<BuildStatus> values() {
        return values(BuildStatus.class);
    }
}