package com.cgi.insuranceapi.aspectlogging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {

	public static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
		
	
	/*@Before("execution(* com.cgi.insuranceapi.controller.PolicyController.getAllPolicy(..)")
	public void logBeforeThis(JoinPoint joinPoint) {
		
	}*/
	
	@Before("execution(* com.cgi.insuranceapi.controller.PolicyController.getAllPolicy(..))")
	public void logBeforeGetAllClaims(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}
}
