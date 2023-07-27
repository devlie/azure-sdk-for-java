// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.chaos.fluent.CapabilityTypesClient;
import com.azure.resourcemanager.chaos.fluent.models.CapabilityTypeInner;
import com.azure.resourcemanager.chaos.models.CapabilityTypeListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CapabilityTypesClient. */
public final class CapabilityTypesClientImpl implements CapabilityTypesClient {
    /** The proxy service used to perform REST calls. */
    private final CapabilityTypesService service;

    /** The service client containing this operation class. */
    private final ChaosManagementClientImpl client;

    /**
     * Initializes an instance of CapabilityTypesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CapabilityTypesClientImpl(ChaosManagementClientImpl client) {
        this.service =
            RestProxy.create(CapabilityTypesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ChaosManagementClientCapabilityTypes to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ChaosManagementClien")
    public interface CapabilityTypesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Chaos/locations/{locationName}/targetTypes/{targetTypeName}/capabilityTypes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CapabilityTypeListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("locationName") String locationName,
            @PathParam("targetTypeName") String targetTypeName,
            @QueryParam("continuationToken") String continuationToken,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Chaos/locations/{locationName}/targetTypes/{targetTypeName}/capabilityTypes/{capabilityTypeName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CapabilityTypeInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("locationName") String locationName,
            @PathParam("targetTypeName") String targetTypeName,
            @PathParam("capabilityTypeName") String capabilityTypeName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CapabilityTypeListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get a list of Capability Type resources for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param continuationToken String that sets the continuation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Capability Type resources for given Target Type and location along with {@link PagedResponse}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CapabilityTypeInner>> listSinglePageAsync(
        String locationName, String targetTypeName, String continuationToken) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (targetTypeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter targetTypeName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            locationName,
                            targetTypeName,
                            continuationToken,
                            accept,
                            context))
            .<PagedResponse<CapabilityTypeInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a list of Capability Type resources for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param continuationToken String that sets the continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Capability Type resources for given Target Type and location along with {@link PagedResponse}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CapabilityTypeInner>> listSinglePageAsync(
        String locationName, String targetTypeName, String continuationToken, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (targetTypeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter targetTypeName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                locationName,
                targetTypeName,
                continuationToken,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get a list of Capability Type resources for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param continuationToken String that sets the continuation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Capability Type resources for given Target Type and location as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CapabilityTypeInner> listAsync(
        String locationName, String targetTypeName, String continuationToken) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(locationName, targetTypeName, continuationToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get a list of Capability Type resources for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Capability Type resources for given Target Type and location as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CapabilityTypeInner> listAsync(String locationName, String targetTypeName) {
        final String continuationToken = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(locationName, targetTypeName, continuationToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get a list of Capability Type resources for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param continuationToken String that sets the continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Capability Type resources for given Target Type and location as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CapabilityTypeInner> listAsync(
        String locationName, String targetTypeName, String continuationToken, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(locationName, targetTypeName, continuationToken, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get a list of Capability Type resources for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Capability Type resources for given Target Type and location as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CapabilityTypeInner> list(String locationName, String targetTypeName) {
        final String continuationToken = null;
        return new PagedIterable<>(listAsync(locationName, targetTypeName, continuationToken));
    }

    /**
     * Get a list of Capability Type resources for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param continuationToken String that sets the continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Capability Type resources for given Target Type and location as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CapabilityTypeInner> list(
        String locationName, String targetTypeName, String continuationToken, Context context) {
        return new PagedIterable<>(listAsync(locationName, targetTypeName, continuationToken, context));
    }

    /**
     * Get a Capability Type resource for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param capabilityTypeName String that represents a Capability Type resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Capability Type resource for given Target Type and location along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CapabilityTypeInner>> getWithResponseAsync(
        String locationName, String targetTypeName, String capabilityTypeName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (targetTypeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter targetTypeName is required and cannot be null."));
        }
        if (capabilityTypeName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter capabilityTypeName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            locationName,
                            targetTypeName,
                            capabilityTypeName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a Capability Type resource for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param capabilityTypeName String that represents a Capability Type resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Capability Type resource for given Target Type and location along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CapabilityTypeInner>> getWithResponseAsync(
        String locationName, String targetTypeName, String capabilityTypeName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (targetTypeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter targetTypeName is required and cannot be null."));
        }
        if (capabilityTypeName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter capabilityTypeName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                locationName,
                targetTypeName,
                capabilityTypeName,
                accept,
                context);
    }

    /**
     * Get a Capability Type resource for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param capabilityTypeName String that represents a Capability Type resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Capability Type resource for given Target Type and location on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CapabilityTypeInner> getAsync(String locationName, String targetTypeName, String capabilityTypeName) {
        return getWithResponseAsync(locationName, targetTypeName, capabilityTypeName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a Capability Type resource for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param capabilityTypeName String that represents a Capability Type resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Capability Type resource for given Target Type and location along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CapabilityTypeInner> getWithResponse(
        String locationName, String targetTypeName, String capabilityTypeName, Context context) {
        return getWithResponseAsync(locationName, targetTypeName, capabilityTypeName, context).block();
    }

    /**
     * Get a Capability Type resource for given Target Type and location.
     *
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param capabilityTypeName String that represents a Capability Type resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Capability Type resource for given Target Type and location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CapabilityTypeInner get(String locationName, String targetTypeName, String capabilityTypeName) {
        return getWithResponse(locationName, targetTypeName, capabilityTypeName, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents a list of Capability Type resources and a link for pagination along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CapabilityTypeInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<CapabilityTypeInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents a list of Capability Type resources and a link for pagination along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CapabilityTypeInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
