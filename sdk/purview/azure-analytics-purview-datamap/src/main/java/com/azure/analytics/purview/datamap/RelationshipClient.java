// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap;

import com.azure.analytics.purview.datamap.implementation.RelationshipsImpl;
import com.azure.analytics.purview.datamap.models.AtlasRelationship;
import com.azure.analytics.purview.datamap.models.AtlasRelationshipWithExtInfo;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/**
 * Initializes a new instance of the synchronous DataMapClient type.
 */
@ServiceClient(builder = DataMapClientBuilder.class)
public final class RelationshipClient {
    @Generated
    private final RelationshipsImpl serviceClient;

    /**
     * Initializes an instance of RelationshipClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    RelationshipClient(RelationshipsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create a new relationship between entities.
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     attributes (Optional): {
     *         String: Object (Required)
     *     }
     *     typeName: String (Optional)
     *     lastModifiedTS: String (Optional)
     *     createTime: Long (Optional)
     *     createdBy: String (Optional)
     *     end1 (Optional): {
     *         guid: String (Optional)
     *         typeName: String (Optional)
     *         uniqueAttributes (Optional): {
     *             String: Object (Required)
     *         }
     *     }
     *     end2 (Optional): (recursive schema, see end2 above)
     *     guid: String (Optional)
     *     homeId: String (Optional)
     *     label: String (Optional)
     *     provenanceType: Integer (Optional)
     *     status: String(ACTIVE/DELETED) (Optional)
     *     updateTime: Long (Optional)
     *     updatedBy: String (Optional)
     *     version: Long (Optional)
     * }
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     attributes (Optional): {
     *         String: Object (Required)
     *     }
     *     typeName: String (Optional)
     *     lastModifiedTS: String (Optional)
     *     createTime: Long (Optional)
     *     createdBy: String (Optional)
     *     end1 (Optional): {
     *         guid: String (Optional)
     *         typeName: String (Optional)
     *         uniqueAttributes (Optional): {
     *             String: Object (Required)
     *         }
     *     }
     *     end2 (Optional): (recursive schema, see end2 above)
     *     guid: String (Optional)
     *     homeId: String (Optional)
     *     label: String (Optional)
     *     provenanceType: Integer (Optional)
     *     status: String(ACTIVE/DELETED) (Optional)
     *     updateTime: Long (Optional)
     *     updatedBy: String (Optional)
     *     version: Long (Optional)
     * }
     * }</pre>
     * 
     * @param atlasRelationship Atlas relationship instance.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlas relationship instance along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createWithResponse(BinaryData atlasRelationship, RequestOptions requestOptions) {
        return this.serviceClient.createWithResponse(atlasRelationship, requestOptions);
    }

    /**
     * Update an existing relationship between entities.
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     attributes (Optional): {
     *         String: Object (Required)
     *     }
     *     typeName: String (Optional)
     *     lastModifiedTS: String (Optional)
     *     createTime: Long (Optional)
     *     createdBy: String (Optional)
     *     end1 (Optional): {
     *         guid: String (Optional)
     *         typeName: String (Optional)
     *         uniqueAttributes (Optional): {
     *             String: Object (Required)
     *         }
     *     }
     *     end2 (Optional): (recursive schema, see end2 above)
     *     guid: String (Optional)
     *     homeId: String (Optional)
     *     label: String (Optional)
     *     provenanceType: Integer (Optional)
     *     status: String(ACTIVE/DELETED) (Optional)
     *     updateTime: Long (Optional)
     *     updatedBy: String (Optional)
     *     version: Long (Optional)
     * }
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     attributes (Optional): {
     *         String: Object (Required)
     *     }
     *     typeName: String (Optional)
     *     lastModifiedTS: String (Optional)
     *     createTime: Long (Optional)
     *     createdBy: String (Optional)
     *     end1 (Optional): {
     *         guid: String (Optional)
     *         typeName: String (Optional)
     *         uniqueAttributes (Optional): {
     *             String: Object (Required)
     *         }
     *     }
     *     end2 (Optional): (recursive schema, see end2 above)
     *     guid: String (Optional)
     *     homeId: String (Optional)
     *     label: String (Optional)
     *     provenanceType: Integer (Optional)
     *     status: String(ACTIVE/DELETED) (Optional)
     *     updateTime: Long (Optional)
     *     updatedBy: String (Optional)
     *     version: Long (Optional)
     * }
     * }</pre>
     * 
     * @param atlasRelationship Atlas relationship instance.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlas relationship instance along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(BinaryData atlasRelationship, RequestOptions requestOptions) {
        return this.serviceClient.updateWithResponse(atlasRelationship, requestOptions);
    }

    /**
     * Get relationship information between entities by its GUID.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>extendedInfo</td>
     * <td>Boolean</td>
     * <td>No</td>
     * <td>Limits whether includes extended information.</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     referredEntities (Optional): {
     *         String (Required): {
     *             attributes (Optional): {
     *                 String: Object (Required)
     *             }
     *             typeName: String (Optional)
     *             lastModifiedTS: String (Optional)
     *             classificationNames (Optional): [
     *                 String (Optional)
     *             ]
     *             classifications (Optional): [
     *                  (Optional){
     *                     attributes (Optional): {
     *                         String: Object (Required)
     *                     }
     *                     typeName: String (Optional)
     *                     lastModifiedTS: String (Optional)
     *                     entityGuid: String (Optional)
     *                     entityStatus: String(ACTIVE/DELETED) (Optional)
     *                     removePropagationsOnEntityDelete: Boolean (Optional)
     *                     validityPeriods (Optional): [
     *                          (Optional){
     *                             endTime: String (Optional)
     *                             startTime: String (Optional)
     *                             timeZone: String (Optional)
     *                         }
     *                     ]
     *                 }
     *             ]
     *             displayText: String (Optional)
     *             guid: String (Optional)
     *             isIncomplete: Boolean (Optional)
     *             labels (Optional): [
     *                 String (Optional)
     *             ]
     *             meaningNames (Optional): [
     *                 String (Optional)
     *             ]
     *             meanings (Optional): [
     *                  (Optional){
     *                     confidence: Integer (Optional)
     *                     createdBy: String (Optional)
     *                     description: String (Optional)
     *                     displayText: String (Optional)
     *                     expression: String (Optional)
     *                     relationGuid: String (Optional)
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER) (Optional)
     *                     steward: String (Optional)
     *                     termGuid: String (Optional)
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED) (Optional)
     *         }
     *     }
     *     relationship (Optional): {
     *         attributes (Optional): {
     *             String: Object (Required)
     *         }
     *         typeName: String (Optional)
     *         lastModifiedTS: String (Optional)
     *         createTime: Long (Optional)
     *         createdBy: String (Optional)
     *         end1 (Optional): {
     *             guid: String (Optional)
     *             typeName: String (Optional)
     *             uniqueAttributes (Optional): {
     *                 String: Object (Required)
     *             }
     *         }
     *         end2 (Optional): (recursive schema, see end2 above)
     *         guid: String (Optional)
     *         homeId: String (Optional)
     *         label: String (Optional)
     *         provenanceType: Integer (Optional)
     *         status: String(ACTIVE/DELETED) (Optional)
     *         updateTime: Long (Optional)
     *         updatedBy: String (Optional)
     *         version: Long (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param guid The globally unique identifier of the relationship.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return relationship information between entities by its GUID along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String guid, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponse(guid, requestOptions);
    }

    /**
     * Delete a relationship between entities by its GUID.
     * 
     * @param guid The globally unique identifier of the relationship.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String guid, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponse(guid, requestOptions);
    }

    /**
     * Create a new relationship between entities.
     * 
     * @param atlasRelationship Atlas relationship instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return atlas relationship instance.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AtlasRelationship create(AtlasRelationship atlasRelationship) {
        // Generated convenience method for createWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createWithResponse(BinaryData.fromObject(atlasRelationship), requestOptions).getValue()
            .toObject(AtlasRelationship.class);
    }

    /**
     * Update an existing relationship between entities.
     * 
     * @param atlasRelationship Atlas relationship instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return atlas relationship instance.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AtlasRelationship update(AtlasRelationship atlasRelationship) {
        // Generated convenience method for updateWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return updateWithResponse(BinaryData.fromObject(atlasRelationship), requestOptions).getValue()
            .toObject(AtlasRelationship.class);
    }

    /**
     * Get relationship information between entities by its GUID.
     * 
     * @param guid The globally unique identifier of the relationship.
     * @param extendedInfo Limits whether includes extended information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return relationship information between entities by its GUID.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AtlasRelationshipWithExtInfo get(String guid, Boolean extendedInfo) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (extendedInfo != null) {
            requestOptions.addQueryParam("extendedInfo", String.valueOf(extendedInfo), false);
        }
        return getWithResponse(guid, requestOptions).getValue().toObject(AtlasRelationshipWithExtInfo.class);
    }

    /**
     * Get relationship information between entities by its GUID.
     * 
     * @param guid The globally unique identifier of the relationship.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return relationship information between entities by its GUID.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AtlasRelationshipWithExtInfo get(String guid) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(guid, requestOptions).getValue().toObject(AtlasRelationshipWithExtInfo.class);
    }

    /**
     * Delete a relationship between entities by its GUID.
     * 
     * @param guid The globally unique identifier of the relationship.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String guid) {
        // Generated convenience method for deleteWithResponse
        RequestOptions requestOptions = new RequestOptions();
        deleteWithResponse(guid, requestOptions).getValue();
    }
}
