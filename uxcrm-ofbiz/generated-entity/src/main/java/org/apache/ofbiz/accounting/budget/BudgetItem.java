package org.apache.ofbiz.accounting.budget;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Budget Item
 */
public class BudgetItem implements Serializable {

	public static final long serialVersionUID = 7678628682069543936L;
	public static final String NAME = "BudgetItem";
	/**
	 * Budget Id
	 */
	@Getter
	@Setter
	private String budgetId;
	/**
	 * Budget Item Seq Id
	 */
	@Getter
	@Setter
	private String budgetItemSeqId;
	/**
	 * Budget Item Type Id
	 */
	@Getter
	@Setter
	private String budgetItemTypeId;
	/**
	 * Amount
	 */
	@Getter
	@Setter
	private BigDecimal amount;
	/**
	 * Purpose
	 */
	@Getter
	@Setter
	private String purpose;
	/**
	 * Justification
	 */
	@Getter
	@Setter
	private String justification;
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
		budgetId, budgetItemSeqId, budgetItemTypeId, amount, purpose, justification, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public BudgetItem(GenericValue value) {
		budgetId = (String) value.get(Fields.budgetId.name());
		budgetItemSeqId = (String) value.get(Fields.budgetItemSeqId.name());
		budgetItemTypeId = (String) value.get(Fields.budgetItemTypeId.name());
		amount = (BigDecimal) value.get(Fields.amount.name());
		purpose = (String) value.get(Fields.purpose.name());
		justification = (String) value.get(Fields.justification.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static BudgetItem fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new BudgetItem(value);
	}

	public static List<BudgetItem> fromValues(List<GenericValue> values) {
		List<BudgetItem> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new BudgetItem(value));
		}
		return entities;
	}
}