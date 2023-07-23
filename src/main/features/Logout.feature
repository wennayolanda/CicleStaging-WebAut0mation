Feature: Logout

  Background: User already login and create company
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "secretbase64."
    Then user click existing company

  Scenario: User successful logout
    Given user click profil icon
    When user click logout icon
    Then the See you later! label is displayed