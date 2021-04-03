package com.Appium.Test;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.io.IOException;

import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Appium_BaseClass.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;

public class TCID_004_Swipping extends BaseClass{

	@BeforeTest
	public void AppLaunch() throws IOException, InterruptedException
	{
		driver=applaunch("ApplicationName");
	}
	
	
	@Test
	public void SwippingMethod()
	{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElement(By.xpath("//*[@text='Date Widgets']")).click();
		driver.findElementByXPath("//*[@text='2. Inline']").click();
		
		//driver.findElementByXPath("//android.widget.Button[@text='CHANGE THE TIME']").click();
		System.out.println(driver.findElementById("android:id/time_header").isDisplayed());
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		TouchAction t=new TouchAction(driver);
		AndroidElement first = driver.findElementByXPath("//*[@content-desc='15']");
		AndroidElement second = driver.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
		
		
	}
	
	
	@AfterTest
	public void AppClose()
	{
		driver.quit();
	}
}
