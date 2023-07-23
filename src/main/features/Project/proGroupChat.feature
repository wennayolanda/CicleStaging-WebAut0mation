Feature: Group Chat from Projects Card

  Background: User already login and enters group chat feature
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "secretbase64."
    Then user click existing company
    When user click existing projects card
    And user click Group Chat menu

  Scenario: Verify that the Send Chat button is functioning properly
    Given user types "percobaan kirim pesan" in the chat box
    And user clicks Send button

  Scenario: User sending a message with special characters
    Given user types "˚₊‧꒰ა ☆ ໒꒱ ‧₊˚" in the chat box
    When user clicks Send button
    Then message "˚₊‧꒰ა ☆ ໒꒱ ‧₊˚" display correctly