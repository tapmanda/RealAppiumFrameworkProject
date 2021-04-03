package com.Appium.Test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Appium_BaseClass.BaseClass;
//import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.TouchAction;
public class TCID_006_DragAndDrop extends BaseClass{
	
	@BeforeTest
	public void AppLaunch() throws IOException, InterruptedException
	{
		driver=applaunch("realdevice");
	}
	
	@Test
	public void DragAndDrop()
	{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElement(By.xpath("//*[@text='Drag and Drop']")).click();
		WebElement src = driver.findElementByXPath("(//*[@class='android.view.View'])[1]");
		WebElement des = driver.findElementByXPath("(//*[@class='android.view.View'])[2]");
		TouchAction t=new TouchAction(driver);
		//t.longPress(longPressOptions().withElement(element(src))).moveTo(element(des)).release().perform();
		t.longPress((element(src))).moveTo(element(des)).release().perform();
	}
	
	@AfterTest
	public void AppClose()
	{
		driver.quit();
	}

}
