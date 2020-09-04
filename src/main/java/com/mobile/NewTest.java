package com.mobile;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	AppiumDriver driver ;
	
	@Test
	public void invalidUsername() throws Exception {
		MobileElement userName= (MobileElement) driver.findElementByAccessibilityId("test-Username");
		MobileElement password= (MobileElement) driver.findElementByAccessibilityId("test-Password");
		MobileElement loginButton= (MobileElement) driver.findElementByAccessibilityId("test-LOGIN");
		userName.sendKeys("test");
		password.sendKeys("secret_sauce");
		loginButton.click();
		MobileElement errorText= (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView");
		String errormsg=errorText.getAttribute("text");
		String expctedtext="Username and password do not match any user in this service.";
	}
	
	@Test
	public void invalidPassword() throws Exception {
		MobileElement userName= (MobileElement) driver.findElementByAccessibilityId("test-Username");
		MobileElement password= (MobileElement) driver.findElementByAccessibilityId("test-Password");
		MobileElement loginButton= (MobileElement) driver.findElementByAccessibilityId("test-LOGIN");
		userName.sendKeys("standard_user");
		password.sendKeys("invalidpassword");
		loginButton.click();
		MobileElement errorText= (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView");
		String errormsg=errorText.getAttribute("text");
		String expctedtext="Username and password do not match any user in this service.";
	}
	@Test
	public void successfulLogin() throws Exception {
		MobileElement userName= (MobileElement) driver.findElementByAccessibilityId("test-Username");
		MobileElement password= (MobileElement) driver.findElementByAccessibilityId("test-Password");
		MobileElement loginButton= (MobileElement) driver.findElementByAccessibilityId("test-LOGIN");
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		MobileElement errorText= (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]/preceding-sibling::android.view.ViewGroup/android.widget.TextView");
		String errormsg=errorText.getAttribute("text");
		String expctedtext="PRODUCTS";
		Assert.assertEquals(errormsg, expctedtext);
	}
	
	@BeforeClass
	public void beforeClass() throws Exception {
		AppiumDriverLocalService service = null;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Samsung Galaxy S7 edge");
		cap.setCapability("udid", "ce11160bda21483003");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0.0");
		cap.setCapability("appPackage", "com.swaglabsmobileapp");
		cap.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity");
		cap.setCapability("app", "C:\\Users\\DELL\\eclipse-workspace\\appiumtest\\src\\main\\resources\\app\\Android.SauceLabs.Mobile.Sample.app.2.2.1.apk");
		URL url=new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		String sessionId = driver.getSessionId().toString();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
