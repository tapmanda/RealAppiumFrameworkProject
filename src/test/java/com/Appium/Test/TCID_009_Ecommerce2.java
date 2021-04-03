package com.Appium.Test;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Appium_BaseClass.BaseClass;
import io.appium.java_client.android.AndroidElement;

public class TCID_009_Ecommerce2 extends BaseClass{
	@BeforeTest
	public void AppLaunch() throws IOException, InterruptedException
	{
		driver=applaunch("EcommerceApkName");
	}
	
	@Test
	public void LoginPage()
	{
		driver.findElementByXPath("//*[@text='Enter name here']").sendKeys("tapas");
		driver.hideKeyboard();
		driver.findElementByXPath("//*[@text='Female']").click();
		driver.findElementById("android:id/text1").click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"))");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"))");
		driver.findElementByXPath("//*[@text='Austria']").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		AndroidElement shoes = driver.findElementByXPath("//*[@text='Jordan Lift Off']");
		int x = shoes.getLocation().getX();
		int y = shoes.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		
	}
	@AfterTest
	public void AppClose()
	{
		driver.quit();
	}

}
