Feature: Company Setting

  Background: User already login and create company
    Given user open the webpage
    When user click Gmail button
    And user input "wennatesting@gmail.com" and "emailtestingnih"
    Then user click existing company

#TC_ID: Setting-001
  Scenario: User successfully access the company settings
    Given when user click on the company setting icon
    Then the company logo is display

#TC_ID: Setting-002
  Scenario: User Editing the company details successfully
    Given when user click on the company setting icon
    When the company logo is display
    Then user click edit company button
    And user input "SQA Ltd" and "Sekolah Digital Cilsy" in textbox
    And user clicks save company setting button
    Then company name is display

#TC_ID: Setting-003
  Scenario: User cancel edit without saving changes
    Given when user click on the company setting icon
    When the company logo is display
    Then user click edit company button
    And user input "NewCorp" and "desc" in textbox
    And user clicks cancel company setting button
