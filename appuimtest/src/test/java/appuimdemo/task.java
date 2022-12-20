package appuimdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class task {
	
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
	  public void BT1() throws InterruptedException
	  {
		  driver.findElement(MobileBy.AccessibilityId("Animation")).click();
			 Thread.sleep(3000);
			 driver.findElements(MobileBy.className("android.widget.TextView")).get(9).click();
			 Thread.sleep(3000);
			 driver.findElement(MobileBy.AccessibilityId("Run")).click();
			 Thread.sleep(3000);
	  }
	  @Test(enabled=false)
	  public void scrollintoview() throws InterruptedException
	  {
		  driver.findElement(MobileBy.AccessibilityId("Graphics")).click();
		  Thread.sleep(4000);
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PathEffects\"))").click();
		  Thread.sleep(4000);
		  
		  //keyboard actions
		  driver.pressKey(new KeyEvent(AndroidKey.BACK));
		  driver.pressKey(new KeyEvent(AndroidKey.HOME));
		  
		  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	  }
	  @Test (enabled=true)
	  public void changedate() throws InterruptedException
	  
	  {
		  driver.findElement(MobileBy.AccessibilityId("Views")).click();
		  Thread.sleep(4000);
		  driver .findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		  Thread.sleep(4000);
		  driver .findElement(MobileBy.AccessibilityId("1. Dialog")).click();
		  Thread.sleep(4000);
		  driver .findElement(MobileBy.className("android.widget.Button")).click();
		  Thread.sleep(4000);
		  driver .findElement(MobileBy.AccessibilityId("08 December 2022")).click();
		  Thread.sleep(4000);
		  
		  
	  }
	  @Test (enabled=false)
	  public void switchapp() throws InterruptedException
	  {
				
				driver.findElement(MobileBy.AccessibilityId("OS")).click();
				
				Thread.sleep(3000);
				driver.findElement(MobileBy.AccessibilityId("SMS Messaging")).click();
				
				driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_recipient")).sendKeys("(555) 521-5554");
				
				driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_content")).sendKeys("Hi Welcome Madhavi");
				
				
				driver.findElement(MobileBy.AccessibilityId("Send")).click();
				
				
				driver.activateApp("com.google.android.apps.messaging");
				
				String M=driver.findElement(MobileBy.id("com.google.android.apps.messaging:id/conversation_snippet")).getText();
				
			System.out.println(M);
			
			driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.pressKey(new KeyEvent(AndroidKey.HOME));
			
			
			
			
	  }

}
