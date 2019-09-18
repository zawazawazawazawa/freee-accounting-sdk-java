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
 * The TrialBsThreeYearsResponse model.
 */
public class TrialBsThreeYearsResponse {
    /**
     * The trialBsThreeYears property.
     */
    @JsonProperty(value = "trial_bs_three_years", required = true)
    private TrialBsThreeYearsResponseTrialBsThreeYears trialBsThreeYears;

    /**
     * Get the trialBsThreeYears value.
     *
     * @return the trialBsThreeYears value
     */
    public TrialBsThreeYearsResponseTrialBsThreeYears trialBsThreeYears() {
        return this.trialBsThreeYears;
    }

    /**
     * Set the trialBsThreeYears value.
     *
     * @param trialBsThreeYears the trialBsThreeYears value to set
     * @return the TrialBsThreeYearsResponse object itself.
     */
    public TrialBsThreeYearsResponse withTrialBsThreeYears(TrialBsThreeYearsResponseTrialBsThreeYears trialBsThreeYears) {
        this.trialBsThreeYears = trialBsThreeYears;
        return this;
    }

}