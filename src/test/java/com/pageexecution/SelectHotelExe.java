package com.pageexecution;

import com.baseclass.BaseClass;
import com.locators.SelectHotelLocators;

public class SelectHotelExe extends SearchHotelExe {

	public static void radiobutton() {
		BaseClass.clickbutton(new SelectHotelLocators().getRadiobutton_0());
	}
	public static void continue_button() {
		BaseClass.clickbutton(new SelectHotelLocators().getContinue_button());
	}
}
