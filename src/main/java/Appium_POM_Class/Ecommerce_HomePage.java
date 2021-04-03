package Appium_POM_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Ecommerce_HomePage {
	AndroidDriver<AndroidElement> driver;

	public Ecommerce_HomePage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	private By gender = By.xpath("//*[@text='Female']");
	private By list = By.id("android:id/text1");
	private By selectCountry=By.xpath("//*[@text='Austria']");
	private By clickButton=By.id("com.androidsample.generalstore:id/btnLetsShop");
	private By alert=By.xpath("//android.widget.Toast[1]");

	public WebElement Gender() {
		return driver.findElement(gender);
	}

	public WebElement DropDownList() {
		return driver.findElement(list);
	}
	public WebElement SelectCountry() {
		return driver.findElement(selectCountry);
	}

	public WebElement ClickShopButton() {
		return driver.findElement(clickButton);
	}
	public WebElement GetAlertText() {
		return driver.findElement(alert);
	}


	// ========================Other Way======================//

	/*
	 * public Ecommerce_HomePage(AndroidDriver<AndroidElement> driver) {
	 * PageFactory.initElements(new AppiumFieldDecorator(driver), this); }
	 * 
	 * @AndroidFindBy(xpath="//*[@text='Female']") 
	 * public WebElement Gender;
	 * 
	 * 
	 */
	 
}
