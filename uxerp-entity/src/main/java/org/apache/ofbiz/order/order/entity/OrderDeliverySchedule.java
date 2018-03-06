package org.apache.ofbiz.order.order.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import java.math.BigDecimal;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Order Delivery Schedule
 */
public class OrderDeliverySchedule implements Serializable {

	public static final long serialVersionUID = 919874640759272448L;
	public static final String NAME = "OrderDeliverySchedule";
	/**
	 * Order Id
	 */
	@Getter
	@Setter
	private String orderId;
	/**
	 * Order Item Seq Id
	 */
	@Getter
	@Setter
	private String orderItemSeqId;
	/**
	 * Estimated Ready Date
	 */
	@Getter
	@Setter
	private Timestamp estimatedReadyDate;
	/**
	 * Cartons
	 */
	@Getter
	@Setter
	private Long cartons;
	/**
	 * Skids Pallets
	 */
	@Getter
	@Setter
	private Long skidsPallets;
	/**
	 * Units Pieces
	 */
	@Getter
	@Setter
	private BigDecimal unitsPieces;
	/**
	 * Total Cubic Size
	 */
	@Getter
	@Setter
	private BigDecimal totalCubicSize;
	/**
	 * Total Cubic Uom Id
	 */
	@Getter
	@Setter
	private String totalCubicUomId;
	/**
	 * Total Weight
	 */
	@Getter
	@Setter
	private BigDecimal totalWeight;
	/**
	 * Total Weight Uom Id
	 */
	@Getter
	@Setter
	private String totalWeightUomId;
	/**
	 * Status Id
	 */
	@Getter
	@Setter
	private String statusId;

	public enum Fields {
		orderId, orderItemSeqId, estimatedReadyDate, cartons, skidsPallets, unitsPieces, totalCubicSize, totalCubicUomId, totalWeight, totalWeightUomId, statusId
	}

	public OrderDeliverySchedule(GenericValue value) {
		orderId = (String) value.get(Fields.orderId.name());
		orderItemSeqId = (String) value.get(Fields.orderItemSeqId.name());
		estimatedReadyDate = (Timestamp) value.get(Fields.estimatedReadyDate
				.name());
		cartons = (Long) value.get(Fields.cartons.name());
		skidsPallets = (Long) value.get(Fields.skidsPallets.name());
		unitsPieces = (BigDecimal) value.get(Fields.unitsPieces.name());
		totalCubicSize = (BigDecimal) value.get(Fields.totalCubicSize.name());
		totalCubicUomId = (String) value.get(Fields.totalCubicUomId.name());
		totalWeight = (BigDecimal) value.get(Fields.totalWeight.name());
		totalWeightUomId = (String) value.get(Fields.totalWeightUomId.name());
		statusId = (String) value.get(Fields.statusId.name());
	}

	public static OrderDeliverySchedule fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new OrderDeliverySchedule(value);
	}

	public static List<OrderDeliverySchedule> fromValues(
			List<GenericValue> values) {
		List<OrderDeliverySchedule> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new OrderDeliverySchedule(value));
		}
		return entities;
	}
}