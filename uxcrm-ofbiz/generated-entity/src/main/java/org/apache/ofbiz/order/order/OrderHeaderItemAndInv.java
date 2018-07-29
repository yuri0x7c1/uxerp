package org.apache.ofbiz.order.order;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import java.math.BigDecimal;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Order Header Item And Inv
 */
public class OrderHeaderItemAndInv implements Serializable {

	public static final long serialVersionUID = 8042700889446669312L;
	public static final String NAME = "OrderHeaderItemAndInv";
	/**
	 * Order Id
	 */
	@Getter
	@Setter
	private String orderId;
	/**
	 * Order Type Id
	 */
	@Getter
	@Setter
	private String orderTypeId;
	/**
	 * Order Date
	 */
	@Getter
	@Setter
	private Timestamp orderDate;
	/**
	 * Entry Date
	 */
	@Getter
	@Setter
	private Timestamp entryDate;
	/**
	 * Visit Id
	 */
	@Getter
	@Setter
	private String visitId;
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
	 * First Attempt Order Id
	 */
	@Getter
	@Setter
	private String firstAttemptOrderId;
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
	 * Billing Account Id
	 */
	@Getter
	@Setter
	private String billingAccountId;
	/**
	 * Origin Facility Id
	 */
	@Getter
	@Setter
	private String originFacilityId;
	/**
	 * Product Store Id
	 */
	@Getter
	@Setter
	private String productStoreId;
	/**
	 * Web Site Id
	 */
	@Getter
	@Setter
	private String webSiteId;
	/**
	 * Grand Total
	 */
	@Getter
	@Setter
	private BigDecimal grandTotal;
	/**
	 * Remaining Sub Total
	 */
	@Getter
	@Setter
	private BigDecimal remainingSubTotal;
	/**
	 * Product Id
	 */
	@Getter
	@Setter
	private String productId;
	/**
	 * Quantity
	 */
	@Getter
	@Setter
	private BigDecimal quantity;
	/**
	 * Unit Price
	 */
	@Getter
	@Setter
	private BigDecimal unitPrice;
	/**
	 * Unit List Price
	 */
	@Getter
	@Setter
	private BigDecimal unitListPrice;
	/**
	 * Estimated Ship Date
	 */
	@Getter
	@Setter
	private Timestamp estimatedShipDate;
	/**
	 * Auto Cancel Date
	 */
	@Getter
	@Setter
	private Timestamp autoCancelDate;
	/**
	 * Corresponding Po Id
	 */
	@Getter
	@Setter
	private String correspondingPoId;
	/**
	 * Quantity Not Available
	 */
	@Getter
	@Setter
	private BigDecimal quantityNotAvailable;

	public enum Fields {
		orderId, orderTypeId, orderDate, entryDate, visitId, statusId, createdBy, firstAttemptOrderId, currencyUom, syncStatusId, billingAccountId, originFacilityId, productStoreId, webSiteId, grandTotal, remainingSubTotal, productId, quantity, unitPrice, unitListPrice, estimatedShipDate, autoCancelDate, correspondingPoId, quantityNotAvailable
	}

	public OrderHeaderItemAndInv(GenericValue value) {
		orderId = (String) value.get(Fields.orderId.name());
		orderTypeId = (String) value.get(Fields.orderTypeId.name());
		orderDate = (Timestamp) value.get(Fields.orderDate.name());
		entryDate = (Timestamp) value.get(Fields.entryDate.name());
		visitId = (String) value.get(Fields.visitId.name());
		statusId = (String) value.get(Fields.statusId.name());
		createdBy = (String) value.get(Fields.createdBy.name());
		firstAttemptOrderId = (String) value.get(Fields.firstAttemptOrderId
				.name());
		currencyUom = (String) value.get(Fields.currencyUom.name());
		syncStatusId = (String) value.get(Fields.syncStatusId.name());
		billingAccountId = (String) value.get(Fields.billingAccountId.name());
		originFacilityId = (String) value.get(Fields.originFacilityId.name());
		productStoreId = (String) value.get(Fields.productStoreId.name());
		webSiteId = (String) value.get(Fields.webSiteId.name());
		grandTotal = (BigDecimal) value.get(Fields.grandTotal.name());
		remainingSubTotal = (BigDecimal) value.get(Fields.remainingSubTotal
				.name());
		productId = (String) value.get(Fields.productId.name());
		quantity = (BigDecimal) value.get(Fields.quantity.name());
		unitPrice = (BigDecimal) value.get(Fields.unitPrice.name());
		unitListPrice = (BigDecimal) value.get(Fields.unitListPrice.name());
		estimatedShipDate = (Timestamp) value.get(Fields.estimatedShipDate
				.name());
		autoCancelDate = (Timestamp) value.get(Fields.autoCancelDate.name());
		correspondingPoId = (String) value.get(Fields.correspondingPoId.name());
		quantityNotAvailable = (BigDecimal) value
				.get(Fields.quantityNotAvailable.name());
	}

	public static OrderHeaderItemAndInv fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new OrderHeaderItemAndInv(value);
	}

	public static List<OrderHeaderItemAndInv> fromValues(
			List<GenericValue> values) {
		List<OrderHeaderItemAndInv> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new OrderHeaderItemAndInv(value));
		}
		return entities;
	}
}