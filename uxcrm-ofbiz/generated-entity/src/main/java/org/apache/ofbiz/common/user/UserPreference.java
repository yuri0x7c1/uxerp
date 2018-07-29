package org.apache.ofbiz.common.user;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * User Preference
 */
public class UserPreference implements Serializable {

	public static final long serialVersionUID = 5435932388213619712L;
	public static final String NAME = "UserPreference";
	/**
	 * User Login Id
	 */
	@Getter
	@Setter
	private String userLoginId;
	/**
	 * User Pref Type Id
	 */
	@Getter
	@Setter
	private String userPrefTypeId;
	/**
	 * User Pref Group Type Id
	 */
	@Getter
	@Setter
	private String userPrefGroupTypeId;
	/**
	 * User Pref Value
	 */
	@Getter
	@Setter
	private String userPrefValue;
	/**
	 * User Pref Data Type
	 */
	@Getter
	@Setter
	private String userPrefDataType;
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
		userLoginId, userPrefTypeId, userPrefGroupTypeId, userPrefValue, userPrefDataType, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public UserPreference(GenericValue value) {
		userLoginId = (String) value.get(Fields.userLoginId.name());
		userPrefTypeId = (String) value.get(Fields.userPrefTypeId.name());
		userPrefGroupTypeId = (String) value.get(Fields.userPrefGroupTypeId
				.name());
		userPrefValue = (String) value.get(Fields.userPrefValue.name());
		userPrefDataType = (String) value.get(Fields.userPrefDataType.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static UserPreference fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new UserPreference(value);
	}

	public static List<UserPreference> fromValues(List<GenericValue> values) {
		List<UserPreference> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new UserPreference(value));
		}
		return entities;
	}
}