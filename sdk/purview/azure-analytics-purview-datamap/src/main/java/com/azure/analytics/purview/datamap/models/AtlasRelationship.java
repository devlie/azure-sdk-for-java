// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Atlas relationship instance.
 */
@Fluent
public final class AtlasRelationship {
    /*
     * The attributes of the struct.
     */
    @Generated
    @JsonProperty(value = "attributes")
    private Map<String, Object> attributes;

    /*
     * The name of the type.
     */
    @Generated
    @JsonProperty(value = "typeName")
    private String typeName;

    /*
     * ETag for concurrency control.
     */
    @Generated
    @JsonProperty(value = "lastModifiedTS")
    private String lastModifiedTS;

    /*
     * The created time of the record.
     */
    @Generated
    @JsonProperty(value = "createTime")
    private Long createTime;

    /*
     * The user who created the record.
     */
    @Generated
    @JsonProperty(value = "createdBy")
    private String createdBy;

    /*
     * Reference to an object-instance of a type - like entity.
     */
    @Generated
    @JsonProperty(value = "end1")
    private AtlasObjectId end1;

    /*
     * Reference to an object-instance of a type - like entity.
     */
    @Generated
    @JsonProperty(value = "end2")
    private AtlasObjectId end2;

    /*
     * The GUID of the relationship.
     */
    @Generated
    @JsonProperty(value = "guid")
    private String guid;

    /*
     * The home ID of the relationship.
     */
    @Generated
    @JsonProperty(value = "homeId")
    private String homeId;

    /*
     * The label of the relationship.
     */
    @Generated
    @JsonProperty(value = "label")
    private String label;

    /*
     * Used to record the provenance of an instance of an entity or relationship
     */
    @Generated
    @JsonProperty(value = "provenanceType")
    private Integer provenanceType;

    /*
     * The enum of relationship status.
     */
    @Generated
    @JsonProperty(value = "status")
    private StatusAtlasRelationship status;

    /*
     * The update time of the record.
     */
    @Generated
    @JsonProperty(value = "updateTime")
    private Long updateTime;

    /*
     * The user who updated the record.
     */
    @Generated
    @JsonProperty(value = "updatedBy")
    private String updatedBy;

    /*
     * The version of the relationship.
     */
    @Generated
    @JsonProperty(value = "version")
    private Long version;

    /**
     * Creates an instance of AtlasRelationship class.
     */
    @Generated
    public AtlasRelationship() {
    }

    /**
     * Get the attributes property: The attributes of the struct.
     * 
     * @return the attributes value.
     */
    @Generated
    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The attributes of the struct.
     * 
     * @param attributes the attributes value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the typeName property: The name of the type.
     * 
     * @return the typeName value.
     */
    @Generated
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The name of the type.
     * 
     * @param typeName the typeName value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the lastModifiedTS property: ETag for concurrency control.
     * 
     * @return the lastModifiedTS value.
     */
    @Generated
    public String getLastModifiedTS() {
        return this.lastModifiedTS;
    }

    /**
     * Set the lastModifiedTS property: ETag for concurrency control.
     * 
     * @param lastModifiedTS the lastModifiedTS value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setLastModifiedTS(String lastModifiedTS) {
        this.lastModifiedTS = lastModifiedTS;
        return this;
    }

    /**
     * Get the createTime property: The created time of the record.
     * 
     * @return the createTime value.
     */
    @Generated
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * Set the createTime property: The created time of the record.
     * 
     * @param createTime the createTime value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the createdBy property: The user who created the record.
     * 
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: The user who created the record.
     * 
     * @param createdBy the createdBy value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the end1 property: Reference to an object-instance of a type - like entity.
     * 
     * @return the end1 value.
     */
    @Generated
    public AtlasObjectId getEnd1() {
        return this.end1;
    }

    /**
     * Set the end1 property: Reference to an object-instance of a type - like entity.
     * 
     * @param end1 the end1 value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setEnd1(AtlasObjectId end1) {
        this.end1 = end1;
        return this;
    }

    /**
     * Get the end2 property: Reference to an object-instance of a type - like entity.
     * 
     * @return the end2 value.
     */
    @Generated
    public AtlasObjectId getEnd2() {
        return this.end2;
    }

    /**
     * Set the end2 property: Reference to an object-instance of a type - like entity.
     * 
     * @param end2 the end2 value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setEnd2(AtlasObjectId end2) {
        this.end2 = end2;
        return this;
    }

    /**
     * Get the guid property: The GUID of the relationship.
     * 
     * @return the guid value.
     */
    @Generated
    public String getGuid() {
        return this.guid;
    }

    /**
     * Set the guid property: The GUID of the relationship.
     * 
     * @param guid the guid value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Get the homeId property: The home ID of the relationship.
     * 
     * @return the homeId value.
     */
    @Generated
    public String getHomeId() {
        return this.homeId;
    }

    /**
     * Set the homeId property: The home ID of the relationship.
     * 
     * @param homeId the homeId value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setHomeId(String homeId) {
        this.homeId = homeId;
        return this;
    }

    /**
     * Get the label property: The label of the relationship.
     * 
     * @return the label value.
     */
    @Generated
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: The label of the relationship.
     * 
     * @param label the label value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the provenanceType property: Used to record the provenance of an instance of an entity or relationship.
     * 
     * @return the provenanceType value.
     */
    @Generated
    public Integer getProvenanceType() {
        return this.provenanceType;
    }

    /**
     * Set the provenanceType property: Used to record the provenance of an instance of an entity or relationship.
     * 
     * @param provenanceType the provenanceType value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setProvenanceType(Integer provenanceType) {
        this.provenanceType = provenanceType;
        return this;
    }

    /**
     * Get the status property: The enum of relationship status.
     * 
     * @return the status value.
     */
    @Generated
    public StatusAtlasRelationship getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The enum of relationship status.
     * 
     * @param status the status value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setStatus(StatusAtlasRelationship status) {
        this.status = status;
        return this;
    }

    /**
     * Get the updateTime property: The update time of the record.
     * 
     * @return the updateTime value.
     */
    @Generated
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Set the updateTime property: The update time of the record.
     * 
     * @param updateTime the updateTime value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get the updatedBy property: The user who updated the record.
     * 
     * @return the updatedBy value.
     */
    @Generated
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Set the updatedBy property: The user who updated the record.
     * 
     * @param updatedBy the updatedBy value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Get the version property: The version of the relationship.
     * 
     * @return the version value.
     */
    @Generated
    public Long getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the relationship.
     * 
     * @param version the version value to set.
     * @return the AtlasRelationship object itself.
     */
    @Generated
    public AtlasRelationship setVersion(Long version) {
        this.version = version;
        return this;
    }
}
