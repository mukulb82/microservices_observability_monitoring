package com.grenergy.payment.controller;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
	
	
	public String makePayment(String paymentMode) {
		
		
		
		if(paymentMode.equals("online")) { 
			
			return paymentMode;	
		}
		
		else {
			return "offline";
		}
		
	}

	

}
