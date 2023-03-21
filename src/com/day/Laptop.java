package com.day;

public class Laptop {
	
	public Laptop() {
    System.out.println("dell store");
	}
	
	public Laptop(String brand_Name) {
	    System.out.println("brand Name:"+brand_Name);
		}
	public Laptop(int price) {
	    System.out.println("price:"+price);
		}
	public Laptop(long mobile_Number) {
	    System.out.println("mobile number:"+mobile_Number);
		}

	
public static void main(String[] args) {
Laptop details = new Laptop();
Laptop details1 = new Laptop("delli5");
Laptop details2 = new Laptop("50000");
	Laptop details3 = new Laptop("987654321l");
}


}
