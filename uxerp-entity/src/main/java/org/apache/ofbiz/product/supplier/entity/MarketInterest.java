package org.apache.ofbiz.product.supplier.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Market Interest
 */
public class MarketInterest implements Serializable {

	public static final long serialVersionUID = 2825221317708705792L;
	public static final String NAME = "MarketInterest";
	/**
	 * Product Category Id
	 */
	@Getter
	@Setter
	private String productCategoryId;
	/**
	 * Party Classification Group Id
	 */
	@Getter
	@Setter
	private String partyClassificationGroupId;
	/**
	 * From Date
	 */
	@Getter
	@Setter
	private Timestamp fromDate;
	/**
	 * Thru Date
	 */
	@Getter
	@Setter
	private Timestamp thruDate;

	public enum Fields {
		productCategoryId, partyClassificationGroupId, fromDate, thruDate
	}

	public MarketInterest(GenericValue value) {
		productCategoryId = (String) value.get(Fields.productCategoryId.name());
		partyClassificationGroupId = (String) value
				.get(Fields.partyClassificationGroupId.name());
		fromDate = (Timestamp) value.get(Fields.fromDate.name());
		thruDate = (Timestamp) value.get(Fields.thruDate.name());
	}

	public static MarketInterest fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new MarketInterest(value);
	}

	public static List<MarketInterest> fromValues(List<GenericValue> values) {
		List<MarketInterest> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new MarketInterest(value));
		}
		return entities;
	}
}