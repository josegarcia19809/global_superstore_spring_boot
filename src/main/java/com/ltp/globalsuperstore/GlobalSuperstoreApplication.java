package com.ltp.globalsuperstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GlobalSuperstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalSuperstoreApplication.class, args);
		System.out.println("Servidor ejecutándose en el puerto 8080...");
	}

}
