$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Guestuser is taken to HomeScreen after closing from Login screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GuestUser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User taps on the Explore JawwyTV link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.userTapsOnTheSinginLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks SignIn Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.userClickOnSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the close icon",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.userClickOnCloseButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on the home page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.signinBtnDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Guestuser navigating from home is taken back to LoginScreen after clicking signIn on",
  "description": "popUP",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GuestUser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the home page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.signinBtnDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Live TV screen",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.userClicksOnTheSignUpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks SignIn on popup",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.signInbuttonVisible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.signinBtnDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate user can access available countries link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GuestUser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks SignIn Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.userClickOnSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks SignUp Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.userClicksOnTheCloseIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see available countries link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.userShouldSeeAvailableCountriesLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on available countries link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.userClicksOnAvailableCountriesLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see list of countries",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HomeScreen.userShouldSeeListOfCountries()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});