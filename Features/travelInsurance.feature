Feature: Travel Insurance page

  @sanity @regression
  Scenario: Displaying the travel insurance for students
    Given User navigates to the travel insurance page
    When User selects the location and select the date
    And User selects two travellers and selects no button
    And User enters the mobile number
    And User selects the student and selects the traveller
    Then Displays the first three travel insurance plan
