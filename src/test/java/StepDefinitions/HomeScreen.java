package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeScreen {

	@When("User taps on the Singin link")
	public void userTapsOnTheSinginLink() {
	   System.out.println("Hi this is Sreedhar1");
	}

	@When("User is on the Signin page")
	public void userIsOnTheSigninPage() {
		System.out.println("Hi this is Sreedhar2");
	}

	@When("User clicks on the close icon")
	public void userClicksOnTheCloseIcon() {
		System.out.println("Hi this is Sreedhar3");
	}

	@When("User is on the home page")
	public void userIsOnTheHomePage() {
		System.out.println("Hi this is Sreedhar4");
	}

//	@When("User taps on Join free for days link")
//	public void userTapsOnJoinFreeForDaysLink(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("^User should see available countries link$")
//	public void userShouldSeeAvailableCountriesLink() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("^User clicks on available countries link$")
//	public void userClicksOnAvailableCountriesLink() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("^User should see list of countries$")
//	public void userShouldSeeListOfCountries() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("^User should see sign in link$")
//	public void userShouldSeeSignInLink() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on sign in link$")
//	public void userClicksOnSignInLink() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("^Sign up button should appear$")
//	public void signUpButtonShouldAppear() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
