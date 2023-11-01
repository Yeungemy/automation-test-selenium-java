package com.ebay.developer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.ebay.developer.constants.TestEnvironmentConstantTest;
import com.ebay.developer.util.Actions;
import com.ebay.developer.util.Util;

public class PlatformStandardSetup {
	Util util = new Util();
	TestEnvironmentConstantTest envConst = new TestEnvironmentConstantTest();

	public WebDriver navigateToHomePage(String webDriverName, Duration waitTime) {
		WebDriver driver = util.getWebDriver(webDriverName);
		Actions action = new Actions(driver, waitTime);

		driver.manage().window().maximize();

		// Deleting all the cookies
		driver.manage().deleteAllCookies();

		// specify pageLoadTimeout and Implicit wait
		driver.manage().timeouts().pageLoadTimeout(waitTime);
		driver.manage().timeouts().implicitlyWait(waitTime);

		// navigate to home page
		action.navigateTo(envConst.getBaseUrl());
		
		return driver;
	}
}
