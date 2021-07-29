package com.morganj.spring.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.morganj.spring.lesson04.model.NewRealtor;

@Repository
public interface NewRealtorDAO {
	public int insertNewRealtor(NewRealtor newRealtor);
}
