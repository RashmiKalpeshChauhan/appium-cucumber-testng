package StepDefinitions;



import com.mobile.pages.HomePage;
import com.mobile.pages.SigninPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeScreen {
	
	@When("User clicks SignIn Button")
	public void userClickOnSignInButton() {
	  new HomePage().clickSignInBtn();
	}	
	@When("User clicks on the close icon")
	public void userClickOnCloseButton() {
	  new SigninPage().clickCloseBtn();
	}
	@When("User is on the home page")
	public void signinBtnDisplayed() {
	  new HomePage().isSignInBtnDisplayed();
	}	

	@When("User taps on the Explore JawwyTV link")
	public void userTapsOnTheSinginLink() {
	  new HomePage().clickExploreBtn();
	}
	
	@When("User clicks SignUp Button")
	public void userClicksOnTheCloseIcon() {		 
		 new SigninPage().clickSignUp();
	}
	
	@When("User clicks SignIn on popup")
	public void signInbuttonVisible() {
		new SigninPage().popUpCloseBtn();
	}
	@When("User navigates to Live TV screen")
	public void userClicksOnTheSignUpButton() {
		 new HomePage().clickMenu();
		 new SigninPage().clickLiveTv();
	}
	
	@When("User should see available countries link")
	public void userShouldSeeAvailableCountriesLink() {
		 new SigninPage().availableCountryLinkDisplayed();
	}

	@When("User clicks on available countries link")
	public void userClicksOnAvailableCountriesLink() {
		new SigninPage().availableCountryLink();
	}

	@Then("User should see list of countries")
	public void userShouldSeeListOfCountries() {
		new SigninPage().availableCountryLinkDisplayed();
	}


}
