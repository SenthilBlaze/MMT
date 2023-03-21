package com.day;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Function_String {
	
	public static void main(String[] args) {
		String name= " senthil";
		String name1= "BALA";
		String name2="Yadhvik";
		String name3 ="vishnu";
		String name4="Yuvaraj";
		String name5 ="Senthil";
		String name6="Bala";
		String name7="BALA";
		
		int length = name4.length();
		System.out.println(length);
		
		boolean equals = name.equals(name5);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = name.equalsIgnoreCase(name5);
		System.out.println(equalsIgnoreCase);
		
		String upperCase = name2.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = name1.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = name1.startsWith("b");
		System.out.println(startsWith);
		
        boolean startsWith2 = name1.startsWith("B");
		System.out.println(startsWith2);
		
		boolean endsWith = name3.endsWith("u");
		System.out.println(endsWith);
		
		boolean contains = name4.contains("u");
		System.out.println(contains);
		
		boolean contains2 = name1.contains("B");
		System.out.println(contains2);
		
		int indexOf = name1.indexOf('L');
		System.out.println(indexOf);
		
		char charAt = name.charAt(5);
		System.out.println(charAt);
		
		String replace = name3.replace("vishnu","Marish");
		System.out.println(replace);
		
		String substring = name.substring(3);
		System.out.println(substring);

		String trim = name.trim();
		System.out.println(trim);
		
		String concat = name1.concat(name);
		System.out.println(concat);
		
		System.out.println(name==name1);
		System.out.println(name1==name6);
		System.out.println(name1==name7);
	}

}

