package com.cg.spring.plpmod21mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring.plpmod21mvc")
public class Plpmod21mvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Plpmod21mvcApplication.class, args);
	}
}
