Feature: Company Feature

  Background: user open the webpage and login with valid credential
    Given user open the webpage
    When user click Gmail button
    Then user input "wennatesting@gmail.com" and "testing234"

  Scenario: Verify that user can create company and fill the name and description.
    Given user click company button
    When user input "company baru" and "ini deskripsinya" in textbox
    #Create Company Btn
    And user click button
    And user click next button
    Then user click let's start button
