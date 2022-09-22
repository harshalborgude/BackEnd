package org.hrb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

// @RequestMapping can take any type of request.
// we can use @GetMapping instead of RequestMapping , getMapping is specific to get request.

@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}

	// instead of this request , we r using below type of model.

	/*
	 * @RequestMapping("displayname")
	 * public String displayName(HttpServletRequest request) { 
	 * String firstName = request.getParameter("firstName");
	 * request.setAttribute("firstName", firstName); 
	 * return "displayName";
	 * }
	 */

	/*
	 // With @RequestParam annotation , we can remove above class of HttpServletRequest and request object
	 // we can use model instead of request object.
	 
	@RequestMapping("displayname")
	public String displayName(@RequestParam("firstName") String firstName, Model model) {

		model.addAttribute("firstName", firstName);
		// request.setAttribute("firstName", firstName);
		return "displayName";
	}*/

	// we can do the same stuff with ModelAndView also.
	// either model or modelAndView are two methods of dealing with models
	
	@RequestMapping("displayname")
	public ModelAndView displayName(@RequestParam("firstName") String firstName) {

		ModelAndView modelAndView =new ModelAndView("displayName");
		Date date=new Date();
		
		List<String> names=new ArrayList<>();
		names.add("harsh1");
		names.add("harsh2");
		names.add("harsh3");
		names.add("harsh4");
		
		
		modelAndView.addObject("Date",date);
		modelAndView.addObject("firstName", firstName);
		modelAndView.addObject("Names",names);
		return modelAndView;
	}
	
}














