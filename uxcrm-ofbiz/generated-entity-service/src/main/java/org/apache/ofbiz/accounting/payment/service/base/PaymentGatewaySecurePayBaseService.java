package org.apache.ofbiz.accounting.payment.service.base;

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
import org.apache.ofbiz.accounting.payment.PaymentGatewaySecurePay;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ofbiz.accounting.payment.PaymentGatewayConfig;

@Slf4j
@Component
@SuppressWarnings("unchecked")
public class PaymentGatewaySecurePayBaseService {

	protected ExecuteFindService executeFindService;

	@Autowired
	public PaymentGatewaySecurePayBaseService(
			ExecuteFindService executeFindService) {
		this.executeFindService = executeFindService;
	}

	/**
	 * Count PaymentGatewaySecurePays
	 */
	public Integer count(EntityConditionList conditions) {
		In in = new In();
		in.setEntityName(PaymentGatewaySecurePay.NAME);
		if (conditions == null) {
			in.setNoConditionFind(OfbizUtil.Y);
		} else {
			in.setEntityConditionList(conditions);
		}
		Out out = executeFindService.runSync(in);
		return out.getListSize();
	}

	/**
	 * Find PaymentGatewaySecurePays
	 */
	public List<PaymentGatewaySecurePay> find(Integer start, Integer number,
			List<String> orderBy, EntityConditionList conditions) {
		List<PaymentGatewaySecurePay> entityList = Collections.emptyList();
		In in = new In();
		in.setEntityName(PaymentGatewaySecurePay.NAME);
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
				entityList = PaymentGatewaySecurePay.fromValues(out.getListIt()
						.getPartialList(start, number));
				out.getListIt().close();
			}
		} catch (GenericEntityException e) {
			log.error(e.getMessage(), e);
		}
		return entityList;
	}

	/**
	 * Find one PaymentGatewaySecurePay
	 */
	public Optional<PaymentGatewaySecurePay> findOne(
			Object paymentGatewayConfigId) {
		List<PaymentGatewaySecurePay> entityList = null;
		In in = new In();
		in.setEntityName(PaymentGatewaySecurePay.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("paymentGatewayConfigId",
						EntityOperator.EQUALS, paymentGatewayConfigId)),
				EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = PaymentGatewaySecurePay.fromValues(out.getListIt()
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
	 * Get payment gateway config
	 */
	public Optional<PaymentGatewayConfig> getPaymentGatewayConfig(
			PaymentGatewaySecurePay paymentGatewaySecurePay) {
		List<PaymentGatewayConfig> entityList = null;
		In in = new In();
		in.setEntityName(PaymentGatewayConfig.NAME);
		in.setEntityConditionList(new EntityConditionList<>(Arrays
				.asList(new EntityExpr("paymentGatewayConfigId",
						EntityOperator.EQUALS, paymentGatewaySecurePay
								.getPaymentGatewayConfigId())),
				EntityOperator.AND));
		Out out = executeFindService.runSync(in);
		try {
			if (out.getListIt() != null) {
				entityList = PaymentGatewayConfig.fromValues(out.getListIt()
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