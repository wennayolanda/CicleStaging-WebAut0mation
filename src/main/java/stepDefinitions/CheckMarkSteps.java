package stepDefinitions;

import Component.Button;
import Component.Label;
import Hooks.Hooks;
import Component.CheckMark;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class CheckMarkSteps {

    @Then("user select company headquarter")
    public void userSelectCompanyHq() {
        CheckMark checkMark = new CheckMark(Hooks.driver);
        checkMark.hqBulletCheck();
    }
}
