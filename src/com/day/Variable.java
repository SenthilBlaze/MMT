package com.day;
// local variable method
public class Variable {
	private void limit() { // method

		int age =20; // initialization
		int age1=10; // declaration
		System.out.println(age);
		System.out.println(age1);
	}
	
	public static void main(String[] args) {
		
		Variable ref=new Variable();
		ref.limit();
		
		
	}
	

}
