package org.apache.ofbiz.humanres.employment.service.base;

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
import org.apache.ofbiz.humanres.employment.PayrollPreference;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ofbiz.party.party.Party;
import org.apache.ofbiz.party.party.PartyRole;
import org.apache.ofbiz.accounting.payment.DeductionType;
import org.apache.ofbiz.accounting.payment.PaymentMethodType;
import org.apache.ofbiz.common.period.PeriodType;

@Slf4j
@Component
@SuppressWarnings("unchecked")
public class PayrollPreferenceBaseService {

	protected ExecuteFindService executeFindService;

	@Autowired
	public PayrollPreferenceBaseService(ExecuteFindService executeFindService) {
		this.executeFindService = executeFindService;
	}

	/**
	 * Count PayrollPreferences
	 */
	public Integer count(EntityConditionList conditions) {
		In in = new In();
		in.setEntityName(PayrollPreference.NAME);
		if (conditions == null) {
			in.setNoConditionFind(OfbizUtil.Y);
		} else {
			in.setEntityConditionList(conditions);
		}
		Out out = executeFindService.runSync(in);
		return out.getListSize();
	}

	/**
	 * Find PayrollPreferences
	 */
	public List<PayrollPreference> find(Integer start, Integer number,
			List<String> orderBy, EntityConditionList conditions) {
		List<PayrollPreference> entityList = Collections.emptyList();
		In in = new In();
		in.setEntityName(PayrollPreference.NAME);
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
				entityList = PayrollPreference.fromValues(out.getListIt()
						.getPartialList(start, number));
				out.getListIt().close();
			}
		} catch (GenericEntityException e) {
			log.error(e.getMessage(), e);
		}
		return entityList;
	}

	/**
	 * Find one PayrollPreference
	 */
	public Optional<PayrollPreference> findOne(Object partyId,
			Object roleTypeId, Object payrollPreferenceSeqId) {
		List<PayrollPreference> entityList = null;
		In in = new In();
		in.setEntityName(PayrollPreference.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("partyId", EntityOperator.EQUALS,
						partyId), new EntityExpr("roleTypeId",
						EntityOperator.EQUALS, roleTypeId), new EntityExpr(
						"payrollPreferenceSeqId", EntityOperator.EQUALS,
						payrollPreferenceSeqId)), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = PayrollPreference.fromValues(out.getListIt()
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
	 * Get party
	 */
	public Optional<Party> getParty(PayrollPreference payrollPreference) {
		List<Party> entityList = null;
		In in = new In();
		in.setEntityName(Party.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("partyId", EntityOperator.EQUALS,
						payrollPreference.getPartyId())), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = Party
						.fromValues(out.getListIt().getCompleteList());
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
	 * Get party role
	 */
	public Optional<PartyRole> getPartyRole(PayrollPreference payrollPreference) {
		List<PartyRole> entityList = null;
		In in = new In();
		in.setEntityName(PartyRole.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays.asList(
				new EntityExpr("partyId", EntityOperator.EQUALS,
						payrollPreference.getPartyId()),
				new EntityExpr("roleTypeId", EntityOperator.EQUALS,
						payrollPreference.getRoleTypeId())), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = PartyRole.fromValues(out.getListIt()
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
	 * Get deduction type
	 */
	public Optional<DeductionType> getDeductionType(
			PayrollPreference payrollPreference) {
		List<DeductionType> entityList = null;
		In in = new In();
		in.setEntityName(DeductionType.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("deductionTypeId",
						EntityOperator.EQUALS, payrollPreference
								.getDeductionTypeId())), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = DeductionType.fromValues(out.getListIt()
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
	 * Get payment method type
	 */
	public Optional<PaymentMethodType> getPaymentMethodType(
			PayrollPreference payrollPreference) {
		List<PaymentMethodType> entityList = null;
		In in = new In();
		in.setEntityName(PaymentMethodType.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("paymentMethodTypeId",
						EntityOperator.EQUALS, payrollPreference
								.getPaymentMethodTypeId())), EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = PaymentMethodType.fromValues(out.getListIt()
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
	 * Get period type
	 */
	public Optional<PeriodType> getPeriodType(
			PayrollPreference payrollPreference) {
		List<PeriodType> entityList = null;
		In in = new In();
		in.setEntityName(PeriodType.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("periodTypeId", EntityOperator.EQUALS,
						payrollPreference.getPeriodTypeId())),
				EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = PeriodType.fromValues(out.getListIt()
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