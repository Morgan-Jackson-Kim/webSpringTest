package com.morganj.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.morganj.spring.lesson04.bo.SellerBO;
import com.morganj.spring.lesson04.model.Seller;

@RequestMapping("/lesson04")
@Controller
public class NewSellerController {
	
	@Autowired
	private SellerBO sellerBO;
	
	@GetMapping("/test01/1")
	public String addSellerView() {
		return "lesson04/addSeller";
	}
	
	@PostMapping("/test01/add_seller")
	public String addSeller(
			@RequestParam("nickname")String nickname
			,@RequestParam("profileImageUrl") String profileImageUrl
			,@RequestParam("temperature") double temperature){
		
		int count = sellerBO.addNewSeller(nickname, profileImageUrl, temperature);
		
		//페이지로 이동하는것 
		return "redirect:/lesson04/test01/seller_info";
		//return "lesson04/addSuccess";
	}
	
	@GetMapping("/test01/seller_info")
	public String getSellerInfo(
			@RequestParam(value="id",required = false) Integer id
			,Model model) {
		Seller seller = null;
		if(id == null) {
			seller = sellerBO.getLastSeller();
		} else {
			seller = sellerBO.getSellerById(id);
		}
		model.addAttribute("result",seller);
		model.addAttribute("subject", "판매자 정보");
		return "lesson04/sellerInfo";
	}
	

}
