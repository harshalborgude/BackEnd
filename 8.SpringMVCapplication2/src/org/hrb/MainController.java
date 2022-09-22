package org.hrb;

import org.hrb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

// working of model and view , radio button and forms.
@Controller
public class MainController {

	@GetMapping("/")
	public ModelAndView welcome() {
		ModelAndView modelAndView=new ModelAndView("userFormView");
		
		User user=new User();
		modelAndView.addObject("user",user);
		return modelAndView;
	}

	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView=new ModelAndView("displayUserInfo");
		
		System.out.println(user);
		modelAndView.addObject("user",user);
		
		return modelAndView;
	}
	
	
	
}














