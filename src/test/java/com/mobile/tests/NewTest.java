package com.mobile.tests;

import org.testng.annotations.Test;


import com.mobile.pages.TenantPage;


public class NewTest {
 

  @Test
	public void invalidUsername() throws Exception {
	  TenantPage tenantPage=new TenantPage();
	  tenantPage.clickDropDown();
	  tenantPage.clickTenantBtn();	
	  tenantPage.clickSignIn();
	  tenantPage.clickCloseButton();
	}
}
