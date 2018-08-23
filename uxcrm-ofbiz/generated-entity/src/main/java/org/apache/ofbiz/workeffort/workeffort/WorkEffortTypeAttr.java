package org.apache.ofbiz.workeffort.workeffort;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Work Effort Type Attr
 */
@FieldNameConstants
public class WorkEffortTypeAttr implements Serializable {

	public static final long serialVersionUID = 2507418105098908672L;
	public static final String NAME = "WorkEffortTypeAttr";
	/**
	 * Work Effort Type Id
	 */
	@Getter
	@Setter
	private String workEffortTypeId;
	/**
	 * Attr Name
	 */
	@Getter
	@Setter
	private String attrName;
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

	public WorkEffortTypeAttr(GenericValue value) {
		workEffortTypeId = (String) value.get(FIELD_WORK_EFFORT_TYPE_ID);
		attrName = (String) value.get(FIELD_ATTR_NAME);
		description = (String) value.get(FIELD_DESCRIPTION);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static WorkEffortTypeAttr fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new WorkEffortTypeAttr(value);
	}

	public static List<WorkEffortTypeAttr> fromValues(List<GenericValue> values) {
		List<WorkEffortTypeAttr> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new WorkEffortTypeAttr(value));
		}
		return entities;
	}
}