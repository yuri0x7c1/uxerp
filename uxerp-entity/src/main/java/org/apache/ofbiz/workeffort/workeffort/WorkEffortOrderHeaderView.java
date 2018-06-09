package org.apache.ofbiz.workeffort.workeffort;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Work Effort Order Header View
 */
public class WorkEffortOrderHeaderView implements Serializable {

	public static final long serialVersionUID = 777394673024563200L;
	public static final String NAME = "WorkEffortOrderHeaderView";
	/**
	 * Order Type Description
	 */
	@Getter
	@Setter
	private String orderTypeDescription;
	/**
	 * Status Item Description
	 */
	@Getter
	@Setter
	private String statusItemDescription;
	/**
	 * Work Effort Id
	 */
	@Getter
	@Setter
	private String workEffortId;
	/**
	 * Order Id
	 */
	@Getter
	@Setter
	private String orderId;
	/**
	 * Invoice Per Shipment
	 */
	@Getter
	@Setter
	private String invoicePerShipment;
	/**
	 * Sales Channel Enum Id
	 */
	@Getter
	@Setter
	private String salesChannelEnumId;
	/**
	 * Order Type Id
	 */
	@Getter
	@Setter
	private String orderTypeId;
	/**
	 * Billing Account Id
	 */
	@Getter
	@Setter
	private String billingAccountId;
	/**
	 * Terminal Id
	 */
	@Getter
	@Setter
	private String terminalId;
	/**
	 * Is Viewed
	 */
	@Getter
	@Setter
	private String isViewed;
	/**
	 * Visit Id
	 */
	@Getter
	@Setter
	private String visitId;
	/**
	 * Agreement Id
	 */
	@Getter
	@Setter
	private String agreementId;
	/**
	 * Product Store Id
	 */
	@Getter
	@Setter
	private String productStoreId;
	/**
	 * Remaining Sub Total
	 */
	@Getter
	@Setter
	private BigDecimal remainingSubTotal;
	/**
	 * Order Name
	 */
	@Getter
	@Setter
	private String orderName;
	/**
	 * Web Site Id
	 */
	@Getter
	@Setter
	private String webSiteId;
	/**
	 * Is Rush Order
	 */
	@Getter
	@Setter
	private String isRushOrder;
	/**
	 * Entry Date
	 */
	@Getter
	@Setter
	private Timestamp entryDate;
	/**
	 * Grand Total
	 */
	@Getter
	@Setter
	private BigDecimal grandTotal;
	/**
	 * Auto Order Shopping List Id
	 */
	@Getter
	@Setter
	private String autoOrderShoppingListId;
	/**
	 * External Id
	 */
	@Getter
	@Setter
	private String externalId;
	/**
	 * Priority
	 */
	@Getter
	@Setter
	private String priority;
	/**
	 * Transaction Id
	 */
	@Getter
	@Setter
	private String transactionId;
	/**
	 * First Attempt Order Id
	 */
	@Getter
	@Setter
	private String firstAttemptOrderId;
	/**
	 * Origin Facility Id
	 */
	@Getter
	@Setter
	private String originFacilityId;
	/**
	 * Status Id
	 */
	@Getter
	@Setter
	private String statusId;
	/**
	 * Created By
	 */
	@Getter
	@Setter
	private String createdBy;
	/**
	 * Currency Uom
	 */
	@Getter
	@Setter
	private String currencyUom;
	/**
	 * Sync Status Id
	 */
	@Getter
	@Setter
	private String syncStatusId;
	/**
	 * Pick Sheet Printed Date
	 */
	@Getter
	@Setter
	private Timestamp pickSheetPrintedDate;
	/**
	 * Needs Inventory Issuance
	 */
	@Getter
	@Setter
	private String needsInventoryIssuance;
	/**
	 * Order Date
	 */
	@Getter
	@Setter
	private Timestamp orderDate;
	/**
	 * Internal Code
	 */
	@Getter
	@Setter
	private String internalCode;

	public enum Fields {
		orderTypeDescription, statusItemDescription, workEffortId, orderId, invoicePerShipment, salesChannelEnumId, orderTypeId, billingAccountId, terminalId, isViewed, visitId, agreementId, productStoreId, remainingSubTotal, orderName, webSiteId, isRushOrder, entryDate, grandTotal, autoOrderShoppingListId, externalId, priority, transactionId, firstAttemptOrderId, originFacilityId, statusId, createdBy, currencyUom, syncStatusId, pickSheetPrintedDate, needsInventoryIssuance, orderDate, internalCode
	}

	public WorkEffortOrderHeaderView(GenericValue value) {
		orderTypeDescription = (String) value.get(Fields.orderTypeDescription
				.name());
		statusItemDescription = (String) value.get(Fields.statusItemDescription
				.name());
		workEffortId = (String) value.get(Fields.workEffortId.name());
		orderId = (String) value.get(Fields.orderId.name());
		invoicePerShipment = (String) value.get(Fields.invoicePerShipment
				.name());
		salesChannelEnumId = (String) value.get(Fields.salesChannelEnumId
				.name());
		orderTypeId = (String) value.get(Fields.orderTypeId.name());
		billingAccountId = (String) value.get(Fields.billingAccountId.name());
		terminalId = (String) value.get(Fields.terminalId.name());
		isViewed = (String) value.get(Fields.isViewed.name());
		visitId = (String) value.get(Fields.visitId.name());
		agreementId = (String) value.get(Fields.agreementId.name());
		productStoreId = (String) value.get(Fields.productStoreId.name());
		remainingSubTotal = (BigDecimal) value.get(Fields.remainingSubTotal
				.name());
		orderName = (String) value.get(Fields.orderName.name());
		webSiteId = (String) value.get(Fields.webSiteId.name());
		isRushOrder = (String) value.get(Fields.isRushOrder.name());
		entryDate = (Timestamp) value.get(Fields.entryDate.name());
		grandTotal = (BigDecimal) value.get(Fields.grandTotal.name());
		autoOrderShoppingListId = (String) value
				.get(Fields.autoOrderShoppingListId.name());
		externalId = (String) value.get(Fields.externalId.name());
		priority = (String) value.get(Fields.priority.name());
		transactionId = (String) value.get(Fields.transactionId.name());
		firstAttemptOrderId = (String) value.get(Fields.firstAttemptOrderId
				.name());
		originFacilityId = (String) value.get(Fields.originFacilityId.name());
		statusId = (String) value.get(Fields.statusId.name());
		createdBy = (String) value.get(Fields.createdBy.name());
		currencyUom = (String) value.get(Fields.currencyUom.name());
		syncStatusId = (String) value.get(Fields.syncStatusId.name());
		pickSheetPrintedDate = (Timestamp) value
				.get(Fields.pickSheetPrintedDate.name());
		needsInventoryIssuance = (String) value
				.get(Fields.needsInventoryIssuance.name());
		orderDate = (Timestamp) value.get(Fields.orderDate.name());
		internalCode = (String) value.get(Fields.internalCode.name());
	}

	public static WorkEffortOrderHeaderView fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new WorkEffortOrderHeaderView(value);
	}

	public static List<WorkEffortOrderHeaderView> fromValues(
			List<GenericValue> values) {
		List<WorkEffortOrderHeaderView> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new WorkEffortOrderHeaderView(value));
		}
		return entities;
	}
}