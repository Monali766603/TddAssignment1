package com.emp.aspects;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class LoggingAspects {
	Logger LOGGER;

	@Pointcut(value = "@within(org.springframework.stereotype.Controller)")
	public void EmployeeControllerPointcut() {
	}

	@Pointcut(value = "@within(org.springframework.stereotype.Service)")
	public void EmployeeImplPointcut() {
	}

	@Before("EmployeeControllerPointcut() || EmployeeImplPointcut()")
	public void logBefore(JoinPoint joinPoint) {
		LOGGER = Logger.getLogger(joinPoint.getSignature().getDeclaringTypeName());
		LOGGER.log(Level.INFO, "Before : " + joinPoint.getSignature().getName());
	}

	@AfterReturning("EmployeeControllerPointcut() || EmployeeImplPointcut()")
	public void logAfterReturning(JoinPoint joinPoint) {
		LOGGER = Logger.getLogger(joinPoint.getSignature().getDeclaringTypeName());
		LOGGER.log(Level.INFO, "Returning from : " + joinPoint.getSignature().getName());
	}

	@AfterThrowing("EmployeeControllerPointcut() || EmployeeImplPointcut()")
	public void logAfterThrowing(JoinPoint joinPoint) {
		LOGGER = Logger.getLogger(joinPoint.getSignature().getDeclaringTypeName());
		LOGGER.log(Level.INFO, "Throwing Exception from : " + joinPoint.getSignature().getName());
	}

	@After("EmployeeControllerPointcut() || EmployeeImplPointcut()")
	public void logAfter(JoinPoint joinPoint) {
		LOGGER = Logger.getLogger(joinPoint.getSignature().getDeclaringTypeName());
		LOGGER.log(Level.INFO, "After : " + joinPoint.getSignature().getName());
	
	}
}






