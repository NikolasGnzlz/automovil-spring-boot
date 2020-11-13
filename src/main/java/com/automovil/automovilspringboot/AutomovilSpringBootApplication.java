package com.automovil.automovilspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
public class AutomovilSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomovilSpringBootApplication.class, args);
	}

}
