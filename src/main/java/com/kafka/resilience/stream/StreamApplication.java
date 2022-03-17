package com.kafka.resilience.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class StreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamApplication.class, args);
	}

}