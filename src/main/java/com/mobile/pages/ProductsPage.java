package com.mobile.pages;

import com.mobile.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductsPage  extends BaseTest{
	@AndroidFindBy(xpath="//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]/preceding-sibling::android.view.ViewGroup/android.widget.TextView")private MobileElement productTxt;	
	
	public String getTitle() {
		return getAttribute(productTxt,"text");
	}	
}
