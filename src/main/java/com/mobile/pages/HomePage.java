package com.mobile.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.TestUtils;

public class HomePage extends BasePage {
	@AndroidFindBy(id="net.gadm.tv:id/btn_login")private MobileElement signin;
	@AndroidFindBy(className="android.widget.ImageButton")private MobileElement menu;
	@AndroidFindBy(id="net.gadm.tv:id/explore_btn")private MobileElement exploreBtn;
	
	
	public HomePage isSigninButtonPrsent(){
		find(signin,10);
		return this;
	}
	
	public HomePage clickSignInBtn() {
		click(signin);
		return this;
	}
	public HomePage clickMenu() {
		click(menu);
		return this;
	}
	public HomePage clickExploreBtn() {
		click(exploreBtn);
		return this;
	}
	
	public Boolean isSignInBtnDisplayed() {		
	return find(signin,10);
}
}
