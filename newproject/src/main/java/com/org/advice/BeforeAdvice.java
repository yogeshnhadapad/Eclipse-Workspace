package com.org.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAdvice {

	@Before("execution("com.org.aop.",add(..))")
	public void allDaoAddMethods1(JoinPoint joinpoint) {
		System.out.println("Intercepted method: "+ joinpoint);
		System.out.println("Arguments :" + joinpoint.getArgs());
		System.out.println(joinpoint.getTarget());		
	}
	
	public void allDaoAddMethods(JoinPoint jointpoint) {
		System.out.println("Intercepted method: "+ jointpoint);
		System.out.println("Arguments :" + jointpoint.getArgs());
		System.out.println(jointpoint.getTarget());		
	}
	
	
}
