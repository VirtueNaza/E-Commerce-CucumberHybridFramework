package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonUtils {
    WebDriverWait wait;
    WebDriver driver;
    Actions actions;

    public CommonUtils(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnAnElement(WebElement element, long waitingTime){
        wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

    }

    public  void typeTextIntoElement(WebElement element, String text, long waitingTime){
        wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public String getText(WebElement element, long waitingTime){
        wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime));
        wait.until(ExpectedConditions.visibilityOf(element));

        return element.getText();
    }

    public boolean isDisplayed(WebElement element, long waitingTime){
         wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime));
         wait.until(ExpectedConditions.visibilityOf(element));
         return element.isDisplayed();
    }

    public void moveToElement(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element);
    }
}
