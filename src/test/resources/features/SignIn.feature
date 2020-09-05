Feature: SignIn Scenarios

@SignUp
Scenario: Validate user can access available countries link
When User taps on the Tenant DropDown select option
And user click on load config button
And User click on signin link
And User click on signup button
And User should see available countries link
And User clicks on available countries link
Then User should see list of countries