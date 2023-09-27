package com.pageexecution;

import org.openqa.selenium.WebElement;
import com.baseclass.BaseClass;
import com.locators.LoginPageLocators;
import com.locators.SearchHotelLocators;

public class SearchHotelExe extends LoginPageExe{
	
	public static void location() {
		WebElement s1 = new SearchHotelLocators().getLocation();
		BaseClass.dropDownoptions(s1).selectByVisibleText((String) readAllValues(1,0));
	}
	public static void hotel() {
		WebElement s1 = new SearchHotelLocators().getHotels();
		BaseClass.dropDownoptions(s1).selectByVisibleText((String) readAllValues(1,1));
	}
	public static void room_type() {
		WebElement s1 = new SearchHotelLocators().getRoom_type();
		BaseClass.dropDownoptions(s1).selectByVisibleText((String) readAllValues(1,2));
	}
	public static void room_nos() {
		WebElement s1 = new SearchHotelLocators().getRoom_nos();
		BaseClass.dropDownoptions(s1).selectByVisibleText((String) readAllValues(1,3));
	}
	public static void adult_room() {
		WebElement s1 = new SearchHotelLocators().getAdult_room();
		BaseClass.dropDownoptions(s1).selectByVisibleText((String) readAllValues(1,4));
	}
	public static void child_room() {
		WebElement s1 = new SearchHotelLocators().getChild_room();
		BaseClass.dropDownoptions(s1).selectByVisibleText((String) readAllValues(1,5));
	}
	public static void submit() {
		BaseClass.clickbutton(new SearchHotelLocators().getSubmit());
	}

}
