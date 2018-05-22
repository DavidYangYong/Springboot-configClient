package com.jnc.cloud.configclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class HelloController {

	@Value("${spring.datasource.username}")
	private String profile;

	@GetMapping("/hi")
	public String home() {

		return "hello";
	}

	@GetMapping("/profile")
	public String profile() {

		return this.profile;
	}
}
