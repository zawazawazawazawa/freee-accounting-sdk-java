

# TrialCrTwoYearsResponseTrialCrTwoYearsBalances


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountCategoryName** | **String** | 勘定科目カテゴリー名 |  [optional]
**accountGroupName** | **String** | 決算書表示名(account_item_display_type:group指定時に決算書表示名の時のみ含まれる) |  [optional]
**accountItemId** | **Integer** | 勘定科目ID(勘定科目の時のみ含まれる) |  [optional]
**accountItemName** | **String** | 勘定科目名(勘定科目の時のみ含まれる) |  [optional]
**closingBalance** | **Integer** | 期末残高 |  [optional]
**hierarchyLevel** | **Integer** | 階層レベル |  [optional]
**items** | [**List&lt;TrialCrTwoYearsResponseTrialCrTwoYearsItems&gt;**](TrialCrTwoYearsResponseTrialCrTwoYearsItems.md) | breakdown_display_type:item, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**lastYearClosingBalance** | **Integer** | 前年度期末残高 |  [optional]
**parentAccountCategoryName** | **String** | 上位勘定科目カテゴリー名(勘定科目カテゴリーの時のみ、上層が存在する場合含まれる) |  [optional]
**partners** | [**List&lt;TrialCrTwoYearsResponseTrialCrTwoYearsPartners&gt;**](TrialCrTwoYearsResponseTrialCrTwoYearsPartners.md) | breakdown_display_type:partner, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**sections** | [**List&lt;TrialBsTwoYearsResponseTrialBsTwoYearsSections&gt;**](TrialBsTwoYearsResponseTrialBsTwoYearsSections.md) | breakdown_display_type:section, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**segment1Tags** | [**List&lt;TrialCrTwoYearsResponseTrialCrTwoYearsSegment1Tags&gt;**](TrialCrTwoYearsResponseTrialCrTwoYearsSegment1Tags.md) | breakdown_display_type:segment_1_tag, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**segment2Tags** | [**List&lt;TrialCrTwoYearsResponseTrialCrTwoYearsSegment2Tags&gt;**](TrialCrTwoYearsResponseTrialCrTwoYearsSegment2Tags.md) | breakdown_display_type:segment_2_tag, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**segment3Tags** | [**List&lt;TrialCrTwoYearsResponseTrialCrTwoYearsSegment3Tags&gt;**](TrialCrTwoYearsResponseTrialCrTwoYearsSegment3Tags.md) | breakdown_display_type:segment_3_tag, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**totalLine** | **Boolean** | 合計行(勘定科目カテゴリーの時のみ含まれる) |  [optional]
**yearOnYear** | **BigDecimal** | 前年比 |  [optional]



