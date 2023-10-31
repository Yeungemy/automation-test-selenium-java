package com.ebay.developer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageTest {
	private WebDriver driver;
	
	// page url
	private static String PAGE_URL = "https://developer.ebay.com/";
	
	// locators
	// nav bar
	@FindBy(className = "app-header")
	WebElement navBar;
	
	@FindBy(css = "[href='/search']")
	WebElement searchIcon;
	
	// constructor
	public HomePageTest (WebDriver driver) {
		this.driver = driver;
		
		// navigate to home page
		driver.get(PAGE_URL);
		
		// initialize elements
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToProgramSearchPage() {
		searchIcon.click();
	}
}
