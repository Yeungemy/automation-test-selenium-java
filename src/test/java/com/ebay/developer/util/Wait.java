package com.ebay.developer.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class shares some waiting methods to avoid hard wait 
 */
public class Wait {
	private WebDriver driver;
	private Duration waitTime;
	private WebDriverWait wait;
	
	//constructor
	public Wait(WebDriver driver, Duration waitTime) {
		this.driver = driver;
		this.waitTime = waitTime;
		
		this.wait = new WebDriverWait(driver, waitTime);
	}
	
	public void waitUntilInvisible(WebElement ele) {
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public void waitUntilVisible(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOf(ele));		
	}
	
	public void waitUntilTextToBePresented(WebElement ele, String text) {
	    wait.until(ExpectedConditions.textToBePresentInElement(ele, text));
	}
	
	public void waiToBeClickable(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));		
	}
	
	public void waitAndClick(WebElement ele) {
		waiToBeClickable(ele);
		ele.click();
	}
	
	public void waitPageToBeLoadedByUrl(String url) {
		wait.until(ExpectedConditions.urlToBe(url));
	}
}
