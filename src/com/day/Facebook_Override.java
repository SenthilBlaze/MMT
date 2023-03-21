package com.day;

public class Facebook_Override extends Login{
	@Override
	public void mailid() {
		super.mailid();
	}
	
	@Override
	public void pass(String pass) {
		super.pass("1234");
		System.out.println("new password:"+ pass);
	}
	
	public static void main(String[] args) {
		
		Facebook_Override ans=new Facebook_Override();
		ans.mailid();
		ans.pass("@1019");
		
	}
	
	
	
	
	
	
	
	

}
