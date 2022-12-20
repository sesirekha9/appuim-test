package appuimdemo;

import java.net.MalformedURLException;
import java.net.URL;
import static java.time.Duration.ofSeconds;

import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;

import static io.appium.java_client.touch.TapOptions.tapOptions;



public class tapandlongpress {

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
	  public void tapandlongpress() throws InterruptedException
	  {
		  driver.findElementByAccessibilityId("Views").click();
		  Thread.sleep(4000);
		  driver.findElementByAccessibilityId("Expandable Lists").click();
		  Thread.sleep(4000);
		  
		  AndroidElement tp = driver.findElement(MobileBy.AccessibilityId("1. Custom Adapter"));
		  TouchAction at = new TouchAction(driver);
			
			at.tap(tapOptions().withElement(element(tp))).perform();
			  //at.tap((tapOptions())
			
			AndroidElement lp=	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"People Names\")"));
			
			
			at.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(3))).release().perform();
			//ta.longPress(LongPressOptions)
			driver.findElementByAndroidUIAutomator("text(\"Sample action\")").click();
			  
	  }
	  @Test(enabled=false)
	  public void scroll() throws InterruptedException
	  {
		  driver.findElement(MobileBy.AccessibilityId("Views")).click();
		  Thread.sleep(4000);
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
		  Thread.sleep(4000);
		  
		  //keyboard actions
		  driver.pressKey(new KeyEvent(AndroidKey.BACK));
		  driver.pressKey(new KeyEvent(AndroidKey.HOME));
		  
		  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		 
		  
	  }
	  //swipe and swap
	  @Test(enabled=false)
	  public void swapandswipe() throws InterruptedException 
	  {
		  driver.findElement(MobileBy.AccessibilityId("Views")).click();
		  Thread.sleep(4000);
		  driver .findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		  Thread.sleep(4000);
		  driver .findElement(MobileBy.AccessibilityId("2. Inline")).click();
		  Thread.sleep(4000);
		  driver .findElement(MobileBy.AccessibilityId("12")).click();
		  Thread.sleep(4000);
		  
		 AndroidElement ele1= driver .findElement(MobileBy.AccessibilityId("30"));
		 Thread.sleep(4000);
		 AndroidElement ele2= driver .findElement(MobileBy.AccessibilityId("55"));
		 Thread.sleep(4000);
		 TouchAction ta = new TouchAction(driver);
		 ta.longPress(longPressOptions().withElement(element(ele1)).withDuration(ofSeconds(3))).moveTo(element(ele2)).release().perform();
		 Thread.sleep(4000);
		 driver.findElementByAndroidUIAutomator("text(\"PM\")").click();
		 Thread.sleep(4000);
		 
	  }
	  //drag and drop
	  @Test(enabled=true)
	  public void draganddrop() throws InterruptedException
	  
	  {
		  
		  driver .findElement(MobileBy.AccessibilityId("Views")).click();
		  Thread.sleep(4000);
		  driver.findElementByAccessibilityId("Drag and Drop").click();
		  Thread.sleep(4000);
		  AndroidElement ele1= driver.findElements(MobileBy.className("android.view.View")).get(0);
		  Thread.sleep(4000);
			 AndroidElement ele2= driver.findElements(MobileBy.className("android.view.View")).get(1);
			 Thread.sleep(4000);
			 TouchAction ta = new TouchAction(driver);
			 Thread.sleep(4000);
			 ta.longPress(longPressOptions().withElement(element(ele1)).withDuration(ofSeconds(3))).moveTo(element(ele2)).release().perform();
			
			 
			
	  }
	 
	  
}
