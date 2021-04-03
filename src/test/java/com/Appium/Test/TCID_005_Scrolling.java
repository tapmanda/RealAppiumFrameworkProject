package com.Appium.Test;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Appium_BaseClass.BaseClass;


public class TCID_005_Scrolling extends BaseClass{
	
	@BeforeTest
	public void AppLaunch() throws IOException, InterruptedException
	{
		StartServer();
		driver=applaunch("ApplicationName");
	}
	@Test
	public void Scrolling()
	{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Scrolling until text visible
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
	}
	
	@AfterTest
	public void AppClose()
	{
		driver.quit();
		service.stop();
		
	}

}
