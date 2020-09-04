package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Calculator {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			opencalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}
	}

	public static void opencalculator() throws Exception {
		AppiumDriverLocalService service = null;
		//service = AppiumDriverLocalService.buildDefaultService();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Samsung Galaxy S7 edge");
		cap.setCapability("udid", "ce11160bda21483003");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0.0");
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		//service.start();
		URL url=new URL("http://localhost:4723/wd/hub");
		AppiumDriver driver = new AndroidDriver(url, cap);
		String sessionId = driver.getSessionId().toString();
		MobileElement seven=(MobileElement) driver.findElementById("bt_07");
		MobileElement four=(MobileElement) driver.findElementById("bt_04");
		MobileElement add=(MobileElement) driver.findElementById("bt_add");
		//MobileElement equal=(MobileElement) driver.findElementById("bt_equal");
		//MobileElement result=(MobileElement) driver.findElementById("txtCalc");
		WebElement equal= driver.findElementById("bt_equal");
		By result=By.id("txtCalc");
		seven.click();
		add.click();
		four.click();
		equal.click();
		String actualResult= driver.findElement(result).getText();
		System.out.println(actualResult);
		
	}
}
