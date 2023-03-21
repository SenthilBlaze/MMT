package com.day;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Functions {
	public static void main(String[] args) {
		
		Map<Integer,String>det = new HashMap<Integer,String>(); // syntax
		
		det.put(1, "bala");
		det.put(2,"senthil");
		det.put(3,"yadhu");
		det.put(4,"pranav");
		
		System.out.println(det);
		//size
		int size = det.size();
		System.out.println(size);
		//get
		String string = det.get(2);
		System.out.println(string);
		//keyset
		Set<Integer> keySet = det.keySet();
		System.out.println(keySet);
		//values
		Collection<String> values = det.values();
		System.out.println(values);
		//containskey
		boolean containsKey = det.containsKey(3);
		System.out.println(containsKey);
		
		boolean containsKey2 = det.containsKey(5);
		System.out.println(containsKey2);
		
		//containsvalue
		boolean containsValue = det.containsValue("bala");
		System.out.println(containsValue);
		
		//entryset
		Set<Entry<Integer,String>> entrySet = det.entrySet();
		System.out.println(entrySet);
		
		String put = det.put(4
				,string);
		System.out.println(put);
		
		
	}

}
