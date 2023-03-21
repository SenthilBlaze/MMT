package com.day;

public class Arrays {
public static void main(String[] args) {
	//datatype vari[]=new datatype[length];
	
	int marks []=new int[10];
	marks[0]=10;
	marks[1]=19;
	marks[2]=23;
	marks[3]=49;
	marks[4]=62;
	marks[5]=100;
	marks[6]=120;
	marks[7]=25;
	marks[8]=44;
	marks[9]=01;
	
	System.out.println(marks[2]);
	System.out.println("=========================");
	System.out.println(marks.length);
	System.out.println("==========================");
	for(int i =0;i<marks.length;i++) {
		System.out.println(marks[i]);
	}
	System.out.println("===========================");
	System.out.println(java.util.Arrays.toString(marks));
	}
}
	
	
	

