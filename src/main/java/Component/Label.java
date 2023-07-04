package Component;

import Hooks.Hooks;
import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Label extends PageObject {
    public Label(WebDriver driver) {
        super(driver);
    }

    Duration duration = Duration.ofSeconds(300);
    WebDriverWait wait = new WebDriverWait(Hooks.driver, duration);

    public void labelIsDisplayed(String labelName) throws Exception {
        try {
            WebElement findElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[.='" + labelName + "']")));
            findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("The label " + labelName + " is not displayed");
        }
    }

    public void messageIsDisplay() throws Exception {
        try {
            WebElement findElement = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='fr-view']//p[.='percobaan kirim pesan']")));
            findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("message not sent");
        }
    }
    public void chatErrorMessage() throws Exception {
        try {
            WebElement findElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']//div[contains(text(),'the message cannot be empty')]")));
            findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("error message is not display");
        }
    }

    public void specialChar(String text) throws Exception {
        try {
            WebElement findElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='"+ text + "']")));
            findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("The sent message is not displayed");
        }
    }

    public void alertMessageIsDisplay() throws Exception {
        try {
            WebElement findElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
            findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("The alert is not display");
        }
    }
}

