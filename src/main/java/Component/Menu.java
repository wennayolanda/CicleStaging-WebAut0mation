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
public class Menu extends PageObject {
    public Menu(WebDriver driver) {
        super(driver);
    }

    Duration duration = Duration.ofSeconds(10);
    WebDriverWait wait = new WebDriverWait(Hooks.driver, duration);

    public void existComp() {
        WebElement extComp= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ModalSelectCompany_listCompanies__18prX MuiBox-root css-0']//div[@class='MuiBox-root css-r7q7qr']")));
        extComp.click();
    }

    public void existHqCard() {
        WebElement extHqCard= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a//div[@class='Card_link__YL79H']")));
        extHqCard.click();
    }

    public void groupChat(){
        WebElement extHqCard= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//a[@href='/companies/649e76bb94b1e7327f6ecba6/teams/649e792094b1e7327f6ecee4/group-chats/649e792094b1e7327f6ecee9']//div[@class='BoxMenu_container__1flgD']")));
        extHqCard.click();
    }

    public void kanbanBoard(){
        WebElement board= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//a[@href='/companies/649e76bb94b1e7327f6ecba6/teams/649e792094b1e7327f6ecee4/boards/649e792094b1e7327f6ecee8']//div[@class='BoxMenu_container__1flgD']")));
        board.click();
    }


    public void checkins() {
        WebElement checkin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//a[@href='/companies/649e76bb94b1e7327f6ecba6/teams/649e792094b1e7327f6ecee4/check-ins/649e792094b1e7327f6eceeb']//div[@class='BoxMenu_container__1flgD']")));
        checkin.click();
    }

    public void checkinsPost() {
        WebElement checkPost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Question_Question__3B07Q Question_borderSemiRounded__2m-UV Question_borderLineRegularThin__1cBAM']")));
        checkPost.click();
    }
}
