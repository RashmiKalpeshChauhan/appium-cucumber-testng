package com.mobile.pages;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverManager;
import utils.GlobalParams;
import utils.TestUtils;

public class BasePage {
	 private AppiumDriver<?> driver;
	
	    TestUtils utils = new TestUtils();

	    public BasePage(){
	        this.driver = new DriverManager().getDriver();
	       // return driver;
	        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	        
	    }

	    public void waitForVisibility(MobileElement e) {
	        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
	        wait.until(ExpectedConditions.visibilityOf(e));
	    }
	    public void clear(MobileElement e) {
	        waitForVisibility(e);
	        e.clear();
	    }

	    public void click(MobileElement e) {
	        waitForVisibility(e);
	        e.click();
	    }

	    public void click(MobileElement e, String msg) {
	        waitForVisibility(e);
	        utils.log().info(msg);
	        e.click();
	    }
	    public void sendKeys(MobileElement e, String txt) {
	        waitForVisibility(e);
	        e.sendKeys(txt);
	    }

	    public void sendKeys(MobileElement e, String txt, String msg) {
	        waitForVisibility(e);
	        utils.log().info(msg);
	        e.sendKeys(txt);
	    }

	    public String getAttribute(MobileElement e, String attribute) {
	        waitForVisibility(e);
	        return e.getAttribute(attribute);
	    }

	    public String getText(MobileElement e, String msg) {
	        String txt;
	        txt = getAttribute(e, "text");
	        utils.log().info(msg + txt);
	        return txt;
	    }
	   
	    public void closeApp() {
	        ((InteractsWithApps) driver).closeApp();
	    }

	    public void launchApp() {
	        ((InteractsWithApps) driver).launchApp();
	    }

	    public MobileElement andScrollToElementUsingUiScrollable(String childLocAttr, String childLocValue) {
	        return (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
	                "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
	                        + "new UiSelector()."+ childLocAttr +"(\"" + childLocValue + "\"));");
	    }


	    public MobileElement scrollToElement(MobileElement element, String direction) throws Exception {
	        Dimension size = driver.manage().window().getSize();
	        int startX = (int) (size.width * 0.5);
	        int endX = (int) (size.width * 0.5);
	        int startY = 0;
	        int endY = 0;
	        boolean isFound = false;

	        switch (direction) {
	            case "up":
	                endY = (int) (size.height * 0.4);
	                startY = (int) (size.height * 0.6);
	                break;

	            case "down":
	                endY = (int) (size.height * 0.6);
	                startY = (int) (size.height * 0.4);
	                break;
	        }

	        for (int i = 0; i < 3; i++) {
	            if (find(element, 1)) {
	                isFound = true;
	                break;
	            } else {
	                swipe(startX, startY, endX, endY, 1000);
	            }
	        }
	        if(!isFound){
	            throw new Exception("Element not found");
	        }
	        return element;
	    }



	    public boolean find(final MobileElement element, int timeout) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, timeout);
	            return wait.until(new ExpectedCondition<Boolean>() {
	                @Override
	                public Boolean apply(WebDriver driver) {
	                    if (element.isDisplayed()) {
	                        return true;
	                    }
	                    return false;
	                }
	            });
	        } catch (Exception e) {
	            return false;
	        }
	    }


	    public void swipe(int startX, int startY, int endX, int endY, int millis)
	            throws InterruptedException {
	        TouchAction t = new TouchAction(driver);
	        t.press(point(startX, startY)).waitAction(waitOptions(ofMillis(millis))).moveTo(point(endX, endY)).release()
	                .perform();
	    }
}
