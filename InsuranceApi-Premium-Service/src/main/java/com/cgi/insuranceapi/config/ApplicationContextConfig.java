package com.cgi.insuranceapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.cgi.insuranceapi.aspect.LoggingAspect;

@Configuration
@ComponentScan("com.cgi.insuranceapi")
@EnableAspectJAutoProxy
public class ApplicationContextConfig {

	@Autowired
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();	
	}
	
}
