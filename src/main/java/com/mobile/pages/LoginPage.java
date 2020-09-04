package com.mobile.pages;

import com.mobile.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseTest {
	@AndroidFindBy(accessibility="test-Username")private MobileElement userNametxtFild;
	@AndroidFindBy(accessibility="test-Password")private MobileElement passwordtxtFild;
	@AndroidFindBy(accessibility="test-LOGIN")private MobileElement loginButton;
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")private MobileElement errTxt;	
	
	public LoginPage enterUsername(String userName) {
		sendKeys(userNametxtFild,userName);
		return this;
	}
	public LoginPage enterPassword(String password) {
		sendKeys(passwordtxtFild,password);
		return this;
	}
	public ProductsPage pressLoginButton() {
		click(loginButton);
		return new ProductsPage();
	}
	public String getErrorTxt() {
		return getAttribute(errTxt,"text");
	}
}

