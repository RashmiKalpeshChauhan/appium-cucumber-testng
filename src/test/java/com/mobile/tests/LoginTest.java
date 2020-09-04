package com.mobile.tests;

import org.testng.annotations.Test;

import com.mobile.BaseTest;
import com.mobile.pages.LoginPage;
import com.mobile.pages.ProductsPage;

import io.appium.java_client.MobileElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginTest extends BaseTest {
	LoginPage loginPage;
	ProductsPage productPage;
	InputStream datais;
	JSONObject loginUsers;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		try {
			String dataFileName="data/loginUser.json";
			datais=getClass().getClassLoader().getResourceAsStream(dataFileName);
			JSONTokener tokner=new JSONTokener(datais);
			loginUsers=new JSONObject(tokner);	
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			if(datais!=null) {
				datais.close();
			}
		}
		
	}

	@AfterClass
	public void afterClass() {
	}


	@BeforeMethod
	public void beforeMethod(Method m) {		
		loginPage=new LoginPage();
		System.out.println("\n"+"******Starting test"+m.getName()+"******"+"\n");
	}

	@AfterMethod
	public void afterMethod() {
	}
	
	@Test
	public void invalidUsername() throws Exception {
		loginPage.enterUsername(loginUsers.getJSONObject("invalidUser").getString("username"));
		loginPage.enterPassword(loginUsers.getJSONObject("invalidUser").getString("password"));
		loginPage.pressLoginButton();
		String errorText=loginPage.getErrorTxt();
		String expctedtext=strings.get("err_invalid_username_or_password");
		System.out.println("actual error text"+errorText+ "\n"+ "Expected Error txt"+expctedtext);
		Assert.assertEquals(errorText, expctedtext);		
	}
	
	@Test
	public void invalidPassword() throws Exception {
		loginPage.enterUsername(loginUsers.getJSONObject("invalidPassword").getString("username"));
		loginPage.enterPassword(loginUsers.getJSONObject("invalidPassword").getString("password"));
		loginPage.pressLoginButton();
		String errorText=loginPage.getErrorTxt();
		String expctedtext=strings.get("err_invalid_username_or_password");
		System.out.println("actual error text"+errorText+ "\n"+ "Expected Error txt"+expctedtext);
		Assert.assertEquals(errorText, expctedtext);		
	}
	@Test
	public void successfulLogin() throws Exception {
		loginPage.enterUsername(loginUsers.getJSONObject("validUser").getString("username"));
		loginPage.enterPassword(loginUsers.getJSONObject("validUser").getString("password"));
		productPage= loginPage.pressLoginButton();
		String actualProductTitle=productPage.getTitle();	
		String expctedtext=strings.get("product_title");
		System.out.println("actual error text"+actualProductTitle+ "\n"+ "Expected Error txt"+expctedtext);
		Assert.assertEquals(actualProductTitle, expctedtext);
	}
	

}
