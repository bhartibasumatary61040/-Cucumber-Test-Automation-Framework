#Author
#Date
#Description

@SmokeFeature

Feature: feature to test login functionality

 @Smoketest
  Scenario: Check login is successfull with valid credentials
  
    Given user is on login page
    
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

 