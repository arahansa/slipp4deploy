package com.example.arahansa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@SpringBootApplication
public class ArahansaApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext run = SpringApplication.run(ArahansaApplication.class, args);
		log.info("app here : {}", run);
		System.out.println("=== hello world === ");
	}

	@Controller
	static class IndexController{
		@GetMapping("/")
		public String index(){
			return "index";
		}
	}
}
