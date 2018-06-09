package org.apache.ofbiz.order._return;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Return Item Type
 */
public class ReturnItemType implements Serializable {

	public static final long serialVersionUID = 6506337417267103744L;
	public static final String NAME = "ReturnItemType";
	/**
	 * Return Item Type Id
	 */
	@Getter
	@Setter
	private String returnItemTypeId;
	/**
	 * Parent Type Id
	 */
	@Getter
	@Setter
	private String parentTypeId;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;
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
		returnItemTypeId, parentTypeId, description, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public ReturnItemType(GenericValue value) {
		returnItemTypeId = (String) value.get(Fields.returnItemTypeId.name());
		parentTypeId = (String) value.get(Fields.parentTypeId.name());
		description = (String) value.get(Fields.description.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static ReturnItemType fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new ReturnItemType(value);
	}

	public static List<ReturnItemType> fromValues(List<GenericValue> values) {
		List<ReturnItemType> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new ReturnItemType(value));
		}
		return entities;
	}
}