package com.mobile;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utils.TestUtils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class BaseTest {
	protected static AppiumDriver driver ;
	protected static Properties props;
	protected static HashMap<String,String> strings = new HashMap<String,String>();
	InputStream inputStream;
	InputStream stringsis; 
	TestUtils utils;
	
	public BaseTest() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@Parameters({"platformName","platformVersion","deviceName"})
	@BeforeTest
	public void beforeTest(String platformName,String platformVersion,String deviceName) throws Exception {
		try {
			props =new Properties();
			String propFileName="config.properties";
			String xmlFileName="strings/strings.xml";
			inputStream=getClass().getClassLoader().getResourceAsStream(propFileName);
			props.load(inputStream);
			stringsis=getClass().getClassLoader().getResourceAsStream(xmlFileName);
			utils =new TestUtils();
			strings=utils.parseStringXML(stringsis);
			AppiumDriverLocalService service = null;
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", deviceName);
			cap.setCapability("platformName", platformName);
			cap.setCapability("platformVersion", platformVersion);
			cap.setCapability("automationName", props.getProperty("androidAutomationName"));
			cap.setCapability("appPackage", props.getProperty("androidAppPackage"));			
			cap.setCapability("appActivity", props.getProperty("androidAppActivity"));	
			URL res = getClass().getResource(props.getProperty("androidAppLocation"));
			File file = Paths.get(res.toURI()).toFile();
			String appUrl = file.getAbsolutePath();
			cap.setCapability("app", appUrl);
			System.out.println("appurl-"+appUrl);
			URL url=new URL(props.getProperty("appiumURL"));		
			driver = new AndroidDriver(url, cap);
			String sessionId = driver.getSessionId().toString();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(inputStream !=null) {
				inputStream.close();
			}
			if(stringsis !=null) {
				stringsis.close();
			}
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
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
