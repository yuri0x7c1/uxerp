package org.apache.ofbiz.accounting.invoice;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Invoice Item Assoc Type
 */
@FieldNameConstants
public class InvoiceItemAssocType implements Serializable {

	public static final long serialVersionUID = 3643500157672002560L;
	public static final String NAME = "InvoiceItemAssocType";
	/**
	 * Invoice Item Assoc Type Id
	 */
	@Getter
	@Setter
	private String invoiceItemAssocTypeId;
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

	public InvoiceItemAssocType(GenericValue value) {
		invoiceItemAssocTypeId = (String) value
				.get(FIELD_INVOICE_ITEM_ASSOC_TYPE_ID);
		parentTypeId = (String) value.get(FIELD_PARENT_TYPE_ID);
		hasTable = (String) value.get(FIELD_HAS_TABLE);
		description = (String) value.get(FIELD_DESCRIPTION);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static InvoiceItemAssocType fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new InvoiceItemAssocType(value);
	}

	public static List<InvoiceItemAssocType> fromValues(
			List<GenericValue> values) {
		List<InvoiceItemAssocType> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new InvoiceItemAssocType(value));
		}
		return entities;
	}
}