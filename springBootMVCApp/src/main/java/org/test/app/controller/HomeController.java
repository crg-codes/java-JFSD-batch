package org.test.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/test")
	public String test()
	{
		return "test";
	}
	
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	
	@RequestMapping("/service")
	public String service()
	{
		return "service";
	}

}
