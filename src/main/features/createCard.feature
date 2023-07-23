Feature: Card Feature

  Background: User already login and create company
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "secretbase64."
    Then user click existing company

#Headquarter Card
  Scenario: Verify that user can create HQ card successfully
    #Create Team Btn
    And user click button
    When user input "Headquarter" card and "ini deskripsinya HQ Card" in textbox
    And user select company headquarter
    #Create HQ Card
    Then user click create card button

#Division Card
  Scenario: Verify that user can create Division Card Successfully
    #Create Team btn
    And user click create team card icon
    When user input "QA Division" card and "ini deskripsinya divisi qa engineer" in textbox
    And user select division checkmark
    Then user click create card button

#Project Card
  Scenario: Verify that user can create Division Card Successfully
    #Create Team btn
    And user click create team card icon
    When user input "QA Project" card and "ini deskripsinya qa projects" in textbox
    And user select project checkmark
    Then user click create card button


