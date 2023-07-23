Feature: CheckIns feature from Division Card

  Background: User already login and enters group chat feature
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "secretbase64."
    Then user click existing company
    When user click existing division card
    And user click Check-ins menu

  Scenario: User creating a check-in question by entering a question title
            and selecting a day of the week
    Given user clicks Create Check-ins icon
    When user input "pertanyaan" in check-ins question box
    And select "Thu" day button
    And user clicks start collecting answer button
    Then alert message is visible

  Scenario: User canceling the changes made to a check-in question
    Given user clicks existing Check-ins post
    When user clicks menu edit icon
    And user clicks edit question icon
    And select "Wed" day button
    Then user clicks cancel changes button

  Scenario: Verify that the user is able to archive the post
    Given user clicks existing Check-ins post
    When user clicks menu edit icon
    Then user clicks question archive button