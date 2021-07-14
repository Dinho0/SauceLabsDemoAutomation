Feature: Shopping
  Background: After User Logged In
    Given I am on the login page
    And I enter the username
    And I enter the password
    When I click the login button
    Then I am successfully logged in.

    @logout
    Scenario: Logout
      Given I am successfully logged in.
      And I click the hamburger menu
      When I click the logout button
      Then I am successfully logged out