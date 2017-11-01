/**
 * 
 */
package com.rules.model;

import javax.xml.bind.annotation.*;

/**
 * @author ankush.h.kumar
 *
 */
@XmlRootElement(name = "Rules")
@XmlType(propOrder = {"rule","ruleVv","activation","threshold"})
public class Rules {

	private Rule rule;
	private RuleVv ruleVv;
	private RuleThrshld threshold;
	private RuleActivation activation;
	
	@XmlElement(name= "Rule_table")
	public Rule getRule() {
		return rule;
	}
	@XmlElement(name= "ET_RULE_VV_TBL")
	public RuleVv getRuleVv() {
		return ruleVv;
	}
	@XmlElement(name= "ET_SCORE_THRSHLD_TBL")
	public RuleThrshld getThreshold() {
		return threshold;
	}
	@XmlElement(name= "ET_RULE_ACTIVATION_TBL")
	public RuleActivation getActivation() {
		return activation;
	}

	public void setRuleVv(RuleVv ruleVv) {
		this.ruleVv = ruleVv;
	}

	public void setThreshold(RuleThrshld threshold) {
		this.threshold = threshold;
	}

	public void setActivation(RuleActivation activation) {
		this.activation = activation;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}
	
	
}
