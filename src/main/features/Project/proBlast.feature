Feature: Blast feature from Projects Card

  Background: User already login and enters group chat feature
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "secretbase64."
    Then user click existing company
    When user click existing projects card
    And user clicks Blast menu

#TC: Project-Blast-001
  Scenario: User successfully create and publish a blast
    Given user clicks create blast button
    When user input blast title "First Blast"
    And user input blast desc "Percobaan pertama"
    And user clicks publish blast button
    Then First Blast is appear

#TC: Project-Blast-002
  Scenario: User set a due date manually for Blast post
    Given user clicks create blast button
    When user input blast title "Second Blast"
    And user input blast desc "Percobaan kedua"
    And user clicks complete drop down button and click set due date manually menu
    And user clicks calendar icon and set due date
    Then user clicks publish blast button

#TC: Project-Blast-003
  Scenario: User cancel creating a blast
    Given user clicks create blast button
    When user input blast title "cancel post"
    And user input blast desc "this post will be cancel"
    Then user clicks cancel blast button