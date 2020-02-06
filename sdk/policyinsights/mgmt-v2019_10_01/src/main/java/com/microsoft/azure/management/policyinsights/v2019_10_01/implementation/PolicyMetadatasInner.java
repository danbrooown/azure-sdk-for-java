/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.policyinsights.v2019_10_01.ErrorResponseException;
import com.microsoft.azure.management.policyinsights.v2019_10_01.QueryOptions;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PolicyMetadatas.
 */
public class PolicyMetadatasInner {
    /** The Retrofit service to perform REST calls. */
    private PolicyMetadatasService service;
    /** The service client containing this operation class. */
    private PolicyInsightsClientImpl client;

    /**
     * Initializes an instance of PolicyMetadatasInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PolicyMetadatasInner(Retrofit retrofit, PolicyInsightsClientImpl client) {
        this.service = retrofit.create(PolicyMetadatasService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PolicyMetadatas to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PolicyMetadatasService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyMetadatas getResource" })
        @GET("providers/Microsoft.PolicyInsights/policyMetadata/{resourceName}")
        Observable<Response<ResponseBody>> getResource(@Path(value = "resourceName", encoded = true) String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyMetadatas list" })
        @GET("providers/Microsoft.PolicyInsights/policyMetadata")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("$top") Integer top, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyMetadatas listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PolicyMetadataInner object if successful.
     */
    public PolicyMetadataInner getResource(String resourceName) {
        return getResourceWithServiceResponseAsync(resourceName).toBlocking().single().body();
    }

    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PolicyMetadataInner> getResourceAsync(String resourceName, final ServiceCallback<PolicyMetadataInner> serviceCallback) {
        return ServiceFuture.fromResponse(getResourceWithServiceResponseAsync(resourceName), serviceCallback);
    }

    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PolicyMetadataInner object
     */
    public Observable<PolicyMetadataInner> getResourceAsync(String resourceName) {
        return getResourceWithServiceResponseAsync(resourceName).map(new Func1<ServiceResponse<PolicyMetadataInner>, PolicyMetadataInner>() {
            @Override
            public PolicyMetadataInner call(ServiceResponse<PolicyMetadataInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PolicyMetadataInner object
     */
    public Observable<ServiceResponse<PolicyMetadataInner>> getResourceWithServiceResponseAsync(String resourceName) {
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        final String apiVersion = "2019-10-01";
        return service.getResource(resourceName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PolicyMetadataInner>>>() {
                @Override
                public Observable<ServiceResponse<PolicyMetadataInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PolicyMetadataInner> clientResponse = getResourceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PolicyMetadataInner> getResourceDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PolicyMetadataInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PolicyMetadataInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SlimPolicyMetadataInner&gt; object if successful.
     */
    public PagedList<SlimPolicyMetadataInner> list() {
        ServiceResponse<Page<SlimPolicyMetadataInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<SlimPolicyMetadataInner>(response.body()) {
            @Override
            public Page<SlimPolicyMetadataInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SlimPolicyMetadataInner>> listAsync(final ListOperationCallback<SlimPolicyMetadataInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SlimPolicyMetadataInner&gt; object
     */
    public Observable<Page<SlimPolicyMetadataInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<SlimPolicyMetadataInner>>, Page<SlimPolicyMetadataInner>>() {
                @Override
                public Page<SlimPolicyMetadataInner> call(ServiceResponse<Page<SlimPolicyMetadataInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SlimPolicyMetadataInner&gt; object
     */
    public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<SlimPolicyMetadataInner>>, Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> call(ServiceResponse<Page<SlimPolicyMetadataInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SlimPolicyMetadataInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> listSinglePageAsync() {
        final String apiVersion = "2019-10-01";
        final QueryOptions queryOptions = null;
        Integer top = null;
        return service.list(apiVersion, this.client.acceptLanguage(), top, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SlimPolicyMetadataInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SlimPolicyMetadataInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param queryOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SlimPolicyMetadataInner&gt; object if successful.
     */
    public PagedList<SlimPolicyMetadataInner> list(final QueryOptions queryOptions) {
        ServiceResponse<Page<SlimPolicyMetadataInner>> response = listSinglePageAsync(queryOptions).toBlocking().single();
        return new PagedList<SlimPolicyMetadataInner>(response.body()) {
            @Override
            public Page<SlimPolicyMetadataInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param queryOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SlimPolicyMetadataInner>> listAsync(final QueryOptions queryOptions, final ListOperationCallback<SlimPolicyMetadataInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(queryOptions),
            new Func1<String, Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param queryOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SlimPolicyMetadataInner&gt; object
     */
    public Observable<Page<SlimPolicyMetadataInner>> listAsync(final QueryOptions queryOptions) {
        return listWithServiceResponseAsync(queryOptions)
            .map(new Func1<ServiceResponse<Page<SlimPolicyMetadataInner>>, Page<SlimPolicyMetadataInner>>() {
                @Override
                public Page<SlimPolicyMetadataInner> call(ServiceResponse<Page<SlimPolicyMetadataInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param queryOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SlimPolicyMetadataInner&gt; object
     */
    public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> listWithServiceResponseAsync(final QueryOptions queryOptions) {
        return listSinglePageAsync(queryOptions)
            .concatMap(new Func1<ServiceResponse<Page<SlimPolicyMetadataInner>>, Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> call(ServiceResponse<Page<SlimPolicyMetadataInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get a list of the policy metadata resources.
     *
    ServiceResponse<PageImpl<SlimPolicyMetadataInner>> * @param queryOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SlimPolicyMetadataInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> listSinglePageAsync(final QueryOptions queryOptions) {
        Validator.validate(queryOptions);
        final String apiVersion = "2019-10-01";
        Integer top = null;
        if (queryOptions != null) {
            top = queryOptions.top();
        }
        return service.list(apiVersion, this.client.acceptLanguage(), top, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SlimPolicyMetadataInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SlimPolicyMetadataInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SlimPolicyMetadataInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SlimPolicyMetadataInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SlimPolicyMetadataInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SlimPolicyMetadataInner&gt; object if successful.
     */
    public PagedList<SlimPolicyMetadataInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<SlimPolicyMetadataInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<SlimPolicyMetadataInner>(response.body()) {
            @Override
            public Page<SlimPolicyMetadataInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SlimPolicyMetadataInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<SlimPolicyMetadataInner>> serviceFuture, final ListOperationCallback<SlimPolicyMetadataInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SlimPolicyMetadataInner&gt; object
     */
    public Observable<Page<SlimPolicyMetadataInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<SlimPolicyMetadataInner>>, Page<SlimPolicyMetadataInner>>() {
                @Override
                public Page<SlimPolicyMetadataInner> call(ServiceResponse<Page<SlimPolicyMetadataInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SlimPolicyMetadataInner&gt; object
     */
    public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SlimPolicyMetadataInner>>, Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> call(ServiceResponse<Page<SlimPolicyMetadataInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get a list of the policy metadata resources.
     *
    ServiceResponse<PageImpl<SlimPolicyMetadataInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SlimPolicyMetadataInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SlimPolicyMetadataInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SlimPolicyMetadataInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SlimPolicyMetadataInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SlimPolicyMetadataInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SlimPolicyMetadataInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SlimPolicyMetadataInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}