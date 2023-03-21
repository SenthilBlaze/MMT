package com.day;

public class Datas_Override implements Login_Account,Login_Number{

	@Override
	public void phone_Number() {
    System.out.println("9876543210");		
	}

	@Override
	public void otp() {
    System.out.println("1234");
	}

	@Override
	public void facebook_Id() {
    System.out.println("senthil@gmail.com");		
	}

	@Override
	public void password() {
    System.out.println("ssk");		
	}

	@Override
	public void app() {
    System.out.println("facebook");		
	}
	
	public static void main(String[] args) {
		
		Datas_Override login = new Datas_Override();
		login.phone_Number();
		login.otp();
		login.facebook_Id();
		login.password();
		login.app();	
	}
	
	

}
