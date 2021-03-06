package org.apache.ofbiz.accounting.finaccount;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Fin Account Trans Type Attr
 */
@FieldNameConstants
public class FinAccountTransTypeAttr implements Serializable {

	public static final long serialVersionUID = 5631907147990751232L;
	public static final String NAME = "FinAccountTransTypeAttr";
	/**
	 * Fin Account Trans Type Id
	 */
	@Getter
	@Setter
	private String finAccountTransTypeId;
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

	public FinAccountTransTypeAttr(GenericValue value) {
		finAccountTransTypeId = (String) value
				.get(FIELD_FIN_ACCOUNT_TRANS_TYPE_ID);
		attrName = (String) value.get(FIELD_ATTR_NAME);
		description = (String) value.get(FIELD_DESCRIPTION);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static FinAccountTransTypeAttr fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new FinAccountTransTypeAttr(value);
	}

	public static List<FinAccountTransTypeAttr> fromValues(
			List<GenericValue> values) {
		List<FinAccountTransTypeAttr> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new FinAccountTransTypeAttr(value));
		}
		return entities;
	}
}