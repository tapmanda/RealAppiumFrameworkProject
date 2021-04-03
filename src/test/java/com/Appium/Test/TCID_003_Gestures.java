package com.Appium.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Appium_BaseClass.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.io.IOException;

public class TCID_003_Gestures extends BaseClass{
	
	@BeforeTest
	public void AppLaunch() throws IOException, InterruptedException
	{
		driver=applaunch("ApplicationName");
	}
	
	
	@Test
	public void Gestures()
	{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		TouchAction t=new TouchAction(driver);
		AndroidElement elem = driver.findElementByXPath("//*[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(elem))).perform();
		driver.findElementByXPath("//*[@text='1. Custom Adapter']").click();
		AndroidElement peoplename = driver.findElementByXPath("//*[@text='People Names']");
		t.longPress(longPressOptions().withElement(element(peoplename)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
	}
	
	
	@AfterTest
	public void AppClose()
	{
		driver.quit();
	}

}
