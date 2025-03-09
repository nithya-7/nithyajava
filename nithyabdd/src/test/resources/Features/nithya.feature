Feature: feature to test login functionality

  Scenario: check login is succesfull with valid credentials
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to the home page
    
    // after pasteing it - slelect all => ryt click => prety formate 
    // the to run - ryt click => run 
