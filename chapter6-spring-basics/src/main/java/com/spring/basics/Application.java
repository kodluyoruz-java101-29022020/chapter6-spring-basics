package com.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.basics.annotion.MethodRunningTime;


@SpringBootApplication
public class Application {

	@MethodRunningTime(active = false)
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
