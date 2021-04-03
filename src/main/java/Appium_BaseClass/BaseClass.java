package Appium_BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	public static AndroidDriver<AndroidElement> driver;
	public AppiumDriverLocalService service;
	public static String commonPath = System.getProperty("user.dir");
	
	//To start and stop the server 
	public AppiumDriverLocalService StartServer()
	{
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		return service;
	}
	
	//To Start The Emulator Through program
	public static void startEmulator() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec(commonPath+"\\src\\main\\java\\Resources_Emulator\\Emulator.bat");
		Thread.sleep(6000);
	}
	
	public AndroidDriver<AndroidElement> applaunch(String appName) throws IOException, InterruptedException {
		FileInputStream file=new FileInputStream(commonPath+"\\src\\main\\java\\Appium_Properties_File\\GlobalPropertie.properties");
		Properties prop=new Properties();
		prop.load(file);
		
		File f = new File("src");
		File fs = new File(f,prop.getProperty(appName));
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		String device = prop.getProperty("DeviceName");
		
		if(device.contains("Emulator"))
		{
			startEmulator();//To launch the Emulator 
		}
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,device); //For Real device
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver<AndroidElement>(new URL("http://192.168.1.203:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void getScreenshot(String s) throws IOException
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(commonPath+"\\FailedScreenshot\\"+s+".png"));
	}
}
