package com.day;

import java.util.Scanner;

public class Condition_Statement1 {

	private void limit() {
		Scanner ref = new Scanner(System.in);
		int age = ref.nextInt();
		if(age>21) {
			System.out.println("eligible for driving");
		}
		else {
			System.out.println("not eligible for driving");	
		}
	}
	
public static void main(String[] args) {
	Condition_Statement1 ref1=new Condition_Statement1();
	System.out.println("enter the age");
	ref1.limit();
	System.out.println();
	
	Condition_Statement1 ref2=new Condition_Statement1();
	System.out.println("enter the age");
	ref2.limit();
	
}
	
	
}
