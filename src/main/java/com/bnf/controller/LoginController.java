/**
 * 
 */
package com.bnf.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bnf.model.UserModel;
import com.bnf.service.BnfTreeService;

/**
 * @author ankush.h.kumar
 *
 */

@RestController
public class LoginController {

	public static UserModel user =new UserModel();
	@Autowired
	private BnfTreeService bnfTreeService;
	
	@RequestMapping("/welcome")
	public ModelAndView showLoginForm() {
		return new ModelAndView("login", "user", user);
		}
		
	@RequestMapping(value = "/loginUser", method = { RequestMethod.GET, RequestMethod.POST}, produces = "application/json")
	public ModelAndView loginAndShowBnfTree(@ModelAttribute("user") UserModel user) {
		String redirect=null;
		String message=null;
		String bnfTree=null;
		
		if((user.getUserName().equals("admin"))&&(user.getPassword().equals("admin")))
		{
			redirect = "home";
			message ="login successful";
			bnfTree = bnfTreeService.getBnfTreeJson();
			System.out.println(bnfTree.toString());
			
		
		}
		else
		{
		redirect="failure";
		message ="username/password not correct";
		
		}
		ModelAndView mv = new ModelAndView(redirect);
		mv.addObject("bnfTree", bnfTree);
		mv.addObject("message", message);
		
		return mv;
	}
	
}
