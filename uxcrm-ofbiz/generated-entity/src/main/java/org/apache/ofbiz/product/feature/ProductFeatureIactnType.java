package org.apache.ofbiz.product.feature;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Product Feature Iactn Type
 */
public class ProductFeatureIactnType implements Serializable {

	public static final long serialVersionUID = 5741576282530445312L;
	public static final String NAME = "ProductFeatureIactnType";
	/**
	 * Product Feature Iactn Type Id
	 */
	@Getter
	@Setter
	private String productFeatureIactnTypeId;
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

	public enum Fields {
		productFeatureIactnTypeId, parentTypeId, hasTable, description, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public ProductFeatureIactnType(GenericValue value) {
		productFeatureIactnTypeId = (String) value
				.get(Fields.productFeatureIactnTypeId.name());
		parentTypeId = (String) value.get(Fields.parentTypeId.name());
		hasTable = (String) value.get(Fields.hasTable.name());
		description = (String) value.get(Fields.description.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static ProductFeatureIactnType fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new ProductFeatureIactnType(value);
	}

	public static List<ProductFeatureIactnType> fromValues(
			List<GenericValue> values) {
		List<ProductFeatureIactnType> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new ProductFeatureIactnType(value));
		}
		return entities;
	}
}