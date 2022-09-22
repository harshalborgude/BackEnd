package org.hrb;


import org.hrb.DAO.AppDAOImpl;
import org.hrb.Model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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


@Controller
public class AppController {

	@RequestMapping("/")
	public ModelAndView homePage() {
		ModelAndView model=new ModelAndView("index");
		List<User> users=new ArrayList<User>();
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("AppConfig.class");
		
		AppDAOImpl DAO=context.getBean("DAOBean",AppDAOImpl.class);
		
		users=DAO.listUsers();
		System.out.println(users);
		model.addObject("users",users);
		context.close();

		return model;
	}

	
	
}














