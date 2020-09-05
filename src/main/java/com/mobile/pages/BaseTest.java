package com.mobile.pages;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utils.TestUtils;

public class BaseTest {
	protected static AppiumDriver driver ;
	protected static Properties props;
	InputStream inputStream;
	public BaseTest() {
	
	}
public void setDriver(AppiumDriver driver) {
	this.driver=driver;
}
	public AppiumDriver getDriver() {
		return driver;
	}
	
	public void intializeDriver(String platformName,String platformVersion,String deviceName) {
		try {
			props =new Properties();
			String propFileName="config.properties";
			inputStream=getClass().getClassLoader().getResourceAsStream(propFileName);
			props.load(inputStream);
			AppiumDriverLocalService service = null;
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", deviceName);
			cap.setCapability("platformName", platformName);
			cap.setCapability("platformVersion", platformVersion);
			cap.setCapability("automationName", props.getProperty("androidAutomationName"));
			cap.setCapability("appPackage", props.getProperty("androidAppPackage"));			
			cap.setCapability("appActivity", props.getProperty("androidAppActivity"));
			URL appUrl=getClass().getClassLoader().getResource(props.getProperty("androidAppLocation"));
			cap.setCapability("app", appUrl);
			URL url=new URL(props.getProperty("appiumURL"));
			driver = new AndroidDriver(url, cap);
			String sessionId = driver.getSessionId().toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void waitForVisibility(MobileElement e) {
		WebDriverWait wait=new WebDriverWait(driver,TestUtils.WAIT);
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	public void click(MobileElement e) {
		waitForVisibility(e);
		e.click();
	}
	public void sendKeys(MobileElement e,String txt) {
		waitForVisibility(e);
		e.sendKeys(txt);
	}
	public String getAttribute(MobileElement e,String attribute) {
		waitForVisibility(e);
		return e.getAttribute(attribute);
	}
	public void quitDriver() {
		driver.quit();
	}

}