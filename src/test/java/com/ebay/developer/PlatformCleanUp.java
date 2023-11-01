package com.ebay.developer;

import org.openqa.selenium.WebDriver;

public class PlatformCleanUp {
	public void platformCleanUp(WebDriver driver) {
		// Deleting all the cookies
		driver.manage().deleteAllCookies();
		
		// close the current tab
		driver.close();

		// close all tabs related to the test project
		driver.quit();
	}
}
