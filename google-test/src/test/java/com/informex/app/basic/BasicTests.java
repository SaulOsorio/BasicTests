package com.informex.app.basic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.informex.app.utils.Utils;
import com.informex.app.behavior.mainpage.MainPage;

	
public class BasicTests {
	
	@Test
	public void loginTest() {
		WebDriver driver = Utils.setup("firefox");
		MainPage.goToMainPage(driver);
		Utils.sleep(1500);
		MainPage.acceptCookies(driver);
		Utils.sleep(1500);
		MainPage.enterASearch(driver, "solera");
		Utils.sleep(1500);
		driver.quit();
	}
	
}

