Feature: Health Insurance Page

  @sanity @regression
  Scenario: Displaying the health insurance submenus
    Given User navigates to the home page
    When User hover to the health insurance
    Then User displays submenus of health insurance
