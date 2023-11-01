package com.ebay.developer.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

/**
 * This class shares some common action methods
 */
public class Actions {
	private WebDriver driver;
	private Duration waitTime;
	private Waits wait;
	
	
	public Actions(WebDriver driver, Duration waitTime) {
		this.driver = driver;
		this.waitTime = waitTime;
		
		wait = new Waits(driver, waitTime);				
	}
	
	public void navigateTo(String url) {
		this.driver.get(url);
		wait.untilPageUrlToBePresented(url);
	}
}
