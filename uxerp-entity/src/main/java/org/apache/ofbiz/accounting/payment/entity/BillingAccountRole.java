package org.apache.ofbiz.accounting.payment.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Billing Account Role
 */
public class BillingAccountRole implements Serializable {

	public static final long serialVersionUID = 8508306983459625984L;
	public static final String NAME = "BillingAccountRole";
	/**
	 * Billing Account Id
	 */
	@Getter
	@Setter
	private String billingAccountId;
	/**
	 * Party Id
	 */
	@Getter
	@Setter
	private String partyId;
	/**
	 * Role Type Id
	 */
	@Getter
	@Setter
	private String roleTypeId;
	/**
	 * From Date
	 */
	@Getter
	@Setter
	private Timestamp fromDate;
	/**
	 * Thru Date
	 */
	@Getter
	@Setter
	private Timestamp thruDate;

	public enum Fields {
		billingAccountId, partyId, roleTypeId, fromDate, thruDate
	}

	public BillingAccountRole(GenericValue value) {
		billingAccountId = (String) value.get(Fields.billingAccountId.name());
		partyId = (String) value.get(Fields.partyId.name());
		roleTypeId = (String) value.get(Fields.roleTypeId.name());
		fromDate = (Timestamp) value.get(Fields.fromDate.name());
		thruDate = (Timestamp) value.get(Fields.thruDate.name());
	}

	public static BillingAccountRole fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new BillingAccountRole(value);
	}

	public static List<BillingAccountRole> fromValues(List<GenericValue> values) {
		List<BillingAccountRole> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new BillingAccountRole(value));
		}
		return entities;
	}
}