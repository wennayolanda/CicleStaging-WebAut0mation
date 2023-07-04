package Component;

import Hooks.Hooks;
import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class DropDown extends PageObject {
    public DropDown(WebDriver driver) {
        super(driver);
    }
    Duration duration = Duration.ofSeconds(500);
    WebDriverWait wait = new WebDriverWait(Hooks.driver, duration);
    public void messageDropDown() {
        WebElement dropDown = webDriver.findElement(By.xpath("/div[@class='Message_iconOption__3F-Ru']//*[name()='svg']//*[name()='path' and contains(@d,'M16.59 8.5')]"));
        dropDown.click();
    }
}
