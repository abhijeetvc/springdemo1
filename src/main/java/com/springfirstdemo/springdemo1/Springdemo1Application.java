package com.springfirstdemo.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController   //@Controller and @ResponseBody
//@Controller
@SpringBootApplication
public class Springdemo1Application {

	public static void main(String[] args) {

		SpringApplication.run(Springdemo1Application.class, args);
	}

	//@ResponseBody
	@GetMapping(value="/check1")
	public String getData(){
		return "Hello Spring";
	}

	//@ResponseBody
	@GetMapping(value="/check2")
	public String getData1(){
		return "Hello Spring Demo";

	}
}
