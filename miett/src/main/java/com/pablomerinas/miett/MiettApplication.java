package com.pablomerinas.miett;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiettApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiettApplication.class, args);
		System.err.println("INICIALIZADO");
	}

}
