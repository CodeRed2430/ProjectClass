package com.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class PracticeForm extends BaseClass{
	
	public static void Browser() throws AWTException, InterruptedException {
		selectingBrowser("edge");
		launching("https://demoqa.com/automation-practice-form");
		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}
	
	public static void Form()throws Exception {
		BaseClass.findElementbyId("firstName").sendKeys("Karthikeyan");
		BaseClass.findElementbyId("lastName").sendKeys("Murugan");
		BaseClass.findElementbyId("userEmail").sendKeys("sample123@gmail.com");
		BaseClass.findElementbyXpath("//input[@id='gender-radio-1']//..//label").click();
		BaseClass.findElementbyId("userNumber").sendKeys("1234567890");
		BaseClass.findElementbyId("dateOfBirthInput").click();
		Thread.sleep(100);
		WebElement month = BaseClass.findElementbyXpath("//select[@class='react-datepicker__month-select']");
		BaseClass.dropDownoptions(month).selectByValue("10");
		WebElement year = BaseClass.findElementbyXpath("//select[@class='react-datepicker__year-select']");
		BaseClass.dropDownoptions(year).selectByValue("1998");
		BaseClass.findElementbyXpath("//div[@class='react-datepicker__day react-datepicker__day--024']").click();
		WebElement subject = BaseClass.findElementbyId("subjectsInput");
		subject.sendKeys("Maths");
		subject.sendKeys(Keys.ARROW_DOWN);
		subject.sendKeys(Keys.ENTER);
		BaseClass.findElementbyXpath("//input[@id='hobbies-checkbox-1']//..//label").click();
		BaseClass.findElementbyXpath("//input[@id='hobbies-checkbox-2']//..//label").click();
		BaseClass.findElementbyXpath("//input[@id='hobbies-checkbox-3']//..//label").click();
		BaseClass.findElementbyId("currentAddress").sendKeys("123 Test Street");
		WebElement state = BaseClass.findElementbyId("react-select-3-input");
		state.sendKeys("NCR");
		state.sendKeys(Keys.ARROW_DOWN);
		state.sendKeys(Keys.ENTER);
		WebElement city = BaseClass.findElementbyId("react-select-4-input");
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ARROW_DOWN);
		city.sendKeys(Keys.ENTER);
		BaseClass.findElementbyXpath("//button[@id='submit']").sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		BaseClass.findElementbyXpath("//button[@id='closeLargeModal']").sendKeys(Keys.ENTER);
		}

	public static void main(String[] args) throws Exception {
		Browser();
		Form();
	}

}
