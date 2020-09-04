package com.mobile.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mobile.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.TestUtils;

public class TenantPage extends BaseTest {
	@AndroidFindBy(id="net.gadm.tv.beta:id/tenants_selector_holder")private MobileElement tenantId;
	@AndroidFindBy(id="net.gadm.tv.beta:id/select_tenant_button")private MobileElement tenantButton;
	@AndroidFindBy(className="android.widget.ListView")private MobileElement dropdown;
	@AndroidFindBy(id="net.gadm.tv.beta:id/signIn")private MobileElement signin;
	@AndroidFindBy(id="net.gadm.tv.beta:id/close_button")private MobileElement closeButton;
	@AndroidFindBy(id="net.gadm.tv.beta:id/select_operator_spinner")private MobileElement dropDown;
	@AndroidFindBy(id="net.gadm.tv.beta:id/explore_btn")private MobileElement exploreLink;
	
	

	

	public TenantPage clickTenantBtn () {
		click(tenantButton);
		return this;
	}
	public TenantPage clickDropDown () {
		 click(dropDown);
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  List<WebElement> list = driver.findElements(By.className("android.widget.CheckedTextView"));
		 list.get(2).click();
		 return this;
	}
	public TenantPage clickSignIn () {
		click(signin);
		return this;
	}
	public TenantPage clickCloseButton () {
		click(closeButton);
		return this;
	}
	public TenantPage clickExploreLink () {
		click(exploreLink);
		return this;
	}
}
