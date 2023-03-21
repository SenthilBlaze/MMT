package com.day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Methods_List1 {
	public static void main(String[] args) {
		
		List<Object>det = new ArrayList<Object>();
		
		det.add("laptop");
		det.add('B');
		det.add(12.5);
	
		List<Object>det1 = new LinkedList<Object>();
		
		det1.add("mobile");
		det1.add('S');
		det1.add(12.5);
				
		det1.addAll(det);
		System.out.println(det1);
		
		System.out.println("=======================================");
		
		det1.removeAll(det);
		System.out.println(det1);
		
		System.out.println("=======================================");
		
		for (Object object : det1) {
			System.out.println(object);
		}
				
	}
	
	

}
																															