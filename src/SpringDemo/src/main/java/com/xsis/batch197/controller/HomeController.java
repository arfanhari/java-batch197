package com.xsis.batch197.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String index() {
		return "home/index";
	}
	
	@RequestMapping(value="/home/contact-us")
	public String contactUs() {
		return "home/contact-us";
	}
	
	@RequestMapping(value="/home/testingan")
	public String testingan() {
		return "home/testingan";
	}
}
