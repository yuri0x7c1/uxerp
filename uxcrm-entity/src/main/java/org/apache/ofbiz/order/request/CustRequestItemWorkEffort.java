package org.apache.ofbiz.order.request;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Cust Request Item Work Effort
 */
public class CustRequestItemWorkEffort implements Serializable {

	public static final long serialVersionUID = 3887387772300333056L;
	public static final String NAME = "CustRequestItemWorkEffort";
	/**
	 * Cust Request Id
	 */
	@Getter
	@Setter
	private String custRequestId;
	/**
	 * Cust Request Item Seq Id
	 */
	@Getter
	@Setter
	private String custRequestItemSeqId;
	/**
	 * Work Effort Id
	 */
	@Getter
	@Setter
	private String workEffortId;
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
		custRequestId, custRequestItemSeqId, workEffortId, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public CustRequestItemWorkEffort(GenericValue value) {
		custRequestId = (String) value.get(Fields.custRequestId.name());
		custRequestItemSeqId = (String) value.get(Fields.custRequestItemSeqId
				.name());
		workEffortId = (String) value.get(Fields.workEffortId.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static CustRequestItemWorkEffort fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new CustRequestItemWorkEffort(value);
	}

	public static List<CustRequestItemWorkEffort> fromValues(
			List<GenericValue> values) {
		List<CustRequestItemWorkEffort> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new CustRequestItemWorkEffort(value));
		}
		return entities;
	}
}