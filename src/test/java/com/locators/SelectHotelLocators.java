package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SelectHotelLocators extends SearchHotelLocators{
	
	public SelectHotelLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id="continue")
	private WebElement continue_button;

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinue_button() {
		return continue_button;
	}
}
