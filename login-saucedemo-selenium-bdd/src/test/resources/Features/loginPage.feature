Feature: Saucedemo Login Page

  Scenario: Logo presence at saucedemo page
    Given I launch chrome browser
    When I open saucedemo homepage
    Then I verify the logo presence
    And I close the browser
