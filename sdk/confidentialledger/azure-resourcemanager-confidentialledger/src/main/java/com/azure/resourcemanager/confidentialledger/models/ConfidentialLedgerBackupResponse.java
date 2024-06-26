// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.resourcemanager.confidentialledger.fluent.models.ConfidentialLedgerBackupResponseInner;

/**
 * An immutable client-side representation of ConfidentialLedgerBackupResponse.
 */
public interface ConfidentialLedgerBackupResponse {
    /**
     * Gets the message property: Response body stating if the ledger is being backed up.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.confidentialledger.fluent.models.ConfidentialLedgerBackupResponseInner
     * object.
     * 
     * @return the inner object.
     */
    ConfidentialLedgerBackupResponseInner innerModel();
}
