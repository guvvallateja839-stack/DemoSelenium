@nukari
Feature: Naukri log in functionality 
 Scenario Outline: login  
 Given user is Naukri log in page
 When user enters "<username>" and "<password>"
  Then user should see "<result>"


Examples:
  | username                 | password  |
  | guvvallateja839@gmail.com | Teja@1234 |