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
public class Waits {
	private WebDriver driver;
	private Duration waitTime;
	private WebDriverWait wait;
	
	//constructor
	public Waits(WebDriver driver, Duration waitTime) {
		this.driver = driver;
		this.waitTime = waitTime;
		
		this.wait = new WebDriverWait(driver, waitTime);
	}
	
	public void untilElementInvisible(WebElement ele) {
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public void untilElementToBeVisible(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOf(ele));		
	}
	
	public void untilTextToBePresented(WebElement ele, String text) {
	    wait.until(ExpectedConditions.textToBePresentInElement(ele, text));
	}
	
	public void untilButtonToBeClickable(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));		
	}
	
	public void clickButton(WebElement ele) {
		untilButtonToBeClickable(ele);
		ele.click();
	}
	
	public void untilPageUrlToBePresented(String url) {
		wait.until(ExpectedConditions.urlToBe(url));
	}
}
