package org.apache.ofbiz.entity.tenant;

import lombok.experimental.FieldNameConstants;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Tenant Data Source
 */
@FieldNameConstants
public class TenantDataSource implements Serializable {

	public static final long serialVersionUID = 5011831035385473024L;
	public static final String NAME = "TenantDataSource";
	/**
	 * Tenant Id
	 */
	@Getter
	@Setter
	private String tenantId;
	/**
	 * Entity Group Name
	 */
	@Getter
	@Setter
	private String entityGroupName;
	/**
	 * Jdbc Uri
	 */
	@Getter
	@Setter
	private String jdbcUri;
	/**
	 * Jdbc Username
	 */
	@Getter
	@Setter
	private String jdbcUsername;
	/**
	 * Jdbc Password
	 */
	@Getter
	@Setter
	private String jdbcPassword;
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

	public TenantDataSource(GenericValue value) {
		tenantId = (String) value.get(FIELD_TENANT_ID);
		entityGroupName = (String) value.get(FIELD_ENTITY_GROUP_NAME);
		jdbcUri = (String) value.get(FIELD_JDBC_URI);
		jdbcUsername = (String) value.get(FIELD_JDBC_USERNAME);
		jdbcPassword = (String) value.get(FIELD_JDBC_PASSWORD);
		lastUpdatedStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_STAMP);
		lastUpdatedTxStamp = (Timestamp) value.get(FIELD_LAST_UPDATED_TX_STAMP);
		createdStamp = (Timestamp) value.get(FIELD_CREATED_STAMP);
		createdTxStamp = (Timestamp) value.get(FIELD_CREATED_TX_STAMP);
	}

	public static TenantDataSource fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new TenantDataSource(value);
	}

	public static List<TenantDataSource> fromValues(List<GenericValue> values) {
		List<TenantDataSource> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new TenantDataSource(value));
		}
		return entities;
	}
}