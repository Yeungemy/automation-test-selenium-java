package com.ebay.developer.pages.programSearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.developer.constants.ProgramSearchPageConstantsTest;

public class ProgramSearchPageTest {
	private WebDriver driver;

	ProgramSearchPageConstantsTest programSearchPageConstantsTest = new ProgramSearchPageConstantsTest();

	// locators
	@FindBy(id = "s0-1-22-4-banner-title")
	WebElement programSearchPageTitle;

	// constructor
	public ProgramSearchPageTest(WebDriver driver) {
		this.driver = driver;

		// initialize elements
		PageFactory.initElements(driver, this);
	}

	// assertion
	public void isProgramSearchPageOpen() {
		programSearchPageTitle.getText().contains(programSearchPageConstantsTest.getProgramSearchPageTitle());
	}
}
