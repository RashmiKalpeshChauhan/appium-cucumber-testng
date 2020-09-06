package com.mobile.pages;


import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SigninPage extends BasePage {
	@AndroidFindBy(id="net.gadm.tv:id/close_button")private MobileElement closeBtn;
	@AndroidFindBy(id="net.gadm.tv:id/close")private MobileElement popUpcloseBtn;
	@AndroidFindBy(id="net.gadm.tv:id/sign_up_link")private MobileElement signUp;	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Live TV')]")private MobileElement liveTv;
    @AndroidFindBy(id="net.gadm.tv:id/signIn")private MobileElement signIn;
	@AndroidFindBy(id="net.gadm.tv:id/availableCountries")private MobileElement availableCountryLink;
	@AndroidFindBy(id="net.gadm.tv:id/IVCountryFlag")private List<MobileElement> availableCountries;
	@AndroidFindBy(id="net.gadm.tv:id/IVCountryFlag")private List<MobileElement> exploreLink;
	
	
	public SigninPage clickCloseBtn() {
		click(closeBtn);
		return this;
	}
	public SigninPage popUpCloseBtn() {
		click(popUpcloseBtn);
		return this;
	}
	public SigninPage clickSignUp() {
		click(signUp);
		return this;
	}
	public SigninPage clickLiveTv() {
	
		//liveTv.get(1).click();
		click(liveTv);
		return this;
	}
	public SigninPage clickSignInBtn() {
		click(signIn);
		return this;
	}
	public SigninPage availableCountryLink() {
		click(availableCountryLink);
		return this;
	}
	public SigninPage availableCountryLinkDisplayed() {
		find(availableCountryLink,10);
		return this;
	}
//	public Boolean isCountryDisplayed() {		
//		return find(availableCountries,10).isDisplayed();
//	}
}
