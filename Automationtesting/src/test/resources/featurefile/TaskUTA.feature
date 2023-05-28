Feature: To validate the highligted 5 platforms of UTA homepage.

  @TestUta1
  Scenario: To validate the platform highlights of UTA.
    Given User enters the UTA home page
    When User clicks the Platform highlights button on top
    Then User should be able to navigate to the bottom of the page to see the available options

  Scenario: To validate the platform button available at the bottom of the home page
    Given User enters the UTA home page
    When User clicks the first button (platform) inside the Platform highlights page
    Then User should be able to navigate to platform link

  Scenario: To validate the case studies button available at the bottom of the home page
    Given User enters the UTA home page
    When User clicks the case studies button inside the Platform highlights page
    Then User should be able to navigate to case studies link

  Scenario: To validate the Resources button available at the bottom of the home page
    Given User enters the UTA home page
    When User clicks the resoursces button inside the Platform highlights page
    Then User should be able to navigate to resources link

  Scenario: To validate the About button available at the bottom of the home page
    Given User enters the UTA home page
    When User clicks the About button inside the Platform highlights page
    Then User should be able to navigate to About link

  Scenario: To validate the Contact button available at the bottom of the home page
    Given User enters the UTA home page
    When User clicks the Contact button inside the Platform highlights page
    Then User should be able to navigate to Contact link