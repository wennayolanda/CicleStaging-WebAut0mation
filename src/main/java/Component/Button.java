package Component;

import Hooks.Hooks;
import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Button extends PageObject {
    public Button(WebDriver driver) {
        super(driver);
    }

    Duration duration = Duration.ofSeconds(500);
    WebDriverWait wait = new WebDriverWait(Hooks.driver, duration);
    public void gmailBtn () {
        WebElement button = webDriver.findElement(By.xpath("//div[@class='LoginButton_LoginButton__3qKtx'][1]"));
        button.click();
    }
    public void nextBtn() {
        WebElement nextBtn = webDriver.findElement(By.xpath("//button//span[contains(text(), 'Next')]"));
        nextBtn.click();
    }
    public void createNewCompany() {
        WebElement newCompanyBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/welcome/create-company']")));
        newCompanyBtn.click();
    }

    public void Button() {
        WebElement Btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Main_container__3r1Cm']")));
        Btn.click();
    }

    public void nextButton() {
        WebElement Btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div[@class='SceneTutorial_button__25o7K']")));
        Btn.click();
    }

    public void letsBtn() {
        WebElement Btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//div[@class='SceneHelp_button__-S_47']")));
        Btn.click();
    }

    public void createCardbtn() {
        WebElement Btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ModalCreateTeam_button__12VMX']//button[@class='Main_container__3r1Cm']")));
        Btn.click();
    }

    public void sendBtn() {
        WebElement sendBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='CreateMessage_send__2f1ZQ']")));
        sendBtn.click();
    }
    public void delMessageBtn() {
        WebElement delBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-danger btn-block btn-sm']")));
        delBtn.click();
    }

    public void addListBtn() {
        WebElement addList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-outline-dark btn-block btn-sm']")));
        addList.click();
    }

//    public void kanbanBtn(String btnName) {
//        WebElement kanban = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success btn-sm']//div[contains(text(),'"+ btnName +"')]")));
//        kanban.click();
//    }

    public void addTaskBtn() {
        WebElement addTask = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ListContainer_ListContainer__buttonBottom__2kZAI']")));
        addTask.click();
    }

    public void createListBtn() {
        WebElement createList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success btn-sm']//div[contains(text(),'Create')]")));
        createList.click();
    }

    public void createTask() {
        WebElement createTask = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success btn-sm']//div[contains(text(),'Add Card')]")));
        createTask.click();
    }

    public void changeNameTaskBtn() {
        WebElement changeName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='editCardMenuButton']//div[7]")));
        changeName.click();
    }

    public void saveEditTaskBtn() {
        WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success btn-sm']//div[contains(text(),'Save')]")));
        save.click();
    }

    public void archiveTaskBtn() {
        WebElement archive = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='editCardMenuButton']//div[10]")));
        archive.click();
    }

    public void dayBtn(String text) {
        WebElement day = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='"+ text +"']")));
        day.click();
    }

    public void startCollecting() {
        WebElement collect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']//div[normalize-space()='Start collecting answers']")));
        collect.click();
    }

    public void editSaveChanges() {
        WebElement editSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']//div[normalize-space()='Save Changes']")));
        editSave.click();
    }

    public void cancelChanges() {
        WebElement editSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-danger']//div[normalize-space()='Cancel']")));
        editSave.click();
    }

    public void archiveQuestion() {
        WebElement archive = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='OverlayButton_box__2jFLd']//div[2]")));
        archive.click();
    }

    public void saveCompSett() {
        WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[1]")));
        save.click();
    }

    public void editCompanyBtn() {
        WebElement edit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button']")));
        edit.click();
    }
    public void cancelEditCompBtn() {
        WebElement cancel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Main_container__3r1Cm']//div[@class='Main_iconText__f-xVC Main_iconLight__3jKiU Main_iconPositionStart__IWQqT']//h1[normalize-space()='Cancel']")));
        cancel.click();
    }

    public void createBlastBtn() {
        WebElement blast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='GlobalActionButton_container__EJ7Lh']")));
        blast.click();
    }

    public void publishBlastBtn() {
        WebElement publish = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Publish']")));
        publish.click();
    }

    public void cancelBlastBtn() {
        WebElement cancel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'CreateBlastPage_actionSection__cancel__3b0TR')]//button[contains(@type,'button')]")));
        cancel.click();
    }

}
