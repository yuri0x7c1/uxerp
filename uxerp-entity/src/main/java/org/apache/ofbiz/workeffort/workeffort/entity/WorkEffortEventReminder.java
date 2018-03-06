package org.apache.ofbiz.workeffort.workeffort.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Work Effort Event Reminder
 */
public class WorkEffortEventReminder implements Serializable {

	public static final long serialVersionUID = 7643961788519177216L;
	public static final String NAME = "WorkEffortEventReminder";
	/**
	 * Work Effort Id
	 */
	@Getter
	@Setter
	private String workEffortId;
	/**
	 * Sequence Id
	 */
	@Getter
	@Setter
	private String sequenceId;
	/**
	 * Contact Mech Id
	 */
	@Getter
	@Setter
	private String contactMechId;
	/**
	 * Party Id
	 */
	@Getter
	@Setter
	private String partyId;
	/**
	 * Reminder Date Time
	 */
	@Getter
	@Setter
	private Timestamp reminderDateTime;
	/**
	 * Repeat Count
	 */
	@Getter
	@Setter
	private Long repeatCount;
	/**
	 * Repeat Interval
	 */
	@Getter
	@Setter
	private Long repeatInterval;
	/**
	 * Current Count
	 */
	@Getter
	@Setter
	private Long currentCount;
	/**
	 * Reminder Offset
	 */
	@Getter
	@Setter
	private Long reminderOffset;
	/**
	 * Locale Id
	 */
	@Getter
	@Setter
	private String localeId;
	/**
	 * Time Zone Id
	 */
	@Getter
	@Setter
	private String timeZoneId;

	public enum Fields {
		workEffortId, sequenceId, contactMechId, partyId, reminderDateTime, repeatCount, repeatInterval, currentCount, reminderOffset, localeId, timeZoneId
	}

	public WorkEffortEventReminder(GenericValue value) {
		workEffortId = (String) value.get(Fields.workEffortId.name());
		sequenceId = (String) value.get(Fields.sequenceId.name());
		contactMechId = (String) value.get(Fields.contactMechId.name());
		partyId = (String) value.get(Fields.partyId.name());
		reminderDateTime = (Timestamp) value
				.get(Fields.reminderDateTime.name());
		repeatCount = (Long) value.get(Fields.repeatCount.name());
		repeatInterval = (Long) value.get(Fields.repeatInterval.name());
		currentCount = (Long) value.get(Fields.currentCount.name());
		reminderOffset = (Long) value.get(Fields.reminderOffset.name());
		localeId = (String) value.get(Fields.localeId.name());
		timeZoneId = (String) value.get(Fields.timeZoneId.name());
	}

	public static WorkEffortEventReminder fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new WorkEffortEventReminder(value);
	}

	public static List<WorkEffortEventReminder> fromValues(
			List<GenericValue> values) {
		List<WorkEffortEventReminder> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new WorkEffortEventReminder(value));
		}
		return entities;
	}
}