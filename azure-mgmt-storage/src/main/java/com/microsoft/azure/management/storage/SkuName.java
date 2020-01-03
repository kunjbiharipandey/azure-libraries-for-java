/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuName.
 */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /** Static value Standard_LRS for SkuName. */
    public static final SkuName STANDARD_LRS = fromString("Standard_LRS");

    /** Static value Standard_GRS for SkuName. */
    public static final SkuName STANDARD_GRS = fromString("Standard_GRS");

    /** Static value Standard_RAGRS for SkuName. */
    public static final SkuName STANDARD_RAGRS = fromString("Standard_RAGRS");

    /** Static value Standard_ZRS for SkuName. */
    public static final SkuName STANDARD_ZRS = fromString("Standard_ZRS");

    /** Static value Premium_LRS for SkuName. */
    public static final SkuName PREMIUM_LRS = fromString("Premium_LRS");

    /** Static value Premium_ZRS for SkuName. */
    public static final SkuName PREMIUM_ZRS = fromString("Premium_ZRS");

    /** Static value Standard_GZRS for SkuName. */
    public static final SkuName STANDARD_GZRS = fromString("Standard_GZRS");

    /** Static value Standard_RAGZRS for SkuName. */
    public static final SkuName STANDARD_RAGZRS = fromString("Standard_RAGZRS");

    /**
     * Creates or finds a SkuName from its string representation.
     * @param name a name to look for
     * @return the corresponding SkuName
     */
    @JsonCreator
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /**
     * @return known SkuName values
     */
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
