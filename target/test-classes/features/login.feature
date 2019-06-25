#Author:Syntax Team             //john.smith@fellsfargo.com
@sprint3
Feature: Login

  Background: 
    Given I see OrangeHrm logo

  @smoke @test
  Scenario: Valid Login
    And I see OrangeHrm logo
    When I enter valid username and password
    And I click login button
    Then I successfully logged in

  @regression @login
  Scenario: Invalid Login
    And I see OrangeHrm logo
    When I enter valid username and password
    And I click login button
    Then I successfully logged in

  Scenario: Error message validation
    When I enter invalid username and password I see errorMessage
    
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123??   | Invalid Credentials |
      | Admin1   | Syntax123!?? | Invalid Credentials |
      | Admin2   | Syn  | Invalid Credentials |
