@Sample
Feature: Validate the login page of salesforce application

    @Test1
    Scenario: To validate the login functionality with valid user name and password.
      Given User should navigate to salesforce application
    When  User Enters the username "Anand" and password "abc"
      And user clicks the login button
    Then User navigates to Home page.
    # Then user clicks the forget password link

    @Test2
    Scenario: Validating the error message in login page

      Given User should navigate to salesforce application
      When User Enters the username "Learn" and password "123"
      And user clicks the login button
      Then User validates the error message "Please check your username and password. If you still can't log in, contact your Salesforce administrator.."

     @Test3
    Scenario Outline:  Validating the login functionality with proper credential
      Given User should navigate to salesforce application
      When  User Enters the username "<UserName>" and password "<Password>"
      And user clicks the login button
      Then User navigates to Home page.
      Examples:
        | UserName | Password |
        |Anand     |123       |
        |Aravinth  |abc       |
        |Surender  |345       |


    @AutoDynamicDropdown

    Scenario: Dynamic Dropdown
      Given User navigates to the application
      When User handles the dynamic dropdown

    @Calendar
    Scenario: calendar handling
      Given User navigates to the application
      When User handles the calendar boxes

    @StaleElement
    Scenario: Stale Element check
      Given User navigates to the application
      When User enters the username and password

    @Hyperlink
    Scenario: count the links
      Given User navigates to the application
      When User counts the links

     @ManualTest
    Scenario:
       Given Hello
