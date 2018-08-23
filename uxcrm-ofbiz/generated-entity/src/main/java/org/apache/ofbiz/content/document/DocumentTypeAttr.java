package org.apache.ofbiz.content.document;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Document Type Attr
 */
@FieldNameConstants
public class DocumentTypeAttr implements Serializable {

	public static final long serialVersionUID = 3497594718924823552L;
	public static final String NAME = "DocumentTypeAttr";
	/**
	 * Document Type Id
	 */
	@Getter
	@Setter
	private String documentTypeId;
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

	public DocumentTypeAttr(GenericValue value) {
		documentTypeId = (String) value.get(FIELD_DOCUMENT_TYPE_ID);
		attrName = (String) value.get(FIELD_ATTR_NAME);
		description = (String) value.get(FIELD_DESCRIPTION);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static DocumentTypeAttr fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new DocumentTypeAttr(value);
	}

	public static List<DocumentTypeAttr> fromValues(List<GenericValue> values) {
		List<DocumentTypeAttr> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new DocumentTypeAttr(value));
		}
		return entities;
	}
}