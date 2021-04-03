package com.Appium.Test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Appium_BaseClass.MobileBrowserBase;
import junit.framework.Assert;

public class TCID_007_MobileBrowser extends MobileBrowserBase {

	@BeforeTest
	public void BrowerLaunch() throws MalformedURLException {
		driver = Browserlaunch("realdevice");
	}

	@Test
	public void OpenGoogle() throws InterruptedException {
		driver.get("https://cricbuzz.com/");
		/*
		 * driver.findElement(By.xpath("//*[@id='m_login_email']")).sendKeys(
		 * "tapasmandal644@gmail.com");
		 * driver.findElement(By.xpath("//input[@id='m_login_password']")).sendKeys(
		 * "TAPASMANDAL1996");
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 * driver.findElement(By.xpath("//button[@value='OK']")).click(); String al =
		 * driver.switchTo().alert().getText(); System.out.println(al);
		 * driver.switchTo().alert().accept(); Thread.sleep(3000);
		 */
		driver.findElement(By.xpath("//span[text()='Menu ']")).click();
		driver.findElement(By.xpath("//a[@title='Cricbuzz Home']")).click();

		/*
		 * int x = top.getLocation().getX(); System.out.println(x); int y =
		 * top.getLocation().getY(); System.out.println(y);
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,480)","");
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));

	}

	@AfterTest
	public void BrowserClose() {
		driver.quit();
	}

}
