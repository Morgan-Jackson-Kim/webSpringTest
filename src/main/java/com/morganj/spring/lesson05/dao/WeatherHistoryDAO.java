package com.morganj.spring.lesson05.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.morganj.spring.lesson05.model.WeatherHistory;

@Repository
public interface WeatherHistoryDAO {
	
	public List<WeatherHistory> selectWeatherHistory();
	
	public int insertWeather (
			@Param("date")Date date,
			@Param("weather")String weather,
			@Param("temperatures")double temperatures,
			@Param("precipitation")double precipitation,
			@Param("windSpeed")double windSpeed,
			@Param("microDust")String microDust
			);

}
