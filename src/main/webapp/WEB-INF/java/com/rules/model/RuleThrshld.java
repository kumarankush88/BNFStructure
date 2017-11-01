/**
 * 
 */
package com.rules.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author ankush.h.kumar
 *
 */


@XmlType(propOrder = {"country","tm","threshold","thresholdSetDate","thresholdSetapprovedBy","thresholdLastModifiedDate"})
public class RuleThrshld {

	
	private String country;
	private String tm;
	private String threshold;
	private String thresholdSetDate;
	private String thresholdSetapprovedBy;
	private String thresholdLastModifiedDate;
	
	@XmlElement(name = "COUNTRY")
	public String getCountry() {
		return country;
	}
	@XmlElement(name = "TM")
	public String getTm() {
		return tm;
	}
	@XmlElement(name = "THRESHOLD")
	public String getThreshold() {
		return threshold;
	}
	@XmlElement(name = "THRESHOLD_SET_DATE")
	public String getThresholdSetDate() {
		return thresholdSetDate;
	}
	@XmlElement(name = "THRESHOLD_SET_APPROVED_BY")
	public String getThresholdSetapprovedBy() {
		return thresholdSetapprovedBy;
	}
	@XmlElement(name = "THRESHOLD_LAST_MODIFIED_DATE")
	public String getThresholdLastModifiedDate() {
		return thresholdLastModifiedDate;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setTm(String tm) {
		this.tm = tm;
	}
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}
	public void setThresholdSetDate(String thresholdSetDate) {
		this.thresholdSetDate = thresholdSetDate;
	}
	public void setThresholdSetapprovedBy(String thresholdSetapprovedBy) {
		this.thresholdSetapprovedBy = thresholdSetapprovedBy;
	}
	public void setThresholdLastModifiedDate(String thresholdLastModifiedDate) {
		this.thresholdLastModifiedDate = thresholdLastModifiedDate;
	}
	
	
}
