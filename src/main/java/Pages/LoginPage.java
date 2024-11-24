package Pages;

import Utilities.CommonUtils;
import Utilities.MyUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    CommonUtils utils;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.utils = new CommonUtils(driver);

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "input-email")
    private WebElement emailAddressField;


    @FindBy(id = "input-password")
    private WebElement passwordTextField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;


    public void enterEmailIntoEmailAddressField(String emailAddress){
        utils.typeTextIntoElement(emailAddressField, emailAddress, MyUtils.EXPLICIT_WAIT_TIME);

    }

    public void enterPasswordIntoPasswordField(int password){
        utils.typeTextIntoElement(passwordTextField, String.valueOf(password), MyUtils.EXPLICIT_WAIT_TIME);
    }

    public void clickLoginButton(){
        utils.clickOnAnElement(loginButton, MyUtils.EXPLICIT_WAIT_TIME);
    }

}
