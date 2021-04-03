package Appium_BaseClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowserBase {

	public static AndroidDriver<AndroidElement> driver;

	public AndroidDriver<AndroidElement> Browserlaunch(String device) throws MalformedURLException {
		//appium --allow-insecure chromedriver_autodownload
		DesiredCapabilities cap = new DesiredCapabilities();
		if (device.equals("emulator")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "EmulatorDevice");
		} else if (device.equals("realdevice")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M51");
		}

		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		driver = new AndroidDriver<AndroidElement>(new URL("http://192.168.1.203:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}
}
