package com.morganj.spring.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controler {
	
	@GetMapping("/test01")
	public String test01() {
		return "lesson05/test01";
	}

}
