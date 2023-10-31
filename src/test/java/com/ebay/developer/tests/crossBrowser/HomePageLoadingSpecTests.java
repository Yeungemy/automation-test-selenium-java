package com.ebay.developer.tests.crossBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageLoadingSpecTests {

	public static void main(String[] args) {
		final Duration WAIT_TIME = Duration.ofSeconds(4, -999_999_999);
		
		
		// this will save a few seconds for download remotely every time
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// close the current tab
		driver.close();
		
		// close all tabs related to the test project
		driver.quit();
	}
}
