package com.informex.app.behavior.mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	public static void acceptCookies(WebDriver driver) {
		WebElement cookieButton = driver.findElement(By.id("L2AGLb"));
		cookieButton.click();
	}
	
	public static void enterASearch(WebDriver driver, String search) {
		WebElement searchInput = driver.findElement(By.xpath("//input[@name = 'q']"));
		searchInput.sendKeys(search + "\n");
	}
	
	public static void goToMainPage(WebDriver driver) {
		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
	}
}