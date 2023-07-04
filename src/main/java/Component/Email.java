package Component;

import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Email extends PageObject {
    public Email(WebDriver driver) {
        super(driver);
    }
    public void emailLabel() {
        WebElement Email = webDriver.findElement(By.xpath("//div[@data-item-index='1']"));
        Email.click();
    }

}
