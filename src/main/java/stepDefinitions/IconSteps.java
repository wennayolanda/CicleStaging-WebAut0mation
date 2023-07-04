package stepDefinitions;
import Component.Label;
import Hooks.Hooks;
import io.cucumber.java.bs.I;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import Component.Icon;
import io.cucumber.java.en.When;

public class IconSteps {

    @When("user click delete message icon")
    public void clickDelIcon() throws Exception {
        Icon del = new Icon(Hooks.driver);
        del.deleteMessage();
    }

    @When("user click profil icon")
    public void userClickProfilIcon() {
        Icon profil = new Icon(Hooks.driver);
        profil.profilIcon();
    }

    @And("user click private message icon")
    public void userClickPrivateMessageIcon() {
        Icon privMsg = new Icon(Hooks.driver);
        privMsg.privateMessageIcon();
    }

    @Then("user choose contact from list")
    public void userChooseContactFromList() {
        Icon contact = new Icon(Hooks.driver);
        contact.contactListIcon();
    }

    @Given("user clicks edit icon")
    public void userClicksEditIcon() {
        Icon edit = new Icon(Hooks.driver);
        edit.editTaskIcon();
    }

    @Given("user clicks Create Check-ins icon")
    public void userClicksCreateCheckInsIcon() {
        Icon create = new Icon(Hooks.driver);
        create.createCheckin();
    }

    @When("user clicks menu edit icon")
    public void userClicksMenuEditIcon() {
        Icon editMenu = new Icon(Hooks.driver);
        editMenu.checkinEditMenu();
    }

    @And("user clicks edit question icon")
    public void userClicksEditQuestionIcon() {
        Icon editMenu = new Icon(Hooks.driver);
        editMenu.editQuestion();
    }
}
