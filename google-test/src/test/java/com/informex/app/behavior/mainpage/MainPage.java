package com.informex.app.behavior.mainpage;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.informex.app.utils.TestProperties;

public class MainPage {
	private static Properties properties = TestProperties.getProperties();
	
	public static void acceptCookies(WebDriver driver) {
		String id = properties.getProperty("acceptcookiesbuttonid");
		new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.elementToBeClickable(By.id(id)));
		WebElement cookieButton = driver.findElement(By.id(id));
		cookieButton.click();
	}
	
	public static void enterASearch(WebDriver driver, String search) {
		String xpath = properties.getProperty("searchInputXpath");
		new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		WebElement searchInput = driver.findElement(By.xpath(xpath));
		searchInput.sendKeys(search + "\n");
	}
	
	public static void goToMainPage(WebDriver driver) {
		Properties properties = TestProperties.getProperties();
		String url = properties.getProperty("googleurl");
		driver.get(url);
		driver.manage().window().maximize();
	}
}
