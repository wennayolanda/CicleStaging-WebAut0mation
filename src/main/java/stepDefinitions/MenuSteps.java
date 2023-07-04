package stepDefinitions;

import Hooks.Hooks;
import Component.Menu;
import io.cucumber.java.da.Men;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuSteps {

    @Then("user click existing company")
    public void clickExistComp() throws Exception {
        Menu extComp = new Menu(Hooks.driver);
        extComp.existComp();
    }

    @When("user click existing card")
    public void userClickExistingCard() {
        Menu expHqCard = new Menu(Hooks.driver);
        expHqCard.existHqCard();
        }

    @And("user click Group Chat menu")
    public void userClickGroupChatMenu() {
        Menu groupChat = new Menu(Hooks.driver);
        groupChat.groupChat();
    }

    @And("user click Board menu")
    public void userClickBoardMenu() {
        Menu board = new Menu(Hooks.driver);
        board.kanbanBoard();
    }

    @And("user click Check-ins menu")
    public void userClickCheckInsMenu() {
        Menu check = new Menu(Hooks.driver);
        check.checkins();
    }

    @Given("user clicks existing Check-ins post")
    public void userClicksExistingCheckInsPost() {
        Menu check = new Menu(Hooks.driver);
        check.checkinsPost();
    }
}
