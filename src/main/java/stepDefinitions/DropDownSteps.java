package stepDefinitions;

import Component.DropDown;
import Component.Menu;
import Hooks.Hooks;
import io.cucumber.java.en.*;
public class DropDownSteps {
    @Given("user click the drop-down arrow")
    public void clickDropDown() throws Exception {
        Thread.sleep(7000);
        DropDown dropDown = new DropDown(Hooks.driver);
        dropDown.messageDropDown();
    }
    @And("user clicks complete drop down button and click set due date manually menu")
    public void userClicksCompleteDropDownButtonAndClickSetDueDateManuallyMenu() {
        DropDown blast = new DropDown(Hooks.driver);
        Menu duedate = new Menu(Hooks.driver);
        blast.blastDropDown();
        duedate.blastCompleteDueDate();
    }
}
