package com.morganj.spring.lesson05.bo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morganj.spring.lesson05.dao.WeatherHistoryDAO;
import com.morganj.spring.lesson05.model.WeatherHistory;

@Service
public class WeatherHistoryBO {
	
	@Autowired
	private WeatherHistoryDAO weatherHistoryDAO;
	
	public List<WeatherHistory> getWeatherHistory() {
		return weatherHistoryDAO.selectWeatherHistory();
	}
	
	public int addWeather(Date date,String weather,double temperatures,double precipitation,double windSpeed,String microDust) {
		return weatherHistoryDAO.insertWeather(date, weather, temperatures, precipitation, windSpeed, microDust);
	}
}
