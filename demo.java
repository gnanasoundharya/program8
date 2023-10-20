package testng;//Native App

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import native_app.capability;
//import static 
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.TouchAction;
import java.time.Duration;
import static java.time.Duration.ofSeconds;
public class demo extends capability {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest

	public void bt() throws MalformedURLException
	{
		driver = capabilities();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test(enabled=false)
	public void test()
	{
	System.out.println("soundharya");
	driver.findElement(MobileBy.AccessibilityId("Preference")).click();
	driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();
	//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"wiFi Settings\")")).click();
	driver.findElement(MobileBy.id("android:id/edit")).sendKeys("soundharya");
	driver.findElement(MobileBy.id("android:id/button2")).click();
    driver.hideKeyboard();
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	@Test(enabled =false)
	public void notifications()
	{
		driver.openNotifications();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(1).click();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(2).click();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(3).click();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(5).click();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(6).click();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(7).click();
		
	}
	@Test(enabled=false)
	public void scroll() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		//now we ant to scroll...three things...UIAutomator...UiSelector.....UiScrollable
		//if u want to scroll a particular element (scrollIntoViews )
		Thread.sleep(9000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
		
	}
	@Test(enabled = false)
	public void case01() {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		//to check elements are present and clickable 
		AndroidElement clickable=driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
		org.openqa.selenium.Dimension count=clickable.getSize();
	    System.out.println(count); 
	}
	@Test(enabled = false)
public void scroll01() throws InterruptedException {
	driver.findElement(MobileBy.AccessibilityId("Views")).click();
	//now we ant to scroll...three things...UIAutomator...UiSelector.....UiScrollable
	//if u want to scroll a particular element (scrollIntoViews )
	Thread.sleep(9000);
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
	
}
@Test(enabled = false)
public void count() {
	driver.findElement(MobileBy.AccessibilityId("Views")).click();
	//to check elements are present and clickable 
	AndroidElement clickable=driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
	org.openqa.selenium.Dimension count=clickable.getSize();
    System.out.println(count); 
	}
	@Test(enabled = false)
	public void longpres() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(4000);
		AndroidElement el=driver.findElement(MobileBy.AccessibilityId("Expandable Lists"));
		Thread.sleep(5000);
	    //TouchAction ta=new TouchAction(driver);
		TouchAction ta=new TouchAction(driver);
	    //ta.tap(tapOptions().withElement(element(el))).perform();
	    ta.tap(tapOptions().withElement(element(el))).perform();
		driver.findElement(MobileBy.AccessibilityId("1. Custom Adapter")).click();
	    AndroidElement lp=driver.findElement(By.xpath("//*[@text='Fish Names']"));
	    //ta.longPress(LongPressOptions().withElement(element(lp)).withDuration(ofSeconds(3))).release().perform();
	    //ta.longPress(longPressOptions().withElement(element(lp).withDuration(ofSeconds(3))).release().perform();
			ta.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(3))).release().perform();
			Thread.sleep(3000);
			String str01=driver.findElements(MobileBy.className("android.widget.TextView")).get(0).getText();
			String str02=driver.findElements(MobileBy.className("android.widget.TextView")).get(1).getText();
			System.out.println(str01);
			System.out.println(str02);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
		    driver.pressKey(new KeyEvent(AndroidKey.BACK));
		    driver.pressKey(new KeyEvent(AndroidKey.BACK));
		    driver.pressKey(new KeyEvent(AndroidKey.BACK));
		    driver.pressKey(new KeyEvent(AndroidKey.BACK));
		    
	}
	@Test(enabled = false)
	public void swipeaction() throws InterruptedException
	{
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(4000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
		AndroidElement el01=driver.findElement(MobileBy.AccessibilityId("12"));
		Thread.sleep(3000);
		AndroidElement el02=driver.findElement(MobileBy.AccessibilityId("4"));
		TouchAction ta01=new TouchAction(driver);
		Thread.sleep(3000);
		ta01.longPress(longPressOptions().withElement(element(el01)).withDuration(ofSeconds(3))).moveTo(element(el02)).release().perform();
		driver.findElement(MobileBy.id("android:id/pm_label")).click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    
	}
	@Test(enabled = false)
	public void dragdrop() throws InterruptedException
	{
	driver.findElement(MobileBy.AccessibilityId("Views")).click();
	Thread.sleep(4000);
	driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
	Thread.sleep(3000);
	TouchAction ta02=new TouchAction(driver);
	Thread.sleep(2000);
	AndroidElement el04=driver.findElement(MobileBy.AccessibilityId("io.appium.android.apis:id/drag_dot_1"));
	Thread.sleep(3000);
	AndroidElement el05=driver.findElement(MobileBy.AccessibilityId("io.appium.android.apis:id/drag_dot_2"));	
	ta02.longPress(longPressOptions().withElement(element(el04)).withDuration(ofSeconds(3))).moveTo(element(el05)).release().perform();
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	@Test(enabled= true)
	public void sms() throws InterruptedException
	{
		driver.findElements(MobileBy.className("android.widget.TextView")).get(8).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("SMS Messaging")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Enable SMS broadcast receiver")).click();
		Thread.sleep(2000);
		driver.findElements(MobileBy.className("android.widget.EditText")).get(0).sendKeys(("650)555-1212"));
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_content")).sendKeys("Nice Day");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Send")).click();
		Thread.sleep(2000);
		driver.hideKeyboard();
		driver.activateApp("com.google.android.apps.messaging");
		String str=driver.findElement(MobileBy.id("com.google.android.apps.messaging:id/conversation_snippet")).getText();
		System.out.println("Nice Day");
		Thread.sleep(2000);
		driver.activateApp("io.appium.android.apis");
				
		
	}
}


