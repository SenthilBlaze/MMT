package com.day;

import java.util.Scanner;

public class Condition_Statement2 {

	private void limit() {
Scanner ref= new Scanner(System.in);
int age = ref.nextInt();

if(age>=45) {
System.out.println("senior");
	}

else if(age<=15 || age>=21) {
	System.out.println("children");
}
else {
	System.out.println("adult");
}
}
public static void main(String[] args) {
	Condition_Statement2 ref1= new Condition_Statement2();
	System.out.println("enter the age");
	ref1.limit();
	
}
	
	
}