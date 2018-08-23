package org.apache.ofbiz.workeffort.workeffort;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Work Effort And Sales Opportunity
 */
@FieldNameConstants
public class WorkEffortAndSalesOpportunity implements Serializable {

	public static final long serialVersionUID = 7701256260890546176L;
	public static final String NAME = "WorkEffortAndSalesOpportunity";
	/**
	 * Work Effort Description
	 */
	@Getter
	@Setter
	private String workEffortDescription;
	/**
	 * Work Effort Created By User Login
	 */
	@Getter
	@Setter
	private String workEffortCreatedByUserLogin;
	/**
	 * Estimated Probability
	 */
	@Getter
	@Setter
	private BigDecimal estimatedProbability;
	/**
	 * Opportunity Name
	 */
	@Getter
	@Setter
	private String opportunityName;
	/**
	 * Marketing Campaign Id
	 */
	@Getter
	@Setter
	private String marketingCampaignId;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;
	/**
	 * Opportunity Stage Id
	 */
	@Getter
	@Setter
	private String opportunityStageId;
	/**
	 * Type Enum Id
	 */
	@Getter
	@Setter
	private String typeEnumId;
	/**
	 * Estimated Close Date
	 */
	@Getter
	@Setter
	private Timestamp estimatedCloseDate;
	/**
	 * Data Source Id
	 */
	@Getter
	@Setter
	private String dataSourceId;
	/**
	 * Currency Uom Id
	 */
	@Getter
	@Setter
	private String currencyUomId;
	/**
	 * Next Step
	 */
	@Getter
	@Setter
	private String nextStep;
	/**
	 * Next Step Date
	 */
	@Getter
	@Setter
	private Timestamp nextStepDate;
	/**
	 * Estimated Amount
	 */
	@Getter
	@Setter
	private BigDecimal estimatedAmount;
	/**
	 * Created By User Login
	 */
	@Getter
	@Setter
	private String createdByUserLogin;
	/**
	 * Sales Opportunity Id
	 */
	@Getter
	@Setter
	private String salesOpportunityId;
	/**
	 * Work Effort Id
	 */
	@Getter
	@Setter
	private String workEffortId;
	/**
	 * Recurrence Info Id
	 */
	@Getter
	@Setter
	private String recurrenceInfoId;
	/**
	 * Work Effort Type Id
	 */
	@Getter
	@Setter
	private String workEffortTypeId;
	/**
	 * Reserv Persons
	 */
	@Getter
	@Setter
	private BigDecimal reservPersons;
	/**
	 * Revision Number
	 */
	@Getter
	@Setter
	private Long revisionNumber;
	/**
	 * Temp Expr Id
	 */
	@Getter
	@Setter
	private String tempExprId;
	/**
	 * Show As Enum Id
	 */
	@Getter
	@Setter
	private String showAsEnumId;
	/**
	 * Info Url
	 */
	@Getter
	@Setter
	private String infoUrl;
	/**
	 * Universal Id
	 */
	@Getter
	@Setter
	private String universalId;
	/**
	 * Location Desc
	 */
	@Getter
	@Setter
	private String locationDesc;
	/**
	 * Actual Milli Seconds
	 */
	@Getter
	@Setter
	private Double actualMilliSeconds;
	/**
	 * Quantity To Produce
	 */
	@Getter
	@Setter
	private BigDecimal quantityToProduce;
	/**
	 * Work Effort Purpose Type Id
	 */
	@Getter
	@Setter
	private String workEffortPurposeTypeId;
	/**
	 * Service Loader Name
	 */
	@Getter
	@Setter
	private String serviceLoaderName;
	/**
	 * Accommodation Spot Id
	 */
	@Getter
	@Setter
	private String accommodationSpotId;
	/**
	 * Estimated Start Date
	 */
	@Getter
	@Setter
	private Timestamp estimatedStartDate;
	/**
	 * Send Notification Email
	 */
	@Getter
	@Setter
	private String sendNotificationEmail;
	/**
	 * Note Id
	 */
	@Getter
	@Setter
	private String noteId;
	/**
	 * Quantity Rejected
	 */
	@Getter
	@Setter
	private BigDecimal quantityRejected;
	/**
	 * Priority
	 */
	@Getter
	@Setter
	private Long priority;
	/**
	 * Current Status Id
	 */
	@Getter
	@Setter
	private String currentStatusId;
	/**
	 * Runtime Data Id
	 */
	@Getter
	@Setter
	private String runtimeDataId;
	/**
	 * Estimated Milli Seconds
	 */
	@Getter
	@Setter
	private Double estimatedMilliSeconds;
	/**
	 * Special Terms
	 */
	@Getter
	@Setter
	private String specialTerms;
	/**
	 * Time Transparency
	 */
	@Getter
	@Setter
	private Long timeTransparency;
	/**
	 * Actual Completion Date
	 */
	@Getter
	@Setter
	private Timestamp actualCompletionDate;
	/**
	 * Fixed Asset Id
	 */
	@Getter
	@Setter
	private String fixedAssetId;
	/**
	 * Reserv 2 Nd Pp Perc
	 */
	@Getter
	@Setter
	private BigDecimal reserv2ndPPPerc;
	/**
	 * Total Money Allowed
	 */
	@Getter
	@Setter
	private BigDecimal totalMoneyAllowed;
	/**
	 * Estimate Calc Method
	 */
	@Getter
	@Setter
	private String estimateCalcMethod;
	/**
	 * Work Effort Parent Id
	 */
	@Getter
	@Setter
	private String workEffortParentId;
	/**
	 * Money Uom Id
	 */
	@Getter
	@Setter
	private String moneyUomId;
	/**
	 * Reserv Nth Pp Perc
	 */
	@Getter
	@Setter
	private BigDecimal reservNthPPPerc;
	/**
	 * Work Effort Name
	 */
	@Getter
	@Setter
	private String workEffortName;
	/**
	 * Last Modified By User Login
	 */
	@Getter
	@Setter
	private String lastModifiedByUserLogin;
	/**
	 * Accommodation Map Id
	 */
	@Getter
	@Setter
	private String accommodationMapId;
	/**
	 * Actual Start Date
	 */
	@Getter
	@Setter
	private Timestamp actualStartDate;
	/**
	 * Scope Enum Id
	 */
	@Getter
	@Setter
	private String scopeEnumId;
	/**
	 * Quantity Produced
	 */
	@Getter
	@Setter
	private BigDecimal quantityProduced;
	/**
	 * Facility Id
	 */
	@Getter
	@Setter
	private String facilityId;
	/**
	 * Estimated Setup Millis
	 */
	@Getter
	@Setter
	private Double estimatedSetupMillis;
	/**
	 * Last Modified Date
	 */
	@Getter
	@Setter
	private Timestamp lastModifiedDate;
	/**
	 * Source Reference Id
	 */
	@Getter
	@Setter
	private String sourceReferenceId;
	/**
	 * Last Status Update
	 */
	@Getter
	@Setter
	private Timestamp lastStatusUpdate;
	/**
	 * Percent Complete
	 */
	@Getter
	@Setter
	private Long percentComplete;
	/**
	 * Total Milli Seconds Allowed
	 */
	@Getter
	@Setter
	private Double totalMilliSecondsAllowed;
	/**
	 * Created Date
	 */
	@Getter
	@Setter
	private Timestamp createdDate;
	/**
	 * Actual Setup Millis
	 */
	@Getter
	@Setter
	private Double actualSetupMillis;
	/**
	 * Estimated Completion Date
	 */
	@Getter
	@Setter
	private Timestamp estimatedCompletionDate;

	public WorkEffortAndSalesOpportunity(GenericValue value) {
		workEffortDescription = (String) value
				.get(FIELD_WORK_EFFORT_DESCRIPTION);
		workEffortCreatedByUserLogin = (String) value
				.get(FIELD_WORK_EFFORT_CREATED_BY_USER_LOGIN);
		estimatedProbability = (BigDecimal) value
				.get(FIELD_ESTIMATED_PROBABILITY);
		opportunityName = (String) value.get(FIELD_OPPORTUNITY_NAME);
		marketingCampaignId = (String) value.get(FIELD_MARKETING_CAMPAIGN_ID);
		description = (String) value.get(FIELD_DESCRIPTION);
		opportunityStageId = (String) value.get(FIELD_OPPORTUNITY_STAGE_ID);
		typeEnumId = (String) value.get(FIELD_TYPE_ENUM_ID);
		estimatedCloseDate = (Timestamp) value.get(FIELD_ESTIMATED_CLOSE_DATE);
		dataSourceId = (String) value.get(FIELD_DATA_SOURCE_ID);
		currencyUomId = (String) value.get(FIELD_CURRENCY_UOM_ID);
		nextStep = (String) value.get(FIELD_NEXT_STEP);
		nextStepDate = (Timestamp) value.get(FIELD_NEXT_STEP_DATE);
		estimatedAmount = (BigDecimal) value.get(FIELD_ESTIMATED_AMOUNT);
		createdByUserLogin = (String) value.get(FIELD_CREATED_BY_USER_LOGIN);
		salesOpportunityId = (String) value.get(FIELD_SALES_OPPORTUNITY_ID);
		workEffortId = (String) value.get(FIELD_WORK_EFFORT_ID);
		recurrenceInfoId = (String) value.get(FIELD_RECURRENCE_INFO_ID);
		workEffortTypeId = (String) value.get(FIELD_WORK_EFFORT_TYPE_ID);
		reservPersons = (BigDecimal) value.get(FIELD_RESERV_PERSONS);
		revisionNumber = (Long) value.get(FIELD_REVISION_NUMBER);
		tempExprId = (String) value.get(FIELD_TEMP_EXPR_ID);
		showAsEnumId = (String) value.get(FIELD_SHOW_AS_ENUM_ID);
		infoUrl = (String) value.get(FIELD_INFO_URL);
		universalId = (String) value.get(FIELD_UNIVERSAL_ID);
		locationDesc = (String) value.get(FIELD_LOCATION_DESC);
		actualMilliSeconds = (Double) value.get(FIELD_ACTUAL_MILLI_SECONDS);
		quantityToProduce = (BigDecimal) value.get(FIELD_QUANTITY_TO_PRODUCE);
		workEffortPurposeTypeId = (String) value
				.get(FIELD_WORK_EFFORT_PURPOSE_TYPE_ID);
		serviceLoaderName = (String) value.get(FIELD_SERVICE_LOADER_NAME);
		accommodationSpotId = (String) value.get(FIELD_ACCOMMODATION_SPOT_ID);
		estimatedStartDate = (Timestamp) value.get(FIELD_ESTIMATED_START_DATE);
		sendNotificationEmail = (String) value
				.get(FIELD_SEND_NOTIFICATION_EMAIL);
		noteId = (String) value.get(FIELD_NOTE_ID);
		quantityRejected = (BigDecimal) value.get(FIELD_QUANTITY_REJECTED);
		priority = (Long) value.get(FIELD_PRIORITY);
		currentStatusId = (String) value.get(FIELD_CURRENT_STATUS_ID);
		runtimeDataId = (String) value.get(FIELD_RUNTIME_DATA_ID);
		estimatedMilliSeconds = (Double) value
				.get(FIELD_ESTIMATED_MILLI_SECONDS);
		specialTerms = (String) value.get(FIELD_SPECIAL_TERMS);
		timeTransparency = (Long) value.get(FIELD_TIME_TRANSPARENCY);
		actualCompletionDate = (Timestamp) value
				.get(FIELD_ACTUAL_COMPLETION_DATE);
		fixedAssetId = (String) value.get(FIELD_FIXED_ASSET_ID);
		reserv2ndPPPerc = (BigDecimal) value.get(FIELD_RESERV2ND_P_P_PERC);
		totalMoneyAllowed = (BigDecimal) value.get(FIELD_TOTAL_MONEY_ALLOWED);
		estimateCalcMethod = (String) value.get(FIELD_ESTIMATE_CALC_METHOD);
		workEffortParentId = (String) value.get(FIELD_WORK_EFFORT_PARENT_ID);
		moneyUomId = (String) value.get(FIELD_MONEY_UOM_ID);
		reservNthPPPerc = (BigDecimal) value.get(FIELD_RESERV_NTH_P_P_PERC);
		workEffortName = (String) value.get(FIELD_WORK_EFFORT_NAME);
		lastModifiedByUserLogin = (String) value
				.get(FIELD_LAST_MODIFIED_BY_USER_LOGIN);
		accommodationMapId = (String) value.get(FIELD_ACCOMMODATION_MAP_ID);
		actualStartDate = (Timestamp) value.get(FIELD_ACTUAL_START_DATE);
		scopeEnumId = (String) value.get(FIELD_SCOPE_ENUM_ID);
		quantityProduced = (BigDecimal) value.get(FIELD_QUANTITY_PRODUCED);
		facilityId = (String) value.get(FIELD_FACILITY_ID);
		estimatedSetupMillis = (Double) value.get(FIELD_ESTIMATED_SETUP_MILLIS);
		lastModifiedDate = (Timestamp) value.get(FIELD_LAST_MODIFIED_DATE);
		sourceReferenceId = (String) value.get(FIELD_SOURCE_REFERENCE_ID);
		lastStatusUpdate = (Timestamp) value.get(FIELD_LAST_STATUS_UPDATE);
		percentComplete = (Long) value.get(FIELD_PERCENT_COMPLETE);
		totalMilliSecondsAllowed = (Double) value
				.get(FIELD_TOTAL_MILLI_SECONDS_ALLOWED);
		createdDate = (Timestamp) value.get(FIELD_CREATED_DATE);
		actualSetupMillis = (Double) value.get(FIELD_ACTUAL_SETUP_MILLIS);
		estimatedCompletionDate = (Timestamp) value
				.get(FIELD_ESTIMATED_COMPLETION_DATE);
	}

	public static WorkEffortAndSalesOpportunity fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new WorkEffortAndSalesOpportunity(value);
	}

	public static List<WorkEffortAndSalesOpportunity> fromValues(
			List<GenericValue> values) {
		List<WorkEffortAndSalesOpportunity> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new WorkEffortAndSalesOpportunity(value));
		}
		return entities;
	}
}