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
import com.azure.management.sql.JobTarget;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * JobTargetGroups.
 */
public final class JobTargetGroupsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private JobTargetGroupsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of JobTargetGroupsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public JobTargetGroupsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(JobTargetGroupsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientJobTargetGroups to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientJobTargetGroups")
    private interface JobTargetGroupsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/targetGroups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobTargetGroupListResultInner>> listByAgent(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/targetGroups/{targetGroupName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobTargetGroupInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("targetGroupName") String targetGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/targetGroups/{targetGroupName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobTargetGroupInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("targetGroupName") String targetGroupName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") JobTargetGroupInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/targetGroups/{targetGroupName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("targetGroupName") String targetGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobTargetGroupListResultInner>> listByAgentNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets all target groups in an agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobTargetGroupInner>> listByAgentSinglePageAsync(String resourceGroupName, String serverName, String jobAgentName) {
        final String apiVersion = "2017-03-01-preview";
        return service.listByAgent(this.client.getHost(), resourceGroupName, serverName, jobAgentName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all target groups in an agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobTargetGroupInner> listByAgentAsync(String resourceGroupName, String serverName, String jobAgentName) {
        return new PagedFlux<>(
            () -> listByAgentSinglePageAsync(resourceGroupName, serverName, jobAgentName),
            nextLink -> listByAgentNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all target groups in an agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobTargetGroupInner> listByAgent(String resourceGroupName, String serverName, String jobAgentName) {
        return new PagedIterable<>(listByAgentAsync(resourceGroupName, serverName, jobAgentName));
    }

    /**
     * Gets a target group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param targetGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<JobTargetGroupInner>> getWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName) {
        final String apiVersion = "2017-03-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, jobAgentName, targetGroupName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a target group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param targetGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobTargetGroupInner> getAsync(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName) {
        return getWithResponseAsync(resourceGroupName, serverName, jobAgentName, targetGroupName)
            .flatMap((SimpleResponse<JobTargetGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a target group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param targetGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobTargetGroupInner get(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName) {
        return getAsync(resourceGroupName, serverName, jobAgentName, targetGroupName).block();
    }

    /**
     * Creates or updates a target group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param targetGroupName 
     * @param members Members of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<JobTargetGroupInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName, List<JobTarget> members) {
        final String apiVersion = "2017-03-01-preview";
        JobTargetGroupInner parameters = new JobTargetGroupInner();
        parameters.withMembers(members);
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, jobAgentName, targetGroupName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a target group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param targetGroupName 
     * @param members Members of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobTargetGroupInner> createOrUpdateAsync(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName, List<JobTarget> members) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, jobAgentName, targetGroupName, members)
            .flatMap((SimpleResponse<JobTargetGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a target group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param targetGroupName 
     * @param members Members of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobTargetGroupInner createOrUpdate(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName, List<JobTarget> members) {
        return createOrUpdateAsync(resourceGroupName, serverName, jobAgentName, targetGroupName, members).block();
    }

    /**
     * Deletes a target group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param targetGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName) {
        final String apiVersion = "2017-03-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, serverName, jobAgentName, targetGroupName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a target group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param targetGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName) {
        return deleteWithResponseAsync(resourceGroupName, serverName, jobAgentName, targetGroupName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a target group.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param targetGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName) {
        deleteAsync(resourceGroupName, serverName, jobAgentName, targetGroupName).block();
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
    public Mono<PagedResponse<JobTargetGroupInner>> listByAgentNextSinglePageAsync(String nextLink) {
        return service.listByAgentNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}