package com.uca.capas.Tarea4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages=("com.uca.capas.controller"))
@ComponentScan(basePackages=("com.uca.capas..domain"))
public class Tarea4Application {

	public static void main(String[] args) {
		SpringApplication.run(Tarea4Application.class, args);
	}

}
