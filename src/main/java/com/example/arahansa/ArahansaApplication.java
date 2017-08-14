package com.example.arahansa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ArahansaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArahansaApplication.class, args);
	}

	@Controller
	static class IndexController{
		@GetMapping("/")
		public String index(){
			return "index";
		}
	}
}
