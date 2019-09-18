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
 * The ManualJournal model.
 */
public class ManualJournal {
    /**
     * 振替伝票ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * 発生日 (yyyy-mm-dd).
     */
    @JsonProperty(value = "issue_date", required = true)
    private String issueDate;

    /**
     * 決算整理仕訳フラグ（falseまたは未指定の場合: 日常仕訳）.
     */
    @JsonProperty(value = "adjustment", required = true)
    private boolean adjustment;

    /**
     * 仕訳番号.
     */
    @JsonProperty(value = "txn_number", required = true)
    private String txnNumber;

    /**
     * 貸借行一覧（配列）: 貸借合わせて100行まで登録できます。.
     */
    @JsonProperty(value = "details", required = true)
    private List<ManualJournalDetailsItem> details;

    /**
     * Get 振替伝票ID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set 振替伝票ID.
     *
     * @param id the id value to set
     * @return the ManualJournal object itself.
     */
    public ManualJournal withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get 事業所ID.
     *
     * @return the companyId value
     */
    public int companyId() {
        return this.companyId;
    }

    /**
     * Set 事業所ID.
     *
     * @param companyId the companyId value to set
     * @return the ManualJournal object itself.
     */
    public ManualJournal withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get 発生日 (yyyy-mm-dd).
     *
     * @return the issueDate value
     */
    public String issueDate() {
        return this.issueDate;
    }

    /**
     * Set 発生日 (yyyy-mm-dd).
     *
     * @param issueDate the issueDate value to set
     * @return the ManualJournal object itself.
     */
    public ManualJournal withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Get 決算整理仕訳フラグ（falseまたは未指定の場合: 日常仕訳）.
     *
     * @return the adjustment value
     */
    public boolean adjustment() {
        return this.adjustment;
    }

    /**
     * Set 決算整理仕訳フラグ（falseまたは未指定の場合: 日常仕訳）.
     *
     * @param adjustment the adjustment value to set
     * @return the ManualJournal object itself.
     */
    public ManualJournal withAdjustment(boolean adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    /**
     * Get 仕訳番号.
     *
     * @return the txnNumber value
     */
    public String txnNumber() {
        return this.txnNumber;
    }

    /**
     * Set 仕訳番号.
     *
     * @param txnNumber the txnNumber value to set
     * @return the ManualJournal object itself.
     */
    public ManualJournal withTxnNumber(String txnNumber) {
        this.txnNumber = txnNumber;
        return this;
    }

    /**
     * Get 貸借行一覧（配列）: 貸借合わせて100行まで登録できます。.
     *
     * @return the details value
     */
    public List<ManualJournalDetailsItem> details() {
        return this.details;
    }

    /**
     * Set 貸借行一覧（配列）: 貸借合わせて100行まで登録できます。.
     *
     * @param details the details value to set
     * @return the ManualJournal object itself.
     */
    public ManualJournal withDetails(List<ManualJournalDetailsItem> details) {
        this.details = details;
        return this;
    }

}