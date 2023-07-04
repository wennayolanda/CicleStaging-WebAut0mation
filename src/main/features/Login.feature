Feature: Login

  Background: user open the web
    Given user open the webpage

  Scenario: user login with valid google email
    Given user click Gmail button
    When user input "wennatesting@gmail.com" and "testing234"
    Then the "Hello and welcome to Cicle!" label is displayed