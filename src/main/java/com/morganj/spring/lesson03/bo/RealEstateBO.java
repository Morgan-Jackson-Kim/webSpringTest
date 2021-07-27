package com.morganj.spring.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morganj.spring.lesson03.dao.RealEstateDAO;
import com.morganj.spring.lesson03.model.RealEstate;

@Service
public class RealEstateBO {
	
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate getRealEstate(int id){
		
		return realEstateDAO.selectRealEstate(id);
		
	}
	
	public List<RealEstate> getRealEstateAsRent(int rentPrice){
		return realEstateDAO.selectRealEstateAsRent(rentPrice);
	}
	
	public List<RealEstate> getRealEstateAsAreaPrice(int area, int price){
		return realEstateDAO.selectRealEstateAsAreaPrice(area, price);
	}
	
	public int addRealEstate(RealEstate realEstate) {
		return realEstateDAO.insertRealEstateFromObject(realEstate);
	}
	
	public int addRealEstate(int realtorId,String address, int area, String type, int price, int rentPrice) {
		return realEstateDAO.insertRealEstate(realtorId, address, area, type, price, rentPrice); 
	}
	
	public int updateRealEstateTypeById(int id , String type ,int price) {
		return realEstateDAO.updateRealEstateTypeById(id, type, price);
	}
	
	public int deleteRealEstateById(int id) {
		return realEstateDAO.deleteRealEstateById(id);
	}

}
