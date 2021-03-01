package com.sau.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@After("allGetters()")
	public void AfterAdvice() {
		System.out.println("Advice After being called ");
	}

	@AfterReturning("args(name)")
	public void stringArgument(String name) {
		System.out.println("Advice After returning and new value is " + name);
	}

	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void throwingException(String name, Exception ex) {
		System.out.println("Advice After throwing new exception and exception thrown is " + ex.toString());
	}

	@Around("args(String)")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnvalue = null;
		System.out.println("Advice Around being called");
		try {
			returnvalue = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
		}
		return returnvalue;
	}

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	@Pointcut("within(com.sau.model.Circle)")
	public void allApple() {
	}
}
