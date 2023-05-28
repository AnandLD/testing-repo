Feature: To validate the homepage of the ACME bank application.

  Scenario: To validate the card types field in the homepage
    Given User navigates to the homepage of ACME application.
    When User clicks on the card types button.
    Then User should be able to see credit card & Debit card options.

  Scenario: To validate the banner message at the top of the homepage.
    Given User navigates to the homepage of the ACME application.
    Then User should be able to see the message in the banner.
    And The message should be about the nearest branch and its closing time in Hours Minutes seconds format .

  Scenario: To Validate the financial overview in the homepage.
    Given User navigates to the homepage of the ACME application.
    Then The user should be able to see financial overview below the banner.
    And User validates the total balance, credit available & due today fields are available in dollors.