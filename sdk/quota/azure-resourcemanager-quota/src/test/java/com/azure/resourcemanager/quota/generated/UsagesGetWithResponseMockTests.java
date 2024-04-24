// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.quota.QuotaManager;
import com.azure.resourcemanager.quota.models.CurrentUsagesBase;
import com.azure.resourcemanager.quota.models.UsagesTypes;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class UsagesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"usages\":{\"value\":1682572993,\"usagesType\":\"Individual\"},\"unit\":\"xleptramx\",\"name\":{\"value\":\"wlwnwxuqlcv\",\"localizedValue\":\"ypatdooaojkniod\"},\"resourceType\":\"oebwnujhemms\",\"quotaPeriod\":\"dkcrodt\",\"isQuotaApplicable\":true,\"properties\":\"datawj\"},\"id\":\"fltkacjv\",\"name\":\"f\",\"type\":\"dlfoakggkfp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        QuotaManager manager = QuotaManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CurrentUsagesBase response = manager.usages()
            .getWithResponse("xiilivpdtiirqt", "qoaxoruzfgs", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(1682572993, response.properties().usages().value());
        Assertions.assertEquals(UsagesTypes.INDIVIDUAL, response.properties().usages().usagesType());
        Assertions.assertEquals("wlwnwxuqlcv", response.properties().name().value());
        Assertions.assertEquals("oebwnujhemms", response.properties().resourceType());
    }
}
