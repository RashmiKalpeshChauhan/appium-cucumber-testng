Feature: Login scenarios

@GuestUser
Scenario: Verify user is taken to Singin Screen after clicking singin button
When User taps on the Singin link
And User is on the Signin page
And User clicks on the close icon
And User is on the home page


#@SignUp
#Scenario: Validate user can access available countries link
#When User taps on Join free for 7 days link
#And User should see available countries link
#And User clicks on available countries link
#Then User should see list of countries
#
#@SignUp
#Scenario: Verify user is taken to Singup Screen after clicking signin button 
#When User taps on Join free for 7 days link
#And User should see sign in link
#And User clicks on sign in link
#Then Sign up button should appear.