package stepDefinitions;

import Component.Button;
import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Component.TextBox;

public class TextBoxSteps {

    @When("user input {string} and {string} in textbox")
    public void userInputAndInTextbox(String companyName, String description) throws InterruptedException {
        TextBox textBox = new TextBox(Hooks.driver);
        textBox.enterCompanyName(companyName);
        textBox.enterCompanyDesc(description);
    }

    @When("user input {string} card and {string} in textbox")
    public void userInputCardAndInTextbox(String cardName, String cardDesc) {
        TextBox textBox = new TextBox(Hooks.driver);
        textBox.enterCompanyName(cardName);
        textBox.enterHqDesc(cardDesc);
    }

    @Given("user types {string} in the chat box")
    public void userTypesInTheChatBox(String message) {
        TextBox chatBox = new TextBox(Hooks.driver);
        chatBox.clickMessageBox();
        chatBox.messageBox(message);
    }

    @When("user input {string} in kanban textbox")
    public void userInputIn(String text) {
        TextBox kanbanTextBox = new TextBox(Hooks.driver);
        kanbanTextBox.textBoxKanban("Input list name...", "list satu");
    }

    @When("user input {string} in task textbox")
    public void userInputInTaskTextbox(String text) {
        TextBox task = new TextBox(Hooks.driver);
        task.taskTextBox(text);
    }

    @And("user input {string} in edit task textbox")
    public void userInputInEditTaskTextbox(String text) throws InterruptedException {
        TextBox task = new TextBox(Hooks.driver);
        Thread.sleep(3000);
        task.taskEditName(text);
    }

    @When("user input {string} in check-ins question box")
    public void userInputInCheckInsQuestionBox(String text) {
        TextBox que = new TextBox(Hooks.driver);
        que.checkinQuestBox(text);
    }
}
