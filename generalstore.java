package hybird;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hybirdapp.capability01;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import native_app.capability;

public class generalstore extends capability01 {
	 
		AndroidDriver<AndroidElement> driver;
		@BeforeTest

		public void bts() throws MalformedURLException
		{
			driver = capabilities();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		@Test
		public  void test01()
		{
			System.out.println("generalstore open");
		}
		@Test(enabled=false)
		public void countryname() throws InterruptedException
		{
			driver.findElement(MobileBy.id("android:id/text1")).click();
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"))").click();
			//driver.findElements(MobileBy.className("android.widget.Spinner")).get(1).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("soundharya");
			Thread.sleep(2000);
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			Thread.sleep(2000);		
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ADD TO CART\"))").click();
			String i=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))").getText();
			System.out.println(i);
			driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(1).click();
			Thread.sleep(2000);	
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			Thread.sleep(2000);
			String j=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/productName")).getText();
			System.out.println(j);
			Thread.sleep(2000);
			Assert.assertEquals(i, j);
			Thread.sleep(2000);
		}
		@Test
		public void product() throws InterruptedException {
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"))").click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("soundharya");
			Thread.sleep(2000);
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"ADD TO CART\")")).click();
			Thread.sleep(2000);
			driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			Thread.sleep(2000);
			String product1=driver.findElement(By.xpath("//*[@text='$160.97']")).getText();
			Thread.sleep(2000);
			String product2=driver.findElement(By.xpath("//*[@text='$120.0']")).getText();
			Thread.sleep(2000);
			String totalprice=driver.findElement(By.xpath("//*[@text='$ 280.97']")).getText();
			Thread.sleep(2000);
			product1=product1.substring(1);
			Thread.sleep(2000);
			product2=product2.substring(1);
			Thread.sleep(2000);
			totalprice=totalprice.substring(1);
			Thread.sleep(2000);
			Double firstproduct= Double.parseDouble(product1);
			Thread.sleep(2000);
			Double secondproduct=Double.parseDouble(product2);
			Thread.sleep(2000);
			Double totalprice1=Double.parseDouble(totalprice);
			Thread.sleep(2000);
			Double total=firstproduct+secondproduct;
			Thread.sleep(2000);
			//Assert.assertEquals(totalprice1, total);
			if(totalprice1.equals(total)) {
				System.out.println("price matched");
			}
			else {
				System.out.println("price not matched");
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@text='Send me e-mails on discounts related to selected products in future']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@text='Visit to the website to complete purchase']")).click();
			Thread.sleep(9000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(5000);				
			Set<String> contextNames = driver.getContextHandles();
			for (String contextName : contextNames) {
			    System.out.println(contextName);
		}
	}
}

		
	


