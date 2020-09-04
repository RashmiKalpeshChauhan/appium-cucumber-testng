package com.mobile.tests;

import org.testng.annotations.Test;

import com.mobile.BaseTest;
import com.mobile.pages.TenantPage;


public class NewTest extends BaseTest {
 

  @Test
	public void invalidUsername() throws Exception {
	  TenantPage tenantPage=new TenantPage();
	  tenantPage.clickDropDown();
	  tenantPage.clickTenantBtn();	
	  tenantPage.clickSignIn();
	  tenantPage.clickCloseButton();
	}
}
