package hybridapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
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

public class task2 {
	AndroidDriver<AndroidElement> driver;
	 

	  @BeforeTest
		public void BT() throws MalformedURLException
		{
	  DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.mns");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.mns.SplashActivity");
			driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		}
	  @Test
	  public void scroll() throws InterruptedException
	  {
		  Thread.sleep(6000);
		  driver.findElementByAndroidUIAutomator("text(\"Shop now\")").click();
			 Thread.sleep(4000);
		  //driver.findElements(MobileBy.className("android.widget.TextView")).get(1).click();
		  //Thread.sleep(6000);
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Feather & Down Packaway Puffer Jacket\"))").click();
		  Thread.sleep(6000);
		  //driver.findElement(MobileBy.className("android.widget.ImageView\r\n")).click();
		  //Thread.sleep(6000);
		 // driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		  //driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			//Thread.sleep(5000);
			 
		  
	  }
}

