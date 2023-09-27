package com.pageexecution;

import com.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import com.locators.BookHotelLocators;

public class BookHotelExe extends SelectHotelExe {
	
	public static void fname() {
		BaseClass.send_keys(new BookHotelLocators().getFirst_name(),(String) readAllValues(1,6));
	}
	public static void lname() {
		BaseClass.send_keys(new BookHotelLocators().getLast_name(),(String) readAllValues(1,7));
	}
	public static void address() {
		BaseClass.send_keys(new BookHotelLocators().getAddress(),(String) readAllValues(1,8));
	}
	public static void ccno() {
		BaseClass.send_keys(new BookHotelLocators().getCc_num(),(String) readAllValues(1,9));
	}
	public static void cctype() {
		WebElement s1 = new BookHotelLocators().getCc_type();
		BaseClass.dropDownoptions(s1).selectByVisibleText((String) readAllValues(1,10));
	}
	public static void ccmonth() {
		WebElement s2 = new BookHotelLocators().getCc_exp_month();
		BaseClass.dropDownoptions(s2).selectByVisibleText((String) readAllValues(1,11));
	}
	public static void ccyear() {
		WebElement s3 = new BookHotelLocators().getCc_exp_year();
		BaseClass.dropDownoptions(s3).selectByVisibleText((String) readAllValues(1,12));
	}
	public static void cvv() {
		BaseClass.send_keys(new BookHotelLocators().getCc_cvv(),(String) readAllValues(1,13));
		BaseClass.waits(120);
	}
		public static void booking() {
		BaseClass.clickbutton(new BookHotelLocators().getBook_now());
		BaseClass.waits(120);
	}
	
	public static void orderID() {
		BaseClass.waits(5000);
		String orderno = BaseClass.getAttribute(new BookHotelLocators().getOrder_no());
		BaseClass.orderNumber(orderno,1, 0);
		System.out.println(orderno);
	}
}