/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WalletablesIndexResponse model.
 */
public class WalletablesIndexResponse {
    /**
     * The walletables property.
     */
    @JsonProperty(value = "walletables", required = true)
    private List<WalletablesIndexResponseWalletablesItem> walletables;

    /**
     * Get the walletables value.
     *
     * @return the walletables value
     */
    public List<WalletablesIndexResponseWalletablesItem> walletables() {
        return this.walletables;
    }

    /**
     * Set the walletables value.
     *
     * @param walletables the walletables value to set
     * @return the WalletablesIndexResponse object itself.
     */
    public WalletablesIndexResponse withWalletables(List<WalletablesIndexResponseWalletablesItem> walletables) {
        this.walletables = walletables;
        return this;
    }

}