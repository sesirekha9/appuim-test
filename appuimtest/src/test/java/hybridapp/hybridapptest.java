package hybridapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class hybridapptest {
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
	  @Test(enabled=false)
	  public void negativecase() throws InterruptedException
	  {
		 //driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		  Thread.sleep(6000);
		  driver.findElement(MobileBy.id("android:id/text1")).click();
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"))").click();
		  Thread.sleep(4000);
		 //driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("sesirekha");
		  driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
		  Thread.sleep(4000);
		  driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		  String toast = driver.findElement(By.xpath("//android.widget.Toast[1]")).getText();
		  System.out.println(toast);
		  
		}
	  @Test(enabled=true)
	  public void positivecase() throws InterruptedException
	  {
		  //driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		  Thread.sleep(4000);
		  driver.findElement(MobileBy.id("android:id/text1")).click();
		  Thread.sleep(4000);
		  
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"))").click();
			Thread.sleep(4000);
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("sesi");
			Thread.sleep(4000);
			
			driver.hideKeyboard();
			
			//driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
		  driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
		  Thread.sleep(4000);
		  driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		  Thread.sleep(4000);
		 driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		 driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 Thread.sleep(5000);
			String price1=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
			//first remove the character using substring
			price1=price1.substring(1);
			//convert the string into Double using parseDouble
			Double cost1=Double.parseDouble(price1);
			System.out.println(cost1);
			
			String price2=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
			price2=price2.substring(1);
			Double cost2=Double.parseDouble(price2);
			System.out.println(price2);
			Double Totalprice=cost1+cost2;
			System.out.println(Totalprice);
			
			
			
			driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
			driver.findElement(MobileBy.className("android.widget.Button")).click();
			
		 
		 
		 
		  
		  

}
}
