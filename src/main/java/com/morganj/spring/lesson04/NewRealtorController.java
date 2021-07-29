package com.morganj.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.morganj.spring.lesson04.bo.NewRealtorBO;
import com.morganj.spring.lesson04.model.NewRealtor;

@Controller
@RequestMapping("/lesson04/test02")
public class NewRealtorController {
	
	@Autowired
	private NewRealtorBO newRealtorBO;
	
	@GetMapping("/1")
	public String addRealtorView() {
		return "lesson04/addRealtor";
	}
	
	@PostMapping("/add_realtor")
	public String addRealtor(
			@ModelAttribute NewRealtor newRealtor
			,Model model) {
		
		newRealtorBO.addRealtor(newRealtor);
		
		model.addAttribute("result", newRealtor);
		
		return "lesson04/realtorInfo";
	}


}