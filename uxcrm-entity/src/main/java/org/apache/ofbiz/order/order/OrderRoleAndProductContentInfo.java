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
 * Order Role And Product Content Info
 */
public class OrderRoleAndProductContentInfo implements Serializable {

	public static final long serialVersionUID = 1134262745747159040L;
	public static final String NAME = "OrderRoleAndProductContentInfo";
	/**
	 * Product Name
	 */
	@Getter
	@Setter
	private String productName;
	/**
	 * Content Status Id
	 */
	@Getter
	@Setter
	private String contentStatusId;
	/**
	 * Role Type Id
	 */
	@Getter
	@Setter
	private String roleTypeId;
	/**
	 * Order Id
	 */
	@Getter
	@Setter
	private String orderId;
	/**
	 * Party Id
	 */
	@Getter
	@Setter
	private String partyId;
	/**
	 * Deployment Id
	 */
	@Getter
	@Setter
	private String deploymentId;
	/**
	 * Cancel Back Order Date
	 */
	@Getter
	@Setter
	private Timestamp cancelBackOrderDate;
	/**
	 * Item Description
	 */
	@Getter
	@Setter
	private String itemDescription;
	/**
	 * Selected Amount
	 */
	@Getter
	@Setter
	private BigDecimal selectedAmount;
	/**
	 * Order Item Seq Id
	 */
	@Getter
	@Setter
	private String orderItemSeqId;
	/**
	 * Unit Price
	 */
	@Getter
	@Setter
	private BigDecimal unitPrice;
	/**
	 * Product Id
	 */
	@Getter
	@Setter
	private String productId;
	/**
	 * Unit Recurring Price
	 */
	@Getter
	@Setter
	private BigDecimal unitRecurringPrice;
	/**
	 * Is Item Group Primary
	 */
	@Getter
	@Setter
	private String isItemGroupPrimary;
	/**
	 * Auto Cancel Date
	 */
	@Getter
	@Setter
	private Timestamp autoCancelDate;
	/**
	 * Product Feature Id
	 */
	@Getter
	@Setter
	private String productFeatureId;
	/**
	 * Override Gl Account Id
	 */
	@Getter
	@Setter
	private String overrideGlAccountId;
	/**
	 * Budget Id
	 */
	@Getter
	@Setter
	private String budgetId;
	/**
	 * Supplier Product Id
	 */
	@Getter
	@Setter
	private String supplierProductId;
	/**
	 * Estimated Delivery Date
	 */
	@Getter
	@Setter
	private Timestamp estimatedDeliveryDate;
	/**
	 * Quote Id
	 */
	@Getter
	@Setter
	private String quoteId;
	/**
	 * Status Id
	 */
	@Getter
	@Setter
	private String statusId;
	/**
	 * Sync Status Id
	 */
	@Getter
	@Setter
	private String syncStatusId;
	/**
	 * Estimated Ship Date
	 */
	@Getter
	@Setter
	private Timestamp estimatedShipDate;
	/**
	 * Shopping List Item Seq Id
	 */
	@Getter
	@Setter
	private String shoppingListItemSeqId;
	/**
	 * Subscription Id
	 */
	@Getter
	@Setter
	private String subscriptionId;
	/**
	 * Sales Opportunity Id
	 */
	@Getter
	@Setter
	private String salesOpportunityId;
	/**
	 * Dont Cancel Set User Login
	 */
	@Getter
	@Setter
	private String dontCancelSetUserLogin;
	/**
	 * Is Promo
	 */
	@Getter
	@Setter
	private String isPromo;
	/**
	 * Is Modified Price
	 */
	@Getter
	@Setter
	private String isModifiedPrice;
	/**
	 * Ship Before Date
	 */
	@Getter
	@Setter
	private Timestamp shipBeforeDate;
	/**
	 * Product Category Id
	 */
	@Getter
	@Setter
	private String productCategoryId;
	/**
	 * Shopping List Id
	 */
	@Getter
	@Setter
	private String shoppingListId;
	/**
	 * Unit List Price
	 */
	@Getter
	@Setter
	private BigDecimal unitListPrice;
	/**
	 * Unit Average Cost
	 */
	@Getter
	@Setter
	private BigDecimal unitAverageCost;
	/**
	 * Order Item Type Id
	 */
	@Getter
	@Setter
	private String orderItemTypeId;
	/**
	 * Dont Cancel Set Date
	 */
	@Getter
	@Setter
	private Timestamp dontCancelSetDate;
	/**
	 * Quantity
	 */
	@Getter
	@Setter
	private BigDecimal quantity;
	/**
	 * Comments
	 */
	@Getter
	@Setter
	private String comments;
	/**
	 * Recurring Freq Uom Id
	 */
	@Getter
	@Setter
	private String recurringFreqUomId;
	/**
	 * Order Item Group Seq Id
	 */
	@Getter
	@Setter
	private String orderItemGroupSeqId;
	/**
	 * Quote Item Seq Id
	 */
	@Getter
	@Setter
	private String quoteItemSeqId;
	/**
	 * External Id
	 */
	@Getter
	@Setter
	private String externalId;
	/**
	 * From Inventory Item Id
	 */
	@Getter
	@Setter
	private String fromInventoryItemId;
	/**
	 * Budget Item Seq Id
	 */
	@Getter
	@Setter
	private String budgetItemSeqId;
	/**
	 * Corresponding Po Id
	 */
	@Getter
	@Setter
	private String correspondingPoId;
	/**
	 * Cancel Quantity
	 */
	@Getter
	@Setter
	private BigDecimal cancelQuantity;
	/**
	 * Ship After Date
	 */
	@Getter
	@Setter
	private Timestamp shipAfterDate;
	/**
	 * Change By User Login Id
	 */
	@Getter
	@Setter
	private String changeByUserLoginId;
	/**
	 * Prod Catalog Id
	 */
	@Getter
	@Setter
	private String prodCatalogId;
	/**
	 * Purchase From Date
	 */
	@Getter
	@Setter
	private Timestamp purchaseFromDate;
	/**
	 * Use Time Uom Id
	 */
	@Getter
	@Setter
	private String useTimeUomId;
	/**
	 * Sequence Num
	 */
	@Getter
	@Setter
	private Long sequenceNum;
	/**
	 * Content Id
	 */
	@Getter
	@Setter
	private String contentId;
	/**
	 * Use Count Limit
	 */
	@Getter
	@Setter
	private Long useCountLimit;
	/**
	 * Product Content Type Id
	 */
	@Getter
	@Setter
	private String productContentTypeId;
	/**
	 * Thru Date
	 */
	@Getter
	@Setter
	private Timestamp thruDate;
	/**
	 * From Date
	 */
	@Getter
	@Setter
	private Timestamp fromDate;
	/**
	 * Use Role Type Id
	 */
	@Getter
	@Setter
	private String useRoleTypeId;
	/**
	 * Use Time
	 */
	@Getter
	@Setter
	private Long useTime;
	/**
	 * Purchase Thru Date
	 */
	@Getter
	@Setter
	private Timestamp purchaseThruDate;
	/**
	 * Owner Content Id
	 */
	@Getter
	@Setter
	private String ownerContentId;
	/**
	 * Content Type Id
	 */
	@Getter
	@Setter
	private String contentTypeId;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;
	/**
	 * Mime Type Id
	 */
	@Getter
	@Setter
	private String mimeTypeId;
	/**
	 * Child Leaf Count
	 */
	@Getter
	@Setter
	private Long childLeafCount;
	/**
	 * Privilege Enum Id
	 */
	@Getter
	@Setter
	private String privilegeEnumId;
	/**
	 * Data Source Id
	 */
	@Getter
	@Setter
	private String dataSourceId;
	/**
	 * Last Modified By User Login
	 */
	@Getter
	@Setter
	private String lastModifiedByUserLogin;
	/**
	 * Data Resource Id
	 */
	@Getter
	@Setter
	private String dataResourceId;
	/**
	 * Created By User Login
	 */
	@Getter
	@Setter
	private String createdByUserLogin;
	/**
	 * Template Data Resource Id
	 */
	@Getter
	@Setter
	private String templateDataResourceId;
	/**
	 * Last Modified Date
	 */
	@Getter
	@Setter
	private Timestamp lastModifiedDate;
	/**
	 * Instance Of Content Id
	 */
	@Getter
	@Setter
	private String instanceOfContentId;
	/**
	 * Service Name
	 */
	@Getter
	@Setter
	private String serviceName;
	/**
	 * Custom Method Id
	 */
	@Getter
	@Setter
	private String customMethodId;
	/**
	 * Character Set Id
	 */
	@Getter
	@Setter
	private String characterSetId;
	/**
	 * Content Name
	 */
	@Getter
	@Setter
	private String contentName;
	/**
	 * Created Date
	 */
	@Getter
	@Setter
	private Timestamp createdDate;
	/**
	 * Locale String
	 */
	@Getter
	@Setter
	private String localeString;
	/**
	 * Decorator Content Id
	 */
	@Getter
	@Setter
	private String decoratorContentId;
	/**
	 * Child Branch Count
	 */
	@Getter
	@Setter
	private Long childBranchCount;

	public enum Fields {
		productName, contentStatusId, roleTypeId, orderId, partyId, deploymentId, cancelBackOrderDate, itemDescription, selectedAmount, orderItemSeqId, unitPrice, productId, unitRecurringPrice, isItemGroupPrimary, autoCancelDate, productFeatureId, overrideGlAccountId, budgetId, supplierProductId, estimatedDeliveryDate, quoteId, statusId, syncStatusId, estimatedShipDate, shoppingListItemSeqId, subscriptionId, salesOpportunityId, dontCancelSetUserLogin, isPromo, isModifiedPrice, shipBeforeDate, productCategoryId, shoppingListId, unitListPrice, unitAverageCost, orderItemTypeId, dontCancelSetDate, quantity, comments, recurringFreqUomId, orderItemGroupSeqId, quoteItemSeqId, externalId, fromInventoryItemId, budgetItemSeqId, correspondingPoId, cancelQuantity, shipAfterDate, changeByUserLoginId, prodCatalogId, purchaseFromDate, useTimeUomId, sequenceNum, contentId, useCountLimit, productContentTypeId, thruDate, fromDate, useRoleTypeId, useTime, purchaseThruDate, ownerContentId, contentTypeId, description, mimeTypeId, childLeafCount, privilegeEnumId, dataSourceId, lastModifiedByUserLogin, dataResourceId, createdByUserLogin, templateDataResourceId, lastModifiedDate, instanceOfContentId, serviceName, customMethodId, characterSetId, contentName, createdDate, localeString, decoratorContentId, childBranchCount
	}

	public OrderRoleAndProductContentInfo(GenericValue value) {
		productName = (String) value.get(Fields.productName.name());
		contentStatusId = (String) value.get(Fields.contentStatusId.name());
		roleTypeId = (String) value.get(Fields.roleTypeId.name());
		orderId = (String) value.get(Fields.orderId.name());
		partyId = (String) value.get(Fields.partyId.name());
		deploymentId = (String) value.get(Fields.deploymentId.name());
		cancelBackOrderDate = (Timestamp) value.get(Fields.cancelBackOrderDate
				.name());
		itemDescription = (String) value.get(Fields.itemDescription.name());
		selectedAmount = (BigDecimal) value.get(Fields.selectedAmount.name());
		orderItemSeqId = (String) value.get(Fields.orderItemSeqId.name());
		unitPrice = (BigDecimal) value.get(Fields.unitPrice.name());
		productId = (String) value.get(Fields.productId.name());
		unitRecurringPrice = (BigDecimal) value.get(Fields.unitRecurringPrice
				.name());
		isItemGroupPrimary = (String) value.get(Fields.isItemGroupPrimary
				.name());
		autoCancelDate = (Timestamp) value.get(Fields.autoCancelDate.name());
		productFeatureId = (String) value.get(Fields.productFeatureId.name());
		overrideGlAccountId = (String) value.get(Fields.overrideGlAccountId
				.name());
		budgetId = (String) value.get(Fields.budgetId.name());
		supplierProductId = (String) value.get(Fields.supplierProductId.name());
		estimatedDeliveryDate = (Timestamp) value
				.get(Fields.estimatedDeliveryDate.name());
		quoteId = (String) value.get(Fields.quoteId.name());
		statusId = (String) value.get(Fields.statusId.name());
		syncStatusId = (String) value.get(Fields.syncStatusId.name());
		estimatedShipDate = (Timestamp) value.get(Fields.estimatedShipDate
				.name());
		shoppingListItemSeqId = (String) value.get(Fields.shoppingListItemSeqId
				.name());
		subscriptionId = (String) value.get(Fields.subscriptionId.name());
		salesOpportunityId = (String) value.get(Fields.salesOpportunityId
				.name());
		dontCancelSetUserLogin = (String) value
				.get(Fields.dontCancelSetUserLogin.name());
		isPromo = (String) value.get(Fields.isPromo.name());
		isModifiedPrice = (String) value.get(Fields.isModifiedPrice.name());
		shipBeforeDate = (Timestamp) value.get(Fields.shipBeforeDate.name());
		productCategoryId = (String) value.get(Fields.productCategoryId.name());
		shoppingListId = (String) value.get(Fields.shoppingListId.name());
		unitListPrice = (BigDecimal) value.get(Fields.unitListPrice.name());
		unitAverageCost = (BigDecimal) value.get(Fields.unitAverageCost.name());
		orderItemTypeId = (String) value.get(Fields.orderItemTypeId.name());
		dontCancelSetDate = (Timestamp) value.get(Fields.dontCancelSetDate
				.name());
		quantity = (BigDecimal) value.get(Fields.quantity.name());
		comments = (String) value.get(Fields.comments.name());
		recurringFreqUomId = (String) value.get(Fields.recurringFreqUomId
				.name());
		orderItemGroupSeqId = (String) value.get(Fields.orderItemGroupSeqId
				.name());
		quoteItemSeqId = (String) value.get(Fields.quoteItemSeqId.name());
		externalId = (String) value.get(Fields.externalId.name());
		fromInventoryItemId = (String) value.get(Fields.fromInventoryItemId
				.name());
		budgetItemSeqId = (String) value.get(Fields.budgetItemSeqId.name());
		correspondingPoId = (String) value.get(Fields.correspondingPoId.name());
		cancelQuantity = (BigDecimal) value.get(Fields.cancelQuantity.name());
		shipAfterDate = (Timestamp) value.get(Fields.shipAfterDate.name());
		changeByUserLoginId = (String) value.get(Fields.changeByUserLoginId
				.name());
		prodCatalogId = (String) value.get(Fields.prodCatalogId.name());
		purchaseFromDate = (Timestamp) value
				.get(Fields.purchaseFromDate.name());
		useTimeUomId = (String) value.get(Fields.useTimeUomId.name());
		sequenceNum = (Long) value.get(Fields.sequenceNum.name());
		contentId = (String) value.get(Fields.contentId.name());
		useCountLimit = (Long) value.get(Fields.useCountLimit.name());
		productContentTypeId = (String) value.get(Fields.productContentTypeId
				.name());
		thruDate = (Timestamp) value.get(Fields.thruDate.name());
		fromDate = (Timestamp) value.get(Fields.fromDate.name());
		useRoleTypeId = (String) value.get(Fields.useRoleTypeId.name());
		useTime = (Long) value.get(Fields.useTime.name());
		purchaseThruDate = (Timestamp) value
				.get(Fields.purchaseThruDate.name());
		ownerContentId = (String) value.get(Fields.ownerContentId.name());
		contentTypeId = (String) value.get(Fields.contentTypeId.name());
		description = (String) value.get(Fields.description.name());
		mimeTypeId = (String) value.get(Fields.mimeTypeId.name());
		childLeafCount = (Long) value.get(Fields.childLeafCount.name());
		privilegeEnumId = (String) value.get(Fields.privilegeEnumId.name());
		dataSourceId = (String) value.get(Fields.dataSourceId.name());
		lastModifiedByUserLogin = (String) value
				.get(Fields.lastModifiedByUserLogin.name());
		dataResourceId = (String) value.get(Fields.dataResourceId.name());
		createdByUserLogin = (String) value.get(Fields.createdByUserLogin
				.name());
		templateDataResourceId = (String) value
				.get(Fields.templateDataResourceId.name());
		lastModifiedDate = (Timestamp) value
				.get(Fields.lastModifiedDate.name());
		instanceOfContentId = (String) value.get(Fields.instanceOfContentId
				.name());
		serviceName = (String) value.get(Fields.serviceName.name());
		customMethodId = (String) value.get(Fields.customMethodId.name());
		characterSetId = (String) value.get(Fields.characterSetId.name());
		contentName = (String) value.get(Fields.contentName.name());
		createdDate = (Timestamp) value.get(Fields.createdDate.name());
		localeString = (String) value.get(Fields.localeString.name());
		decoratorContentId = (String) value.get(Fields.decoratorContentId
				.name());
		childBranchCount = (Long) value.get(Fields.childBranchCount.name());
	}

	public static OrderRoleAndProductContentInfo fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new OrderRoleAndProductContentInfo(value);
	}

	public static List<OrderRoleAndProductContentInfo> fromValues(
			List<GenericValue> values) {
		List<OrderRoleAndProductContentInfo> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new OrderRoleAndProductContentInfo(value));
		}
		return entities;
	}
}