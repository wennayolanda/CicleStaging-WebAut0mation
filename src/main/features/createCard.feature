Feature: Card Feature

  Background: User already login and create company
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "secretbase64."
    Then user click existing company

  Scenario: Verify that user can create HQ card successfully
    #Create Team Btn
    And user click button
    When user input "Headquarter" card and "ini deskripsinya HQ Card" in textbox
    And user select company headquarter
    #Create HQ Card
    Then user click create card button


