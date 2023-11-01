package com.ebay.developer.e2e.crossBrowser;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ebay.developer.PlatformCleanUp;
import com.ebay.developer.PlatformStandardSetup;
import com.ebay.developer.constants.TestEnvironmentConstantTest;

public class HomePageLoadingE2eTests {
	//define wait time duration
	final Duration WAIT_TIME = Duration.ofSeconds(4, -999_999_999);
	WebDriver driver;
	
	static TestEnvironmentConstantTest envConst = new TestEnvironmentConstantTest();
	final static String WEB_DRIVER_NAME = envConst.getChromeWebDriverName();
	PlatformStandardSetup platformStandardSetup = new PlatformStandardSetup();
	PlatformCleanUp platformCleanUp = new PlatformCleanUp();
	
	@Before
	public void setup() throws Exception{
		driver = platformStandardSetup.navigateToHomePage(WEB_DRIVER_NAME, WAIT_TIME);
	}
	
	@Test
	public void shouldLoadHomePageOnChromeBrowser() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	
	
	@After
	public void teardown() throws Exception{
		platformCleanUp.platformCleanUp(driver);
	}
}
