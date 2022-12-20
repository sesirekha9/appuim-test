package appuimdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class exampletest {AndroidDriver<AndroidElement> driver;


@BeforeTest
	public void BT() throws MalformedURLException
	{
DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"E://chromedriver//chromedriver.exe");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	
	}


public void tc()
{
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//*[@class='yuRUbf'")).sendKeys("flipkart",Keys.ENTER);
	WebElement text= driver.findElement(By.xpath("//*[@href='https://www.flipkart.com/']"));
	
	
}
	
	

}
