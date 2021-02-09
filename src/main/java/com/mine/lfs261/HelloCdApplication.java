package com.mine.lfs261;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class HelloCdApplication {

	@RequestMapping("/")
	String home() {
		return "Hello to Continuous Integration Course!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloCdApplication.class, args);
	}

}
