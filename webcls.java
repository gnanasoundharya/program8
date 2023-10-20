package webapp;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import webapp01.webcls01;

public class webcls extends webcls01{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest

	public void bts() throws MalformedURLException
	{
		driver = capabilities();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void web001() throws InterruptedException
	{
		System.out.println("brower is working");
        Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("appium",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='ynAwRc q8U8x MBeuO oewGkc LeUQr htnRc djl1df']")).click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		/*WebElement ele= driver.findElement(By.xpath("//*[@class='Aozhyc MUxGbd lyLwlc aLF0Z OSrXXb']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		ele.click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));*/
		List<AndroidElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));		
			
		}				
				
	}

}
