package stepDefinitions;

import Component.DropDown;
import Component.Label;
import Hooks.Hooks;
import io.cucumber.java.en.*;
public class DropDownSteps {
    @Given("user click the drop-down arrow")
    public void clickDropDown() throws Exception {
        Thread.sleep(7000);
        DropDown dropDown = new DropDown(Hooks.driver);
        dropDown.messageDropDown();
    }
}
