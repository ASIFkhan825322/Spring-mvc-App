package org.jsp.usermvcapp.controller;


import org.jsp.usermvcapp.dto.User;
import org.jsp.usermvcapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(names = { "user" })
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping(value = "/load",method = RequestMethod.GET)
	public ModelAndView load(ModelAndView mv) {
		mv.setViewName("register");
		mv.addObject("user", new User());
		return mv;

	}

	@RequestMapping(value = "/reg",method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute User user, ModelAndView mv) {
		user = service.saveUser(user);
		mv.setViewName("print");
		mv.addObject("message", "User saved with ID:" + user.getId());
		return mv;

	}

	@RequestMapping(value = "/loginuser", method = RequestMethod.POST)
	public String login(@RequestParam long phone, @RequestParam String password, Model model) {
		User user = service.verifyUser(phone, password);
		if (user != null) {
			model.addAttribute("user", user);
			return "home";
		} else {
			return "login";

		}
	}
	
}
 