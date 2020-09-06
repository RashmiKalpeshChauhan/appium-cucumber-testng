Feature: Login scenarios

@GuestUser
Scenario: Verify Guestuser is taken to HomeScreen after closing from Login screen
When User taps on the Explore JawwyTV link
And User clicks SignIn Button
And User clicks on the close icon
And User is on the home page

@GuestUser
Scenario: Verify Guestuser navigating from home is taken back to LoginScreen after clicking signIn on
popUP
When User is on the home page
And User navigates to Live TV screen
And User clicks SignIn on popup
Then User is on the home page

@GuestUser
Scenario: Validate user can access available countries link
When User clicks SignIn Button
And User clicks SignUp Button
And User should see available countries link
And User clicks on available countries link
Then User should see list of countries