package com.day;
//method overloading

public class Collage {
	private void collage_Details() {
System.out.println("srmuniversity");	
	}
	
	private void collage_Details(String name) {
System.out.println(name);	
	}
	
	private void collage_Details(String address,long number) {
System.out.println(address);	
System.out.println(number);
	}
	
	private void collage_Details(long alternumber,String id) {
System.out.println(alternumber);
System.out.println(id);
	}
	
	private void collage_Details(byte idno) {
System.out.println(idno);	
	}
	
	public static void main(String[] args) {
		
	Collage details= new Collage();
	details.collage_Details();
	details.collage_Details("bala");
	details.collage_Details("madurai",9876543210l);
	details.collage_Details(9600555428l,"srm123@gmail.com");
	details.collage_Details((byte)119);
	
	}
	
	
}
