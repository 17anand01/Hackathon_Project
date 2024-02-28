Feature: Car Insurance Page

  @sanity @regression
  Scenario: Capture the error message
    Given User navigate to the car insurance page
    When User clicks on to the car insurance
    Then User captures the error message
    When User enters the car number and clicks on to the view price button
    Then User captures the email error message
