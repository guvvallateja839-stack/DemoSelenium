@Test

Feature: Flipkart Log in functionality  
Scenario:Valid Log in feature 
Given user is Flipkart page
And click on login button
When user Enter Email/Mobile number
Then click on the Request OTP
When user enters valid OTP
Then OTP should be verified successfully
