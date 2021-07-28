package com.morganj.spring.lesson04.bo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morganj.spring.lesson04.dao.SellerDAO;
import com.morganj.spring.lesson04.model.Seller;



@Service
public class SellerBO {
	
	@Autowired
	private SellerDAO sellerDAO;
	
	
	public int addNewSeller(String nickname, String profileImageUrl, double temperature) {
		return sellerDAO.insertSeller(nickname, profileImageUrl, temperature);
	}
	
	public Seller getLastSeller() {
		return sellerDAO.selectLastSeller();
	}
	
	public Seller getSellerById(int id) {
		return sellerDAO.selectSellerById(id);
	}

}
