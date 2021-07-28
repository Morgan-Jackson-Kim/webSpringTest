package com.morganj.spring.lesson04.dao;

import org.apache.ibatis.annotations.Param;

import com.morganj.spring.lesson04.model.Seller;

public interface SellerDAO {
	public int insertSeller(
			@Param("nickname")String nickname
			,@Param("profileImageUrl") String profileImageUrl
			,@Param("temperature") double temperature
			);
	
	public Seller selectLastSeller();
	
	public Seller selectSellerById(
			@Param("id") int id
			);
}
