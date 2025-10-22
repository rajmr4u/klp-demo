package com.rajesh.klp.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.rajesh.klp.demo.controller.CountyController;

@SpringBootTest
public class CountyControllerTest {
	
	@Autowired
	private CountyController controller;

//	@Test
//	void contextLoads() {
//		assertThat(controller).isNotNull();
//	}
//
//	@Autowired
//	private TestRestTemplate restTemplate;
//	
//	@Test
//	void countyDetailsToReturn() throws Exception {
//		assertThat(this.restTemplate.getForObject("http://localhost:8080/county/42",
//				String.class)).isNotNull();
//	}

}
