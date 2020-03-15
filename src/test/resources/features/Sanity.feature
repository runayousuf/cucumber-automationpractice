Feature: Sanity Test of Automation Practice Website.

  # Given, When,Then, And
  Background: This is a set up that runs before each scenario.
    Given Navigate to 'Automation Practice' site.

  Scenario: 'Evening Dresses' title displays as expected.
    Given Mousehover 'WOMEN' tab.
    And Click on 'EVENING DRESSES' tab in navigation menu.
    Then 'EVENING DRESSES' title displays.

