package com.idothestamping.lab11.songr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SongrApplication {

	public static void main(String[] args) {

		SpringApplication.run(SongrApplication.class, args);
		System.out.println("http://localhost:8080/album");
	}

}
