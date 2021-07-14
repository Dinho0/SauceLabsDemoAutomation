Feature: Shopping
  Background: After User Logged In
    Given I am on the login page
    And I enter the username
    And I enter the password
    When I click the login button
    Then I am successfully logged in.

    @multipleProducts
    Scenario Outline: Search and add multiple products o the cart
      Given I am successfully logged in.
      And I  add a "<product1>" to the cart
      And I  add a "<product2>" to the cart
      And I  add a "<product3>" to the cart
      When I proceed to checkout
      And I fill in my firstname as "<firstname>"
      And I fill in my lastname as "<lastname>"
      And i fill in my postal code as "<postalcode>"
      And I click the continue button
      And I am on the checkout overview page
      And I click finish
      Then my order should be successfully placed.

      Examples: products
        | product1            | product2              | product3          | firstname  | lastname | postalcode |  |
        | Sauce Labs Backpack | Sauce Labs Bike Light | Sauce Labs Onesie | Christaino | Ronaldo  | 2009       |  |

      @filter
      Scenario Outline: Filter products  and order a product
        Given I am successfully logged in.
        And I "<filter>" inventory
        And I  add a "<product1>" to the cart
        When I proceed to checkout
        And I fill in my firstname as "<firstname>"
        And I fill in my lastname as "<lastname>"
        And i fill in my postal code as "<postalcode>"
        And I click the continue button
        And I am on the checkout overview page
        And I click finish
        Then my order should be successfully placed.

        Examples: products
          | product1                 | filter      |  | firstname  | lastname | postalcode |  |
          | Sauce Labs Backpack      | High to low |  | Christaino | Ronaldo  | 2009       |  |
          | Sauce Labs Bike Light    | Low to high |  | Lionel     | Messi    | 2004       |  |
          | Sauce Labs Onesie        | A to Z      |  | Kylian     | Mbappe   | 1001       |  |
          | Sauce Labs Fleece Jacket | Z to A      |  | Sergio     | Ramos    | 5000       |  |





