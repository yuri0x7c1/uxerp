package org.apache.ofbiz.product.product;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Old Product Keyword Result
 */
@FieldNameConstants
public class OldProductKeywordResult implements Serializable {

	public static final long serialVersionUID = 1114476470149987328L;
	public static final String NAME = "OldProductKeywordResult";
	/**
	 * Product Keyword Result Id
	 */
	@Getter
	@Setter
	private String productKeywordResultId;
	/**
	 * Visit Id
	 */
	@Getter
	@Setter
	private String visitId;
	/**
	 * Product Category Id
	 */
	@Getter
	@Setter
	private String productCategoryId;
	/**
	 * Search String
	 */
	@Getter
	@Setter
	private String searchString;
	/**
	 * Intra Keyword Operator
	 */
	@Getter
	@Setter
	private String intraKeywordOperator;
	/**
	 * Any Prefix
	 */
	@Getter
	@Setter
	private String anyPrefix;
	/**
	 * Any Suffix
	 */
	@Getter
	@Setter
	private String anySuffix;
	/**
	 * Remove Stems
	 */
	@Getter
	@Setter
	private String removeStems;
	/**
	 * Num Results
	 */
	@Getter
	@Setter
	private Long numResults;
	/**
	 * Last Updated Stamp
	 */
	@Getter
	@Setter
	private Timestamp lastUpdatedStamp;
	/**
	 * Last Updated Tx Stamp
	 */
	@Getter
	@Setter
	private Timestamp lastUpdatedTxStamp;
	/**
	 * Created Stamp
	 */
	@Getter
	@Setter
	private Timestamp createdStamp;
	/**
	 * Created Tx Stamp
	 */
	@Getter
	@Setter
	private Timestamp createdTxStamp;

	public OldProductKeywordResult(GenericValue value) {
		productKeywordResultId = (String) value
				.get(FIELD_PRODUCT_KEYWORD_RESULT_ID);
		visitId = (String) value.get(FIELD_VISIT_ID);
		productCategoryId = (String) value.get(FIELD_PRODUCT_CATEGORY_ID);
		searchString = (String) value.get(FIELD_SEARCH_STRING);
		intraKeywordOperator = (String) value.get(FIELD_INTRA_KEYWORD_OPERATOR);
		anyPrefix = (String) value.get(FIELD_ANY_PREFIX);
		anySuffix = (String) value.get(FIELD_ANY_SUFFIX);
		removeStems = (String) value.get(FIELD_REMOVE_STEMS);
		numResults = (Long) value.get(FIELD_NUM_RESULTS);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static OldProductKeywordResult fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new OldProductKeywordResult(value);
	}

	public static List<OldProductKeywordResult> fromValues(
			List<GenericValue> values) {
		List<OldProductKeywordResult> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new OldProductKeywordResult(value));
		}
		return entities;
	}
}