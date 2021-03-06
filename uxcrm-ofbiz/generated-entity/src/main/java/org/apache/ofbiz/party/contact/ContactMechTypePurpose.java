package org.apache.ofbiz.party.contact;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Contact Mech Type Purpose
 */
@FieldNameConstants
public class ContactMechTypePurpose implements Serializable {

	public static final long serialVersionUID = 6094272032928432128L;
	public static final String NAME = "ContactMechTypePurpose";
	/**
	 * Contact Mech Type Id
	 */
	@Getter
	@Setter
	private String contactMechTypeId;
	/**
	 * Contact Mech Purpose Type Id
	 */
	@Getter
	@Setter
	private String contactMechPurposeTypeId;
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

	public ContactMechTypePurpose(GenericValue value) {
		contactMechTypeId = (String) value.get(FIELD_CONTACT_MECH_TYPE_ID);
		contactMechPurposeTypeId = (String) value
				.get(FIELD_CONTACT_MECH_PURPOSE_TYPE_ID);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static ContactMechTypePurpose fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new ContactMechTypePurpose(value);
	}

	public static List<ContactMechTypePurpose> fromValues(
			List<GenericValue> values) {
		List<ContactMechTypePurpose> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new ContactMechTypePurpose(value));
		}
		return entities;
	}
}