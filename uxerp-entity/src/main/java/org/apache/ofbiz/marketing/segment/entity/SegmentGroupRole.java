package org.apache.ofbiz.marketing.segment.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Segment Group Role
 */
public class SegmentGroupRole implements Serializable {

	public static final long serialVersionUID = 8789977528297693184L;
	public static final String NAME = "SegmentGroupRole";
	/**
	 * Segment Group Id
	 */
	@Getter
	@Setter
	private String segmentGroupId;
	/**
	 * Party Id
	 */
	@Getter
	@Setter
	private String partyId;
	/**
	 * Role Type Id
	 */
	@Getter
	@Setter
	private String roleTypeId;

	public enum Fields {
		segmentGroupId, partyId, roleTypeId
	}

	public SegmentGroupRole(GenericValue value) {
		segmentGroupId = (String) value.get(Fields.segmentGroupId.name());
		partyId = (String) value.get(Fields.partyId.name());
		roleTypeId = (String) value.get(Fields.roleTypeId.name());
	}

	public static SegmentGroupRole fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new SegmentGroupRole(value);
	}

	public static List<SegmentGroupRole> fromValues(List<GenericValue> values) {
		List<SegmentGroupRole> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new SegmentGroupRole(value));
		}
		return entities;
	}
}