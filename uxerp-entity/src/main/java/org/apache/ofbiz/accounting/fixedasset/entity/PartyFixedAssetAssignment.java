package org.apache.ofbiz.accounting.fixedasset.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Party Fixed Asset Assignment
 */
public class PartyFixedAssetAssignment implements Serializable {

	public static final long serialVersionUID = 6970855705079401472L;
	public static final String NAME = "PartyFixedAssetAssignment";
	/**
	 * Party Id
	 */
	@Getter
	@Setter
	private String partyId;
	/**
	 * Role Type Id
	 */
	@Getter
	@Setter
	private String roleTypeId;
	/**
	 * Fixed Asset Id
	 */
	@Getter
	@Setter
	private String fixedAssetId;
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
	 * Allocated Date
	 */
	@Getter
	@Setter
	private Timestamp allocatedDate;
	/**
	 * Status Id
	 */
	@Getter
	@Setter
	private String statusId;
	/**
	 * Comments
	 */
	@Getter
	@Setter
	private String comments;

	public enum Fields {
		partyId, roleTypeId, fixedAssetId, fromDate, thruDate, allocatedDate, statusId, comments
	}

	public PartyFixedAssetAssignment(GenericValue value) {
		partyId = (String) value.get(Fields.partyId.name());
		roleTypeId = (String) value.get(Fields.roleTypeId.name());
		fixedAssetId = (String) value.get(Fields.fixedAssetId.name());
		fromDate = (Timestamp) value.get(Fields.fromDate.name());
		thruDate = (Timestamp) value.get(Fields.thruDate.name());
		allocatedDate = (Timestamp) value.get(Fields.allocatedDate.name());
		statusId = (String) value.get(Fields.statusId.name());
		comments = (String) value.get(Fields.comments.name());
	}

	public static PartyFixedAssetAssignment fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new PartyFixedAssetAssignment(value);
	}

	public static List<PartyFixedAssetAssignment> fromValues(
			List<GenericValue> values) {
		List<PartyFixedAssetAssignment> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new PartyFixedAssetAssignment(value));
		}
		return entities;
	}
}