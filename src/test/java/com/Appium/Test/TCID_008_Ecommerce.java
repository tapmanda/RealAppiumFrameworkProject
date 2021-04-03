package com.Appium.Test;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Appium_BaseClass.BaseClass;
import Appium_POM_Class.CommonUtilities;
import Appium_POM_Class.Ecommerce_HomePage;
public class TCID_008_Ecommerce extends BaseClass{
	@BeforeTest
	public void AppLaunch() throws IOException, InterruptedException
	{
		StartServer();
		driver=applaunch("EcommerceApkName");
	} 
	
	@Test
	public void LoginPage()
	{
		Ecommerce_HomePage home=new Ecommerce_HomePage(driver);
		//driver.findElementByXPath("//*[@text='Enter name here']").sendKeys("tapas");
		//driver.hideKeyboard();
		
		home.Gender().click();
		home.DropDownList().click();
		CommonUtilities scroll=new CommonUtilities(driver);
		scroll.ScrollableMathod("Austria");
		home.SelectCountry().click();
		home.ClickShopButton().click();
		String name=home.GetAlertText().getAttribute("name");
		System.out.println(name);
		Assert.assertEquals("Please enter your name", name);
	}
	@AfterTest
	public void AppClose()
	{
		driver.quit();
		service.stop();
		
	}

}
