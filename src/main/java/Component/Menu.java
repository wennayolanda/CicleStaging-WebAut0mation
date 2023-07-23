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
        WebElement extHqCard= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//a[@class='LinkNoDecor_Link__3DEkL']//div[@class='BoxMenu_icon__2XiJP']//img[@src='/static/media/group-chat.6daa9866.png']")));
        extHqCard.click();
    }

    public void kanbanBoard(){
        WebElement board= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[contains(@class,'TeamPage_container__2m61r')]/div[2]/div[1]")));
        board.click();
    }


    public void checkins() {
        WebElement checkin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[contains(@class,'TeamPage_container__2m61r')]/div[2]/div[2]")));
        checkin.click();
    }

    public void checkinsPost() {
        WebElement checkPost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Question_Question__3B07Q Question_borderSemiRounded__2m-UV Question_borderLineRegularThin__1cBAM']")));
        checkPost.click();
    }

    public void blastMenu() {
        WebElement blast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[contains(@class,'TeamPage_container__2m61r')]/div[1]/div[2]")));
        blast.click();
    }

    public void blastCompleteDueDate() {
        WebElement complete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Set due date manually']")));
        complete.click();
    }

    public void cardDivision() {
        WebElement card = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DashboardPage_container__2bMGZ']/div[@class='DashboardPage_DashboardPage__flex__2rA7e']/div[.='QA Divisionini deskripsinya divisi qa engineer']")));
        card.click();
    }

    public void cardProject() {
        WebElement card = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[6]/div[@class='Card_Card__2LWWW']")));
        card.click();
    }
}
