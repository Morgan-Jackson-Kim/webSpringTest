package com.morganj.spring.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.morganj.spring.lesson03.model.RealEstate;

@Repository
public interface RealEstateDAO {
	
	public RealEstate selectRealEstate(int id);
	
	public List<RealEstate> selectRealEstateAsRent(@Param("rentPrice") int rentPrice);
	
	//복합조건
	public List<RealEstate> selectRealEstateAsAreaPrice(
			@Param("area") int area,
			@Param("price") int price
			);
	
	public int insertRealEstateFromObject(RealEstate realEstate);
	
	public int insertRealEstate(
			@Param("realtorId") int realtorId,
			@Param("address")String address,
			@Param("area")int area,
			@Param("type")String type,
			@Param("price")int price,
			@Param("rentPrice")int rentPrice	
			);
	
	public int updateRealEstateTypeById(
			@Param("id") int id,
			@Param("type")String type,
			@Param("price")int price
			);
	
	public int deleteRealEstateById(
			@Param("id") int id
			);
	
}
