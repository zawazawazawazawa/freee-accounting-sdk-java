/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JournalsEnqueueJournalsResponse model.
 */
public class JournalsEnqueueJournalsResponse {
    /**
     * The journals property.
     */
    @JsonProperty(value = "journals", required = true)
    private JournalsEnqueueJournalsResponseJournals journals;

    /**
     * Get the journals value.
     *
     * @return the journals value
     */
    public JournalsEnqueueJournalsResponseJournals journals() {
        return this.journals;
    }

    /**
     * Set the journals value.
     *
     * @param journals the journals value to set
     * @return the JournalsEnqueueJournalsResponse object itself.
     */
    public JournalsEnqueueJournalsResponse withJournals(JournalsEnqueueJournalsResponseJournals journals) {
        this.journals = journals;
        return this;
    }

}