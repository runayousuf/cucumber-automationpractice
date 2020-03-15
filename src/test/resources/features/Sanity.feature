Feature: Sanity Test of Automation Practice Website.

  # Given, When,Then, And
  Background: This is a set up that runs before each scenario.
    Given Navigate to 'Automation Practice' site.

  @dev
  Scenario: 'Evening Dresses' title displays as expected.
    Given I mousehover 'WOMEN' tab.
    And I click on 'EVENING DRESSES' tab in navigation menu.
    Then I verify'EVENING DRESSES' title displays.

