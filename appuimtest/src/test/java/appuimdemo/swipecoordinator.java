package appuimdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class swipecoordinator {
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
	  @Test
	  public void dragnotification() throws InterruptedException
	  {
		  driver.openNotifications();
		  Thread.sleep(5000);
		  TouchAction tee=new TouchAction(driver);
			Thread.sleep(5000);
			driver.findElement(MobileBy.AccessibilityId("Open quick settings.")).click();
			tee.longPress(PointOption.point(996,552)).moveTo(PointOption.point(44, 572)).release().perform();
			Thread.sleep(5000);
	  }

}
