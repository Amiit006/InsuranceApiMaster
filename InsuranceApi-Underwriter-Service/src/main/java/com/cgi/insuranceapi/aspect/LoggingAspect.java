package com.cgi.insuranceapi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(* com.cgi.insuranceapi.controller.UnderwriterController.getAllUnderwritter(..))")
	public void beforeLoggetAllUnderwritter(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.UnderwriterController.getAllUnderwritter(..))")
	public void afterLoggetAllUnderwritter(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.cgi.insuranceapi.controller.UnderwriterController.getUnderwriterById(..))")
	public void beforeLoggetUnderwriterById(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.UnderwriterController.getUnderwriterById(..))")
	public void afterLoggetUnderwriterById(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.cgi.insuranceapi.controller.UnderwriterController.getUnderwriterByName(..))")
	public void beforeLoggetUnderwriterByName(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.UnderwriterController.getUnderwriterByName(..))")
	public void afterLoggetUnderwriterByName(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.cgi.insuranceapi.controller.UnderwriterController.saveUnderwriter(..))")
	public void beforeLogsaveUnderwriter(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.UnderwriterController.saveUnderwriter(..))")
	public void afterLogsaveUnderwriter(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.cgi.insuranceapi.controller.UnderwriterController.updateUnderwriter(..))")
	public void beforeLogupdateUnderwriter(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.UnderwriterController.updateUnderwriter(..))")
	public void afterLogupdateUnderwriter(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.cgi.insuranceapi.controller.UnderwriterController.deleteUnderwriter(..))")
	public void beforeLogdeleteUnderwriter(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.UnderwriterController.deleteUnderwriter(..))")
	public void afterLogdeleteUnderwriter(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
}
