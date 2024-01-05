// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Job scheduled event data. Schema of the data property of an EventGridEvent for a Microsoft.Media.JobScheduled event.
 */
@Fluent
public final class MediaJobScheduledEventData extends MediaJobStateChangeEventData {
    /**
     * Creates an instance of MediaJobScheduledEventData class.
     */
    public MediaJobScheduledEventData() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaJobScheduledEventData setCorrelationData(Map<String, String> correlationData) {
        super.setCorrelationData(correlationData);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("correlationData", getCorrelationData(),
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MediaJobScheduledEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MediaJobScheduledEventData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MediaJobScheduledEventData.
     */
    public static MediaJobScheduledEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MediaJobScheduledEventData deserializedMediaJobScheduledEventData = new MediaJobScheduledEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("previousState".equals(fieldName)) {
                    deserializedMediaJobScheduledEventData
                        .setPreviousState(MediaJobState.fromString(reader.getString()));
                } else if ("state".equals(fieldName)) {
                    deserializedMediaJobScheduledEventData.setState(MediaJobState.fromString(reader.getString()));
                } else if ("correlationData".equals(fieldName)) {
                    Map<String, String> correlationData = reader.readMap(reader1 -> reader1.getString());
                    deserializedMediaJobScheduledEventData.setCorrelationData(correlationData);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMediaJobScheduledEventData;
        });
    }
}
