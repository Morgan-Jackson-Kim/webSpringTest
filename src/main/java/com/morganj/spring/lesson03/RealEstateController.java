package com.morganj.spring.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.morganj.spring.lesson03.bo.RealEstateBO;
import com.morganj.spring.lesson03.model.RealEstate;

@RestController
public class RealEstateController {
	
	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/lesson03/test01/1")
	public RealEstate test01(
				@RequestParam("id") int id
			) {
		
		return realEstateBO.getRealEstate(id);
	}
}
