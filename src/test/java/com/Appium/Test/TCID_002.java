package com.Appium.Test;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Appium_BaseClass.BaseClass;
import Appium_BaseClass.DataProvider_Class;
import Appium_POM_Class.Preference;

public class TCID_002 extends BaseClass {

	/*
	 * @BeforeTest public void AppLaunch() throws IOException, InterruptedException
	 * { StartServer(); driver = applaunch("ApplicationName"); }
	 */

	@Test(dataProvider = "inputData", dataProviderClass = DataProvider_Class.class)
	public void Testtwo(String text) throws IOException, InterruptedException {
		StartServer();
		driver = applaunch("ApplicationName");
		Preference pre = new Preference(driver);
		pre.Click_Preference().click();
		pre.Preference_Dependencies().click();
		pre.Checkbox().click();
		pre.Wifi_Settings().click();
		pre.Popup_box().sendKeys(text);
		pre.Click_OK().click();
		service.stop();
	}

	/*
	 * @AfterTest public void closeApp() { service.stop(); }
	 */

}
