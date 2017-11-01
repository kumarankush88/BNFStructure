/**
 * 
 */
package com.rules.model;

import java.util.Date;

import javax.xml.bind.annotation.*;

/**
 * @author ankush.h.kumar
 *
 */

@XmlType(propOrder = {"rule_id","rule_name","rule_desc","rule_expression_id","rule_score","rule_text","rule_business_text","rule_supporting_data","rule_supporting_data_modify_dt","created_by","created_dt","last_modified_dt","approved_flag","approved_by","approval_comments","approved_dt","hibernation_days","rule_type"})
public class Rule {
	
	
	private String rule_id;
	private String rule_name;
	private String rule_desc;
	private String rule_expression_id;
	private String rule_score;
	private String rule_text;
	private String rule_business_text;
	private String rule_supporting_data;
	private String rule_supporting_data_modify_dt;
	private String created_by;
	private String created_dt;
	private String last_modified_dt;
	private String approved_flag;
	private String approved_by;
	private String approval_comments;
	private String approved_dt;
	private String hibernation_days;
	private String rule_type;
	
	
	@XmlElement(name = "RULE_ID")
	public String getRule_id() {
		return rule_id;
	}
	public void setRule_id(String rule_id) {
		this.rule_id = rule_id;
	}
	@XmlElement(name = "RULE_NAME")
	public String getRule_name() {
		return rule_name;
	}
	public void setRule_name(String rule_name) {
		this.rule_name = rule_name;
	}
	@XmlElement(name = "RULE_DESC")
	public String getRule_desc() {
		return rule_desc;
	}
	public void setRule_desc(String rule_desc) {
		this.rule_desc = rule_desc;
	}
	@XmlElement(name = "RULE_EXPRESSION_ID")
	public String getRule_expression_id() {
		return rule_expression_id;
	}
	public void setRule_expression_id(String rule_expression_id) {
		this.rule_expression_id = rule_expression_id;
	}
	@XmlElement(name = "RULE_TEXT")
	public String getRule_text() {
		return rule_text;
	}
	public void setRule_text(String rule_text) {
		this.rule_text = rule_text;
	}
	@XmlElement(name = "RULE_BUSINESS_TEXT")
	public String getRule_business_text() {
		return rule_business_text;
	}
	public void setRule_business_text(String rule_business_text) {
		this.rule_business_text = rule_business_text;
	}
	@XmlElement(name = "RULE_SUPPORTING_DATA")
	public String getRule_supporting_data() {
		return rule_supporting_data;
	}
	public void setRule_supporting_data(String rule_supporting_data) {
		this.rule_supporting_data = rule_supporting_data;
	}
	@XmlElement(name = "CREATED_BY")
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	@XmlElement(name = "APPROVED_FLAG")
	public String getApproved_flag() {
		return approved_flag;
	}
	public void setApproved_flag(String approved_flag) {
		this.approved_flag = approved_flag;
	}
	@XmlElement(name = "APPROVED_BY")
	public String getApproved_by() {
		return approved_by;
	}
	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}
	@XmlElement(name = "APPROVED_COMMENTS")
	public String getApproval_comments() {
		return approval_comments;
	}
	public void setApproval_comments(String approval_comments) {
		this.approval_comments = approval_comments;
	}
	@XmlElement(name = "RULE_TYPE")
	public String getRule_type() {
		return rule_type;
	}
	public void setRule_type(String rule_type) {
		this.rule_type = rule_type;
	}
	@XmlElement(name = "RULE_SCORE")
	public String getRule_score() {
		return rule_score;
	}
	public void setRule_score(String rule_score) {
		this.rule_score = rule_score;
	}
	@XmlElement(name = "RULE_SUPPORTING_DATA_MODIFY_DT")
	public String getRule_supporting_data_modify_dt() {
		return rule_supporting_data_modify_dt;
	}
	public void setRule_supporting_data_modify_dt(String rule_supporting_data_modify_dt) {
		this.rule_supporting_data_modify_dt = rule_supporting_data_modify_dt;
	}
	@XmlElement(name = "CREATED_DT")
	public String getCreated_dt() {
		return created_dt;
	}
	public void setCreated_dt(String created_dt) {
		this.created_dt = created_dt;
	}
	@XmlElement(name = "LAST_MODIFIED_DT")
	public String getLast_modified_dt() {
		return last_modified_dt;
	}
	public void setLast_modified_dt(String last_modified_dt) {
		this.last_modified_dt = last_modified_dt;
	}
	@XmlElement(name = "APPROVED_DT")
	public String getApproved_dt() {
		return approved_dt;
	}
	public void setApproved_dt(String approved_dt) {
		this.approved_dt = approved_dt;
	}
	@XmlElement(name = "HIBERNATION_DAYS")
	public String getHibernation_days() {
		return hibernation_days;
	}
	public void setHibernation_days(String hibernation_days) {
		this.hibernation_days = hibernation_days;
	}
	
	
	
	
	

}
