package com.grenergy.order.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class ApplicationProperties implements Serializable {

	private static final long serialVersionUID = 1L;

	/*@Value("${opentracing.jaeger.udp-sender.port}")
	private String senderPort;
	
	public String getSenderPort() {
		return senderPort;
	}

	public void setSenderPort(String senderPort) {
		this.senderPort = senderPort;
	}*/
	
	
	

}