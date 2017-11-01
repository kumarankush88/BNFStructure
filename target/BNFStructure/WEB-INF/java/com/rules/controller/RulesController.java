/**
 * 
 */
package com.rules.controller;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.rules.model.Rule;
import com.rules.model.RuleActivation;
import com.rules.model.RuleThrshld;
import com.rules.model.RuleVv;
import com.rules.model.Rules;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * @author ankush.h.kumar
 *
 */
@Controller
public class RulesController {

	public static Rules rules =new Rules();
	public String filePath = "C:/Users/ankush.h.kumar/Desktop/Ankush/ET4/ET4XML/Rules/";
	
	
	@RequestMapping("/index")
	public ModelAndView showHome() {
		return new ModelAndView("index");
	}

	
	@RequestMapping("/createRule")
	public ModelAndView showRuleForm() {
		if(rules.getRule()==null)
		{
		rules.setRule(new Rule());
		}
		
		
		return new ModelAndView("ruleCreation", "rule", rules.getRule());
	}
	
	@RequestMapping(value ="/createRuleVv" , method = { RequestMethod.POST})
	public ModelAndView showRuleVvForm(@ModelAttribute("rule") Rule rule) {
		rules.setRule(rule);
		if(rules.getRuleVv() ==null)
		{
			RuleVv ruleVv = new RuleVv();
			rules.setRuleVv(ruleVv);
		}
		return new ModelAndView("ruleVvCreation", "ruleVv", rules.getRuleVv());
	}
	
	@RequestMapping(value ="/createRuleVv" , method = { RequestMethod.GET})
	public ModelAndView returnRuleVvForm() {
		
		return new ModelAndView("ruleVvCreation", "ruleVv", rules.getRuleVv());
	}
	
	@RequestMapping(value ="/createRuleThreshold" , method = { RequestMethod.POST })
	public ModelAndView showRuleThresholdForm(@ModelAttribute("ruleVv") RuleVv ruleVv) {
		rules.setRuleVv(ruleVv);
		if(rules.getThreshold() ==null)
		{
			RuleThrshld threshold = new RuleThrshld(); 
			rules.setThreshold(threshold);
		}
			
		
		return new ModelAndView("ruleThresholdCreation", "threshold", rules.getThreshold());
	}
	
	@RequestMapping(value ="/createRuleThreshold" , method = { RequestMethod.GET })
	public ModelAndView returnRuleThresholdForm() {
		
		
		return new ModelAndView("ruleThresholdCreation", "threshold", rules.getThreshold());
	}
	
	@RequestMapping(value ="/createRuleActivation" , method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView showRuleActivationForm(@ModelAttribute("threshold") RuleThrshld threshold) {
		rules.setThreshold(threshold);
		if(rules.getActivation() ==null)
		{
			RuleActivation activation = new RuleActivation();
			rules.setActivation(activation);
		}
			
	
		return new ModelAndView("ruleActivationCreation", "activation", rules.getActivation());
	}
	
	@RequestMapping(value ="/createRuleActivation" , method = { RequestMethod.GET})
	public ModelAndView returnRuleActivationForm() {
	
		return new ModelAndView("ruleActivationCreation", "activation", rules.getActivation());
	}

	@RequestMapping(value = "/createRuleXml", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView saveRule(@ModelAttribute("activation") RuleActivation activation) {
		rules.setActivation(activation);
		String redirect = null;
		String message = null;
		
		try {
			message = createXml(rules,filePath);
			redirect = "success";
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			message = "Failure in creating xml";
			redirect = "failure";
			e.printStackTrace();

		}
		ModelAndView mv = new ModelAndView(redirect);
		mv.addObject("message", message);
		return mv;
	}
	
	private static String createXml(Object obj,String filePath)throws JAXBException
	{
		JAXBContext context = JAXBContext.newInstance(obj.getClass());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(obj, new File(filePath+"Rule"+new Date().getTime()+".xml"));
		rules =new Rules();
		return "File Successfully created at "+filePath;
		
	}
	
	
	/*@RequestMapping(value = "/createRvvXml", method = RequestMethod.POST)
	public ModelAndView saveRuleVv(@ModelAttribute("ruleVv") RuleVv ruleVv) {
		String redirect = null;
		String message = null;
		String filePath = "C:/Users/ankush.h.kumar/Desktop/Ankush/ET4/ET4XML/RuleVV/RuleVv";
		
		try {
			message = createXml(ruleVv,filePath);
			redirect = "success";
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			message = "Failure in creating xml";
			redirect = "failure";
			e.printStackTrace();

		}
		ModelAndView mv = new ModelAndView(redirect);
		mv.addObject("message", message);
		return mv;
	}
	
	@RequestMapping(value = "/createThresholdXml", method = RequestMethod.POST)
	public ModelAndView saveThreshold(@ModelAttribute("threshold") RuleThrshld threshold) {
		String redirect = null;
		String message = null;
		String filePath = "C:/Users/ankush.h.kumar/Desktop/Ankush/ET4/ET4XML/Threshold/Threshold";
		
		try {
			message = createXml(threshold,filePath);
			redirect = "success";
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			message = "Failure in creating xml";
			redirect = "failure";
			e.printStackTrace();

		}
		ModelAndView mv = new ModelAndView(redirect);
		mv.addObject("message", message);
		return mv;
	}
	
	@RequestMapping(value = "/createThresholdXml", method = RequestMethod.POST)
	public ModelAndView saveActivation(@ModelAttribute("activation") RuleActivation activation) {
		String redirect = null;
		String message = null;
		String filePath = "C:/Users/ankush.h.kumar/Desktop/Ankush/ET4/ET4XML/Activation/Activation";
		
		try {
			message = createXml(activation,filePath);
			redirect = "success";
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			message = "Failure in creating xml";
			redirect = "failure";
			e.printStackTrace();

		}
		ModelAndView mv = new ModelAndView(redirect);
		mv.addObject("message", message);
		return mv;
	}*/
	

	
	/*private static String createRuleXml(Object obj) throws JAXBException {
	
	JAXBContext context = JAXBContext.newInstance(obj.getClass());
	Marshaller m = context.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	String filePath = "C:/Users/ankush.h.kumar/Desktop/Ankush/ET4/ET4XML/Rules/Rule"+new Date().getTime()+".xml";
	//filePath = filePath+"_"+".xml";
	m.marshal(obj, new File(filePath));
	return "File Successfully created at "+filePath;
	

}*/

/*private static String createRuleVvXml(RuleVv rulevv) throws JAXBException {

	JAXBContext context = JAXBContext.newInstance(RuleVv.class);
	Marshaller m = context.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	String filePath = "C:/Users/ankush.h.kumar/Desktop/Ankush/ET4/ET4XML/RuleVV/RuleVv"+new Date().getTime()+".xml";
	//filePath = filePath+"_"+".xml";
	m.marshal(rulevv, new File(filePath));
	return "File Successfully created at "+filePath;
	

}*/
}
