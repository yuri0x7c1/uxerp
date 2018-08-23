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
 * Payment Gateway Config Type
 */
@FieldNameConstants
public class PaymentGatewayConfigType implements Serializable {

	public static final long serialVersionUID = 7741994740361846784L;
	public static final String NAME = "PaymentGatewayConfigType";
	/**
	 * Payment Gateway Config Type Id
	 */
	@Getter
	@Setter
	private String paymentGatewayConfigTypeId;
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

	public PaymentGatewayConfigType(GenericValue value) {
		paymentGatewayConfigTypeId = (String) value
				.get(FIELD_PAYMENT_GATEWAY_CONFIG_TYPE_ID);
		parentTypeId = (String) value.get(FIELD_PARENT_TYPE_ID);
		hasTable = (String) value.get(FIELD_HAS_TABLE);
		description = (String) value.get(FIELD_DESCRIPTION);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static PaymentGatewayConfigType fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new PaymentGatewayConfigType(value);
	}

	public static List<PaymentGatewayConfigType> fromValues(
			List<GenericValue> values) {
		List<PaymentGatewayConfigType> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new PaymentGatewayConfigType(value));
		}
		return entities;
	}
}