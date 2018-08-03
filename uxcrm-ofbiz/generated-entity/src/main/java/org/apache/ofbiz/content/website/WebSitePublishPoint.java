package org.apache.ofbiz.content.website;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import org.apache.ofbiz.entity.GenericValue;
import java.util.List;
import java.util.ArrayList;

/**
 * Web Site Publish Point
 */
public class WebSitePublishPoint implements Serializable {

	public static final long serialVersionUID = 1622329691975120896L;
	public static final String NAME = "WebSitePublishPoint";
	/**
	 * Content Id
	 */
	@Getter
	@Setter
	private String contentId;
	/**
	 * Template Title
	 */
	@Getter
	@Setter
	private String templateTitle;
	/**
	 * Style Sheet File
	 */
	@Getter
	@Setter
	private String styleSheetFile;
	/**
	 * Logo
	 */
	@Getter
	@Setter
	private String logo;
	/**
	 * Medallion Logo
	 */
	@Getter
	@Setter
	private String medallionLogo;
	/**
	 * Line Logo
	 */
	@Getter
	@Setter
	private String lineLogo;
	/**
	 * Left Bar Id
	 */
	@Getter
	@Setter
	private String leftBarId;
	/**
	 * Right Bar Id
	 */
	@Getter
	@Setter
	private String rightBarId;
	/**
	 * Content Dept
	 */
	@Getter
	@Setter
	private String contentDept;
	/**
	 * About Content Id
	 */
	@Getter
	@Setter
	private String aboutContentId;
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
		contentId, templateTitle, styleSheetFile, logo, medallionLogo, lineLogo, leftBarId, rightBarId, contentDept, aboutContentId, lastUpdatedStamp, lastUpdatedTxStamp, createdStamp, createdTxStamp
	}

	public WebSitePublishPoint(GenericValue value) {
		contentId = (String) value.get(Fields.contentId.name());
		templateTitle = (String) value.get(Fields.templateTitle.name());
		styleSheetFile = (String) value.get(Fields.styleSheetFile.name());
		logo = (String) value.get(Fields.logo.name());
		medallionLogo = (String) value.get(Fields.medallionLogo.name());
		lineLogo = (String) value.get(Fields.lineLogo.name());
		leftBarId = (String) value.get(Fields.leftBarId.name());
		rightBarId = (String) value.get(Fields.rightBarId.name());
		contentDept = (String) value.get(Fields.contentDept.name());
		aboutContentId = (String) value.get(Fields.aboutContentId.name());
		lastUpdatedStamp = (Timestamp) value
				.get(Fields.lastUpdatedStamp.name());
		lastUpdatedTxStamp = (Timestamp) value.get(Fields.lastUpdatedTxStamp
				.name());
		createdStamp = (Timestamp) value.get(Fields.createdStamp.name());
		createdTxStamp = (Timestamp) value.get(Fields.createdTxStamp.name());
	}

	public static WebSitePublishPoint fromValue(
			org.apache.ofbiz.entity.GenericValue value) {
		return new WebSitePublishPoint(value);
	}

	public static List<WebSitePublishPoint> fromValues(List<GenericValue> values) {
		List<WebSitePublishPoint> entities = new ArrayList<>();
		for (GenericValue value : values) {
			entities.add(new WebSitePublishPoint(value));
		}
		return entities;
	}
}