package com.cgi.insuranceapi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {

	
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution (* com.cgi.insuranceapi.controller.getAllPremium(..))")
	public void logBeforeGetAllPremium(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
}
