package com.ebay.developer.constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestEnvironmentConstantTest {
	private final static String BASE_URL = "https://developer.ebay.com/";
	private final static String CHROME_WEB_DRIVER = "webdriver.chrome.driver";
	private final static String CHROME_WEB_DRIVER_PATH = "/home/emy/eclipse-workspace/chromedriver";
	private final static String FIREFOX_WEB_DRIVER = "webdriver.gecko.driver";
	private final static String FIREFOX_WEB_DRIVER_PATH = "/home/emy/eclipse-workspace/geckodriver";
	private final static String EDGE_WEB_DRIVER = "webdriver.edge.driver";
	private final static String EDGE_WEB_DRIVER_PATH = "/home/emy/eclipse-workspace/msedgedriver";
	
	public String getBaseUrl() {
		return BASE_URL;
	}
	
	public String getChromeWebDriverName() {
		return CHROME_WEB_DRIVER;
	}
	
	public String getChromeWebDriverPath() {
		return CHROME_WEB_DRIVER_PATH;
	}
	
	public String getFirefoxWebDriverName() {
		return FIREFOX_WEB_DRIVER;
	}
	
	public String getFirefoxWebDriverPath() {
		return FIREFOX_WEB_DRIVER_PATH;
	}
	
	public String getEdgeWebDriverName() {
		return EDGE_WEB_DRIVER;
	}
	
	public String getEdgeWebDriverPath() {
		return EDGE_WEB_DRIVER_PATH;
	}
	
	public WebDriver getChromeWebDriver() {
		System.setProperty(CHROME_WEB_DRIVER, CHROME_WEB_DRIVER_PATH);
		return new ChromeDriver();
	}
	
	public WebDriver getFirefoxWebDriver() {
		System.setProperty(FIREFOX_WEB_DRIVER, FIREFOX_WEB_DRIVER_PATH);
		return new FirefoxDriver();
	}
	
	public WebDriver getEdgeWebDriver() {
		System.setProperty(EDGE_WEB_DRIVER, EDGE_WEB_DRIVER_PATH);
		return new EdgeDriver();
	}
}
