package org.apache.ofbiz.accounting.invoice;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Invoice And Role
 */
public class InvoiceAndRole implements Serializable {

	public static final long serialVersionUID = 3064085693540337664L;
	public static final String NAME = "InvoiceAndRole";
	/**
	 * Invoice Role Party Id
	 */
	@Getter
	@Setter
	private String invoiceRolePartyId;
	/**
	 * Invoice Role Type Id
	 */
	@Getter
	@Setter
	private String invoiceRoleTypeId;
	/**
	 * Party Id From
	 */
	@Getter
	@Setter
	private String partyIdFrom;
	/**
	 * Role Type Id
	 */
	@Getter
	@Setter
	private String roleTypeId;
	/**
	 * Recurrence Info Id
	 */
	@Getter
	@Setter
	private String recurrenceInfoId;
	/**
	 * Invoice Type Id
	 */
	@Getter
	@Setter
	private String invoiceTypeId;
	/**
	 * Due Date
	 */
	@Getter
	@Setter
	private Timestamp dueDate;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;
	/**
	 * Billing Account Id
	 */
	@Getter
	@Setter
	private String billingAccountId;
	/**
	 * Invoice Date
	 */
	@Getter
	@Setter
	private Timestamp invoiceDate;
	/**
	 * Contact Mech Id
	 */
	@Getter
	@Setter
	private String contactMechId;
	/**
	 * Currency Uom Id
	 */
	@Getter
	@Setter
	private String currencyUomId;
	/**
	 * Status Id
	 */
	@Getter
	@Setter
	private String statusId;
	/**
	 * Paid Date
	 */
	@Getter
	@Setter
	private Timestamp paidDate;
	/**
	 * Reference Number
	 */
	@Getter
	@Setter
	private String referenceNumber;
	/**
	 * Invoice Id
	 */
	@Getter
	@Setter
	private String invoiceId;
	/**
	 * Invoice Message
	 */
	@Getter
	@Setter
	private String invoiceMessage;
	/**
	 * Party Id
	 */
	@Getter
	@Setter
	private String partyId;

	public enum Fields {
		invoiceRolePartyId, invoiceRoleTypeId, partyIdFrom, roleTypeId, recurrenceInfoId, invoiceTypeId, dueDate, description, billingAccountId, invoiceDate, contactMechId, currencyUomId, statusId, paidDate, referenceNumber, invoiceId, invoiceMessage, partyId
	}

	public InvoiceAndRole(GenericValue value) {
		invoiceRolePartyId = (String) value.get(Fields.invoiceRolePartyId
				.name());
		invoiceRoleTypeId = (String) value.get(Fields.invoiceRoleTypeId.name());
		partyIdFrom = (String) value.get(Fields.partyIdFrom.name());
		roleTypeId = (String) value.get(Fields.roleTypeId.name());
		recurrenceInfoId = (String) value.get(Fields.recurrenceInfoId.name());
		invoiceTypeId = (String) value.get(Fields.invoiceTypeId.name());
		dueDate = (Timestamp) value.get(Fields.dueDate.name());
		description = (String) value.get(Fields.description.name());
		billingAccountId = (String) value.get(Fields.billingAccountId.name());
		invoiceDate = (Timestamp) value.get(Fields.invoiceDate.name());
		contactMechId = (String) value.get(Fields.contactMechId.name());
		currencyUomId = (String) value.get(Fields.currencyUomId.name());
		statusId = (String) value.get(Fields.statusId.name());
		paidDate = (Timestamp) value.get(Fields.paidDate.name());
		referenceNumber = (String) value.get(Fields.referenceNumber.name());
		invoiceId = (String) value.get(Fields.invoiceId.name());
		invoiceMessage = (String) value.get(Fields.invoiceMessage.name());
		partyId = (String) value.get(Fields.partyId.name());
	}

	public static InvoiceAndRole fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new InvoiceAndRole(value);
	}

	public static List<InvoiceAndRole> fromValues(List<GenericValue> values) {
		List<InvoiceAndRole> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new InvoiceAndRole(value));
		}
		return entities;
	}
}