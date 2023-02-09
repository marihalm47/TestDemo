@SinginSuite
Feature: User to sigin 

  @TestDemo_SignIn_01
  Scenario Outline: User SignIn into Project
    Given User is in sigin page 
    When  User Enters Username valid Userid
    And   User Enters Password valid password
    And   User clicks on sigin button 
    Then  User Redirect to home Page
    
    Examples:
    | Userid        | password  |
    |  Numpysdet84 |   sdet84batch | 
    