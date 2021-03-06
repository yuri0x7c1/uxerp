package org.apache.ofbiz.accounting.payment;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Payment Type Attr
 */
@FieldNameConstants
public class PaymentTypeAttr implements Serializable {

	public static final long serialVersionUID = 3542004721835469824L;
	public static final String NAME = "PaymentTypeAttr";
	/**
	 * Payment Type Id
	 */
	@Getter
	@Setter
	private String paymentTypeId;
	/**
	 * Attr Name
	 */
	@Getter
	@Setter
	private String attrName;
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

	public PaymentTypeAttr(GenericValue value) {
		paymentTypeId = (String) value.get(FIELD_PAYMENT_TYPE_ID);
		attrName = (String) value.get(FIELD_ATTR_NAME);
		description = (String) value.get(FIELD_DESCRIPTION);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static PaymentTypeAttr fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new PaymentTypeAttr(value);
	}

	public static List<PaymentTypeAttr> fromValues(List<GenericValue> values) {
		List<PaymentTypeAttr> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new PaymentTypeAttr(value));
		}
		return entities;
	}
}