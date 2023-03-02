package com.informex.app.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.informex.app.utils.Utils;
import com.informex.app.behavior.mainpage.MainPage;

public class BasicTests {

	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.google.com/";
		driver.get(url);

		driver.manage().window().maximize();
		Utils.sleep(1500);
		MainPage.acceptCookies(driver);
		Utils.sleep(1500);
		MainPage.enterASearch(driver, "solera");
		Utils.sleep(1500);
		driver.quit();

	}
}
