package com.grenergy.order.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class OrderService {

	@Autowired
	private RestTemplate restTemplate;
	
	public boolean createOrder(String orderName) {

		String url = "http://localhost:8002/service/catalog/{catalogName}";

		
		String catalogName = orderName;
		Map<String, String> params = new HashMap<String, String>();
		params.put("catalogName", catalogName);

		// create an instance of RestTemplate
		//RestTemplate restTemplate = new RestTemplate();

		// make an HTTP GET request
		boolean isCatalogPresent = restTemplate.getForObject(url, Boolean.class, catalogName);
		
		System.out.println("response from catalog service = " + isCatalogPresent);
		return isCatalogPresent;

	}

	public String makePayment(String paymentMode) {
		String url = "http://localhost:8003/service/payment/{paymentMode}";

		Map<String, String> params = new HashMap<String, String>();
		params.put("paymentMode", paymentMode);

		// create an instance of RestTemplate
		//RestTemplate restTemplate = new RestTemplate();

		// make an HTTP GET request
		String paymentResponseStr = restTemplate.getForObject(url, String.class, params);

		return paymentResponseStr;

	}

}
