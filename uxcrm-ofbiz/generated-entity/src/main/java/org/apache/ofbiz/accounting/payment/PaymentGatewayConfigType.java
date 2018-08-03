package org.apache.ofbiz.accounting.payment;

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
public class PaymentGatewayConfigType implements Serializable {

	public static final long serialVersionUID = 6114333517538302976L;
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

	public enum Fields {
		paymentGatewayConfigTypeId, parentTypeId, hasTable, description, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public PaymentGatewayConfigType(GenericValue value) {
		paymentGatewayConfigTypeId = (String) value
				.get(Fields.paymentGatewayConfigTypeId.name());
		parentTypeId = (String) value.get(Fields.parentTypeId.name());
		hasTable = (String) value.get(Fields.hasTable.name());
		description = (String) value.get(Fields.description.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
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