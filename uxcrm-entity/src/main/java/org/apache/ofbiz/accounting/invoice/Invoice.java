package org.apache.ofbiz.accounting.invoice;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Invoice
 */
public class Invoice implements Serializable {

	public static final long serialVersionUID = 2176670059745098752L;
	public static final String NAME = "Invoice";
	/**
	 * Invoice Id
	 */
	@Getter
	@Setter
	private String invoiceId;
	/**
	 * Invoice Type Id
	 */
	@Getter
	@Setter
	private String invoiceTypeId;
	/**
	 * Party Id From
	 */
	@Getter
	@Setter
	private String partyIdFrom;
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
	 * Status Id
	 */
	@Getter
	@Setter
	private String statusId;
	/**
	 * Billing Account Id
	 */
	@Getter
	@Setter
	private String billingAccountId;
	/**
	 * Contact Mech Id
	 */
	@Getter
	@Setter
	private String contactMechId;
	/**
	 * Invoice Date
	 */
	@Getter
	@Setter
	private Timestamp invoiceDate;
	/**
	 * Due Date
	 */
	@Getter
	@Setter
	private Timestamp dueDate;
	/**
	 * Paid Date
	 */
	@Getter
	@Setter
	private Timestamp paidDate;
	/**
	 * Invoice Message
	 */
	@Getter
	@Setter
	private String invoiceMessage;
	/**
	 * Reference Number
	 */
	@Getter
	@Setter
	private String referenceNumber;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;
	/**
	 * Currency Uom Id
	 */
	@Getter
	@Setter
	private String currencyUomId;
	/**
	 * Recurrence Info Id
	 */
	@Getter
	@Setter
	private String recurrenceInfoId;
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
		invoiceId, invoiceTypeId, partyIdFrom, partyId, roleTypeId, statusId, billingAccountId, contactMechId, invoiceDate, dueDate, paidDate, invoiceMessage, referenceNumber, description, currencyUomId, recurrenceInfoId, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public Invoice(GenericValue value) {
		invoiceId = (String) value.get(Fields.invoiceId.name());
		invoiceTypeId = (String) value.get(Fields.invoiceTypeId.name());
		partyIdFrom = (String) value.get(Fields.partyIdFrom.name());
		partyId = (String) value.get(Fields.partyId.name());
		roleTypeId = (String) value.get(Fields.roleTypeId.name());
		statusId = (String) value.get(Fields.statusId.name());
		billingAccountId = (String) value.get(Fields.billingAccountId.name());
		contactMechId = (String) value.get(Fields.contactMechId.name());
		invoiceDate = (Timestamp) value.get(Fields.invoiceDate.name());
		dueDate = (Timestamp) value.get(Fields.dueDate.name());
		paidDate = (Timestamp) value.get(Fields.paidDate.name());
		invoiceMessage = (String) value.get(Fields.invoiceMessage.name());
		referenceNumber = (String) value.get(Fields.referenceNumber.name());
		description = (String) value.get(Fields.description.name());
		currencyUomId = (String) value.get(Fields.currencyUomId.name());
		recurrenceInfoId = (String) value.get(Fields.recurrenceInfoId.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static Invoice fromValue(org.apache.ofbiz.entity.GenericValue value) {
		return new Invoice(value);
	}

	public static List<Invoice> fromValues(List<GenericValue> values) {
		List<Invoice> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new Invoice(value));
		}
		return entities;
	}
}