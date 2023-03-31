package com.saurabh.practisespringconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PractiseSpringConfigApplication {
	@Autowired
	static Bike bike;

	public static void main(String[] args) {
		SpringApplication.run(PractiseSpringConfigApplication.class, args);
		bike.run();

	}

}
