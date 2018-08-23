package org.apache.ofbiz.order.order;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Order Adjustment Type
 */
@FieldNameConstants
public class OrderAdjustmentType implements Serializable {

	public static final long serialVersionUID = 5094320826503225344L;
	public static final String NAME = "OrderAdjustmentType";
	/**
	 * Order Adjustment Type Id
	 */
	@Getter
	@Setter
	private String orderAdjustmentTypeId;
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

	public OrderAdjustmentType(GenericValue value) {
		orderAdjustmentTypeId = (String) value
				.get(FIELD_ORDER_ADJUSTMENT_TYPE_ID);
		parentTypeId = (String) value.get(FIELD_PARENT_TYPE_ID);
		hasTable = (String) value.get(FIELD_HAS_TABLE);
		description = (String) value.get(FIELD_DESCRIPTION);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static OrderAdjustmentType fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new OrderAdjustmentType(value);
	}

	public static List<OrderAdjustmentType> fromValues(List<GenericValue> values) {
		List<OrderAdjustmentType> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new OrderAdjustmentType(value));
		}
		return entities;
	}
}