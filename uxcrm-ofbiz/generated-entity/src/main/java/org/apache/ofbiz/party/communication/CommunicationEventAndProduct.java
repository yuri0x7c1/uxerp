package org.apache.ofbiz.party.communication;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Communication Event And Product
 */
public class CommunicationEventAndProduct implements Serializable {

	public static final long serialVersionUID = 3290435322463950848L;
	public static final String NAME = "CommunicationEventAndProduct";
	/**
	 * Product Id
	 */
	@Getter
	@Setter
	private String productId;
	/**
	 * Communication Event Id
	 */
	@Getter
	@Setter
	private String communicationEventId;
	/**
	 * Party Id From
	 */
	@Getter
	@Setter
	private String partyIdFrom;
	/**
	 * Note
	 */
	@Getter
	@Setter
	private String note;
	/**
	 * Subject
	 */
	@Getter
	@Setter
	private String subject;
	/**
	 * Cc String
	 */
	@Getter
	@Setter
	private String ccString;
	/**
	 * Contact Mech Type Id
	 */
	@Getter
	@Setter
	private String contactMechTypeId;
	/**
	 * Communication Event Type Id
	 */
	@Getter
	@Setter
	private String communicationEventTypeId;
	/**
	 * Content
	 */
	@Getter
	@Setter
	private String content;
	/**
	 * Content Mime Type Id
	 */
	@Getter
	@Setter
	private String contentMimeTypeId;
	/**
	 * Datetime Started
	 */
	@Getter
	@Setter
	private Timestamp datetimeStarted;
	/**
	 * Contact List Id
	 */
	@Getter
	@Setter
	private String contactListId;
	/**
	 * Contact Mech Id From
	 */
	@Getter
	@Setter
	private String contactMechIdFrom;
	/**
	 * Reason Enum Id
	 */
	@Getter
	@Setter
	private String reasonEnumId;
	/**
	 * Role Type Id To
	 */
	@Getter
	@Setter
	private String roleTypeIdTo;
	/**
	 * Parent Comm Event Id
	 */
	@Getter
	@Setter
	private String parentCommEventId;
	/**
	 * Entry Date
	 */
	@Getter
	@Setter
	private Timestamp entryDate;
	/**
	 * Datetime Ended
	 */
	@Getter
	@Setter
	private Timestamp datetimeEnded;
	/**
	 * Orig Comm Event Id
	 */
	@Getter
	@Setter
	private String origCommEventId;
	/**
	 * Message Id
	 */
	@Getter
	@Setter
	private String messageId;
	/**
	 * Role Type Id From
	 */
	@Getter
	@Setter
	private String roleTypeIdFrom;
	/**
	 * Contact Mech Id To
	 */
	@Getter
	@Setter
	private String contactMechIdTo;
	/**
	 * Header String
	 */
	@Getter
	@Setter
	private String headerString;
	/**
	 * Status Id
	 */
	@Getter
	@Setter
	private String statusId;
	/**
	 * Bcc String
	 */
	@Getter
	@Setter
	private String bccString;
	/**
	 * Party Id To
	 */
	@Getter
	@Setter
	private String partyIdTo;
	/**
	 * To String
	 */
	@Getter
	@Setter
	private String toString;
	/**
	 * From String
	 */
	@Getter
	@Setter
	private String fromString;

	public enum Fields {
		productId, communicationEventId, partyIdFrom, note, subject, ccString, contactMechTypeId, communicationEventTypeId, content, contentMimeTypeId, datetimeStarted, contactListId, contactMechIdFrom, reasonEnumId, roleTypeIdTo, parentCommEventId, entryDate, datetimeEnded, origCommEventId, messageId, roleTypeIdFrom, contactMechIdTo, headerString, statusId, bccString, partyIdTo, toString, fromString
	}

	public CommunicationEventAndProduct(GenericValue value) {
		productId = (String) value.get(Fields.productId.name());
		communicationEventId = (String) value.get(Fields.communicationEventId
				.name());
		partyIdFrom = (String) value.get(Fields.partyIdFrom.name());
		note = (String) value.get(Fields.note.name());
		subject = (String) value.get(Fields.subject.name());
		ccString = (String) value.get(Fields.ccString.name());
		contactMechTypeId = (String) value.get(Fields.contactMechTypeId.name());
		communicationEventTypeId = (String) value
				.get(Fields.communicationEventTypeId.name());
		content = (String) value.get(Fields.content.name());
		contentMimeTypeId = (String) value.get(Fields.contentMimeTypeId.name());
		datetimeStarted = (Timestamp) value.get(Fields.datetimeStarted.name());
		contactListId = (String) value.get(Fields.contactListId.name());
		contactMechIdFrom = (String) value.get(Fields.contactMechIdFrom.name());
		reasonEnumId = (String) value.get(Fields.reasonEnumId.name());
		roleTypeIdTo = (String) value.get(Fields.roleTypeIdTo.name());
		parentCommEventId = (String) value.get(Fields.parentCommEventId.name());
		entryDate = (Timestamp) value.get(Fields.entryDate.name());
		datetimeEnded = (Timestamp) value.get(Fields.datetimeEnded.name());
		origCommEventId = (String) value.get(Fields.origCommEventId.name());
		messageId = (String) value.get(Fields.messageId.name());
		roleTypeIdFrom = (String) value.get(Fields.roleTypeIdFrom.name());
		contactMechIdTo = (String) value.get(Fields.contactMechIdTo.name());
		headerString = (String) value.get(Fields.headerString.name());
		statusId = (String) value.get(Fields.statusId.name());
		bccString = (String) value.get(Fields.bccString.name());
		partyIdTo = (String) value.get(Fields.partyIdTo.name());
		toString = (String) value.get(Fields.toString.name());
		fromString = (String) value.get(Fields.fromString.name());
	}

	public static CommunicationEventAndProduct fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new CommunicationEventAndProduct(value);
	}

	public static List<CommunicationEventAndProduct> fromValues(
			List<GenericValue> values) {
		List<CommunicationEventAndProduct> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new CommunicationEventAndProduct(value));
		}
		return entities;
	}
}