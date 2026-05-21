@commerce
Feature:Nopcommerce Register funcationality

Scenario: Successful registration with valid details
Given user is on registration page 
When click Register  button
Then  user selects gender as "Male" 
And user enters first name "guvvalla" 
And user enters last name "teja" 
And user enters email "thejakumar8123@gmail.com" 
And user enters password "Teja@1234"
And confirm password "Teja@1234"
And user clicks on Register buutton 
Then user should be registered successfully
