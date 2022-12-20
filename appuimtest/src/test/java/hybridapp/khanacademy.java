package hybridapp;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.android.nativekey.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class khanacademy {
	AndroidDriver<AndroidElement> driver;
	 

	  @BeforeTest
		public void BT() throws MalformedURLException
		{
		  DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
			driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		}
	  @Test(enabled = false)
	  public void tc1() throws InterruptedException {
			Thread.sleep(15000);
			driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
			Thread.sleep(15000);
			driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click();
			Thread.sleep(10000);
			driver.findElement(MobileBy.className("android.widget.LinearLayout")).click();
	  }
			
	  @Test(enabled = true)
	  public void tc2() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_search")).click();
		  Thread.sleep(5000);
		  driver.findElementByAndroidUIAutomator("text(\"Science\")").click();
		  
		  driver.findElementByAndroidUIAutomator("text(\"Class 10 Biology (India)\")").click();
		  Thread.sleep(5000);
			//driver.findElementByAndroidUIAutomator("text(\"Coordination in plants\")").click();
			//Thread.sleep(5000);
	  }
	  @Test(enabled=true)
	  public void tc3() throws InterruptedException
	  {
	  	driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
	  	Thread.sleep(5000);
	  	driver.findElementByAndroidUIAutomator("text(\"Math\")").click();
	  	Thread.sleep(5000);
	  	driver.findElementByAndroidUIAutomator("text(\"Class 6 (Foundation)\")").click();
	  	Thread.sleep(5000);
	  	driver.findElementByAndroidUIAutomator("text(\"Multiplication and division\")").click();
	  	Thread.sleep(5000);
	  	driver.findElementByAndroidUIAutomator("text(\"Multiplying multi-digit numbers\")").click();
	  	Thread.sleep(5000);
	  	driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Bookmark\"]/android.widget.ImageView")).click();
	  	Thread.sleep(5000);
	  	driver.findElementByAndroidUIAutomator("text(\"GOT IT\")").click();
	  	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  }
	  @Test(enabled = false)
		public void tc4() throws InterruptedException {
			Thread.sleep(7000);
			driver.findElementByAndroidUIAutomator("text(\"Science\")").click();
			Thread.sleep(5000);
			TouchAction s5=new TouchAction(driver);
			s5.longPress(PointOption.point(858,1544)).moveTo(PointOption.point(858,1200)).release().perform();
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"Class 12 Physics (India)\")").click();
			Thread.sleep(7000);
			driver.findElementByAndroidUIAutomator("text(\"Electric charges and field\")").click();
			Thread.sleep(5000);
			driver.findElementByAndroidUIAutomator("text(\"Electric charge review\")").click();
			Thread.sleep(10000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Add Bookmark\"])[1]/android.widget.ImageView")).click();
			Thread.sleep(5000);
			driver.findElement(MobileBy.id("android:id/button2")).click();
			Thread.sleep(5000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  }
	  @Test(enabled = false)
		public void tc5 () throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
			Thread.sleep(4000);
			driver.findElementByAndroidUIAutomator("text(\"View progress report\")").click();
			Thread.sleep(20000);
			TouchAction s6=new TouchAction(driver);
			s6.longPress(PointOption.point(809,1930)).moveTo(PointOption.point(809,520)).release().perform();
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			Thread.sleep(5000);
			driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			Thread.sleep(5000);
			TouchAction s7=new TouchAction(driver);
			s7.longPress(PointOption.point(720,1879)).moveTo(PointOption.point(720,962)).release().perform();
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"Sign out\")").click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.id("android:id/button1")).click();
			Thread.sleep(5000);
			driver.pressKey(new KeyEvent(AndroidKey.HOME));
			
		}

}

