package org.apache.ofbiz.shipment.picklist;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import java.math.BigDecimal;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Picklist And Bin And Item
 */
@FieldNameConstants
public class PicklistAndBinAndItem implements Serializable {

	public static final long serialVersionUID = 5368613184557000704L;
	public static final String NAME = "PicklistAndBinAndItem";
	/**
	 * Picklist Id
	 */
	@Getter
	@Setter
	private String picklistId;
	/**
	 * Last Modified By User Login
	 */
	@Getter
	@Setter
	private String lastModifiedByUserLogin;
	/**
	 * Facility Id
	 */
	@Getter
	@Setter
	private String facilityId;
	/**
	 * Status Id
	 */
	@Getter
	@Setter
	private String statusId;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;
	/**
	 * Picklist Date
	 */
	@Getter
	@Setter
	private Timestamp picklistDate;
	/**
	 * Shipment Method Type Id
	 */
	@Getter
	@Setter
	private String shipmentMethodTypeId;
	/**
	 * Created By User Login
	 */
	@Getter
	@Setter
	private String createdByUserLogin;
	/**
	 * Primary Order Id
	 */
	@Getter
	@Setter
	private String primaryOrderId;
	/**
	 * Picklist Bin Id
	 */
	@Getter
	@Setter
	private String picklistBinId;
	/**
	 * Primary Ship Group Seq Id
	 */
	@Getter
	@Setter
	private String primaryShipGroupSeqId;
	/**
	 * Bin Location Number
	 */
	@Getter
	@Setter
	private Long binLocationNumber;
	/**
	 * Order Item Seq Id
	 */
	@Getter
	@Setter
	private String orderItemSeqId;
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
	private BigDecimal quantity;
	/**
	 * Order Id
	 */
	@Getter
	@Setter
	private String orderId;
	/**
	 * Ship Group Seq Id
	 */
	@Getter
	@Setter
	private String shipGroupSeqId;
	/**
	 * Item Status Id
	 */
	@Getter
	@Setter
	private String itemStatusId;

	public PicklistAndBinAndItem(GenericValue value) {
		picklistId = (String) value.get(FIELD_PICKLIST_ID);
		lastModifiedByUserLogin = (String) value
				.get(FIELD_LAST_MODIFIED_BY_USER_LOGIN);
		facilityId = (String) value.get(FIELD_FACILITY_ID);
		statusId = (String) value.get(FIELD_STATUS_ID);
		description = (String) value.get(FIELD_DESCRIPTION);
		picklistDate = (Timestamp) value.get(FIELD_PICKLIST_DATE);
		shipmentMethodTypeId = (String) value
				.get(FIELD_SHIPMENT_METHOD_TYPE_ID);
		createdByUserLogin = (String) value.get(FIELD_CREATED_BY_USER_LOGIN);
		primaryOrderId = (String) value.get(FIELD_PRIMARY_ORDER_ID);
		picklistBinId = (String) value.get(FIELD_PICKLIST_BIN_ID);
		primaryShipGroupSeqId = (String) value
				.get(FIELD_PRIMARY_SHIP_GROUP_SEQ_ID);
		binLocationNumber = (Long) value.get(FIELD_BIN_LOCATION_NUMBER);
		orderItemSeqId = (String) value.get(FIELD_ORDER_ITEM_SEQ_ID);
		inventoryItemId = (String) value.get(FIELD_INVENTORY_ITEM_ID);
		quantity = (BigDecimal) value.get(FIELD_QUANTITY);
		orderId = (String) value.get(FIELD_ORDER_ID);
		shipGroupSeqId = (String) value.get(FIELD_SHIP_GROUP_SEQ_ID);
		itemStatusId = (String) value.get(FIELD_ITEM_STATUS_ID);
	}

	public static PicklistAndBinAndItem fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new PicklistAndBinAndItem(value);
	}

	public static List<PicklistAndBinAndItem> fromValues(
			List<GenericValue> values) {
		List<PicklistAndBinAndItem> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new PicklistAndBinAndItem(value));
		}
		return entities;
	}
}