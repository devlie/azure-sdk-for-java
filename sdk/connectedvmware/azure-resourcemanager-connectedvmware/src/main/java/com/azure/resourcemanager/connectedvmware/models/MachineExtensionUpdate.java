// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.connectedvmware.fluent.models.MachineExtensionUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes a Machine Extension Update. */
@Fluent
public final class MachineExtensionUpdate extends ResourcePatch {
    /*
     * Describes Machine Extension Update Properties.
     */
    @JsonProperty(value = "properties")
    private MachineExtensionUpdateProperties innerProperties;

    /**
     * Get the innerProperties property: Describes Machine Extension Update Properties.
     *
     * @return the innerProperties value.
     */
    private MachineExtensionUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MachineExtensionUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.innerProperties() == null ? null : this.innerProperties().forceUpdateTag();
    }

    /**
     * Set the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the MachineExtensionUpdate object itself.
     */
    public MachineExtensionUpdate withForceUpdateTag(String forceUpdateTag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MachineExtensionUpdateProperties();
        }
        this.innerProperties().withForceUpdateTag(forceUpdateTag);
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.innerProperties() == null ? null : this.innerProperties().publisher();
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     *
     * @param publisher the publisher value to set.
     * @return the MachineExtensionUpdate object itself.
     */
    public MachineExtensionUpdate withPublisher(String publisher) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MachineExtensionUpdateProperties();
        }
        this.innerProperties().withPublisher(publisher);
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the type value.
     */
    public String type() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @param type the type value to set.
     * @return the MachineExtensionUpdate object itself.
     */
    public MachineExtensionUpdate withType(String type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MachineExtensionUpdateProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().typeHandlerVersion();
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the MachineExtensionUpdate object itself.
     */
    public MachineExtensionUpdate withTypeHandlerVersion(String typeHandlerVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MachineExtensionUpdateProperties();
        }
        this.innerProperties().withTypeHandlerVersion(typeHandlerVersion);
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version available.
     *
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.innerProperties() == null ? null : this.innerProperties().enableAutomaticUpgrade();
    }

    /**
     * Set the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version available.
     *
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the MachineExtensionUpdate object itself.
     */
    public MachineExtensionUpdate withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MachineExtensionUpdateProperties();
        }
        this.innerProperties().withEnableAutomaticUpgrade(enableAutomaticUpgrade);
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().autoUpgradeMinorVersion();
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the MachineExtensionUpdate object itself.
     */
    public MachineExtensionUpdate withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MachineExtensionUpdateProperties();
        }
        this.innerProperties().withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     *
     * @return the settings value.
     */
    public Object settings() {
        return this.innerProperties() == null ? null : this.innerProperties().settings();
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     *
     * @param settings the settings value to set.
     * @return the MachineExtensionUpdate object itself.
     */
    public MachineExtensionUpdate withSettings(Object settings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MachineExtensionUpdateProperties();
        }
        this.innerProperties().withSettings(settings);
        return this;
    }

    /**
     * Get the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().protectedSettings();
    }

    /**
     * Set the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @param protectedSettings the protectedSettings value to set.
     * @return the MachineExtensionUpdate object itself.
     */
    public MachineExtensionUpdate withProtectedSettings(Object protectedSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MachineExtensionUpdateProperties();
        }
        this.innerProperties().withProtectedSettings(protectedSettings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}