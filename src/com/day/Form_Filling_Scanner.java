package com.day;

import java.util.Scanner;

public class Form_Filling_Scanner {
	public static void main(String[] args) {
		Scanner details = new Scanner (System.in);
		
		System.out.println("enter the fulllname");
		String name = details.nextLine();
		System.out.println("name:"+name);
		System.out.println();
	    System.out.println("enter the cgpa");
	    float cgpa = details.nextFloat();
	    System.out.println("cgpa:"+cgpa);
		System.out.println();
		System.out.println("enter register number");
		int number = details.nextInt();
		System.out.println("number:"+number);
		System.out.println();
		System.out.println("enter mobile number");
		long number1 = details.nextLong();
		System.out.println("number1:"+number1);
		System.out.println();
		System.out.println("enter the first name");
		String name1=details.next();
		System.out.println("name1:"+name1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
