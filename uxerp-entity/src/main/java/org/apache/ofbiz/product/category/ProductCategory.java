package org.apache.ofbiz.product.category;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Product Category
 */
public class ProductCategory implements Serializable {

	public static final long serialVersionUID = 3326306121713577984L;
	public static final String NAME = "ProductCategory";
	/**
	 * Product Category Id
	 */
	@Getter
	@Setter
	private String productCategoryId;
	/**
	 * Product Category Type Id
	 */
	@Getter
	@Setter
	private String productCategoryTypeId;
	/**
	 * Primary Parent Category Id
	 */
	@Getter
	@Setter
	private String primaryParentCategoryId;
	/**
	 * Category Name
	 */
	@Getter
	@Setter
	private String categoryName;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;
	/**
	 * Long Description
	 */
	@Getter
	@Setter
	private String longDescription;
	/**
	 * Category Image Url
	 */
	@Getter
	@Setter
	private String categoryImageUrl;
	/**
	 * Link One Image Url
	 */
	@Getter
	@Setter
	private String linkOneImageUrl;
	/**
	 * Link Two Image Url
	 */
	@Getter
	@Setter
	private String linkTwoImageUrl;
	/**
	 * Detail Screen
	 */
	@Getter
	@Setter
	private String detailScreen;
	/**
	 * Show In Select
	 */
	@Getter
	@Setter
	private String showInSelect;
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
		productCategoryId, productCategoryTypeId, primaryParentCategoryId, categoryName, description, longDescription, categoryImageUrl, linkOneImageUrl, linkTwoImageUrl, detailScreen, showInSelect, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public ProductCategory(GenericValue value) {
		productCategoryId = (String) value.get(Fields.productCategoryId.name());
		productCategoryTypeId = (String) value.get(Fields.productCategoryTypeId
				.name());
		primaryParentCategoryId = (String) value
				.get(Fields.primaryParentCategoryId.name());
		categoryName = (String) value.get(Fields.categoryName.name());
		description = (String) value.get(Fields.description.name());
		longDescription = (String) value.get(Fields.longDescription.name());
		categoryImageUrl = (String) value.get(Fields.categoryImageUrl.name());
		linkOneImageUrl = (String) value.get(Fields.linkOneImageUrl.name());
		linkTwoImageUrl = (String) value.get(Fields.linkTwoImageUrl.name());
		detailScreen = (String) value.get(Fields.detailScreen.name());
		showInSelect = (String) value.get(Fields.showInSelect.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static ProductCategory fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new ProductCategory(value);
	}

	public static List<ProductCategory> fromValues(List<GenericValue> values) {
		List<ProductCategory> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new ProductCategory(value));
		}
		return entities;
	}
}