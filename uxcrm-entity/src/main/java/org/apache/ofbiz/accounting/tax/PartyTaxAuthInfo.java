package org.apache.ofbiz.accounting.tax;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Party Tax Auth Info
 */
public class PartyTaxAuthInfo implements Serializable {

	public static final long serialVersionUID = 7741521280155288576L;
	public static final String NAME = "PartyTaxAuthInfo";
	/**
	 * Party Id
	 */
	@Getter
	@Setter
	private String partyId;
	/**
	 * Tax Auth Geo Id
	 */
	@Getter
	@Setter
	private String taxAuthGeoId;
	/**
	 * Tax Auth Party Id
	 */
	@Getter
	@Setter
	private String taxAuthPartyId;
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
	 * Party Tax Id
	 */
	@Getter
	@Setter
	private String partyTaxId;
	/**
	 * Is Exempt
	 */
	@Getter
	@Setter
	private String isExempt;
	/**
	 * Is Nexus
	 */
	@Getter
	@Setter
	private String isNexus;
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
		partyId, taxAuthGeoId, taxAuthPartyId, fromDate, thruDate, partyTaxId, isExempt, isNexus, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public PartyTaxAuthInfo(GenericValue value) {
		partyId = (String) value.get(Fields.partyId.name());
		taxAuthGeoId = (String) value.get(Fields.taxAuthGeoId.name());
		taxAuthPartyId = (String) value.get(Fields.taxAuthPartyId.name());
		fromDate = (Timestamp) value.get(Fields.fromDate.name());
		thruDate = (Timestamp) value.get(Fields.thruDate.name());
		partyTaxId = (String) value.get(Fields.partyTaxId.name());
		isExempt = (String) value.get(Fields.isExempt.name());
		isNexus = (String) value.get(Fields.isNexus.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static PartyTaxAuthInfo fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new PartyTaxAuthInfo(value);
	}

	public static List<PartyTaxAuthInfo> fromValues(List<GenericValue> values) {
		List<PartyTaxAuthInfo> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new PartyTaxAuthInfo(value));
		}
		return entities;
	}
}