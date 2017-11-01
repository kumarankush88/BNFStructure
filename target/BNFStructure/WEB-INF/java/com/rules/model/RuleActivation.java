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


@XmlType(propOrder = {"country","tm","rulesActivated","ruleRollOffDt","ruleRollOffApproved","ruleRollLstModifiedDt","effectiveDt","expirationDt","ruleScore"})
public class RuleActivation {
	
	private String country;
	private String tm;
	private String rulesActivated;
	private String ruleRollOffDt;
	private String ruleRollOffApproved;
	private String ruleRollLstModifiedDt;
	private String effectiveDt;
	private String expirationDt;
	private String ruleScore;
	
	
	
	@XmlElement(name = "COUNTRY")
	public String getCountry() {
		return country;
	}
	@XmlElement(name = "TM")
	public String getTm() {
		return tm;
	}
	@XmlElement(name = "RULES_ACTIVATED")
	public String getRulesActivated() {
		return rulesActivated;
	}
	@XmlElement(name = "RULES_ROLL_OF_DATE")
	public String getRuleRollOffDt() {
		return ruleRollOffDt;
	}
	@XmlElement(name = "RULES_ROLL_OF_APPROVED")
	public String getRuleRollOffApproved() {
		return ruleRollOffApproved;
	}
	@XmlElement(name = "RULES_ROLL_LST_MODIFIED_DT")
	public String getRuleRollLstModifiedDt() {
		return ruleRollLstModifiedDt;
	}
	@XmlElement(name = "EFFECTIVE_DT")
	public String getEffectiveDt() {
		return effectiveDt;
	}
	@XmlElement(name = "EXPIRATION_DT")
	public String getExpirationDt() {
		return expirationDt;
	}
	@XmlElement(name = "RULE_SCORE")
	public String getRuleScore() {
		return ruleScore;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setTm(String tm) {
		this.tm = tm;
	}
	public void setRulesActivated(String rulesActivated) {
		this.rulesActivated = rulesActivated;
	}
	public void setRuleRollOffDt(String ruleRollOffDt) {
		this.ruleRollOffDt = ruleRollOffDt;
	}
	public void setRuleRollOffApproved(String ruleRollOffApproved) {
		this.ruleRollOffApproved = ruleRollOffApproved;
	}
	public void setRuleRollLstModifiedDt(String ruleRollLstModifiedDt) {
		this.ruleRollLstModifiedDt = ruleRollLstModifiedDt;
	}
	public void setEffectiveDt(String effectiveDt) {
		this.effectiveDt = effectiveDt;
	}
	public void setExpirationDt(String expirationDt) {
		this.expirationDt = expirationDt;
	}
	public void setRuleScore(String ruleScore) {
		this.ruleScore = ruleScore;
	}
	
	
	

}
