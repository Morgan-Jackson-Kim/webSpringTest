package com.morganj.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.morganj.spring.lesson04.bo.SellerBO;
import com.morganj.spring.lesson04.model.Seller;

@RequestMapping("/lesson04")
@Controller
public class NewSeller {
	
	@Autowired
	private SellerBO sellerBO;
	
	@RequestMapping("/test01/1")
	public String addSellerView() {
		return "lesson04/addSeller";
	}
	
	@RequestMapping("/test01/add_seller")
	public String addSeller(
			@RequestParam("nickname")String nickname
			,@RequestParam("profileImageUrl") String profileImageUrl
			,@RequestParam("temperature") double temperature){
		int count = sellerBO.addNewSeller(nickname, profileImageUrl, temperature);
		return "lesson04/addSuccess";
	}
	
	@GetMapping("/test01/seller_info")
	public String getSellerInfo(Model model) {
		
		Seller seller = sellerBO.getLastSeller();
		model.addAttribute("result",seller);
		model.addAttribute("subject", "판매자 정보");
		return "lesson04/sellerInfo";
	}
	
	@GetMapping("/test01/1/seller_info")
	public String searchSellerInfo(
			@RequestParam(value="id",defaultValue = "1") int id
			,Model model
			) {
		Seller seller = sellerBO.getSellerById(id);
		model.addAttribute("result", seller);
		model.addAttribute("subject", "판매자 정보");
		return "lesson04/sellerInfo";
	}
	

}
