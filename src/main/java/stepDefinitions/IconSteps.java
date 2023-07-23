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

    @When("user click logout icon")
    public void userClickLogoutIcon() throws InterruptedException {
        Icon logout = new Icon(Hooks.driver);
        logout.logoutIcon();
    }

    @Given("when user click on the company setting icon")
    public void whenUserClickOnTheCompanySettingIcon() {
        Icon setting = new Icon(Hooks.driver);
        setting.compSettingIcon();
    }

    @And("user click create team card icon")
    public void userClickCreateTeamCardIcon() {
        Icon create = new Icon(Hooks.driver);
        create.createTeamIcon();
    }

    @And("user clicks calendar icon")
    public void userClicksCalendarIcon() {
        Icon calendar = new Icon(Hooks.driver);
        calendar.calendarIcon();
    }
    @And("user clicks calendar icon and set due date")
    public void userClicksCalendarIconAndSetDueDate() {
        Icon calendar = new Icon(Hooks.driver);
        calendar.calendarIcon();
        calendar.dueDateBlast();
    }
}
