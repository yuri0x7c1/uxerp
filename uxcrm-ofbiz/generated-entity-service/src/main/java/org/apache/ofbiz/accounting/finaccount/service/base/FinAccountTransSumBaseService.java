package org.apache.ofbiz.accounting.finaccount.service.base;

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
import org.apache.ofbiz.accounting.finaccount.FinAccountTransSum;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@Component
@SuppressWarnings("unchecked")
public class FinAccountTransSumBaseService {

	protected ExecuteFindService executeFindService;

	@Autowired
	public FinAccountTransSumBaseService(ExecuteFindService executeFindService) {
		this.executeFindService = executeFindService;
	}

	/**
	 * Count FinAccountTransSums
	 */
	public Integer count(EntityConditionList conditions) {
		In in = new In();
		in.setEntityName(FinAccountTransSum.NAME);
		if (conditions == null) {
			in.setNoConditionFind(OfbizUtil.Y);
		} else {
			in.setEntityConditionList(conditions);
		}
		Out out = executeFindService.runSync(in);
		return out.getListSize();
	}

	/**
	 * Find FinAccountTransSums
	 */
	public List<FinAccountTransSum> find(Integer start, Integer number,
			List<String> orderBy, EntityConditionList conditions) {
		List<FinAccountTransSum> entityList = Collections.emptyList();
		In in = new In();
		in.setEntityName(FinAccountTransSum.NAME);
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
				entityList = FinAccountTransSum.fromValues(out.getListIt()
						.getPartialList(start, number));
				out.getListIt().close();
			}
		} catch (GenericEntityException e) {
			log.error(e.getMessage(), e);
		}
		return entityList;
	}

	/**
	 * Find one FinAccountTransSum
	 */
	public Optional<FinAccountTransSum> findOne() {
		List<FinAccountTransSum> entityList = null;
		In in = new In();
		in.setEntityName(FinAccountTransSum.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays.asList(),
				EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = FinAccountTransSum.fromValues(out.getListIt()
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