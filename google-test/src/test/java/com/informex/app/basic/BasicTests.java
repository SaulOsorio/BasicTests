package com.informex.app.basic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.informex.app.utils.Utils;
import com.informex.app.behavior.mainpage.MainPage;

	
public class BasicTests {
	
	@Test
	public void loginTest() {
		try {
		WebDriver driver = Utils.setup("firefox");	
		MainPage.goToMainPage(driver);
		Utils.implicitWait(1500, driver);
		MainPage.acceptCookies(driver);
		Utils.implicitWait(1500, driver);
		MainPage.enterASearch(driver, "solera");
		Utils.implicitWait(1500, driver);
		Utils.teardown(driver);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
}

