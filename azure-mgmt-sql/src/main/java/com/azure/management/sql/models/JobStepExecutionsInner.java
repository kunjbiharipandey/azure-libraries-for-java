// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import java.time.OffsetDateTime;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * JobStepExecutions.
 */
public final class JobStepExecutionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private JobStepExecutionsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of JobStepExecutionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public JobStepExecutionsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(JobStepExecutionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientJobStepExecutions to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientJobStepExecutions")
    private interface JobStepExecutionsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/executions/{jobExecutionId}/steps")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionListResultInner>> listByJobExecution(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("jobName") String jobName, @PathParam("jobExecutionId") UUID jobExecutionId, @QueryParam("createTimeMin") OffsetDateTime createTimeMin, @QueryParam("createTimeMax") OffsetDateTime createTimeMax, @QueryParam("endTimeMin") OffsetDateTime endTimeMin, @QueryParam("endTimeMax") OffsetDateTime endTimeMax, @QueryParam("isActive") Boolean isActive, @QueryParam("$skip") Integer skip, @QueryParam("$top") Integer top, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/executions/{jobExecutionId}/steps/{stepName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("jobName") String jobName, @PathParam("jobExecutionId") UUID jobExecutionId, @PathParam("stepName") String stepName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionListResultInner>> listByJobExecutionNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Lists the step executions of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @param createTimeMin 
     * @param createTimeMax 
     * @param endTimeMin 
     * @param endTimeMax 
     * @param isActive 
     * @param skip 
     * @param top 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobExecutionInner>> listByJobExecutionSinglePageAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId, OffsetDateTime createTimeMin, OffsetDateTime createTimeMax, OffsetDateTime endTimeMin, OffsetDateTime endTimeMax, Boolean isActive, Integer skip, Integer top) {
        final String apiVersion = "2017-03-01-preview";
        return service.listByJobExecution(this.client.getHost(), resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Lists the step executions of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @param createTimeMin 
     * @param createTimeMax 
     * @param endTimeMin 
     * @param endTimeMax 
     * @param isActive 
     * @param skip 
     * @param top 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobExecutionInner> listByJobExecutionAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId, OffsetDateTime createTimeMin, OffsetDateTime createTimeMax, OffsetDateTime endTimeMin, OffsetDateTime endTimeMax, Boolean isActive, Integer skip, Integer top) {
        return new PagedFlux<>(
            () -> listByJobExecutionSinglePageAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top),
            nextLink -> listByJobExecutionNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the step executions of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobExecutionInner> listByJobExecutionAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        final OffsetDateTime createTimeMin = null;
        final OffsetDateTime createTimeMax = null;
        final OffsetDateTime endTimeMin = null;
        final OffsetDateTime endTimeMax = null;
        final Boolean isActive = null;
        final Integer skip = null;
        final Integer top = null;
        final String apiVersion = "2017-03-01-preview";
        return new PagedFlux<>(
            () -> listByJobExecutionSinglePageAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top),
            nextLink -> listByJobExecutionNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the step executions of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @param createTimeMin 
     * @param createTimeMax 
     * @param endTimeMin 
     * @param endTimeMax 
     * @param isActive 
     * @param skip 
     * @param top 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobExecutionInner> listByJobExecution(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId, OffsetDateTime createTimeMin, OffsetDateTime createTimeMax, OffsetDateTime endTimeMin, OffsetDateTime endTimeMax, Boolean isActive, Integer skip, Integer top) {
        return new PagedIterable<>(listByJobExecutionAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top));
    }

    /**
     * Lists the step executions of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobExecutionInner> listByJobExecution(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        final OffsetDateTime createTimeMin = null;
        final OffsetDateTime createTimeMax = null;
        final OffsetDateTime endTimeMin = null;
        final OffsetDateTime endTimeMax = null;
        final Boolean isActive = null;
        final Integer skip = null;
        final Integer top = null;
        final String apiVersion = "2017-03-01-preview";
        return new PagedIterable<>(listByJobExecutionAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top));
    }

    /**
     * Gets a step execution of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @param stepName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<JobExecutionInner>> getWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId, String stepName) {
        final String apiVersion = "2017-03-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, stepName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a step execution of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @param stepName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobExecutionInner> getAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId, String stepName) {
        return getWithResponseAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, stepName)
            .flatMap((SimpleResponse<JobExecutionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a step execution of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @param stepName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobExecutionInner get(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId, String stepName) {
        return getAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, stepName).block();
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
    public Mono<PagedResponse<JobExecutionInner>> listByJobExecutionNextSinglePageAsync(String nextLink) {
        return service.listByJobExecutionNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
