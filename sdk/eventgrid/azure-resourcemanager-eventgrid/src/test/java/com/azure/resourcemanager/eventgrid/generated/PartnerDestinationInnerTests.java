// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerDestinationInner;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinationActivationState;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class PartnerDestinationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerDestinationInner model = BinaryData.fromString(
            "{\"properties\":{\"partnerRegistrationImmutableId\":\"d42db7eb-6cc4-4a01-b159-5c0507c3cf57\",\"endpointServiceContext\":\"kmoyxcdyuibh\",\"expirationTimeIfNotActivatedUtc\":\"2021-11-27T11:22:53Z\",\"provisioningState\":\"Canceled\",\"activationState\":\"Activated\",\"endpointBaseUrl\":\"vfvfcj\",\"messageForActivation\":\"eoisrvhmgor\"},\"location\":\"ukiscvwmzhw\",\"tags\":{\"btgn\":\"faxvxil\",\"zqlqhyc\":\"nzeyqxtjj\",\"mieknlraria\":\"vodggxdbee\"},\"id\":\"wiuagydwqf\",\"name\":\"ylyrfgiagtco\",\"type\":\"ocqwogfnzjvus\"}")
            .toObject(PartnerDestinationInner.class);
        Assertions.assertEquals("ukiscvwmzhw", model.location());
        Assertions.assertEquals("faxvxil", model.tags().get("btgn"));
        Assertions.assertEquals(UUID.fromString("d42db7eb-6cc4-4a01-b159-5c0507c3cf57"),
            model.partnerRegistrationImmutableId());
        Assertions.assertEquals("kmoyxcdyuibh", model.endpointServiceContext());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-27T11:22:53Z"), model.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerDestinationActivationState.ACTIVATED, model.activationState());
        Assertions.assertEquals("vfvfcj", model.endpointBaseUrl());
        Assertions.assertEquals("eoisrvhmgor", model.messageForActivation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerDestinationInner model = new PartnerDestinationInner().withLocation("ukiscvwmzhw")
            .withTags(mapOf("btgn", "faxvxil", "zqlqhyc", "nzeyqxtjj", "mieknlraria", "vodggxdbee"))
            .withPartnerRegistrationImmutableId(UUID.fromString("d42db7eb-6cc4-4a01-b159-5c0507c3cf57"))
            .withEndpointServiceContext("kmoyxcdyuibh")
            .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-11-27T11:22:53Z"))
            .withActivationState(PartnerDestinationActivationState.ACTIVATED).withEndpointBaseUrl("vfvfcj")
            .withMessageForActivation("eoisrvhmgor");
        model = BinaryData.fromObject(model).toObject(PartnerDestinationInner.class);
        Assertions.assertEquals("ukiscvwmzhw", model.location());
        Assertions.assertEquals("faxvxil", model.tags().get("btgn"));
        Assertions.assertEquals(UUID.fromString("d42db7eb-6cc4-4a01-b159-5c0507c3cf57"),
            model.partnerRegistrationImmutableId());
        Assertions.assertEquals("kmoyxcdyuibh", model.endpointServiceContext());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-27T11:22:53Z"), model.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerDestinationActivationState.ACTIVATED, model.activationState());
        Assertions.assertEquals("vfvfcj", model.endpointBaseUrl());
        Assertions.assertEquals("eoisrvhmgor", model.messageForActivation());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
