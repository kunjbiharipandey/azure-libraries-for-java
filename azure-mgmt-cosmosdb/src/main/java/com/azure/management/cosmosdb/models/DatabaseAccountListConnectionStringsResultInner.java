// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.cosmosdb.DatabaseAccountConnectionString;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DatabaseAccountListConnectionStringsResult model.
 */
@Fluent
public final class DatabaseAccountListConnectionStringsResultInner {
    /*
     * An array that contains the connection strings for the Cosmos DB account.
     */
    @JsonProperty(value = "connectionStrings")
    private List<DatabaseAccountConnectionString> connectionStrings;

    /**
     * Get the connectionStrings property: An array that contains the
     * connection strings for the Cosmos DB account.
     * 
     * @return the connectionStrings value.
     */
    public List<DatabaseAccountConnectionString> connectionStrings() {
        return this.connectionStrings;
    }

    /**
     * Set the connectionStrings property: An array that contains the
     * connection strings for the Cosmos DB account.
     * 
     * @param connectionStrings the connectionStrings value to set.
     * @return the DatabaseAccountListConnectionStringsResultInner object
     * itself.
     */
    public DatabaseAccountListConnectionStringsResultInner withConnectionStrings(List<DatabaseAccountConnectionString> connectionStrings) {
        this.connectionStrings = connectionStrings;
        return this;
    }
}