package com.morganj.spring.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson01/test01")
public class Test01 {
	
	@RequestMapping("/1")
	public String printProject() {
		String printtest = "<h1>테스트 프로젝트 완성</h1> <h3> 해당프로젝트를 통해서 문제풀이를 진행 합니다.</h3>";
		return printtest ;
	}
	
	@RequestMapping("/2")
	public Map<String, Object> printMap(){
		Map<String, Object> map = new HashMap<>();
		
		map.put("국어",80 );
		map.put("수학",90 );
		map.put("영어",85 );
		return map;
	}

}
