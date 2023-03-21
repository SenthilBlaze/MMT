
package com.day;

public class Atm_Details extends Atm{

	@Override
	public void enter_Pin() {
System.out.println("0123");		
	}

	@Override
	public void enter_Amount() {
System.out.println("2500");		
	}
	
	public static void main(String[] args) {
		Atm_Details atm= new Atm_Details();
		atm.enter_Pin();
		atm.enter_Amount();
		atm.bank_Name();
		
	}
	
	
	}
