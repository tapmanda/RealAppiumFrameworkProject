package Appium_POM_Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preference {
	
	public Preference(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//*[@text='Preference']")
	private WebElement preference;
	
	@AndroidFindBy(xpath="//*[@text='3. Preference dependencies']")
	private WebElement pdep;
	
	@AndroidFindBy(id="android:id/checkbox")
	private WebElement checkbox;
	
	@AndroidFindBy(xpath="//*[@text='WiFi settings']")
	private WebElement wifisettings;
	
	@AndroidFindBy(id="android:id/edit")
	private WebElement popup;
	
	@AndroidFindBy(xpath="//*[@text='OK']")
	private WebElement ok;
	
	
	public WebElement Click_Preference()
	{
		return preference;
	}
	public WebElement Preference_Dependencies()
	{
		return pdep;
	}
	public WebElement Checkbox()
	{
		return checkbox;
	}
	public WebElement Wifi_Settings()
	{
		return  wifisettings;
	}
	public WebElement Popup_box()
	{
		return popup;
	}
	
	public WebElement Click_OK()
	{
		return ok;
	}
	
	
	
	
}
