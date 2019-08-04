package com.cake.management.abhinay.CakeManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bakery")
public class CakeController {
	
	@RequestMapping("/cake")
	public String loadApp()
	{
		return "index";
	}

}
