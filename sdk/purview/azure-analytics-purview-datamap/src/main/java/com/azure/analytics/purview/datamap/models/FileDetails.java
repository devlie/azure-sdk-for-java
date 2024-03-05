// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.BinaryData;

/**
 * The file details model for the file.
 */
@Fluent
public final class FileDetails {
    /*
     * The content of the file
     */
    @Generated
    private BinaryData content;

    /*
     * The filename of the file
     */
    @Generated
    private String filename;

    /*
     * The content-type of the file
     */
    @Generated
    private String contentType = "application/octet-stream";

    /**
     * Creates an instance of FileDetails class.
     * 
     * @param content the content value to set.
     */
    @Generated
    public FileDetails(BinaryData content) {
        this.content = content;
    }

    /**
     * Get the content property: The content of the file.
     * 
     * @return the content value.
     */
    @Generated
    public BinaryData getContent() {
        return this.content;
    }

    /**
     * Get the filename property: The filename of the file.
     * 
     * @return the filename value.
     */
    @Generated
    public String getFilename() {
        return this.filename;
    }

    /**
     * Set the filename property: The filename of the file.
     * 
     * @param filename the filename value to set.
     * @return the FileDetails object itself.
     */
    @Generated
    public FileDetails setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Get the contentType property: The content-type of the file.
     * 
     * @return the contentType value.
     */
    @Generated
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content-type of the file.
     * 
     * @param contentType the contentType value to set.
     * @return the FileDetails object itself.
     */
    @Generated
    public FileDetails setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
