package com.tka;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
	
	Atm atm = context.getBean(Atm.class);
	
	atm.deposite(20000);
	
	System.out.println("____________________");
	
	atm.withdraw(3000);
	
	context.close();
	

	}

}
