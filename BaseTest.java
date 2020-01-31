package com.anjali;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver browser;
	
	@BeforeSuite
	public void setupBrowser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		browser = new ChromeDriver();

		browser.manage().deleteAllCookies();
		browser.manage().window().maximize();
	}
	
	@BeforeTest
	public void setupBeforeTest() {
		System.out.println("Running test");
	}
	
	@AfterTest
	public void setupAfterTest() {
		browser.close();
	}
}
