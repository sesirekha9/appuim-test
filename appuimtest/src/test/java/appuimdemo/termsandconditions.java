package appuimdemo;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

public class termsandconditions {
	AndroidDriver<AndroidElement> driver;
	 

	  @BeforeTest
		public void BT() throws MalformedURLException
		{
	  DesiredCapabilities dc = new DesiredCapabilities();
			
	  dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
		}
	  @Test
	  public void tc() throws InterruptedException
	  {
		//driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		  Thread.sleep(6000);
		  driver.findElement(MobileBy.id("android:id/text1")).click();
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"))").click();
		  Thread.sleep(4000);
		 driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("sesirekha");
		  driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
		  Thread.sleep(4000);
		  driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		  driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
			 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			 Thread.sleep(5000);
		  WebElement checkbox=driver.findElement(By.className("android.widget.CheckBox"));
		  TouchAction tc = new TouchAction(driver);
			
			tc.tap(tapOptions().withElement(element(checkbox))).perform();
			driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));
			tc.longPress(longPressOptions().withElement(element(checkbox)).withDuration(ofSeconds(3))).release().perform();
			driver.findElement(MobileBy.id("android:id/button1")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed"));
			
			
	  }

}
