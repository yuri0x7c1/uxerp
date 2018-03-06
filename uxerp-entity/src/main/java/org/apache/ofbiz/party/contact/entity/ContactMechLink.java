package org.apache.ofbiz.party.contact.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Contact Mech Link
 */
public class ContactMechLink implements Serializable {

	public static final long serialVersionUID = 3985914258718786560L;
	public static final String NAME = "ContactMechLink";
	/**
	 * Contact Mech Id From
	 */
	@Getter
	@Setter
	private String contactMechIdFrom;
	/**
	 * Contact Mech Id To
	 */
	@Getter
	@Setter
	private String contactMechIdTo;

	public enum Fields {
		contactMechIdFrom, contactMechIdTo
	}

	public ContactMechLink(GenericValue value) {
		contactMechIdFrom = (String) value.get(Fields.contactMechIdFrom.name());
		contactMechIdTo = (String) value.get(Fields.contactMechIdTo.name());
	}

	public static ContactMechLink fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new ContactMechLink(value);
	}

	public static List<ContactMechLink> fromValues(List<GenericValue> values) {
		List<ContactMechLink> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new ContactMechLink(value));
		}
		return entities;
	}
}