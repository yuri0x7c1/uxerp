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
 * Agreement Attribute
 */
@FieldNameConstants
public class AgreementAttribute implements Serializable {

	public static final long serialVersionUID = 3735924174686880768L;
	public static final String NAME = "AgreementAttribute";
	/**
	 * Agreement Id
	 */
	@Getter
	@Setter
	private String agreementId;
	/**
	 * Attr Name
	 */
	@Getter
	@Setter
	private String attrName;
	/**
	 * Attr Value
	 */
	@Getter
	@Setter
	private String attrValue;
	/**
	 * Attr Description
	 */
	@Getter
	@Setter
	private String attrDescription;
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

	public AgreementAttribute(GenericValue value) {
		agreementId = (String) value.get(FIELD_AGREEMENT_ID);
		attrName = (String) value.get(FIELD_ATTR_NAME);
		attrValue = (String) value.get(FIELD_ATTR_VALUE);
		attrDescription = (String) value.get(FIELD_ATTR_DESCRIPTION);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static AgreementAttribute fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new AgreementAttribute(value);
	}

	public static List<AgreementAttribute> fromValues(List<GenericValue> values) {
		List<AgreementAttribute> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new AgreementAttribute(value));
		}
		return entities;
	}
}