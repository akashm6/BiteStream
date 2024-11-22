package com.BiteStream.BiteStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BiteStreamApplication {

	public static void main(String[] args) {

		UserProfile profile = new UserProfile();

		profile.setBio("hello everyone this is my bio");
		System.out.println(profile.getBio());

		SpringApplication.run(BiteStreamApplication.class, args);
	}

}
