package org.apache.ofbiz.accounting.ledger;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Variance Reason Gl Account
 */
public class VarianceReasonGlAccount implements Serializable {

	public static final long serialVersionUID = 3289402949309550592L;
	public static final String NAME = "VarianceReasonGlAccount";
	/**
	 * Variance Reason Id
	 */
	@Getter
	@Setter
	private String varianceReasonId;
	/**
	 * Organization Party Id
	 */
	@Getter
	@Setter
	private String organizationPartyId;
	/**
	 * Gl Account Id
	 */
	@Getter
	@Setter
	private String glAccountId;
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
		varianceReasonId, organizationPartyId, glAccountId, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public VarianceReasonGlAccount(GenericValue value) {
		varianceReasonId = (String) value.get(Fields.varianceReasonId.name());
		organizationPartyId = (String) value.get(Fields.organizationPartyId
				.name());
		glAccountId = (String) value.get(Fields.glAccountId.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static VarianceReasonGlAccount fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new VarianceReasonGlAccount(value);
	}

	public static List<VarianceReasonGlAccount> fromValues(
			List<GenericValue> values) {
		List<VarianceReasonGlAccount> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new VarianceReasonGlAccount(value));
		}
		return entities;
	}
}