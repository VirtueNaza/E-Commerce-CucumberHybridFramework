package Pages;

import Utilities.CommonUtils;
import Utilities.MyUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {
    WebDriver driver;
    CommonUtils utils;

    public AccountSuccessPage(WebDriver driver){

        this.driver = driver;
        this.utils = new CommonUtils(driver);

        PageFactory.initElements( driver, this);

    }

    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    private WebElement successMessage;

    @FindBy(xpath =  "//a[text()='Logout']")
    private WebElement logoutButton;



    public String verifySuccessMessageDisplayed(){

         return utils.getText(successMessage, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public  boolean logOutButtonIsDisplayed(){

        utils.moveToElement(logoutButton);
        return utils.isDisplayed(logoutButton, MyUtils.EXPLICIT_WAIT_TIME);
    }

}
