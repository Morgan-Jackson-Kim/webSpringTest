package com.morganj.spring.lesson03.dao;

import org.springframework.stereotype.Repository;

import com.morganj.spring.lesson03.model.RealEstate;

@Repository
public interface RealEstateDAO {
	
	public RealEstate selectRealEstate(int id);
	
	public RealEstate selectRealEstateRentPrice(int rentPrice);
}
