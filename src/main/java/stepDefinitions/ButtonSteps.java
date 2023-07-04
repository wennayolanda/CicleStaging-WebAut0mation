package stepDefinitions;

import Component.Button;
import Hooks.Hooks;
import io.cucumber.java.en.*;

public class ButtonSteps {

    @Given("user click Gmail button")
    public void userClickButton() {
        Button button = new Button(Hooks.driver);
        button.gmailBtn();
    }

    @Given("user click company button")
    public void userClickCompanyButton() throws InterruptedException {
        Button button = new Button(Hooks.driver);
        button.createNewCompany();
    }

    @And("user click button")
    public void userClickBtn() {
        Button button = new Button(Hooks.driver);
        button.Button();
    }

    @When("user click next button")
    public void userClickNextButton() throws InterruptedException {
        Thread.sleep(7000);
        Button button = new Button(Hooks.driver);
        button.nextButton();
    }

    @And("user click let's start button")
    public void userClickLetSStartButton() throws InterruptedException {
        Thread.sleep(4000);
        Button button = new Button(Hooks.driver);
        button.letsBtn();
    }

    @And("user click create card button")
    public void userClickCreateCardButton() {
        Button button = new Button(Hooks.driver);
        button.createCardbtn();
    }

    @When("user clicks Send button")
    public void userClicksSendButton() {
        Button sendBtn = new Button(Hooks.driver);
        sendBtn.sendBtn();
    }

    @And("user click delete button")
    public void userClickDeleteButton() {
        Button delete = new Button(Hooks.driver);
        delete.delMessageBtn();
    }

    @Given("user clicks Add List button")
    public void userClicksAddListButton() {
        Button list = new Button(Hooks.driver);
        list.addListBtn();
    }

    @Given("user clicks button add card in task menu")
    public void userClicksButtonAddCardInTaskMenu() {
        Button task = new Button(Hooks.driver);
        task.addTaskBtn();
    }

    @And("user clicks Create button")
    public void userClicksCreateButton() {
        Button createList = new Button(Hooks.driver);
        createList.createListBtn();
    }

    @And("user clicks Add Card button")
    public void userClicksAddCardButton() {
        Button task = new Button(Hooks.driver);
        task.createTask();
    }

    @When("user select change name button")
    public void userSelectChangeNameButton() {
        Button changeName = new Button(Hooks.driver);
        changeName.changeNameTaskBtn();
    }

    @Then("user clicks save button")
    public void userClicksSaveButton() {
        Button save = new Button(Hooks.driver);
        save.saveEditTaskBtn();
    }

    @When("user select archive button")
    public void userSelectArchiveButton() {
        Button archive = new Button(Hooks.driver);
        archive.archiveTaskBtn();
    }

    @And("select {string} day button")
    public void selectDayButton(String text) {
        Button day = new Button(Hooks.driver);
        day.dayBtn(text);
    }

    @And("user clicks start collecting answer button")
    public void userClicksStartColletingAnswerButton() {
        Button collect = new Button(Hooks.driver);
        collect.startCollecting();
    }

    @Then("user clicks edit save changes button")
    public void userClicksEditSaveChangesButton() {
        Button editSave = new Button(Hooks.driver);
        editSave.editSaveChanges();
    }

    @Then("user clicks cancel changes button")
    public void userClicksCancelChangesButton() {
        Button cancel = new Button(Hooks.driver);
        cancel.cancelChanges();
    }

    @Then("user clicks question archive button")
    public void userClicksQuestionArchiveButton() {
        Button archive = new Button(Hooks.driver);
        archive.archiveQuestion();
    }
}
