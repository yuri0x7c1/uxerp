package org.apache.ofbiz.accounting.ledger;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Gl Account Type
 */
@FieldNameConstants
public class GlAccountType implements Serializable {

	public static final long serialVersionUID = 4668716004110559232L;
	public static final String NAME = "GlAccountType";
	/**
	 * Gl Account Type Id
	 */
	@Getter
	@Setter
	private String glAccountTypeId;
	/**
	 * Parent Type Id
	 */
	@Getter
	@Setter
	private String parentTypeId;
	/**
	 * Has Table
	 */
	@Getter
	@Setter
	private String hasTable;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;
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

	public GlAccountType(GenericValue value) {
		glAccountTypeId = (String) value.get(FIELD_GL_ACCOUNT_TYPE_ID);
		parentTypeId = (String) value.get(FIELD_PARENT_TYPE_ID);
		hasTable = (String) value.get(FIELD_HAS_TABLE);
		description = (String) value.get(FIELD_DESCRIPTION);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static GlAccountType fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new GlAccountType(value);
	}

	public static List<GlAccountType> fromValues(List<GenericValue> values) {
		List<GlAccountType> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new GlAccountType(value));
		}
		return entities;
	}
}