package native_app;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class capability {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"soundharya");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"io.appium.android.apis.ApiDemos");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		//dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C://Users//user//Downloads//chromedriver_win32//chromedriver.exe");
		
		AndroidDriver<AndroidElement> driver =new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		return driver;
	}
}
