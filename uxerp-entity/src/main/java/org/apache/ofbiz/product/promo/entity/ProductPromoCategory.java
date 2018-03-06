package org.apache.ofbiz.product.promo.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Product Promo Category
 */
public class ProductPromoCategory implements Serializable {

	public static final long serialVersionUID = 6070443431156644864L;
	public static final String NAME = "ProductPromoCategory";
	/**
	 * Product Promo Id
	 */
	@Getter
	@Setter
	private String productPromoId;
	/**
	 * Product Promo Rule Id
	 */
	@Getter
	@Setter
	private String productPromoRuleId;
	/**
	 * Product Promo Action Seq Id
	 */
	@Getter
	@Setter
	private String productPromoActionSeqId;
	/**
	 * Product Promo Cond Seq Id
	 */
	@Getter
	@Setter
	private String productPromoCondSeqId;
	/**
	 * Product Category Id
	 */
	@Getter
	@Setter
	private String productCategoryId;
	/**
	 * And Group Id
	 */
	@Getter
	@Setter
	private String andGroupId;
	/**
	 * Product Promo Appl Enum Id
	 */
	@Getter
	@Setter
	private String productPromoApplEnumId;
	/**
	 * Include Sub Categories
	 */
	@Getter
	@Setter
	private String includeSubCategories;

	public enum Fields {
		productPromoId, productPromoRuleId, productPromoActionSeqId, productPromoCondSeqId, productCategoryId, andGroupId, productPromoApplEnumId, includeSubCategories
	}

	public ProductPromoCategory(GenericValue value) {
		productPromoId = (String) value.get(Fields.productPromoId.name());
		productPromoRuleId = (String) value.get(Fields.productPromoRuleId
				.name());
		productPromoActionSeqId = (String) value
				.get(Fields.productPromoActionSeqId.name());
		productPromoCondSeqId = (String) value.get(Fields.productPromoCondSeqId
				.name());
		productCategoryId = (String) value.get(Fields.productCategoryId.name());
		andGroupId = (String) value.get(Fields.andGroupId.name());
		productPromoApplEnumId = (String) value
				.get(Fields.productPromoApplEnumId.name());
		includeSubCategories = (String) value.get(Fields.includeSubCategories
				.name());
	}

	public static ProductPromoCategory fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new ProductPromoCategory(value);
	}

	public static List<ProductPromoCategory> fromValues(
			List<GenericValue> values) {
		List<ProductPromoCategory> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new ProductPromoCategory(value));
		}
		return entities;
	}
}