/**
 * 
 */
package com.rules.model;

import javax.xml.bind.annotation.*;

/**
 * @author ankush.h.kumar
 *
 */

@XmlType(propOrder = {"ruleID","rvName","rvValue","rvCreatedBy","rvCreatedDt"})
public class RuleVv {

	
	private String ruleID;
	private String rvName;
	private String rvValue;
	private String rvCreatedBy;
	private String rvCreatedDt;
	
	
	
	@XmlElement(name = "RULE_ID")
	public String getRuleID() {
		return ruleID;
	}
	@XmlElement(name = "RV_NAME")
	public String getRvName() {
		return rvName;
	}
	@XmlElement(name = "RVV_VALUE")
	public String getRvValue() {
		return rvValue;
	}
	@XmlElement(name = "RVV_CREATED_BY")
	public String getRvCreatedBy() {
		return rvCreatedBy;
	}
	@XmlElement(name = "RVV_CREATED_DT")
	public String getRvCreatedDt() {
		return rvCreatedDt;
	}
	public void setRuleID(String ruleID) {
		this.ruleID = ruleID;
	}
	public void setRvName(String rvName) {
		this.rvName = rvName;
	}
	public void setRvValue(String rvValue) {
		this.rvValue = rvValue;
	}
	public void setRvCreatedBy(String rvCreatedBy) {
		this.rvCreatedBy = rvCreatedBy;
	}
	public void setRvCreatedDt(String rvCreatedDt) {
		this.rvCreatedDt = rvCreatedDt;
	}
	
	
}
