package stepDefinitions;

import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import Component.Label;

import javax.print.attribute.HashPrintJobAttributeSet;

public class LabelSteps {

    @Then("the {string} label is displayed")
    public void theLabelIsDisplayed(String labelName) throws Exception {
        Label label = new Label(Hooks.driver);
        label.labelIsDisplayed(labelName);
    }

    @Then("the message written by the user is visible on the screen")
    public void theMessageWrittenByTheUserIsVisibleOnTheScreen() throws Exception {
        Label label = new Label(Hooks.driver);
        label.messageIsDisplay();
    }

    @Then("the error message is visible")
    public void theErrorMessageIsVisible() throws Exception {
        Label label= new Label(Hooks.driver);
        label.chatErrorMessage();
    }

    @Then("message {string} display correctly")
    public void messageDisplayCorrectly(String text) throws Exception {
        Label label = new Label(Hooks.driver);
        label.specialChar(text);
    }

//    @Then("alert message {string} is visible")
//    public void alertMessageIsVisible(String text) throws Exception {
//        Label alert = new Label(Hooks.driver);
//        Thread.sleep(5000);
//        alert.alertMessageIsDisplay("Creating list is success");
//    }

    @Then("alert message is visible")
    public void alertMessageIsVisible() throws Exception {
        Label alert = new Label(Hooks.driver);
        Thread.sleep(3000);
        alert.alertMessageIsDisplay();
    }

    @Then("the See you later! label is displayed")
    public void theSeeYouLaterLabelIsDisplayed() throws Exception {
        Label later = new Label(Hooks.driver);
        later.seeYouLaterMessageIsDisplay();
    }

    @Then("the company logo is display")
    public void theCompanyLogoIsDisplay() throws Exception {
        Label logo = new Label(Hooks.driver);
        logo.companyLogoIsDisplay();
    }

    @Then("company name is display")
    public void companyNameIsDisplay() throws Exception {
        Label comp = new Label(Hooks.driver);
        comp.companyNameIsDisplay();
    }

    @Then("First Blast is appear")
    public void firstBlastIsAppear() throws Exception {
        Label first = new Label(Hooks.driver);
        first.blastPostIsDisplay();
    }
}
