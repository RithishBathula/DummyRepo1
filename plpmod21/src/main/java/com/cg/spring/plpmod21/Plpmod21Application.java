package com.cg.spring.plpmod21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring.plpmod21")
public class Plpmod21Application {

	public static void main(String[] args) {
		SpringApplication.run(Plpmod21Application.class, args);
	}
}
