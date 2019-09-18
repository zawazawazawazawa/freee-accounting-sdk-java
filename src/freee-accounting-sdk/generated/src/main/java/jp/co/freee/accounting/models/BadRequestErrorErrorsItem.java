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
 * The BadRequestErrorErrorsItem model.
 */
public class BadRequestErrorErrorsItem {
    /**
     * The messages property.
     */
    @JsonProperty(value = "messages", required = true)
    private List<String> messages;

    /**
     * Possible values include: 'status', 'validation'.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Get the messages value.
     *
     * @return the messages value
     */
    public List<String> messages() {
        return this.messages;
    }

    /**
     * Set the messages value.
     *
     * @param messages the messages value to set
     * @return the BadRequestErrorErrorsItem object itself.
     */
    public BadRequestErrorErrorsItem withMessages(List<String> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Get possible values include: 'status', 'validation'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set possible values include: 'status', 'validation'.
     *
     * @param type the type value to set
     * @return the BadRequestErrorErrorsItem object itself.
     */
    public BadRequestErrorErrorsItem withType(String type) {
        this.type = type;
        return this;
    }

}