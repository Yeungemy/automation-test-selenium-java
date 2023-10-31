package com.ebay.developer.tests.crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageLoadingSpecTests {

	public static void main(String[] args) {
		final String BASE_URL = "https://rahulshettyacademy.com/";
		final String HOMT_TITLE = "Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy";
		
		// this will save a few seconds for download remotely every time
		System.setProperty("webdriver.chrome.driver", "/home/emy/eclipse-workspace/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(BASE_URL);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// close the current tab
		driver.close();
		
		// close all tabs related to the test project
		driver.quit();
	}
}
