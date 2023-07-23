Feature: Board feature from Projects Card

  Background: User already login and enters group chat feature
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "secretbase64."
    Then user click existing company
    When user click existing projects card
    And user click Board menu

  Scenario: Verify that the user is able to create the list
    Given user clicks Add List button
    When user input "list satu" in kanban textbox
    And user clicks Create button
    Then alert message is visible

  Scenario: Verify that the user is able to create new task with a title
    Given user clicks button add card in task menu
    When user input "task pertama" in task textbox
    And user clicks Add Card button
    Then alert message is visible

  Scenario: Verify that the user is able to archive the task
    Given user clicks edit icon
    When user select archive button
    Then alert message is visible