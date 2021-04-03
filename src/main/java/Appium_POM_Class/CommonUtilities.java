package Appium_POM_Class;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CommonUtilities {
	public AndroidDriver<AndroidElement> driver;
	public CommonUtilities(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}
	
	public void ScrollableMathod(String text)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))");
	}
	

}
