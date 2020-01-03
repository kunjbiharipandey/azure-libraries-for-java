/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Routing preference defines the type of network, either microsoft or internet
 * routing to be used to deliver the user data, the default option is microsoft
 * routing.
 */
public class RoutingPreference {
    /**
     * Routing Choice defines the kind of network routing opted by the user.
     * Possible values include: 'MicrosoftRouting', 'InternetRouting'.
     */
    @JsonProperty(value = "routingChoice")
    private RoutingChoice routingChoice;

    /**
     * A boolean flag which indicates whether microsoft routing storage
     * endpoints are to be published.
     */
    @JsonProperty(value = "publishMicrosoftEndpoints")
    private Boolean publishMicrosoftEndpoints;

    /**
     * A boolean flag which indicates whether internet routing storage
     * endpoints are to be published.
     */
    @JsonProperty(value = "publishInternetEndpoints")
    private Boolean publishInternetEndpoints;

    /**
     * Get routing Choice defines the kind of network routing opted by the user. Possible values include: 'MicrosoftRouting', 'InternetRouting'.
     *
     * @return the routingChoice value
     */
    public RoutingChoice routingChoice() {
        return this.routingChoice;
    }

    /**
     * Set routing Choice defines the kind of network routing opted by the user. Possible values include: 'MicrosoftRouting', 'InternetRouting'.
     *
     * @param routingChoice the routingChoice value to set
     * @return the RoutingPreference object itself.
     */
    public RoutingPreference withRoutingChoice(RoutingChoice routingChoice) {
        this.routingChoice = routingChoice;
        return this;
    }

    /**
     * Get a boolean flag which indicates whether microsoft routing storage endpoints are to be published.
     *
     * @return the publishMicrosoftEndpoints value
     */
    public Boolean publishMicrosoftEndpoints() {
        return this.publishMicrosoftEndpoints;
    }

    /**
     * Set a boolean flag which indicates whether microsoft routing storage endpoints are to be published.
     *
     * @param publishMicrosoftEndpoints the publishMicrosoftEndpoints value to set
     * @return the RoutingPreference object itself.
     */
    public RoutingPreference withPublishMicrosoftEndpoints(Boolean publishMicrosoftEndpoints) {
        this.publishMicrosoftEndpoints = publishMicrosoftEndpoints;
        return this;
    }

    /**
     * Get a boolean flag which indicates whether internet routing storage endpoints are to be published.
     *
     * @return the publishInternetEndpoints value
     */
    public Boolean publishInternetEndpoints() {
        return this.publishInternetEndpoints;
    }

    /**
     * Set a boolean flag which indicates whether internet routing storage endpoints are to be published.
     *
     * @param publishInternetEndpoints the publishInternetEndpoints value to set
     * @return the RoutingPreference object itself.
     */
    public RoutingPreference withPublishInternetEndpoints(Boolean publishInternetEndpoints) {
        this.publishInternetEndpoints = publishInternetEndpoints;
        return this;
    }

}
