package com.grenergy.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.uber.jaeger.Configuration;
import com.uber.jaeger.samplers.ProbabilisticSampler;

@SuppressWarnings("deprecation")
@SpringBootApplication
public class OrderApplication {

	@SuppressWarnings("deprecation")
	@Bean
	public io.opentracing.Tracer jaegerTracer() {
	    return new Configuration("spring-boot-order", new Configuration.SamplerConfiguration(ProbabilisticSampler.TYPE, 1),
	        new Configuration.ReporterConfiguration())
	        .getTracer();
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

}
