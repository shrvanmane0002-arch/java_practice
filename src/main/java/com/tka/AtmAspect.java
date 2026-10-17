package com.tka;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AtmAspect {
	
	@Before("execution(* com.tka.Atm.deposit*(..))")

	public void deposite() {

		System.out.println("deposite transaction started");

	}
	
	@After("execution(* com.tka.Atm.deposite*(..))")
	
	public void afterdeposite() {
		
		System.out.println("deposite transaction finished");
	}
	
	@Around("execution (* com.tka.Atm.withdrawal*(..))")
	public Object withdrawal(ProceedingJoinPoint pjp) throws Throwable{

		System.out.println("WITHDRAWAL STARTED ");
		
		Object result = pjp.proceed();
		
		System.out.println("WITHDRAWAL FINISHED");
		
		return result;
		
		
	}

}
