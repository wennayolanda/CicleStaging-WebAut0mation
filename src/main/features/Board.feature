Feature: Board

  Background: User already login and enters board feature
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "secretbase64."
    Then user click existing company
    When user click existing card
    And user click Board menu

#TC_ID: HQ-Board-001
  Scenario: Verify that the user is able to create the list
    Given user clicks Add List button
    When user input "list satu" in kanban textbox
    And user clicks Create button
    Then alert message is visible

#TC_ID: HQ-Board-002
  Scenario: Verify that the user is unable to create the list if the list name is empty
    Given user clicks Add List button
    When user clicks Create button
    Then alert message is visible

#TC_ID: HQ-Board-003
  Scenario: Verify that the user is unable to create new task if the title is empty
    Given user clicks button add card in task menu
    And user clicks Add Card button
    Then alert message is visible

#TC_ID: HQ-Board-004
  Scenario: Verify that the user is able to create new task with a title
    Given user clicks button add card in task menu
    When user input "task pertama" in task textbox
    And user clicks Add Card button
    Then alert message is visible

#TC_ID: HQ-Board-007
  Scenario: User editing the title of a task and verify if the changes are saved
    Given user clicks edit icon
    When user select change name button
    And user input "hasil edit task name" in edit task textbox
    Then user clicks save button

#TC_ID: HQ-Board-010
  Scenario: Verify that the user is able to archive the task
    Given user clicks edit icon
    When user select archive button
    Then alert message is visible




