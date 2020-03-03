// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.sql.ServerDnsAliasAcquisition;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ServerDnsAliases.
 */
public final class ServerDnsAliasesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ServerDnsAliasesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerDnsAliasesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ServerDnsAliasesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ServerDnsAliasesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientServerDnsAliases to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientServerDnsAliases")
    private interface ServerDnsAliasesService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/dnsAliases/{dnsAliasName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerDnsAliasInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("dnsAliasName") String dnsAliasName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/dnsAliases/{dnsAliasName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("dnsAliasName") String dnsAliasName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/dnsAliases/{dnsAliasName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("dnsAliasName") String dnsAliasName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/dnsAliases")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerDnsAliasListResultInner>> listByServer(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/dnsAliases/{dnsAliasName}/acquire")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> acquire(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("dnsAliasName") String dnsAliasName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ServerDnsAliasAcquisition parameters, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/dnsAliases/{dnsAliasName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerDnsAliasInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("dnsAliasName") String dnsAliasName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/dnsAliases/{dnsAliasName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("dnsAliasName") String dnsAliasName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/dnsAliases/{dnsAliasName}/acquire")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginAcquire(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("dnsAliasName") String dnsAliasName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ServerDnsAliasAcquisition parameters, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerDnsAliasListResultInner>> listByServerNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a server DNS alias.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServerDnsAliasInner>> getWithResponseAsync(String resourceGroupName, String serverName, String dnsAliasName) {
        final String apiVersion = "2017-03-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, dnsAliasName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a server DNS alias.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerDnsAliasInner> getAsync(String resourceGroupName, String serverName, String dnsAliasName) {
        return getWithResponseAsync(resourceGroupName, serverName, dnsAliasName)
            .flatMap((SimpleResponse<ServerDnsAliasInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a server DNS alias.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerDnsAliasInner get(String resourceGroupName, String serverName, String dnsAliasName) {
        return getAsync(resourceGroupName, serverName, dnsAliasName).block();
    }

    /**
     * Creates a server dns alias.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String dnsAliasName) {
        final String apiVersion = "2017-03-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, dnsAliasName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Creates a server dns alias.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerDnsAliasInner> createOrUpdateAsync(String resourceGroupName, String serverName, String dnsAliasName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, serverName, dnsAliasName);
        return client.<ServerDnsAliasInner, ServerDnsAliasInner>getLroResultAsync(response, client.getHttpPipeline(), ServerDnsAliasInner.class, ServerDnsAliasInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates a server dns alias.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerDnsAliasInner createOrUpdate(String resourceGroupName, String serverName, String dnsAliasName) {
        return createOrUpdateAsync(resourceGroupName, serverName, dnsAliasName).block();
    }

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName, String dnsAliasName) {
        final String apiVersion = "2017-03-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, serverName, dnsAliasName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String dnsAliasName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, serverName, dnsAliasName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String dnsAliasName) {
        deleteAsync(resourceGroupName, serverName, dnsAliasName).block();
    }

    /**
     * Gets a list of server DNS aliases for a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ServerDnsAliasInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
        final String apiVersion = "2017-03-01-preview";
        return service.listByServer(this.client.getHost(), resourceGroupName, serverName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of server DNS aliases for a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ServerDnsAliasInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName),
            nextLink -> listByServerNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of server DNS aliases for a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServerDnsAliasInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @param oldServerDnsAliasId The id of the server alias that will be acquired to point to this server instead.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> acquireWithResponseAsync(String resourceGroupName, String serverName, String dnsAliasName, String oldServerDnsAliasId) {
        final String apiVersion = "2017-03-01-preview";
        ServerDnsAliasAcquisition parameters = new ServerDnsAliasAcquisition();
        parameters.withOldServerDnsAliasId(oldServerDnsAliasId);
        return service.acquire(this.client.getHost(), resourceGroupName, serverName, dnsAliasName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @param oldServerDnsAliasId The id of the server alias that will be acquired to point to this server instead.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> acquireAsync(String resourceGroupName, String serverName, String dnsAliasName, String oldServerDnsAliasId) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = acquireWithResponseAsync(resourceGroupName, serverName, dnsAliasName, oldServerDnsAliasId);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @param oldServerDnsAliasId The id of the server alias that will be acquired to point to this server instead.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void acquire(String resourceGroupName, String serverName, String dnsAliasName, String oldServerDnsAliasId) {
        acquireAsync(resourceGroupName, serverName, dnsAliasName, oldServerDnsAliasId).block();
    }

    /**
     * Creates a server dns alias.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServerDnsAliasInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String dnsAliasName) {
        final String apiVersion = "2017-03-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serverName, dnsAliasName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Creates a server dns alias.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerDnsAliasInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String dnsAliasName) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, dnsAliasName)
            .flatMap((SimpleResponse<ServerDnsAliasInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates a server dns alias.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerDnsAliasInner beginCreateOrUpdate(String resourceGroupName, String serverName, String dnsAliasName) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, dnsAliasName).block();
    }

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String serverName, String dnsAliasName) {
        final String apiVersion = "2017-03-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, serverName, dnsAliasName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String serverName, String dnsAliasName) {
        return beginDeleteWithResponseAsync(resourceGroupName, serverName, dnsAliasName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String serverName, String dnsAliasName) {
        beginDeleteAsync(resourceGroupName, serverName, dnsAliasName).block();
    }

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @param oldServerDnsAliasId The id of the server alias that will be acquired to point to this server instead.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginAcquireWithResponseAsync(String resourceGroupName, String serverName, String dnsAliasName, String oldServerDnsAliasId) {
        final String apiVersion = "2017-03-01-preview";
        ServerDnsAliasAcquisition parameters = new ServerDnsAliasAcquisition();
        parameters.withOldServerDnsAliasId(oldServerDnsAliasId);
        return service.beginAcquire(this.client.getHost(), resourceGroupName, serverName, dnsAliasName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @param oldServerDnsAliasId The id of the server alias that will be acquired to point to this server instead.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginAcquireAsync(String resourceGroupName, String serverName, String dnsAliasName, String oldServerDnsAliasId) {
        return beginAcquireWithResponseAsync(resourceGroupName, serverName, dnsAliasName, oldServerDnsAliasId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param dnsAliasName 
     * @param oldServerDnsAliasId The id of the server alias that will be acquired to point to this server instead.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginAcquire(String resourceGroupName, String serverName, String dnsAliasName, String oldServerDnsAliasId) {
        beginAcquireAsync(resourceGroupName, serverName, dnsAliasName, oldServerDnsAliasId).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ServerDnsAliasInner>> listByServerNextSinglePageAsync(String nextLink) {
        return service.listByServerNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
