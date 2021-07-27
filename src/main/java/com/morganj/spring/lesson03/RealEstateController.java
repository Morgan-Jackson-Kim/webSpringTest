package com.morganj.spring.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.morganj.spring.lesson03.bo.RealEstateBO;
import com.morganj.spring.lesson03.model.RealEstate;

@RequestMapping("/lesson03")
@RestController
public class RealEstateController {
	
	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/test01/1")
	public RealEstate test01_1(
				@RequestParam("id") int id
			) {
		return realEstateBO.getRealEstate(id);
	}
	
	//월세 조건 
	//http://localhost/lesson03/test01/2?rent=90
	
	@RequestMapping("/test01/2")
	public List<RealEstate> test01_2(
			@RequestParam("rent") int rentPrice
			) {
		return realEstateBO.getRealEstateAsRent(rentPrice);
	}
	
	
	@RequestMapping("/test01/3")
	public List<RealEstate> test01_3(
			@RequestParam("area") int area,
			@RequestParam("price") int price
			) {
		return realEstateBO.getRealEstateAsAreaPrice(area, price);
	}
	
	@RequestMapping("/test02/1")
	public String test02_1() {
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지옹 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		realEstate.setRentPrice(0);
		
		int count = realEstateBO.addRealEstate(realEstate);
		
		return "입력 성공 : " + count;
	}
	
	@RequestMapping("/test02/2")
	public String test02_2(
			@RequestParam("realtorid") int realtorId
			) {
		int count = realEstateBO.addRealEstate(realtorId,"썅때빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		
		return "입력 성공 : " + count;
	}
	
	//update
	@RequestMapping("/test03")
	public String test03(
			@RequestParam("id") int id,
			@RequestParam("type") String type,
			@RequestParam("price") int price
			) {
		int count = realEstateBO.updateRealEstateTypeById(id, type , price);
		// int count = realEstateBO.updateRealEstateTypeById(22,"전세",70000); 이경우 requestParm은 지워야..
		return "수정 성공: " + count;
	}
	
	//delete
	@RequestMapping("/test04")
	public String test04(
			@RequestParam("id") int id
			) {
		int count = realEstateBO.deleteRealEstateById(id);
		return "삭제 성공 : " + count;
	}
	
}
