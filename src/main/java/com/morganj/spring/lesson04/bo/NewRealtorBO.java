package com.morganj.spring.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morganj.spring.lesson04.dao.NewRealtorDAO;
import com.morganj.spring.lesson04.model.NewRealtor;

@Service
public class NewRealtorBO {
	
	@Autowired
	private NewRealtorDAO newRealtorDAO;
	
	public int addRealtor(NewRealtor newRealtor) {
		return newRealtorDAO.insertNewRealtor(newRealtor);
	}

}
