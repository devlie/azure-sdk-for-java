// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request payload for updating a chat thread.
 */
@Fluent
public final class UpdateChatThreadOptions {
    /*
     * Chat thread topic.
     */
    @JsonProperty(value = "topic")
    private String topic;

    /**
     * Creates an instance of UpdateChatThreadOptions class.
     */
    public UpdateChatThreadOptions() {
    }

    /**
     * Get the topic property: Chat thread topic.
     * 
     * @return the topic value.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Set the topic property: Chat thread topic.
     * 
     * @param topic the topic value to set.
     * @return the UpdateChatThreadOptions object itself.
     */
    public UpdateChatThreadOptions setTopic(String topic) {
        this.topic = topic;
        return this;
    }
}
