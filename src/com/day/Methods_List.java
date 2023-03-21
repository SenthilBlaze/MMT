package com.day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Methods_List {
	public static void main(String[] args) {
		
		List<Object>det = new LinkedList<Object>();
		
		det.add("laptop");
		det.add(1234);
		det.add('B');
		det.add(7.8);
		det.add('s');
			
	
		System.out.println(det);
		
		System.out.println(det.size());
		
		Object object = det.get(3);
	    System.out.println(object);

		det.set(0,"mobile");
		System.out.println(det);
		det.set(2,'S');
		System.out.println(det);
		
		det.remove(4);
		System.out.println(det);
		
		int indexOf = det.indexOf("mobile");
		System.out.println(indexOf);
		int indexOf2 = det.indexOf('S');
		System.out.println(indexOf2);
		
		boolean contains = det.contains(7.5);
		System.out.println(contains);
		boolean contains2 = det.contains(7.8);
		System.out.println(contains2);
		
		System.out.println("=============================");
		
	for(int i=0;i<det.size();i++) {
		System.out.println(det.get(i));		
	}
	System.out.println("===================");
    for (Object object2 : det) {
		System.out.println(object2);
    	
	}
	
	}	

}
