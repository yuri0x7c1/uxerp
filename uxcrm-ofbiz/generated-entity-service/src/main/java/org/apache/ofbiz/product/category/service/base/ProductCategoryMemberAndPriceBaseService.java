package org.apache.ofbiz.product.category.service.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.apache.ofbiz.common.ExecuteFindService.In;
import org.apache.ofbiz.common.ExecuteFindService.Out;
import org.apache.ofbiz.common.ExecuteFindService;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import org.apache.commons.collections4.CollectionUtils;
import java.util.Optional;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.condition.EntityConditionList;
import org.apache.ofbiz.entity.condition.EntityExpr;
import org.apache.ofbiz.entity.condition.EntityOperator;
import com.github.yuri0x7c1.uxcrm.util.OfbizUtil;
import org.apache.ofbiz.product.category.ProductCategoryMemberAndPrice;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@Component
@SuppressWarnings("unchecked")
public class ProductCategoryMemberAndPriceBaseService {

	protected ExecuteFindService executeFindService;

	@Autowired
	public ProductCategoryMemberAndPriceBaseService(
			ExecuteFindService executeFindService) {
		this.executeFindService = executeFindService;
	}

	/**
	 * Count ProductCategoryMemberAndPrices
	 */
	public Integer count(EntityConditionList conditions) {
		In in = new In();
		in.setEntityName(ProductCategoryMemberAndPrice.NAME);
		if (conditions == null) {
			in.setNoConditionFind(OfbizUtil.Y);
		} else {
			in.setEntityConditionList(conditions);
		}
		Out out = executeFindService.runSync(in);
		return out.getListSize();
	}

	/**
	 * Find ProductCategoryMemberAndPrices
	 */
	public List<ProductCategoryMemberAndPrice> find(Integer start,
			Integer number, List<String> orderBy, EntityConditionList conditions) {
		List<ProductCategoryMemberAndPrice> entityList = Collections
				.emptyList();
		In in = new In();
		in.setEntityName(ProductCategoryMemberAndPrice.NAME);
		if (start == null) {
			start = OfbizUtil.DEFAULT_FIND_START;
		}
		if (number == null) {
			number = OfbizUtil.DEFAULT_FIND_NUMBER;
		}
		in.setOrderByList(orderBy);
		if (conditions == null) {
			in.setNoConditionFind(OfbizUtil.Y);
		} else {
			in.setEntityConditionList(conditions);
		}
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = ProductCategoryMemberAndPrice.fromValues(out
						.getListIt().getPartialList(start, number));
				out.getListIt().close();
			}
		} catch (GenericEntityException e) {
			log.error(e.getMessage(), e);
		}
		return entityList;
	}

	/**
	 * Find one ProductCategoryMemberAndPrice
	 */
	public Optional<ProductCategoryMemberAndPrice> findOne(Object fromDate,
			Object productCategoryId, Object productId,
			Object priceProductStoreGroupId, Object priceProductPricePurposeId,
			Object priceFromDate, Object priceCurrencyUomId,
			Object priceProductPriceTypeId) {
		List<ProductCategoryMemberAndPrice> entityList = null;
		In in = new In();
		in.setEntityName(ProductCategoryMemberAndPrice.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays.asList(
				new EntityExpr("fromDate", EntityOperator.EQUALS, fromDate),
				new EntityExpr("productCategoryId", EntityOperator.EQUALS,
						productCategoryId), new EntityExpr("productId",
						EntityOperator.EQUALS, productId), new EntityExpr(
						"priceProductStoreGroupId", EntityOperator.EQUALS,
						priceProductStoreGroupId), new EntityExpr(
						"priceProductPricePurposeId", EntityOperator.EQUALS,
						priceProductPricePurposeId), new EntityExpr(
						"priceFromDate", EntityOperator.EQUALS, priceFromDate),
				new EntityExpr("priceCurrencyUomId", EntityOperator.EQUALS,
						priceCurrencyUomId), new EntityExpr(
						"priceProductPriceTypeId", EntityOperator.EQUALS,
						priceProductPriceTypeId)), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = ProductCategoryMemberAndPrice.fromValues(out
						.getListIt().getCompleteList());
				out.getListIt().close();
			}
		} catch (GenericEntityException e) {
			log.error(e.getMessage(), e);
		}
		if (CollectionUtils.isNotEmpty(entityList)) {
			return Optional.of(entityList.get(0));
		}
		return Optional.empty();
	}
}