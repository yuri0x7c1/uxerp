package org.apache.ofbiz.workeffort.workeffort;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Work Effort And Inventory Assign
 */
public class WorkEffortAndInventoryAssign implements Serializable {

	public static final long serialVersionUID = 5034702862849416192L;
	public static final String NAME = "WorkEffortAndInventoryAssign";
	/**
	 * Product Id
	 */
	@Getter
	@Setter
	private String productId;
	/**
	 * Currency Uom Id
	 */
	@Getter
	@Setter
	private String currencyUomId;
	/**
	 * Unit Cost
	 */
	@Getter
	@Setter
	private BigDecimal unitCost;
	/**
	 * Uom Id
	 */
	@Getter
	@Setter
	private String uomId;
	/**
	 * Work Effort Id
	 */
	@Getter
	@Setter
	private String workEffortId;
	/**
	 * Inventory Item Id
	 */
	@Getter
	@Setter
	private String inventoryItemId;
	/**
	 * Quantity
	 */
	@Getter
	@Setter
	private Double quantity;
	/**
	 * Status Id
	 */
	@Getter
	@Setter
	private String statusId;

	public enum Fields {
		productId, currencyUomId, unitCost, uomId, workEffortId, inventoryItemId, quantity, statusId
	}

	public WorkEffortAndInventoryAssign(GenericValue value) {
		productId = (String) value.get(Fields.productId.name());
		currencyUomId = (String) value.get(Fields.currencyUomId.name());
		unitCost = (BigDecimal) value.get(Fields.unitCost.name());
		uomId = (String) value.get(Fields.uomId.name());
		workEffortId = (String) value.get(Fields.workEffortId.name());
		inventoryItemId = (String) value.get(Fields.inventoryItemId.name());
		quantity = (Double) value.get(Fields.quantity.name());
		statusId = (String) value.get(Fields.statusId.name());
	}

	public static WorkEffortAndInventoryAssign fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new WorkEffortAndInventoryAssign(value);
	}

	public static List<WorkEffortAndInventoryAssign> fromValues(
			List<GenericValue> values) {
		List<WorkEffortAndInventoryAssign> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new WorkEffortAndInventoryAssign(value));
		}
		return entities;
	}
}