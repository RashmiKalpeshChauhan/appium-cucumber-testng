package StepDefinitions;

import com.mobile.pages.TenantPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeScreen {

	@When("User taps on the Singin link")
	public void userTapsOnTheSinginLink() {
	  new TenantPage().clickSignIn();
	}
	@When("user click on load config button")
	public void userTapsOnTheLoadConfig() {
	  new TenantPage().clickTenantBtn();
	}
	@When("User taps on the Tenant DropDown select option")
	public void selectoption() {
	  new TenantPage().clickDropDown();
	}
	@When("User is on the Signin page")
	public void userIsOnTheSigninPage() {
		System.out.println("Hi this is Sreedhar2");
	}

	@When("User clicks on the close icon")
	public void userClicksOnTheCloseIcon() {
		 new TenantPage().clickCloseButton();
	}

	@When("User is on the home page")
	public void userIsOnTheHomePage() {
		System.out.println("Hi this is Sreedhar4");
	}

//	@When("User taps on Join free for 7 days link")
//	public void userTapsOnJoinFreeForDaysLink(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Hi this is Sreedhar4");
//	}
//
//	@When("User should see available countries link")
//	public void userShouldSeeAvailableCountriesLink() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Hi this is Sreedhar4");
//	}
//
//	@When("User clicks on available countries link")
//	public void userClicksOnAvailableCountriesLink() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Hi this is Sreedhar4");
//	}
//
//	@Then("User should see list of countries")
//	public void userShouldSeeListOfCountries() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Hi this is Sreedhar4");
//	}


}
