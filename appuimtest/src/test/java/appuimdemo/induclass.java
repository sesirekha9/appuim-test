package appuimdemo;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class induclass {
	
	AndroidDriver<AndroidElement> driver;
	 

	  @BeforeTest
		public void BT() throws MalformedURLException
		{
	  DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"io.appium.android.apis.ApiDemos");
			driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		}
	  @Test(enabled=false)
	  public void scroll2() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.openNotifications();
			WebElement ele=driver.findElementByAccessibilityId("Open quick settings.");
			ele.click();
			//WebElement ele= driver.findElements(MobileBy.className("android.view.ViewGroup")).get(0);
			//Double Screenheightstart= ele.getSize().getHeight() * 0.1 ;
			//int scrollstart =Screenheightstart .intValue();	
	       // Double Screenheightend= ele.getSize().getHeight() * 0.6 ;
			//int scrollend =Screenheightend .intValue();	
			
			TouchAction TA=new TouchAction(driver);
			//TA.longPress(longPressOptions().withElement(element(ele)).withDuration(ofSeconds(3))).moveTo(PointOption.point(0, scrollend)).release().perform();
			WebElement ele2=driver.findElement(By.id("com.android.systemui:id/tile_page"));
			Thread.sleep(3000);
			Double Screenwidthend= ele2.getSize().getWidth() * 0.9 ;
			int scrollover=Screenwidthend.intValue();
			Thread.sleep(3000);
			TA.longPress(longPressOptions().withElement(element(ele2)).withDuration(ofSeconds(3))).moveTo(PointOption.point(0, scrollover)).release().perform();
			Thread.sleep(3000);
		
			//TA.longPress(longPressOptions().withElement(element(ele2)).withDuration(ofSeconds(3))).moveTo(PointOption.point(0, scrollover)).release().perform();
			//TA.scroll(element scrollstart scrollend);
		}
	  @Test(enabled=true)
		public void scroll3() throws InterruptedException
		{
		  driver.openNotifications();
		  WebElement ele=driver.findElementByAccessibilityId("Open quick settings.");
		  ele.click();
			//WebElement ele=driver.findElement(By.id("com.android.systemui:id/header_date"));
			 Double Screenheightend= ele.getSize().getHeight() * 0.8 ;
				int scrollend =Screenheightend .intValue();	
				TouchAction TA=new TouchAction(driver);	
				Thread.sleep(3000);
				TA.longPress(longPressOptions().withElement(element(ele)).withDuration(ofSeconds(3))).moveTo(PointOption.point(0, scrollend)).release().perform();
		}










	  {
		  
	  }

}
