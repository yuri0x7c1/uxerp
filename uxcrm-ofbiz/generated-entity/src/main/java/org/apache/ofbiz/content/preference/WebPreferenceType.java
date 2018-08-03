package org.apache.ofbiz.content.preference;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Web Preference Type
 */
public class WebPreferenceType implements Serializable {

	public static final long serialVersionUID = 6727633252315495424L;
	public static final String NAME = "WebPreferenceType";
	/**
	 * Web Preference Type Id
	 */
	@Getter
	@Setter
	private String webPreferenceTypeId;
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
		webPreferenceTypeId, description, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public WebPreferenceType(GenericValue value) {
		webPreferenceTypeId = (String) value.get(Fields.webPreferenceTypeId
				.name());
		description = (String) value.get(Fields.description.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static WebPreferenceType fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new WebPreferenceType(value);
	}

	public static List<WebPreferenceType> fromValues(List<GenericValue> values) {
		List<WebPreferenceType> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new WebPreferenceType(value));
		}
		return entities;
	}
}