package com.Appium.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Appium_BaseClass.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class TCID_001_FirstTest extends BaseClass {
	@BeforeTest
	public void AppLaunch() throws IOException, InterruptedException {
		driver = applaunch("realdevice");
	}

	@Test
	public void TestOne() {
		List<AndroidElement> list = driver.findElementsByClassName("android.widget.TextView");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("Accessibility")) {
				list.get(i).click();
				break;
			}
		}

		driver.findElementByXPath("//*[@text='Accessibility Node Querying']").click();
		
		List<AndroidElement> n = driver.findElementsById("io.appium.android.apis:id/tasklist_label");
		List<AndroidElement> names = n;
		for (MobileElement all :names) 
		{
			System.out.println(all.getText());

			
		}
			
		List<AndroidElement> clist = driver.findElementsById("io.appium.android.apis:id/tasklist_finished");
			for (MobileElement ch : clist) {
				if (ch.getAttribute("checked").contains("true")) 
				{
				}

			}
		}


	@AfterTest
	public void closeApp() {
		driver.quit();
	}

}
