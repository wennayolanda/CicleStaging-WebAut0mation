package Component;

import Hooks.Hooks;
import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class CheckMark extends PageObject {
    public CheckMark(WebDriver driver) {
        super(driver);
    }

    public void hqBulletCheck() {
        WebElement hqCheck = webDriver.findElement(By.xpath("//input[@value='hq']"));
        hqCheck.click();
    }

    public void divBulletCheck() {
        WebElement divCheck = webDriver.findElement(By.xpath("//input[@value='team']"));
        divCheck.click();
    }

    public void projectCheck() {
        WebElement proCheck = webDriver.findElement(By.xpath("//input[@value='project']"));
        proCheck.click();
    }
}
