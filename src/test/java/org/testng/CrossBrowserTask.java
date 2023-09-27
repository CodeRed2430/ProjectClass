package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

public class CrossBrowserTask {
	
	public WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void browser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get("https://www.google.com/");
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.get("https://www.google.com/");
		} else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
		}else {
		System.out.println("Browser not available!");
		driver.get("https://www.google.com/");
	}
		
}
}