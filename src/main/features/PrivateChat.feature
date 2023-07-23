Feature: Private Chat

  Background: User already login and enters private chat feature
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "secretbase64."
    Then user click existing company
    When user click profil icon
    And user click private message icon
    Then user choose contact from list

# TC_ID: Personal-003
  Scenario: Verify that the Send Chat button is functioning properly
    Given user types "percobaan kirim pesan" in the chat box
    When user clicks Send button
    Then the message written by the user is visible on the screen

#TC_ID: Personal-004
  Scenario: User sending a message without typing anything
    Given user clicks Send button
    Then the error message is visible

#TC_ID: Personal-005
  Scenario: User sending a message with special characters
    Given user types "˚₊‧꒰ა ☆ ໒꒱ ‧₊˚" in the chat box
    When user clicks Send button
    Then message "˚₊‧꒰ა ☆ ໒꒱ ‧₊˚" display correctly

#TC_ID: Personal-014
  Scenario: Verify that user can’t send a message that contains only spaces
    Given user types " " in the chat box
    When user clicks Send button
    Then the error message is visible