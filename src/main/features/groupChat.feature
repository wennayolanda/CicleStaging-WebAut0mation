Feature: Group Chat

  Background: User already login and enters group chat feature
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "testing234"
    Then user click existing company
    When user click existing card
    And user click Group Chat menu

#TC_ID: HQ-Chat-002
  Scenario: Verify that the Send Chat button is functioning properly
    Given user types "percobaan kirim pesan" in the chat box
    When user clicks Send button
    Then the message written by the user is visible on the screen

#TC_ID: HQ-Chat-003
  Scenario: User sending a message without typing anything
    Given user clicks Send button
    Then the error message is visible

#TC_ID: HQ-Chat-004
  Scenario: User sending a message with special characters
    Given user types "˚₊‧꒰ა ☆ ໒꒱ ‧₊˚" in the chat box
    When user clicks Send button
    Then message "˚₊‧꒰ა ☆ ໒꒱ ‧₊˚" display correctly

#TC_ID: HQ-Chat-013
  Scenario: Verify that user can’t send a message that contains only spaces
    Given user types " " in the chat box
    When user clicks Send button
    Then the error message is visible





