package org.apache.ofbiz.party.party.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Affiliate
 */
public class Affiliate implements Serializable {

	public static final long serialVersionUID = 5454040941406684160L;
	public static final String NAME = "Affiliate";
	/**
	 * Party Id
	 */
	@Getter
	@Setter
	private String partyId;
	/**
	 * Affiliate Name
	 */
	@Getter
	@Setter
	private String affiliateName;
	/**
	 * Affiliate Description
	 */
	@Getter
	@Setter
	private String affiliateDescription;
	/**
	 * Year Established
	 */
	@Getter
	@Setter
	private String yearEstablished;
	/**
	 * Site Type
	 */
	@Getter
	@Setter
	private String siteType;
	/**
	 * Site Page Views
	 */
	@Getter
	@Setter
	private String sitePageViews;
	/**
	 * Site Visitors
	 */
	@Getter
	@Setter
	private String siteVisitors;
	/**
	 * Date Time Created
	 */
	@Getter
	@Setter
	private Timestamp dateTimeCreated;
	/**
	 * Date Time Approved
	 */
	@Getter
	@Setter
	private Timestamp dateTimeApproved;

	public enum Fields {
		partyId, affiliateName, affiliateDescription, yearEstablished, siteType, sitePageViews, siteVisitors, dateTimeCreated, dateTimeApproved
	}

	public Affiliate(GenericValue value) {
		partyId = (String) value.get(Fields.partyId.name());
		affiliateName = (String) value.get(Fields.affiliateName.name());
		affiliateDescription = (String) value.get(Fields.affiliateDescription
				.name());
		yearEstablished = (String) value.get(Fields.yearEstablished.name());
		siteType = (String) value.get(Fields.siteType.name());
		sitePageViews = (String) value.get(Fields.sitePageViews.name());
		siteVisitors = (String) value.get(Fields.siteVisitors.name());
		dateTimeCreated = (Timestamp) value.get(Fields.dateTimeCreated.name());
		dateTimeApproved = (Timestamp) value
				.get(Fields.dateTimeApproved.name());
	}

	public static Affiliate fromValue(org.apache.ofbiz.entity.GenericValue value) {
		return new Affiliate(value);
	}

	public static List<Affiliate> fromValues(List<GenericValue> values) {
		List<Affiliate> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new Affiliate(value));
		}
		return entities;
	}
}