package org.apache.ofbiz.humanres.recruitment;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Job Interview
 */
public class JobInterview implements Serializable {

	public static final long serialVersionUID = 2077756474188298240L;
	public static final String NAME = "JobInterview";
	/**
	 * Job Interview Id
	 */
	@Getter
	@Setter
	private String jobInterviewId;
	/**
	 * Job Interviewee Party Id
	 */
	@Getter
	@Setter
	private String jobIntervieweePartyId;
	/**
	 * Job Requisition Id
	 */
	@Getter
	@Setter
	private String jobRequisitionId;
	/**
	 * Job Interviewer Party Id
	 */
	@Getter
	@Setter
	private String jobInterviewerPartyId;
	/**
	 * Job Interview Type Id
	 */
	@Getter
	@Setter
	private String jobInterviewTypeId;
	/**
	 * Grade Secured Enum Id
	 */
	@Getter
	@Setter
	private String gradeSecuredEnumId;
	/**
	 * Job Interview Result
	 */
	@Getter
	@Setter
	private String jobInterviewResult;
	/**
	 * Job Interview Date
	 */
	@Getter
	@Setter
	private Date jobInterviewDate;
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
		jobInterviewId, jobIntervieweePartyId, jobRequisitionId, jobInterviewerPartyId, jobInterviewTypeId, gradeSecuredEnumId, jobInterviewResult, jobInterviewDate, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public JobInterview(GenericValue value) {
		jobInterviewId = (String) value.get(Fields.jobInterviewId.name());
		jobIntervieweePartyId = (String) value.get(Fields.jobIntervieweePartyId
				.name());
		jobRequisitionId = (String) value.get(Fields.jobRequisitionId.name());
		jobInterviewerPartyId = (String) value.get(Fields.jobInterviewerPartyId
				.name());
		jobInterviewTypeId = (String) value.get(Fields.jobInterviewTypeId
				.name());
		gradeSecuredEnumId = (String) value.get(Fields.gradeSecuredEnumId
				.name());
		jobInterviewResult = (String) value.get(Fields.jobInterviewResult
				.name());
		jobInterviewDate = (Date) value.get(Fields.jobInterviewDate.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static JobInterview fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new JobInterview(value);
	}

	public static List<JobInterview> fromValues(List<GenericValue> values) {
		List<JobInterview> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new JobInterview(value));
		}
		return entities;
	}
}