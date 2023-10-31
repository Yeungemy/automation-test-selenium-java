package com.ebay.developer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ebay.developer.constants.TestEnvironmentConstantTest;
import com.ebay.developer.util.Actions;
import com.ebay.developer.util.Util;

public class Setup {
	Util util = new Util();

	public Setup(String webDriverName, Duration waitTime) {	
		WebDriver driver = util.getWebDriver(webDriverName);
		
		driver.manage().window().maximize();

		//Deleting all the cookies
		driver.manage().deleteAllCookies();

		//specify pageLoadTimeout and Implicit wait
		driver.manage().timeouts().pageLoadTimeout(waitTime);
		driver.manage().timeouts().implicitlyWait(waitTime);
	}
}
