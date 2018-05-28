package org.apache.ofbiz.party.party;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Party Classification Group And Type
 */
public class PartyClassificationGroupAndType implements Serializable {

	public static final long serialVersionUID = 3156796417146808320L;
	public static final String NAME = "PartyClassificationGroupAndType";
	/**
	 * Type Description
	 */
	@Getter
	@Setter
	private String typeDescription;
	/**
	 * Parent Type Id
	 */
	@Getter
	@Setter
	private String parentTypeId;
	/**
	 * Party Classification Group Id
	 */
	@Getter
	@Setter
	private String partyClassificationGroupId;
	/**
	 * Parent Group Id
	 */
	@Getter
	@Setter
	private String parentGroupId;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;
	/**
	 * Party Classification Type Id
	 */
	@Getter
	@Setter
	private String partyClassificationTypeId;

	public enum Fields {
		typeDescription, parentTypeId, partyClassificationGroupId, parentGroupId, description, partyClassificationTypeId
	}

	public PartyClassificationGroupAndType(GenericValue value) {
		typeDescription = (String) value.get(Fields.typeDescription.name());
		parentTypeId = (String) value.get(Fields.parentTypeId.name());
		partyClassificationGroupId = (String) value
				.get(Fields.partyClassificationGroupId.name());
		parentGroupId = (String) value.get(Fields.parentGroupId.name());
		description = (String) value.get(Fields.description.name());
		partyClassificationTypeId = (String) value
				.get(Fields.partyClassificationTypeId.name());
	}

	public static PartyClassificationGroupAndType fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new PartyClassificationGroupAndType(value);
	}

	public static List<PartyClassificationGroupAndType> fromValues(
			List<GenericValue> values) {
		List<PartyClassificationGroupAndType> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new PartyClassificationGroupAndType(value));
		}
		return entities;
	}
}