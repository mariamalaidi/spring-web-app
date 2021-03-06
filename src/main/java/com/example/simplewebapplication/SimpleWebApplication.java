package com.example.simplewebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "moon")String name){
		return String.format("Hello %s!",name);
	}
	@GetMapping("/test")
	public String hey(@RequestParam(value = "age", defaultValue = "19")String age){
		return String.format("Hello %s!",age);
	}

}
