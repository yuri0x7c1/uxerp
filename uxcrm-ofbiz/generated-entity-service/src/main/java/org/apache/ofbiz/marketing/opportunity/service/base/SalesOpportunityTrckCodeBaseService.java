package org.apache.ofbiz.marketing.opportunity.service.base;

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
import org.apache.ofbiz.marketing.opportunity.SalesOpportunityTrckCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ofbiz.marketing.opportunity.SalesOpportunity;

@Slf4j
@Component
@SuppressWarnings("unchecked")
public class SalesOpportunityTrckCodeBaseService {

	protected ExecuteFindService executeFindService;

	@Autowired
	public SalesOpportunityTrckCodeBaseService(
			ExecuteFindService executeFindService) {
		this.executeFindService = executeFindService;
	}

	/**
	 * Count SalesOpportunityTrckCodes
	 */
	public Integer count(EntityConditionList conditions) {
		In in = new In();
		in.setEntityName(SalesOpportunityTrckCode.NAME);
		if (conditions == null) {
			in.setNoConditionFind(OfbizUtil.Y);
		} else {
			in.setEntityConditionList(conditions);
		}
		Out out = executeFindService.runSync(in);
		return out.getListSize();
	}

	/**
	 * Find SalesOpportunityTrckCodes
	 */
	public List<SalesOpportunityTrckCode> find(Integer start, Integer number,
			List<String> orderBy, EntityConditionList conditions) {
		List<SalesOpportunityTrckCode> entityList = Collections.emptyList();
		In in = new In();
		in.setEntityName(SalesOpportunityTrckCode.NAME);
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
				entityList = SalesOpportunityTrckCode.fromValues(out
						.getListIt().getPartialList(start, number));
				out.getListIt().close();
			}
		} catch (GenericEntityException e) {
			log.error(e.getMessage(), e);
		}
		return entityList;
	}

	/**
	 * Find one SalesOpportunityTrckCode
	 */
	public Optional<SalesOpportunityTrckCode> findOne(
			Object salesOpportunityId, Object trackingCodeId) {
		List<SalesOpportunityTrckCode> entityList = null;
		In in = new In();
		in.setEntityName(SalesOpportunityTrckCode.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays.asList(
				new EntityExpr("salesOpportunityId", EntityOperator.EQUALS,
						salesOpportunityId), new EntityExpr("trackingCodeId",
						EntityOperator.EQUALS, trackingCodeId)),
				EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = SalesOpportunityTrckCode.fromValues(out
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
	 * Get sales opportunity
	 */
	public Optional<SalesOpportunity> getSalesOpportunity(
			SalesOpportunityTrckCode salesOpportunityTrckCode) {
		List<SalesOpportunity> entityList = null;
		In in = new In();
		in.setEntityName(SalesOpportunity.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("salesOpportunityId",
						EntityOperator.EQUALS, salesOpportunityTrckCode
								.getSalesOpportunityId())), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = SalesOpportunity.fromValues(out.getListIt()
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