package org.apache.ofbiz.party.party.service.base;

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
import org.apache.ofbiz.party.party.PartyTypeAttr;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ofbiz.party.party.PartyType;
import org.apache.ofbiz.party.party.PartyAttribute;
import org.apache.ofbiz.party.party.Party;

@Slf4j
@Component
@SuppressWarnings("unchecked")
public class PartyTypeAttrBaseService {

	protected ExecuteFindService executeFindService;

	@Autowired
	public PartyTypeAttrBaseService(ExecuteFindService executeFindService) {
		this.executeFindService = executeFindService;
	}

	/**
	 * Count PartyTypeAttrs
	 */
	public Integer count(EntityConditionList conditions) {
		In in = new In();
		in.setEntityName(PartyTypeAttr.NAME);
		if (conditions == null) {
			in.setNoConditionFind(OfbizUtil.Y);
		} else {
			in.setEntityConditionList(conditions);
		}
		Out out = executeFindService.runSync(in);
		return out.getListSize();
	}

	/**
	 * Find PartyTypeAttrs
	 */
	public List<PartyTypeAttr> find(Integer start, Integer number,
			List<String> orderBy, EntityConditionList conditions) {
		List<PartyTypeAttr> entityList = Collections.emptyList();
		In in = new In();
		in.setEntityName(PartyTypeAttr.NAME);
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
				entityList = PartyTypeAttr.fromValues(out.getListIt()
						.getPartialList(start, number));
				out.getListIt().close();
			}
		} catch (GenericEntityException e) {
			log.error(e.getMessage(), e);
		}
		return entityList;
	}

	/**
	 * Find one PartyTypeAttr
	 */
	public Optional<PartyTypeAttr> findOne(Object partyTypeId, Object attrName) {
		List<PartyTypeAttr> entityList = null;
		In in = new In();
		in.setEntityName(PartyTypeAttr.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays.asList(
				new EntityExpr("partyTypeId", EntityOperator.EQUALS,
						partyTypeId), new EntityExpr("attrName",
						EntityOperator.EQUALS, attrName)), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = PartyTypeAttr.fromValues(out.getListIt()
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
	 * Get party type
	 */
	public Optional<PartyType> getPartyType(PartyTypeAttr partyTypeAttr) {
		List<PartyType> entityList = null;
		In in = new In();
		in.setEntityName(PartyType.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("partyTypeId", EntityOperator.EQUALS,
						partyTypeAttr.getPartyTypeId())), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = PartyType.fromValues(out.getListIt()
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
	 * Get party attributes
	 */
	public List<PartyAttribute> getPartyAttributes(PartyTypeAttr partyTypeAttr,
			Integer start, Integer number, List<String> orderBy) {
		List<PartyAttribute> entityList = Collections.emptyList();
		In in = new In();
		in.setEntityName(PartyAttribute.NAME);
		if (start == null) {
			start = OfbizUtil.DEFAULT_FIND_START;
		}
		if (number == null) {
			number = OfbizUtil.DEFAULT_FIND_NUMBER;
		}
		in.setOrderByList(orderBy);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("attrName", EntityOperator.EQUALS,
						partyTypeAttr.getAttrName())), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = PartyAttribute.fromValues(out.getListIt()
						.getPartialList(start, number));
				out.getListIt().close();
			}
		} catch (GenericEntityException e) {
			log.error(e.getMessage(), e);
		}
		return entityList;
	}

	/**
	 * Get parties
	 */
	public List<Party> getParties(PartyTypeAttr partyTypeAttr, Integer start,
			Integer number, List<String> orderBy) {
		List<Party> entityList = Collections.emptyList();
		In in = new In();
		in.setEntityName(Party.NAME);
		if (start == null) {
			start = OfbizUtil.DEFAULT_FIND_START;
		}
		if (number == null) {
			number = OfbizUtil.DEFAULT_FIND_NUMBER;
		}
		in.setOrderByList(orderBy);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("partyTypeId", EntityOperator.EQUALS,
						partyTypeAttr.getPartyTypeId())), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = Party.fromValues(out.getListIt().getPartialList(
						start, number));
				out.getListIt().close();
			}
		} catch (GenericEntityException e) {
			log.error(e.getMessage(), e);
		}
		return entityList;
	}
}