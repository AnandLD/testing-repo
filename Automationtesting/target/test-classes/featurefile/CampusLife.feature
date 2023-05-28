Feature: Handling the highlighted fields inside the campus application

  @Campuslife
  Scenario: To Validate the contact us page of the campus life application
    Given User navigates to campus life application
    When user fills the form
    And Clicks the send button
    Then User should be able to send successfully

  @Flexib
  Scenario: To validate the Flexib Application
    Given User navigates to Flexib application
    When user fills the details in the form
    And User clicks the submit button
    Then User should be able to submit successfully

  @Swaglabs
  Scenario: To validate the Swaglabs application
    Given User navigates to Swaglabs application
    When User Enters the username and password
    And User clicks the login button
    Then User should be able to navigate to the swaglabs home page

  @Swaglabs
  Scenario: To validate the Dropdown option
    Given User navigates to Swaglabs application
    And User Enters the username and password
    When User clicks the filter dropdown & clicks low to high option
    Then User should be able to get the filtered result

  @Dynamicdrop
  Scenario: Dynamic Dropdown
    Given user navigates to the application
    When User handles the auto suggestive dropdown

