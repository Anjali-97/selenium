package com.anjali.testing;

import org.testng.annotations.Test;

import com.anjali.BaseTest;

import static org.testng.Assert.assertEquals;

public class Browsers extends BaseTest {
	private static final String EXPECTED_GOOGLE_TITLE = "Google";
	private static final String EXPECTED_EXPLORER_TITLE = "Internet Explorer";
	private static final String EXPECTED_FIREFOX_TITLE = "Mozilla Firefox";
	@Test(priority = 1)
	public void testGoogleHomepageAccessible() {
		browser.get("https://www.google.com/");
		String actual = browser.getTitle();
		assertEquals(actual, EXPECTED_GOOGLE_TITLE);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Test
	public void testexplorerHomepageAccessible() {
		browser.get("https://www.bing.com/search?q=internet+explorer&qs=n&form=QBRE&sp=-1&pq=internet+explorer&sc=8-17&sk=&cvid=E29F165F49974CAB9711AEB50FF7B8DB/");
		String actual = browser.getTitle();
		assertEquals(actual, EXPECTED_EXPLORER_TITLE);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testfirefoxHomepageAccessible() {
		browser.get("https://www.mozilla.org/en-US//");
		String actual = browser.getTitle();
		assertEquals(actual, EXPECTED_FIREFOX_TITLE);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}