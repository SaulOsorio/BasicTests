package com.informex.app.basic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.informex.app.utils.Utils;
import com.informex.app.behavior.mainpage.MainPage;

	
public class BasicTests {
	
	@Test
	public void loginTest() {
		try {
		WebDriver driver = Utils.setup("chrome");	
		MainPage.goToMainPage(driver);
		MainPage.acceptCookies(driver);
		MainPage.enterASearch(driver, "solera");
		Utils.teardown(driver);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
}

