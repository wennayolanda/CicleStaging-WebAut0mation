Feature: Check-Ins

  Background: User already login and enters check-ins feature
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "secretbase64."
    Then user click existing company
    When user click existing card
    And user click Check-ins menu

#TC_ID: HQ-Checkins-001
  Scenario: User creating a check-in question by entering a question title
            and selecting a day of the week
    Given user clicks Create Check-ins icon
    When user input "pertanyaan" in check-ins question box
    And select "Thu" day button
    And user clicks start collecting answer button
    Then alert message is visible

#TC_ID: HQ-Checkins-002
  Scenario: User creating a check-in question without entering a question and
            verify if it throws an error
    Given user clicks Create Check-ins icon
    When select "Thu" day button
    And user clicks start collecting answer button
    Then alert message is visible

#TC_ID: HQ-Checkins-003
  Scenario: User creating a check-in question without selecting a day
            of the week
    Given user clicks Create Check-ins icon
    When user input "pertanyaan" in check-ins question box
    And user clicks start collecting answer button
    Then alert message is visible

#TC_ID: HQ-Checkins-006
  Scenario: User editing the day of the week of a check-in question
    Given user clicks existing Check-ins post
    When user clicks menu edit icon
    And user clicks edit question icon
    And select "Tue" day button
    Then user clicks edit save changes button

#TC_ID: HQ-Checkins-010
  Scenario: User canceling the changes made to a check-in question
    Given user clicks existing Check-ins post
    When user clicks menu edit icon
    And user clicks edit question icon
    And select "Wed" day button
    Then user clicks cancel changes button

#TC_ID: HQ-Checkins-011
  Scenario: User saving or canceling changes on a check-in question
            without making any modifications
    Given user clicks existing Check-ins post
    When user clicks menu edit icon
    And user clicks edit question icon
    Then user clicks cancel changes button

#TC_ID: HQ-Checkins-012
  Scenario: Verify that the user is able to archive the post
    Given user clicks existing Check-ins post
    When user clicks menu edit icon
    Then user clicks question archive button
