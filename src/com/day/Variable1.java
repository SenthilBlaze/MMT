package com.day;
// class variable method
public class Variable1 {
	
	int age=15; // initialization
	int age1=50; //initialization
	boolean age2; // declaration
	float age3;   // declaration
	short age4;
	long age5= 29;
				
	private void limit() {
		System.out.println(age);
        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);
        System.out.println(age4);
        System.out.println(age5);
	}
public static void main(String[] args) {
	
	Variable1 ref = new Variable1();
	ref.limit();
		
}
	
	
}
