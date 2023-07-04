package Component;

import Hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Object.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TextBox extends PageObject {
    public TextBox(WebDriver driver) {
        super(driver);
    }

    Duration duration = Duration.ofSeconds(500);
    WebDriverWait wait = new WebDriverWait(Hooks.driver, duration);
    public void enterTextToTextBox(String type, String text) {
        WebElement textBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='"+type+"']")));
        textBox.sendKeys(text);
    }
    public void enterCompanyName(String name) {
        WebElement textBox = webDriver.findElement(By.xpath("//input[@name='name']"));
        textBox.sendKeys(name);
    }

    public void enterCompanyDesc(String desc) {
        WebElement enterCompDesc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='desc']")));
        enterCompDesc.sendKeys(desc);
    }

    public void enterHqDesc(String desc) {
        WebElement enterCompDesc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='desc']")));
        enterCompDesc.sendKeys(desc);
    }

    public void clickMessageBox() {
        WebElement clickChat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='CreateMessage_text__2pZbe']//div[@class='fr-wrapper show-placeholder']")));
        clickChat.click();
    }
    public void messageBox(String message) {
        WebElement enterChat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//div[@class='CreateMessage_text__2pZbe']//p")));
        enterChat.sendKeys(message);
    }

    public void textBoxKanban(String placeholder, String text) {
        WebElement enterName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='"+ placeholder +"']")));
        enterName.sendKeys(text);
    }

    public void taskTextBox(String text) {
        WebElement taskName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Card name']")));
        taskName.sendKeys(text);
    }

    public void taskEditName(String text) {
        WebElement editName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ChangeNameFormWithBox_bodySection__2V1FR']//form//input[@name='name']")));
        editName.sendKeys(text);
    }

    public void checkinQuestBox(String text) {
        WebElement queBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type your question..']")));
        queBox.sendKeys(text);
    }
}
