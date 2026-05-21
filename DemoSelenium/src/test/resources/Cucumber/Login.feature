@login

Feature: Mercury Tours Login Functionality


Scenario: Valid login
  Given user is on Mercury Tours login page
  When user enters "tutorial" and "tutorial"
  Then user should click login button
  And user should click on the Flights
  And click on the flight details 
  And user is on  Flight Finder page
  And click on the type Round trip Radio button
  And select the all dropdown(Passengers,Departing From,On,Arriving In,Returning)
  Then Need to select Preferences radio button of Service Class (Economy class)
  And click the Airline
  And select the continue button
  
