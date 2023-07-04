package stepDefinitions;

import Hooks.Hooks;
import Component.PopUpMessage;
import io.cucumber.java.da.Men;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class PopUpMessageSteps {

    @And("confirmation pop-up is visible")
    public void confirmPopUp() throws Exception {
        PopUpMessage popUp= new PopUpMessage(Hooks.driver);
        popUp.popUpDeleteIsDisplay();
    }
}
