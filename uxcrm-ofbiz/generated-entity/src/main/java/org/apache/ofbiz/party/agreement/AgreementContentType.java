package org.apache.ofbiz.party.agreement;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Agreement Content Type
 */
@FieldNameConstants
public class AgreementContentType implements Serializable {

	public static final long serialVersionUID = 7115739136359038976L;
	public static final String NAME = "AgreementContentType";
	/**
	 * Agreement Content Type Id
	 */
	@Getter
	@Setter
	private String agreementContentTypeId;
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

	public AgreementContentType(GenericValue value) {
		agreementContentTypeId = (String) value
				.get(FIELD_AGREEMENT_CONTENT_TYPE_ID);
		parentTypeId = (String) value.get(FIELD_PARENT_TYPE_ID);
		hasTable = (String) value.get(FIELD_HAS_TABLE);
		description = (String) value.get(FIELD_DESCRIPTION);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static AgreementContentType fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new AgreementContentType(value);
	}

	public static List<AgreementContentType> fromValues(
			List<GenericValue> values) {
		List<AgreementContentType> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new AgreementContentType(value));
		}
		return entities;
	}
}