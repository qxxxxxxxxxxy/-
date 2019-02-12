package com.one.graduateDesign.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("a")

public class testController {
	
	@RequestMapping("/save")
	public String test() {
		System.out.println("asdf");
		return "NewFile1";
	}
}
