package com.pageexecution;

import com.baseclass.BaseClass;
import com.locators.BookHotelLocators;
import com.locators.LoginPageLocators;

public class LoginPageExe extends BookHotelLocators {
	
	public static void username() {
		BaseClass.send_keys(new LoginPageLocators().getUsername(),(String) passCode(1,0));
	}
	
	public static void password() {
		BaseClass.send_keys(new LoginPageLocators().getPassword(),(String) passCode(1,1));
	}
	
	public static void login() {
		BaseClass.clickbutton(new LoginPageLocators().getLogin());
	}

}
