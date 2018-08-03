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
import org.apache.ofbiz.product.category.ProductCategoryRollupAndRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ofbiz.product.category.ProductCategoryRollup;
import org.apache.ofbiz.product.category.ProductCategoryRole;
import org.apache.ofbiz.product.category.ProductCategory;

@Slf4j
@Component
@SuppressWarnings("unchecked")
public class ProductCategoryRollupAndRoleBaseService {

	protected ExecuteFindService executeFindService;

	@Autowired
	public ProductCategoryRollupAndRoleBaseService(
			ExecuteFindService executeFindService) {
		this.executeFindService = executeFindService;
	}

	/**
	 * Count ProductCategoryRollupAndRoles
	 */
	public Integer count(EntityConditionList conditions) {
		In in = new In();
		in.setEntityName(ProductCategoryRollupAndRole.NAME);
		if (conditions == null) {
			in.setNoConditionFind(OfbizUtil.Y);
		} else {
			in.setEntityConditionList(conditions);
		}
		Out out = executeFindService.runSync(in);
		return out.getListSize();
	}

	/**
	 * Find ProductCategoryRollupAndRoles
	 */
	public List<ProductCategoryRollupAndRole> find(Integer start,
			Integer number, List<String> orderBy, EntityConditionList conditions) {
		List<ProductCategoryRollupAndRole> entityList = Collections.emptyList();
		In in = new In();
		in.setEntityName(ProductCategoryRollupAndRole.NAME);
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
				entityList = ProductCategoryRollupAndRole.fromValues(out
						.getListIt().getPartialList(start, number));
				out.getListIt().close();
			}
		} catch (GenericEntityException e) {
			log.error(e.getMessage(), e);
		}
		return entityList;
	}

	/**
	 * Find one ProductCategoryRollupAndRole
	 */
	public Optional<ProductCategoryRollupAndRole> findOne(
			Object productCategoryId, Object parentProductCategoryId,
			Object fromDate, Object partyId, Object roleTypeId,
			Object roleFromDate) {
		List<ProductCategoryRollupAndRole> entityList = null;
		In in = new In();
		in.setEntityName(ProductCategoryRollupAndRole.NAME);
		in.setEntityConditionList(new EntityConditionList<>(
				Arrays.asList(
						new EntityExpr("productCategoryId",
								EntityOperator.EQUALS, productCategoryId),
						new EntityExpr("parentProductCategoryId",
								EntityOperator.EQUALS, parentProductCategoryId),
						new EntityExpr("fromDate", EntityOperator.EQUALS,
								fromDate), new EntityExpr("partyId",
								EntityOperator.EQUALS, partyId),
						new EntityExpr("roleTypeId", EntityOperator.EQUALS,
								roleTypeId), new EntityExpr("roleFromDate",
								EntityOperator.EQUALS, roleFromDate)),
				EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = ProductCategoryRollupAndRole.fromValues(out
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

	/**
	 * Get product category rollup
	 */
	public Optional<ProductCategoryRollup> getProductCategoryRollup(
			ProductCategoryRollupAndRole productCategoryRollupAndRole) {
		List<ProductCategoryRollup> entityList = null;
		In in = new In();
		in.setEntityName(ProductCategoryRollup.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays.asList(
				new EntityExpr("productCategoryId", EntityOperator.EQUALS,
						productCategoryRollupAndRole.getProductCategoryId()),
				new EntityExpr("parentProductCategoryId",
						EntityOperator.EQUALS, productCategoryRollupAndRole
								.getParentProductCategoryId()), new EntityExpr(
						"fromDate", EntityOperator.EQUALS,
						productCategoryRollupAndRole.getFromDate())),
				EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = ProductCategoryRollup.fromValues(out.getListIt()
						.getCompleteList());
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

	/**
	 * Get product category role
	 */
	public Optional<ProductCategoryRole> getProductCategoryRole(
			ProductCategoryRollupAndRole productCategoryRollupAndRole) {
		List<ProductCategoryRole> entityList = null;
		In in = new In();
		in.setEntityName(ProductCategoryRole.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays.asList(
				new EntityExpr("productCategoryId", EntityOperator.EQUALS,
						productCategoryRollupAndRole
								.getParentProductCategoryId()), new EntityExpr(
						"partyId", EntityOperator.EQUALS,
						productCategoryRollupAndRole.getPartyId()),
				new EntityExpr("roleTypeId", EntityOperator.EQUALS,
						productCategoryRollupAndRole.getRoleTypeId()),
				new EntityExpr("fromDate", EntityOperator.EQUALS,
						productCategoryRollupAndRole.getRoleFromDate())),
				EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = ProductCategoryRole.fromValues(out.getListIt()
						.getCompleteList());
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

	/**
	 * Get product category
	 */
	public Optional<ProductCategory> getProductCategory(
			ProductCategoryRollupAndRole productCategoryRollupAndRole) {
		List<ProductCategory> entityList = null;
		In in = new In();
		in.setEntityName(ProductCategory.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("productCategoryId",
						EntityOperator.EQUALS, productCategoryRollupAndRole
								.getProductCategoryId())), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = ProductCategory.fromValues(out.getListIt()
						.getCompleteList());
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

	/**
	 * Get parent product category
	 */
	public Optional<ProductCategory> getParentProductCategory(
			ProductCategoryRollupAndRole productCategoryRollupAndRole) {
		List<ProductCategory> entityList = null;
		In in = new In();
		in.setEntityName(ProductCategory.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("productCategoryId",
						EntityOperator.EQUALS, productCategoryRollupAndRole
								.getParentProductCategoryId())),
				EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = ProductCategory.fromValues(out.getListIt()
						.getCompleteList());
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