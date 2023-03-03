package com.informex.app.utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
	public static void sleep(Integer miliseconds) {
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static WebDriver setup(String browser) {
		Properties properties = TestProperties.getProperties();
		WebDriver driver = null;
		if (browser.toLowerCase().matches("chrome")) {
			System.setProperty("webdriver.chrome.driver", properties.getProperty("chromeDriverLocation"));
			driver = new ChromeDriver();
		} else if (browser.toLowerCase().matches("firefox")) {
			System.setProperty("webdriver.gecko.driver", properties.getProperty("firefoxDriverLocation"));
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
