package org.apache.ofbiz.humanres.employment;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import java.math.BigDecimal;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Pay History
 */
public class PayHistory implements Serializable {

	public static final long serialVersionUID = 2715743317163839488L;
	public static final String NAME = "PayHistory";
	/**
	 * Role Type Id From
	 */
	@Getter
	@Setter
	private String roleTypeIdFrom;
	/**
	 * Role Type Id To
	 */
	@Getter
	@Setter
	private String roleTypeIdTo;
	/**
	 * Party Id From
	 */
	@Getter
	@Setter
	private String partyIdFrom;
	/**
	 * Party Id To
	 */
	@Getter
	@Setter
	private String partyIdTo;
	/**
	 * From Date
	 */
	@Getter
	@Setter
	private Timestamp fromDate;
	/**
	 * Thru Date
	 */
	@Getter
	@Setter
	private Timestamp thruDate;
	/**
	 * Salary Step Seq Id
	 */
	@Getter
	@Setter
	private String salaryStepSeqId;
	/**
	 * Pay Grade Id
	 */
	@Getter
	@Setter
	private String payGradeId;
	/**
	 * Period Type Id
	 */
	@Getter
	@Setter
	private String periodTypeId;
	/**
	 * Amount
	 */
	@Getter
	@Setter
	private BigDecimal amount;
	/**
	 * Comments
	 */
	@Getter
	@Setter
	private String comments;
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
		roleTypeIdFrom, roleTypeIdTo, partyIdFrom, partyIdTo, fromDate, thruDate, salaryStepSeqId, payGradeId, periodTypeId, amount, comments, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public PayHistory(GenericValue value) {
		roleTypeIdFrom = (String) value.get(Fields.roleTypeIdFrom.name());
		roleTypeIdTo = (String) value.get(Fields.roleTypeIdTo.name());
		partyIdFrom = (String) value.get(Fields.partyIdFrom.name());
		partyIdTo = (String) value.get(Fields.partyIdTo.name());
		fromDate = (Timestamp) value.get(Fields.fromDate.name());
		thruDate = (Timestamp) value.get(Fields.thruDate.name());
		salaryStepSeqId = (String) value.get(Fields.salaryStepSeqId.name());
		payGradeId = (String) value.get(Fields.payGradeId.name());
		periodTypeId = (String) value.get(Fields.periodTypeId.name());
		amount = (BigDecimal) value.get(Fields.amount.name());
		comments = (String) value.get(Fields.comments.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static PayHistory fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new PayHistory(value);
	}

	public static List<PayHistory> fromValues(List<GenericValue> values) {
		List<PayHistory> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new PayHistory(value));
		}
		return entities;
	}
}