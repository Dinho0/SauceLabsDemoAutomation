Feature: Login
  @login
  Scenario Outline:  Logins
    Given I am on the login page
    And I enter the username as "<Username>"
    And I enter the password as "<Password>"
    When I click the login button
    Then I should be successfully logged in.

    Examples:
      | Username                | Password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

