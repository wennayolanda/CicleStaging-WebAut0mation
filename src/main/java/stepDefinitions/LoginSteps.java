package stepDefinitions;

import Component.TextBox;
import Component.Button;
import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import Utils.Utils;
import Component.Email;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {

    @Given("user open the webpage")
    public void userOpenTheWebpage() throws InterruptedException {
        Hooks.driver.manage().window().maximize();
        Hooks.driver.get(Utils.BASE_URL);
        Thread.sleep(3000);
    }

    @When("user input {string} and {string}")
    public void user_input_email_and_password(String email, String password) throws InterruptedException {
        TextBox textBox = new TextBox(Hooks.driver);
        Button button = new Button(Hooks.driver);
        textBox.enterTextToTextBox("email", email);
        button.nextBtn();
        textBox.enterTextToTextBox("password", password);
        button.nextBtn();
    }
}
