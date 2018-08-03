package org.apache.ofbiz.product.cost;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Cost Component Calc
 */
public class CostComponentCalc implements Serializable {

	public static final long serialVersionUID = 7205361080135743488L;
	public static final String NAME = "CostComponentCalc";
	/**
	 * Cost Component Calc Id
	 */
	@Getter
	@Setter
	private String costComponentCalcId;
	/**
	 * Description
	 */
	@Getter
	@Setter
	private String description;
	/**
	 * Cost Gl Account Type Id
	 */
	@Getter
	@Setter
	private String costGlAccountTypeId;
	/**
	 * Offsetting Gl Account Type Id
	 */
	@Getter
	@Setter
	private String offsettingGlAccountTypeId;
	/**
	 * Fixed Cost
	 */
	@Getter
	@Setter
	private BigDecimal fixedCost;
	/**
	 * Variable Cost
	 */
	@Getter
	@Setter
	private BigDecimal variableCost;
	/**
	 * Per Milli Second
	 */
	@Getter
	@Setter
	private Long perMilliSecond;
	/**
	 * Currency Uom Id
	 */
	@Getter
	@Setter
	private String currencyUomId;
	/**
	 * Cost Custom Method Id
	 */
	@Getter
	@Setter
	private String costCustomMethodId;
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
		costComponentCalcId, description, costGlAccountTypeId, offsettingGlAccountTypeId, fixedCost, variableCost, perMilliSecond, currencyUomId, costCustomMethodId, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public CostComponentCalc(GenericValue value) {
		costComponentCalcId = (String) value.get(Fields.costComponentCalcId
				.name());
		description = (String) value.get(Fields.description.name());
		costGlAccountTypeId = (String) value.get(Fields.costGlAccountTypeId
				.name());
		offsettingGlAccountTypeId = (String) value
				.get(Fields.offsettingGlAccountTypeId.name());
		fixedCost = (BigDecimal) value.get(Fields.fixedCost.name());
		variableCost = (BigDecimal) value.get(Fields.variableCost.name());
		perMilliSecond = (Long) value.get(Fields.perMilliSecond.name());
		currencyUomId = (String) value.get(Fields.currencyUomId.name());
		costCustomMethodId = (String) value.get(Fields.costCustomMethodId
				.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static CostComponentCalc fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new CostComponentCalc(value);
	}

	public static List<CostComponentCalc> fromValues(List<GenericValue> values) {
		List<CostComponentCalc> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new CostComponentCalc(value));
		}
		return entities;
	}
}