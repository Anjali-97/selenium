package com.anjali.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.anjali.BaseTest;

import static org.testng.Assert.assertEquals;

public class Amazon extends BaseTest {
	private static final String EXPECTED_AMAZON_TITLE = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	@Test(priority = 1)
	public void testAmazonLoginpage() {
		browser.get("https://www.amazon.in/");
		WebElement textbox = browser.findElement(By.id("nav-link-accountList"));
		textbox.click();
		WebElement textbox2 = browser.findElement(By.name("email"));
		textbox2.sendKeys("9446674136");
		textbox2.sendKeys(Keys.ENTER);
		WebElement textbox4 = browser.findElement(By.id("ap_password"));
		browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		textbox4.sendKeys("anjali@97");

		
		textbox4.sendKeys(Keys.ENTER);
		browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//WebElement textbox1 = browser.findElement(By.xpath("//*[@id=\"zg_tabs\"]/ul/li[4]/div/a"));
	
		//textbox1.click();
		WebElement textbox1 = browser.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]"));
		//WebElement textbox1 = browser.findElement(By.name("Mobiles"));
		textbox1.click();
		browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//browser.findElement(By.name("email"));
		WebElement textbox5=browser.findElement(By.linkText("See more"));
		textbox5.click();
		browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//browser.findElement(By.partialLinkText("bargain finds"));
		WebElement textbox6=browser.findElement(By.partialLinkText("max"));
		textbox6.click();
		WebElement textbox7=browser.findElement(By.cssSelector("li# n/976419031"));
		textbox7.click();
		String actual = browser.getTitle();
		assertEquals(actual, EXPECTED_AMAZON_TITLE);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
	