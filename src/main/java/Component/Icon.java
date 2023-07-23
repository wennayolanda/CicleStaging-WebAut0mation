package Component;

import Hooks.Hooks;
import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Icon extends PageObject {
    public Icon(WebDriver driver) {
        super(driver);
    }
    Duration duration = Duration.ofSeconds(500);
    WebDriverWait wait = new WebDriverWait(Hooks.driver, duration);

    public void deleteMessage() {
        WebElement delMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MessageMenuPopUp_bodySection__BxPUp']//div[@class='OverlayButton_box__2jFLd']")));
        delMessage.click();
    }
    public void profilIcon() {
        WebElement profil = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='ImageMember_image__x7ApH']")));
        profil.click();
    }
    public void privateMessageIcon() {
        WebElement privateMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='UserMenuContainer_iconSection__item__margin__3uuFg']//a[@class='LinkNoDecor_Link__3DEkL']")));
        privateMessage.click();
    }
    public void contactListIcon() {
        WebElement contact = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ChatPersonItem_container__3R9Mt']")));
        contact.click();
    }

    public void editTaskIcon() {
        WebElement task = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='editCardMenu']")));
        task.click();
    }

    public void createCheckin() {
        WebElement check = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='GlobalActionButton_container__EJ7Lh']")));
        check.click();
    }

    public void checkinEditMenu() {
        WebElement check = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='RoundActionMenu_container__2ta8s RoundActionMenu_medium__3rLho']")));
        check.click();
    }

    public void editQuestion() {
        WebElement editQue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='OverlayButton_box__2jFLd']//div[1]")));
        editQue.click();
    }

    public void logoutIcon() {
        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Logout']//div[@class='IconItem_container__2XsfF']")));
        icon.click();
    }

    public void compSettingIcon() {
        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='LinkNoDecor_Link__3DEkL']//div[@class='HomeSubNavHeader_title__settings__E2BgT']//*[name()='svg']")));
        icon.click();
    }

    public void createTeamIcon() {
        WebElement plus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='CreateTeamButton_buttonContainer__Xb_dp']")));
        plus.click();
    }

    public void calendarIcon() {
        WebElement calendar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']")));
        calendar.click();
    }

    public void dueDateBlast() {
        WebElement due = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='cell']//button[normalize-space()='21']")));
        due.click();
    }

}
