package com.spring.basics.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { 
		"com.spring.basics.dao.impl",
		"com.spring.basics.console",
		"com.spring.basics.service.impl",
		"com.spring.basics.aspect"})
public class ApplicationConfig {

}
