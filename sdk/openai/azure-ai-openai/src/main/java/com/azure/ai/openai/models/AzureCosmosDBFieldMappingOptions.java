// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Optional settings to control how fields are processed when using a configured Azure Cosmos DB resource.
 */
@Fluent
public final class AzureCosmosDBFieldMappingOptions implements JsonSerializable<AzureCosmosDBFieldMappingOptions> {

    /*
     * The names of fields that represent vector data.
     */
    @Generated
    private final List<String> vectorFields;

    /**
     * Get the vectorFields property: The names of fields that represent vector data.
     *
     * @return the vectorFields value.
     */
    @Generated
    public List<String> getVectorFields() {
        return this.vectorFields;
    }

    /*
     * The name of the index field to use as a title.
     */
    @Generated
    private String titleField;

    /*
     * The name of the index field to use as a URL.
     */
    @Generated
    private String urlField;

    /*
     * The name of the index field to use as a filepath.
     */
    @Generated
    private String filepathField;

    /*
     * The names of index fields that should be treated as content.
     */
    @Generated
    private final List<String> contentFields;

    /*
     * The separator pattern that content fields should use.
     */
    @Generated
    private String contentFieldsSeparator;

    /**
     * Creates an instance of AzureCosmosDBFieldMappingOptions class.
     *
     * @param contentFields the contentFields value to set.
     * @param vectorFields the vectorFields value to set.
     */
    @Generated
    public AzureCosmosDBFieldMappingOptions(List<String> contentFields, List<String> vectorFields) {
        this.contentFields = contentFields;
        this.vectorFields = vectorFields;
    }

    /**
     * Get the titleField property: The name of the index field to use as a title.
     *
     * @return the titleField value.
     */
    @Generated
    public String getTitleField() {
        return this.titleField;
    }

    /**
     * Set the titleField property: The name of the index field to use as a title.
     *
     * @param titleField the titleField value to set.
     * @return the AzureCosmosDBFieldMappingOptions object itself.
     */
    @Generated
    public AzureCosmosDBFieldMappingOptions setTitleField(String titleField) {
        this.titleField = titleField;
        return this;
    }

    /**
     * Get the urlField property: The name of the index field to use as a URL.
     *
     * @return the urlField value.
     */
    @Generated
    public String getUrlField() {
        return this.urlField;
    }

    /**
     * Set the urlField property: The name of the index field to use as a URL.
     *
     * @param urlField the urlField value to set.
     * @return the AzureCosmosDBFieldMappingOptions object itself.
     */
    @Generated
    public AzureCosmosDBFieldMappingOptions setUrlField(String urlField) {
        this.urlField = urlField;
        return this;
    }

    /**
     * Get the filepathField property: The name of the index field to use as a filepath.
     *
     * @return the filepathField value.
     */
    @Generated
    public String getFilepathField() {
        return this.filepathField;
    }

    /**
     * Set the filepathField property: The name of the index field to use as a filepath.
     *
     * @param filepathField the filepathField value to set.
     * @return the AzureCosmosDBFieldMappingOptions object itself.
     */
    @Generated
    public AzureCosmosDBFieldMappingOptions setFilepathField(String filepathField) {
        this.filepathField = filepathField;
        return this;
    }

    /**
     * Get the contentFields property: The names of index fields that should be treated as content.
     *
     * @return the contentFields value.
     */
    @Generated
    public List<String> getContentFields() {
        return this.contentFields;
    }

    /**
     * Get the contentFieldsSeparator property: The separator pattern that content fields should use.
     *
     * @return the contentFieldsSeparator value.
     */
    @Generated
    public String getContentFieldsSeparator() {
        return this.contentFieldsSeparator;
    }

    /**
     * Set the contentFieldsSeparator property: The separator pattern that content fields should use.
     *
     * @param contentFieldsSeparator the contentFieldsSeparator value to set.
     * @return the AzureCosmosDBFieldMappingOptions object itself.
     */
    @Generated
    public AzureCosmosDBFieldMappingOptions setContentFieldsSeparator(String contentFieldsSeparator) {
        this.contentFieldsSeparator = contentFieldsSeparator;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("content_fields", this.contentFields,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("vector_fields", this.vectorFields,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("title_field", this.titleField);
        jsonWriter.writeStringField("url_field", this.urlField);
        jsonWriter.writeStringField("filepath_field", this.filepathField);
        jsonWriter.writeStringField("content_fields_separator", this.contentFieldsSeparator);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureCosmosDBFieldMappingOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureCosmosDBFieldMappingOptions if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureCosmosDBFieldMappingOptions.
     */
    @Generated
    public static AzureCosmosDBFieldMappingOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<String> contentFields = null;
            List<String> vectorFields = null;
            String titleField = null;
            String urlField = null;
            String filepathField = null;
            String contentFieldsSeparator = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("content_fields".equals(fieldName)) {
                    contentFields = reader.readArray(reader1 -> reader1.getString());
                } else if ("vector_fields".equals(fieldName)) {
                    vectorFields = reader.readArray(reader1 -> reader1.getString());
                } else if ("title_field".equals(fieldName)) {
                    titleField = reader.getString();
                } else if ("url_field".equals(fieldName)) {
                    urlField = reader.getString();
                } else if ("filepath_field".equals(fieldName)) {
                    filepathField = reader.getString();
                } else if ("content_fields_separator".equals(fieldName)) {
                    contentFieldsSeparator = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            AzureCosmosDBFieldMappingOptions deserializedAzureCosmosDBFieldMappingOptions
                = new AzureCosmosDBFieldMappingOptions(contentFields, vectorFields);
            deserializedAzureCosmosDBFieldMappingOptions.titleField = titleField;
            deserializedAzureCosmosDBFieldMappingOptions.urlField = urlField;
            deserializedAzureCosmosDBFieldMappingOptions.filepathField = filepathField;
            deserializedAzureCosmosDBFieldMappingOptions.contentFieldsSeparator = contentFieldsSeparator;
            return deserializedAzureCosmosDBFieldMappingOptions;
        });
    }
}
