package org.apache.ofbiz.accounting.fixedasset;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Fixed Asset Type Gl Account
 */
public class FixedAssetTypeGlAccount implements Serializable {

	public static final long serialVersionUID = 2339753156547914752L;
	public static final String NAME = "FixedAssetTypeGlAccount";
	/**
	 * Fixed Asset Type Id
	 */
	@Getter
	@Setter
	private String fixedAssetTypeId;
	/**
	 * Fixed Asset Id
	 */
	@Getter
	@Setter
	private String fixedAssetId;
	/**
	 * Organization Party Id
	 */
	@Getter
	@Setter
	private String organizationPartyId;
	/**
	 * Asset Gl Account Id
	 */
	@Getter
	@Setter
	private String assetGlAccountId;
	/**
	 * Acc Dep Gl Account Id
	 */
	@Getter
	@Setter
	private String accDepGlAccountId;
	/**
	 * Dep Gl Account Id
	 */
	@Getter
	@Setter
	private String depGlAccountId;
	/**
	 * Profit Gl Account Id
	 */
	@Getter
	@Setter
	private String profitGlAccountId;
	/**
	 * Loss Gl Account Id
	 */
	@Getter
	@Setter
	private String lossGlAccountId;
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
		fixedAssetTypeId, fixedAssetId, organizationPartyId, assetGlAccountId, accDepGlAccountId, depGlAccountId, profitGlAccountId, lossGlAccountId, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public FixedAssetTypeGlAccount(GenericValue value) {
		fixedAssetTypeId = (String) value.get(Fields.fixedAssetTypeId.name());
		fixedAssetId = (String) value.get(Fields.fixedAssetId.name());
		organizationPartyId = (String) value.get(Fields.organizationPartyId
				.name());
		assetGlAccountId = (String) value.get(Fields.assetGlAccountId.name());
		accDepGlAccountId = (String) value.get(Fields.accDepGlAccountId.name());
		depGlAccountId = (String) value.get(Fields.depGlAccountId.name());
		profitGlAccountId = (String) value.get(Fields.profitGlAccountId.name());
		lossGlAccountId = (String) value.get(Fields.lossGlAccountId.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static FixedAssetTypeGlAccount fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new FixedAssetTypeGlAccount(value);
	}

	public static List<FixedAssetTypeGlAccount> fromValues(
			List<GenericValue> values) {
		List<FixedAssetTypeGlAccount> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new FixedAssetTypeGlAccount(value));
		}
		return entities;
	}
}