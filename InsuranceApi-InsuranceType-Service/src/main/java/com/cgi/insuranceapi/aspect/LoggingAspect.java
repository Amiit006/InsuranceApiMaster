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
	
	
	@Before("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.getAllInsuranceType(..))")
	public void logBeforegetAllInsuranceType(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.getAllInsuranceType(..))")
	public void logAftergetAllInsuranceType(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.getInsuranceTypeById(..))")
	public void logBeforegetInsuranceTypeById(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.getInsuranceTypeById(..))")
	public void logAftergetInsuranceTypeById(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.getInsuranceTypeByName(..))")
	public void logBeforegetInsuranceTypeByName(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.getInsuranceTypeByName(..))")
	public void logAftergetInsuranceTypeByName(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.saveInsuranceType(..))")
	public void logBeforesaveInsuranceType(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.saveInsuranceType(..))")
	public void logAftersaveInsuranceType(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.updateInsuranceType(..))")
	public void logBeforeupdateInsuranceType(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.updateInsuranceType(..))")
	public void logAfterupdateInsuranceType(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.deleteInsuranceType(..))")
	public void logBeforedeleteInsuranceType(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
	
	@After("execution(* com.cgi.insuranceapi.controller.InsuranceTypeController.deleteInsuranceType(..))")
	public void logAfterdeleteInsuranceType(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}
}
