package com.grenergy.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grenergy.order.service.ApplicationProperties;
import com.grenergy.order.service.OrderHandlingException;
import com.grenergy.order.service.OrderService;

@RestController
@RequestMapping("/service/order")
public class OrderController {

	@Autowired
	OrderService service;
	
	@Value("${opentracing.jaeger.udp-sender.host}")
    private static String host;
	
	@Autowired
	private ApplicationProperties applicationProperties;
	
	@GetMapping(value = "{orderName}")
	public String createOrder(@PathVariable("orderName") String orderName) throws Exception {
		
		
	//	System.out.println("property == " +  applicationProperties.getSenderPort());
		
		if (orderName.matches("[0-9]+")) {
			throw new OrderHandlingException("401, Bad request, request param can't contain numbers");
		}

		boolean catalogServiceResponse = service.createOrder(orderName);
		


		String paymentStatus = "paymentFailed";
		if (catalogServiceResponse) {
			// proceed for payment
			String paymentMode = "online";
			paymentStatus = service.makePayment(paymentMode);
		}
		
		else {
			
			throw new OrderHandlingException("Order could not be placed");
		}

		return paymentStatus;

	}

}
