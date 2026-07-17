package com.Taskmangemet.version1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.Taskmangemet.version1", "controller"})
public class Version1Application {

	public static void main(String[] args) {
		SpringApplication.run(Version1Application.class, args);
	}

}
