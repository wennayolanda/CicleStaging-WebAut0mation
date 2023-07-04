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
public class PopUpMessage extends PageObject {
    public PopUpMessage(WebDriver driver) {
        super(driver);
    }

    Duration duration = Duration.ofSeconds(10);
    WebDriverWait wait = new WebDriverWait(Hooks.driver, duration);
    public void popUpDeleteIsDisplay() throws Exception {
        try {
            WebElement findElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']")));
            findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("pop up confirmation is not visible");
        }
    }
}
