package org.apache.ofbiz.party.agreement.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Agreement Item Type
 */
public class AgreementItemType implements Serializable {

	public static final long serialVersionUID = 1141031498521866240L;
	public static final String NAME = "AgreementItemType";
	/**
	 * Agreement Item Type Id
	 */
	@Getter
	@Setter
	private String agreementItemTypeId;
	/**
	 * Parent Type Id
	 */
	@Getter
	@Setter
	private String parentTypeId;
	/**
	 * Has Table
	 */
	@Getter
	@Setter
	private String hasTable;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;

	public enum Fields {
		agreementItemTypeId, parentTypeId, hasTable, description
	}

	public AgreementItemType(GenericValue value) {
		agreementItemTypeId = (String) value.get(Fields.agreementItemTypeId
				.name());
		parentTypeId = (String) value.get(Fields.parentTypeId.name());
		hasTable = (String) value.get(Fields.hasTable.name());
		description = (String) value.get(Fields.description.name());
	}

	public static AgreementItemType fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new AgreementItemType(value);
	}

	public static List<AgreementItemType> fromValues(List<GenericValue> values) {
		List<AgreementItemType> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new AgreementItemType(value));
		}
		return entities;
	}
}