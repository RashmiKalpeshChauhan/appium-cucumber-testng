Feature: Login scenarios

@SignInLink
Scenario: Verify user is taken to Singin Screen after clicking singin button
When User taps on the Tenant DropDown select option
And user click on load config button
And User click on signin link
And User clicks on the close icon
Then User is on the home page