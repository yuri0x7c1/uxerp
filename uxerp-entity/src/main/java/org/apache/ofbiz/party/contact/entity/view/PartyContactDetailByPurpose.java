package org.apache.ofbiz.party.contact.entity.view;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Party Contact Detail By Purpose
 */
public class PartyContactDetailByPurpose implements Serializable {

	public static final long serialVersionUID = 917184238748782592L;
	public static final String NAME = "PartyContactDetailByPurpose";
	/**
	 * Party Id
	 */
	@Getter
	@Setter
	private String partyId;
	/**
	 * Contact Mech Id
	 */
	@Getter
	@Setter
	private String contactMechId;
	/**
	 * From Date
	 */
	@Getter
	@Setter
	private Timestamp fromDate;
	/**
	 * Thru Date
	 */
	@Getter
	@Setter
	private Timestamp thruDate;
	/**
	 * Role Type Id
	 */
	@Getter
	@Setter
	private String roleTypeId;
	/**
	 * Allow Solicitation
	 */
	@Getter
	@Setter
	private String allowSolicitation;
	/**
	 * Extension
	 */
	@Getter
	@Setter
	private String extension;
	/**
	 * Verified
	 */
	@Getter
	@Setter
	private String verified;
	/**
	 * Comments
	 */
	@Getter
	@Setter
	private String comments;
	/**
	 * Years With Contact Mech
	 */
	@Getter
	@Setter
	private Long yearsWithContactMech;
	/**
	 * Months With Contact Mech
	 */
	@Getter
	@Setter
	private Long monthsWithContactMech;
	/**
	 * To Name
	 */
	@Getter
	@Setter
	private String toName;
	/**
	 * Attn Name
	 */
	@Getter
	@Setter
	private String attnName;
	/**
	 * Address 1
	 */
	@Getter
	@Setter
	private String address1;
	/**
	 * Address 2
	 */
	@Getter
	@Setter
	private String address2;
	/**
	 * House Number
	 */
	@Getter
	@Setter
	private Long houseNumber;
	/**
	 * House Number Ext
	 */
	@Getter
	@Setter
	private String houseNumberExt;
	/**
	 * Directions
	 */
	@Getter
	@Setter
	private String directions;
	/**
	 * City
	 */
	@Getter
	@Setter
	private String city;
	/**
	 * City Geo Id
	 */
	@Getter
	@Setter
	private String cityGeoId;
	/**
	 * Postal Code
	 */
	@Getter
	@Setter
	private String postalCode;
	/**
	 * Postal Code Ext
	 */
	@Getter
	@Setter
	private String postalCodeExt;
	/**
	 * Country Geo Id
	 */
	@Getter
	@Setter
	private String countryGeoId;
	/**
	 * State Province Geo Id
	 */
	@Getter
	@Setter
	private String stateProvinceGeoId;
	/**
	 * County Geo Id
	 */
	@Getter
	@Setter
	private String countyGeoId;
	/**
	 * Municipality Geo Id
	 */
	@Getter
	@Setter
	private String municipalityGeoId;
	/**
	 * Postal Code Geo Id
	 */
	@Getter
	@Setter
	private String postalCodeGeoId;
	/**
	 * Geo Point Id
	 */
	@Getter
	@Setter
	private String geoPointId;
	/**
	 * Country Code
	 */
	@Getter
	@Setter
	private String countryCode;
	/**
	 * Area Code
	 */
	@Getter
	@Setter
	private String areaCode;
	/**
	 * Contact Number
	 */
	@Getter
	@Setter
	private String contactNumber;
	/**
	 * Ask For Name
	 */
	@Getter
	@Setter
	private String askForName;
	/**
	 * Geo Id
	 */
	@Getter
	@Setter
	private String geoId;
	/**
	 * Geo Type Id
	 */
	@Getter
	@Setter
	private String geoTypeId;
	/**
	 * Geo Name
	 */
	@Getter
	@Setter
	private String geoName;
	/**
	 * Geo Code
	 */
	@Getter
	@Setter
	private String geoCode;
	/**
	 * Geo Sec Code
	 */
	@Getter
	@Setter
	private String geoSecCode;
	/**
	 * Abbreviation
	 */
	@Getter
	@Setter
	private String abbreviation;
	/**
	 * Well Known Text
	 */
	@Getter
	@Setter
	private String wellKnownText;
	/**
	 * Contact Mech Purpose Type Id
	 */
	@Getter
	@Setter
	private String contactMechPurposeTypeId;
	/**
	 * Contact Mech Type Id
	 */
	@Getter
	@Setter
	private String contactMechTypeId;
	/**
	 * Info String
	 */
	@Getter
	@Setter
	private String infoString;

	public enum Fields {
		partyId, contactMechId, fromDate, thruDate, roleTypeId, allowSolicitation, extension, verified, comments, yearsWithContactMech, monthsWithContactMech, toName, attnName, address1, address2, houseNumber, houseNumberExt, directions, city, cityGeoId, postalCode, postalCodeExt, countryGeoId, stateProvinceGeoId, countyGeoId, municipalityGeoId, postalCodeGeoId, geoPointId, countryCode, areaCode, contactNumber, askForName, geoId, geoTypeId, geoName, geoCode, geoSecCode, abbreviation, wellKnownText, contactMechPurposeTypeId, contactMechTypeId, infoString
	}

	public PartyContactDetailByPurpose(GenericValue value) {
		partyId = (String) value.get(Fields.partyId.name());
		contactMechId = (String) value.get(Fields.contactMechId.name());
		fromDate = (Timestamp) value.get(Fields.fromDate.name());
		thruDate = (Timestamp) value.get(Fields.thruDate.name());
		roleTypeId = (String) value.get(Fields.roleTypeId.name());
		allowSolicitation = (String) value.get(Fields.allowSolicitation.name());
		extension = (String) value.get(Fields.extension.name());
		verified = (String) value.get(Fields.verified.name());
		comments = (String) value.get(Fields.comments.name());
		yearsWithContactMech = (Long) value.get(Fields.yearsWithContactMech
				.name());
		monthsWithContactMech = (Long) value.get(Fields.monthsWithContactMech
				.name());
		toName = (String) value.get(Fields.toName.name());
		attnName = (String) value.get(Fields.attnName.name());
		address1 = (String) value.get(Fields.address1.name());
		address2 = (String) value.get(Fields.address2.name());
		houseNumber = (Long) value.get(Fields.houseNumber.name());
		houseNumberExt = (String) value.get(Fields.houseNumberExt.name());
		directions = (String) value.get(Fields.directions.name());
		city = (String) value.get(Fields.city.name());
		cityGeoId = (String) value.get(Fields.cityGeoId.name());
		postalCode = (String) value.get(Fields.postalCode.name());
		postalCodeExt = (String) value.get(Fields.postalCodeExt.name());
		countryGeoId = (String) value.get(Fields.countryGeoId.name());
		stateProvinceGeoId = (String) value.get(Fields.stateProvinceGeoId
				.name());
		countyGeoId = (String) value.get(Fields.countyGeoId.name());
		municipalityGeoId = (String) value.get(Fields.municipalityGeoId.name());
		postalCodeGeoId = (String) value.get(Fields.postalCodeGeoId.name());
		geoPointId = (String) value.get(Fields.geoPointId.name());
		countryCode = (String) value.get(Fields.countryCode.name());
		areaCode = (String) value.get(Fields.areaCode.name());
		contactNumber = (String) value.get(Fields.contactNumber.name());
		askForName = (String) value.get(Fields.askForName.name());
		geoId = (String) value.get(Fields.geoId.name());
		geoTypeId = (String) value.get(Fields.geoTypeId.name());
		geoName = (String) value.get(Fields.geoName.name());
		geoCode = (String) value.get(Fields.geoCode.name());
		geoSecCode = (String) value.get(Fields.geoSecCode.name());
		abbreviation = (String) value.get(Fields.abbreviation.name());
		wellKnownText = (String) value.get(Fields.wellKnownText.name());
		contactMechPurposeTypeId = (String) value
				.get(Fields.contactMechPurposeTypeId.name());
		contactMechTypeId = (String) value.get(Fields.contactMechTypeId.name());
		infoString = (String) value.get(Fields.infoString.name());
	}

	public static PartyContactDetailByPurpose fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new PartyContactDetailByPurpose(value);
	}

	public static List<PartyContactDetailByPurpose> fromValues(
			List<GenericValue> values) {
		List<PartyContactDetailByPurpose> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new PartyContactDetailByPurpose(value));
		}
		return entities;
	}
}