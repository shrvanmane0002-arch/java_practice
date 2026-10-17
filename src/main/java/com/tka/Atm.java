package com.tka;

import org.springframework.stereotype.Component;

@Component
public class Atm {
	
	private double balance = 10000;
	
	public void deposite(double amount) {

		balance = balance + amount ;
		System.out.println("deposite amount " + amount );
		System.out.println("balance "+ balance );
	}

	public void withdraw(double amount ) {
		
		if(amount <= balance && amount > 0) {
			balance = balance - amount ;
			System.out.println("withdrawn Amount "+ amount );
			System.out.println("balance " + balance );
			
		}else{
			System.out.println("insufficient balance ");
		
	}
}
}