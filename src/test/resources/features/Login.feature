Feature: Login functionality

  @sprint1 @regression @tc1101
  Scenario: Valid admin login
   # Given user is navigated to HRMS application
    When user enters valid username and valid password
    And user clicks on login button
    Then  user is successfully logged in
    And click on admin option
    When user navigates to Qualification
    Then user click on licenses option
    And user click on add button and add a new licenses
    And user click on save button




  @regression @tc1102
  Scenario: Valid ess login
   # Given user is navigated to HRMS application
    When user enters ess user name and ess password
    And user clicks on login button
    Then  user is successfully logged in


  @tc1103
  Scenario: Invalid admin login
  # Given user is navigated to HRMS application
    When user enters invalid username and password
    And user clicks on login button
    Then error message displayed


  @tc1105
  Scenario Outline: Invalid login functionality
    When user enters different "<username>" and "<password>" and verify the "<error>" for it
    Examples:
      | username | password | error |
      |admin     |cristiano |Invalid credentials|
      |ronaldo   |Hum@nhrm123|Invalid credentials|
      |          |Hum@nhrm123|Username cannot be empty|
      |admin     |           |Password cannot be empty|


