package com.ebay.developer.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ebay.developer.constants.TestEnvironmentConstantTest;


public class Util {
	private static WebDriver driver;
	TestEnvironmentConstantTest envConst = new TestEnvironmentConstantTest();
	
	public WebDriver getWebDriver(String driverName) {
		String[] temp = driverName.split(".");
				
		if(temp[1].equals("chrome")) {
			System.setProperty(envConst.getChromeWebDriverName(), envConst.getChromeWebDriverPath());
			driver = new ChromeDriver();
		}else if(temp[1].equals("gecko")) {
			System.setProperty(envConst.getFirefoxWebDriverName(), envConst.getFirefoxWebDriverPath());
			driver = new FirefoxDriver();
		}else if(temp[1].equals("edge")) {
			System.setProperty(envConst.getEdgeWebDriverName(), envConst.getEdgeWebDriverPath());
			driver = new EdgeDriver();
		}
		
		return driver;
	}
}
