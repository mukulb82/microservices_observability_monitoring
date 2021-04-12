package com.grenergy.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/payment")
public class PaymentController {
	
	@Autowired
	PaymentService service;
	
	
	@GetMapping(value = "{paymentMode}")
	public String makeCatalog(@PathVariable("paymentMode") String paymentMode){
		
		String response = service.makePayment(paymentMode);
		
		
		return response;
		
	}
	
	

}
