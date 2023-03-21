package com.day;

import java.util.HashSet;
import java.util.Set;

public class Methods_Set {
	public static void main(String[] args) {
		
		Set<Object>det = new HashSet<Object>();
		
		det.add(10.5);
		det.add(null);
		det.add(101);
		det.add(1234);
		System.out.println(det);
			
		for (Object object : det) {
			
			System.out.println(object);
		}
		
	System.out.println("=======================");
		int size = det.size();
		System.out.println(size);
		
		Object[] array = det.toArray();
		System.out.println(array[1]);
		
		det.remove(10.5);
		System.out.println(det);
		
		Object[] array2 = det.toArray();
		System.out.println(array2[0]);
	}
}
