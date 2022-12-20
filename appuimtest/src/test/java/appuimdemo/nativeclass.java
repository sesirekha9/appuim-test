package appuimdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class nativeclass {
	
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
	  @Test (enabled=false)
	  public void BT1() throws InterruptedException
	  {
		  System.out.println("started Native Apps");
		  driver.findElement(MobileBy.AccessibilityId("Animation")).click();
		 Thread.sleep(3000);
		 driver.findElements(MobileBy.className("android.widget.TextView")).get(5).click();
		 driver.findElementByAccessibilityId("Media").click();
		 Thread.sleep(3000);
		  driver.findElements(MobileBy.className("android.widget.TextView")).get(1).click();
		  driver.navigate().back();
		  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Reversing\")")).click();
		  
		 driver.findElements(MobileBy.className("android.widget.TextView")).get(9).click();
		 Thread.sleep(5000);
		 driver.findElementByAccessibilityId("3. Preference dependencies").click();
			Thread.sleep(5000);
			
			//driver.findElement(MobileBy.id("android:id/checkbox")).click();
			//Thread.sleep(5000);
			driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
			//driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
			Thread.sleep(5000);
			
			driver.findElement(MobileBy.id("android:id/edit")).sendKeys("sesi");
			
			Thread.sleep(5000);
			
			driver.findElement(MobileBy.id("android:id/button2")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"CANCEL\")")).click();
			Thread.sleep(5000);
			driver.hideKeyboard();
			driver.navigate().back();
		  
	  }
	  @Test(enabled=true)
	  public void bt2() throws InterruptedException
	  {
		  driver.openNotifications();
		  Thread.sleep(5000);
		  driver.findElements(MobileBy.className("android.widget.ImageView")).get(3).click();
		  Thread.sleep(4000);
		  driver.findElementByAccessibilityId("Battery Saver").click();

		 // driver.findElements(MobileBy.className("android.widget.TextView")).get(4).click();
		  
	  }

}
