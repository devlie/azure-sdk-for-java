// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.documentanalysis.administration;

import com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient;
import com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisServiceVersion;
import com.azure.ai.formrecognizer.documentanalysis.TestUtils;
import com.azure.ai.formrecognizer.documentanalysis.administration.models.BuildModelOptions;
import com.azure.ai.formrecognizer.documentanalysis.administration.models.ComposeModelOptions;
import com.azure.ai.formrecognizer.documentanalysis.administration.models.CopyAuthorization;
import com.azure.ai.formrecognizer.documentanalysis.administration.models.CopyAuthorizationOptions;
import com.azure.ai.formrecognizer.documentanalysis.administration.models.DocumentModelBuildMode;
import com.azure.ai.formrecognizer.documentanalysis.administration.models.DocumentModelDetails;
import com.azure.ai.formrecognizer.documentanalysis.models.AnalyzeResult;
import com.azure.ai.formrecognizer.documentanalysis.models.DocumentOperationResult;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.Response;
import com.azure.core.models.ResponseError;
import com.azure.core.util.BinaryData;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.AzureAuthorityHosts;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.azure.ai.formrecognizer.documentanalysis.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class DocumentModelAdministrationAsyncClientTest extends DocumentModelAdministrationClientTestBase {
    private DocumentModelAdministrationAsyncClient client;
    @BeforeAll
    static void beforeAll() {
        StepVerifier.setDefaultTimeout(Duration.ofSeconds(30));
    }

    @AfterAll
    static void afterAll() {
        StepVerifier.resetDefaultTimeout();
    }

    private DocumentModelAdministrationAsyncClient getDocumentModelAdminAsyncClient(HttpClient httpClient,
                                                                                    DocumentAnalysisServiceVersion serviceVersion) {
        return getDocumentModelAdminClientBuilder(httpClient, serviceVersion, true).buildAsyncClient();
    }

    /**
     * Verifies the document analysis async client is valid.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void getDocumentAnalysisClientAndValidate(HttpClient httpClient,
                                                     DocumentAnalysisServiceVersion serviceVersion) {
        DocumentAnalysisAsyncClient documentAnalysisAsyncClient =
            getDocumentModelAdminAsyncClient(httpClient, serviceVersion)
                .getDocumentAnalysisAsyncClient();
        blankPdfDataRunner((data, dataLength) -> {
            SyncPoller<DocumentOperationResult, AnalyzeResult> syncPoller =
                documentAnalysisAsyncClient.beginAnalyzeDocument("prebuilt-receipt", BinaryData.fromStream(data), dataLength)
                    .getSyncPoller();
            syncPoller.waitForCompletion();
            assertNotNull(syncPoller.getFinalResult());
        });
    }

    /**
     * Verifies account properties returned for a subscription account.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void validGetResourceDetails(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getResourceDetails())
            .assertNext(DocumentModelAdministrationClientTestBase::validateResourceInfo)
            .verifyComplete();
    }

    /**
     * Verifies account properties returned with a Http Response for a subscription account.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void validGetResourceDetailsWithResponse(HttpClient httpClient,
                                                      DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getResourceDetails())
            .assertNext(DocumentModelAdministrationClientTestBase::validateResourceInfo)
            .verifyComplete();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void deleteModelValidModelIdWithResponse(HttpClient httpClient,
                                                    DocumentAnalysisServiceVersion serviceVersion) {

        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller1 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null, null)
                    .setPollInterval(durationTestMode).getSyncPoller();
            syncPoller1.waitForCompletion();
            DocumentModelDetails createdModel = syncPoller1.getFinalResult();

            StepVerifier.create(client.deleteModelWithResponse(createdModel.getModelId()))
                .assertNext(response -> assertEquals(response.getStatusCode(), HttpResponseStatus.NO_CONTENT.code()))
                .verifyComplete();

            StepVerifier.create(client.getModelWithResponse(createdModel.getModelId()))
                .verifyErrorSatisfies(throwable -> {
                    assertEquals(HttpResponseException.class, throwable.getClass());
                    final ResponseError responseError = (ResponseError) ((HttpResponseException) throwable).getValue();
                    assertEquals("NotFound", responseError.getCode());
                });
        });
    }

    /**
     * Verifies the result of the copy authorization for valid parameters.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void copyAuthorization(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        String modelId = "java_copy_model_test";
        StepVerifier.create(client.getCopyAuthorizationWithResponse(new CopyAuthorizationOptions().setModelId(modelId)))
            .assertNext(response -> validateCopyAuthorizationResult(response.getValue()))
            .verifyComplete();

        StepVerifier.create(client.deleteModel(modelId)).verifyComplete();
    }

    /**
     * Verifies the result of the create composed model for valid parameters.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void beginCreateComposedModel(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {

        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller1 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null,
                        new BuildModelOptions().setModelId("async_component_model_1"))
                    .setPollInterval(durationTestMode).getSyncPoller();
            syncPoller1.waitForCompletion();
            DocumentModelDetails createdModel1 = syncPoller1.getFinalResult();

            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller2 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null,
                        new BuildModelOptions().setModelId("async_component_model_2"))
                    .setPollInterval(durationTestMode).getSyncPoller();
            syncPoller2.waitForCompletion();
            DocumentModelDetails createdModel2 = syncPoller2.getFinalResult();

            final List<String> modelIdList = Arrays.asList(createdModel1.getModelId(), createdModel2.getModelId());

            DocumentModelDetails composedModel = client.beginComposeModel(modelIdList,
                    new ComposeModelOptions().setDescription(TestUtils.EXPECTED_DESC))
                .setPollInterval(durationTestMode)
                .getSyncPoller().getFinalResult();

            assertNotNull(composedModel.getModelId());
            assertEquals(TestUtils.EXPECTED_DESC, composedModel.getDescription());
            assertEquals(2, composedModel.getDocumentTypes().size());
            composedModel.getDocumentTypes().forEach((key, docTypeInfo) -> {
                if (key.contains("async_component_model_1") || key.contains("async_component_model_2")) {
                    assert true;
                } else {
                    assert false;
                }
            });
            validateDocumentModelData(composedModel);

            client.deleteModel(createdModel1.getModelId()).block();
            client.deleteModel(createdModel2.getModelId()).block();
            client.deleteModel(composedModel.getModelId()).block();
        });
    }

    /**
     * Verifies the result of building a document analysis  with Options.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void createComposedModelWithOptions(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);

        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller1 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null, null)
                    .setPollInterval(durationTestMode).getSyncPoller();
            syncPoller1.waitForCompletion();
            DocumentModelDetails createdModel1 = syncPoller1.getFinalResult();

            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller2 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null, null)
                    .setPollInterval(durationTestMode).getSyncPoller();
            syncPoller2.waitForCompletion();
            DocumentModelDetails createdModel2 = syncPoller2.getFinalResult();

            final List<String> modelIdList = Arrays.asList(createdModel1.getModelId(), createdModel2.getModelId());
            String composedModelId = "test-composed-model";

            DocumentModelDetails composedModel = client.beginComposeModel(modelIdList,
                    new ComposeModelOptions()
                        .setModelId(composedModelId)
                        .setDescription(TestUtils.EXPECTED_DESC)
                        .setTags(TestUtils.EXPECTED_MODEL_TAGS))
                .setPollInterval(durationTestMode)
                .getSyncPoller()
                .getFinalResult();

            validateDocumentModelData(composedModel);
            Assertions.assertEquals(TestUtils.EXPECTED_DESC, composedModel.getDescription());
            Assertions.assertEquals(TestUtils.EXPECTED_MODEL_TAGS, composedModel.getTags());
            Assertions.assertEquals(composedModelId, composedModel.getModelId());

            client.deleteModel(createdModel1.getModelId()).block();
            client.deleteModel(createdModel2.getModelId()).block();
            client.deleteModel(composedModel.getModelId()).block();
        });
    }

    /**
     * Verifies the result of building a document analysis model.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void beginBuildModel(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller1 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null, null)
                    .setPollInterval(durationTestMode).getSyncPoller();
            syncPoller1.waitForCompletion();
            DocumentModelDetails createdModel1 = syncPoller1.getFinalResult();

            validateDocumentModelData(createdModel1);
            client.deleteModel(createdModel1.getModelId()).block();
        });
    }

    /**
     * Verifies that building a model throws a DocumentModelOperationException when the training container is missing
     * OCR files.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void beginBuildModelThrowsHttpResponseException(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        buildModelErrorRunner((errorTrainingFilesUrl) -> {
            if (!AzureAuthorityHosts.AZURE_GOVERNMENT.equals(TestUtils.getAuthority(client.getEndpoint()))) {
                HttpResponseException httpResponseException
                    = Assertions.assertThrows(HttpResponseException.class, () ->
                    client.beginBuildModel(errorTrainingFilesUrl, DocumentModelBuildMode.TEMPLATE)
                        .setPollInterval(durationTestMode)
                        .getSyncPoller()
                        .getFinalResult());

                ResponseError actualError = (ResponseError) httpResponseException.getValue();
                Assertions.assertEquals("InvalidRequest", actualError.getCode());
            } else {
                HttpResponseException httpResponseException
                    = Assertions.assertThrows(HttpResponseException.class, () ->
                    client.beginBuildModel(errorTrainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null, null)
                        .setPollInterval(durationTestMode)
                        .getSyncPoller()
                        .getFinalResult());

                ResponseError actualError = (ResponseError) httpResponseException.getValue();
                Assertions.assertEquals("Invalid request., errorCode: [ContentSourceNotAccessible], message: Content is not accessible: Invalid data URL", actualError.getMessage());
                Assertions.assertEquals("InvalidRequest", actualError.getCode());
            }
        });
    }

    /**
     * Verifies the result of building a document analysis  with Options.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void beginBuildModelWithOptions(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        String modelId = "test-model";

        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller1 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null,
                        new BuildModelOptions()
                            .setModelId(modelId)
                            .setDescription(TestUtils.EXPECTED_DESC)
                            .setTags(TestUtils.EXPECTED_MODEL_TAGS))
                    .setPollInterval(durationTestMode)
                    .getSyncPoller();
            syncPoller1.waitForCompletion();
            DocumentModelDetails createdModel = syncPoller1.getFinalResult();

            validateDocumentModelData(createdModel);
            Assertions.assertEquals(TestUtils.EXPECTED_DESC, createdModel.getDescription());
            Assertions.assertEquals(TestUtils.EXPECTED_MODEL_TAGS, createdModel.getTags());
            Assertions.assertEquals(modelId, createdModel.getModelId());

            client.deleteModel(createdModel.getModelId()).block();
        });
    }

    /**
     * Verifies that building a document model fails with an Invalid prefix.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void beginBuildModelFailsWithInvalidPrefix(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);

        buildModelRunner((trainingFilesUrl) -> {
            StepVerifier.create(client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, "invalidPrefix",
                        null)
                    .setPollInterval(durationTestMode))
                .verifyErrorSatisfies(throwable -> {
                    assertEquals(HttpResponseException.class, throwable.getClass());
                    final ResponseError responseError = (ResponseError) ((HttpResponseException) throwable).getValue();
                    assertEquals("InvalidRequest", responseError.getCode());
                });
        });
    }

    /**
     * Verifies the result of the copy operation for valid parameters.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void beginCopy(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller1 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null, null)
                    .setPollInterval(durationTestMode).getSyncPoller();
            syncPoller1.waitForCompletion();
            DocumentModelDetails actualModel = syncPoller1.getFinalResult();

            Mono<CopyAuthorization> targetMono = client.getCopyAuthorization();
            CopyAuthorization target = targetMono.block();
            if (actualModel == null) {
                fail();
                return;
            }

            PollerFlux<DocumentOperationResult, DocumentModelDetails> copyPoller =
                client.beginCopyModelTo(actualModel.getModelId(), target).setPollInterval(durationTestMode);
            DocumentModelDetails copiedModel = copyPoller.getSyncPoller().getFinalResult();
            Assertions.assertEquals(target.getTargetModelId(), copiedModel.getModelId());

            client.deleteModel(actualModel.getModelId()).block();
            client.deleteModel(copiedModel.getModelId()).block();
        });
    }

    /**
     * Verifies the result of the copy operation for valid parameters.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void beginCopyWithOptions(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        String modelId = "my-copied-model-id";

        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller1 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null, null)
                    .setPollInterval(durationTestMode).getSyncPoller();
            syncPoller1.waitForCompletion();
            DocumentModelDetails actualModel = syncPoller1.getFinalResult();

            Mono<Response<CopyAuthorization>> targetMono = client.getCopyAuthorizationWithResponse(
                new CopyAuthorizationOptions()
                    .setModelId(modelId)
                    .setDescription(TestUtils.EXPECTED_DESC)
                    .setTags(TestUtils.EXPECTED_MODEL_TAGS));

            CopyAuthorization target = targetMono.block().getValue();
            if (actualModel == null) {
                fail();
                return;
            }

            PollerFlux<DocumentOperationResult, DocumentModelDetails> copyPoller =
                client.beginCopyModelTo(actualModel.getModelId(), target)
                    .setPollInterval(durationTestMode);

            DocumentModelDetails copiedModel = copyPoller.getSyncPoller().getFinalResult();
            Assertions.assertEquals(target.getTargetModelId(), copiedModel.getModelId());
            validateDocumentModelData(copiedModel);
            Assertions.assertEquals(TestUtils.EXPECTED_DESC, copiedModel.getDescription());
            Assertions.assertEquals(TestUtils.EXPECTED_MODEL_TAGS, copiedModel.getTags());
            Assertions.assertEquals(modelId, target.getTargetModelId());

            client.deleteModel(actualModel.getModelId()).block();
            client.deleteModel(copiedModel.getModelId()).block();
        });
    }

    /**
     * Test for listing all models information.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void listModels(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.listModels().byPage().take(4))
            .thenConsumeWhile(documentModelInfoPagedResponse -> {
                documentModelInfoPagedResponse.getValue()
                    .forEach(documentModelInfo -> {
                        assertNotNull(documentModelInfo.getModelId());
                        assertNotNull(documentModelInfo.getCreatedOn());
                    });
                return true;
            }).verifyComplete();
    }

    /**
     * Verifies that an exception is thrown for null model ID parameter.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void getModelNullModelId(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getModel(null)).verifyError();
    }

    /**
     * Verifies document model info returned with response for a valid model ID.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void getModelWithResponse(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller1 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null, null)
                    .setPollInterval(durationTestMode).getSyncPoller();
            syncPoller1.waitForCompletion();
            DocumentModelDetails createdModel = syncPoller1.getFinalResult();

            StepVerifier.create(client.getModelWithResponse(createdModel.getModelId()))
                .assertNext(documentModelResponse -> {
                    assertEquals(documentModelResponse.getStatusCode(), HttpResponseStatus.OK.code());
                    validateDocumentModelData(documentModelResponse.getValue());
                });
        });
    }

    /**
     * Test for listing all operations' information.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void listOperations(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {

        client = getDocumentModelAdminAsyncClient(httpClient, serviceVersion);
        List<String> operationIdList = new ArrayList<>();
        StepVerifier.create(client.listOperations().byPage().take(10))
            .thenConsumeWhile(modelOperationInfoPagedResponse ->          {
                modelOperationInfoPagedResponse.getValue().forEach(modelOperationInfo -> {
                    operationIdList.add(modelOperationInfo.getOperationId());
                    assertTrue(modelOperationInfo.getOperationId() != null
                        && modelOperationInfo.getStatus() != null
                        && modelOperationInfo.getCreatedOn() != null
                        && modelOperationInfo.getLastUpdatedOn() != null
                        && modelOperationInfo.getResourceLocation() != null
                        && modelOperationInfo.getPercentCompleted() != null);
                });
                return true;
            })
            .verifyComplete();

        if (!CoreUtils.isNullOrEmpty(operationIdList)) {
            operationIdList.forEach(operationId -> StepVerifier.create(client.getOperation(operationId))
                .assertNext(modelOperationDetails -> {
                    assertNotNull(modelOperationDetails.getOperationId());
                    assertNotNull(modelOperationDetails.getCreatedOn());
                })
                .verifyComplete());
        }
    }
}