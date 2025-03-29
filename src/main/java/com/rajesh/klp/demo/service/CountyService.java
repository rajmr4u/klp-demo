package com.rajesh.klp.demo.service;

import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CountyService {

	private static final String API_URL = "https://ws.geonorge.no/kommuneinfo/v1/fylker";

	public String getCountyName(String countyNumber) {
		RestTemplate restTemplate = new RestTemplate();
		String url = UriComponentsBuilder.fromHttpUrl(API_URL).pathSegment(countyNumber).toUriString();

		try {

			String response = restTemplate.getForObject(url, String.class);

			return response != null ? response : "County not found";

		} catch (Exception e) {
			return e.getMessage().contains("404 Not Found")
					? "Invalid County Number. Please pass the valid county number."
					: " System is Under Maintaince. Please try later";

		}

	}
}
