package Pages;

import Utilities.CommonUtils;
import Utilities.MyUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    CommonUtils utils;
    public HomePage(WebDriver driver){
        this.driver = driver;
        utils = new CommonUtils(driver);

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountButton;

    @FindBy(linkText = "Register")
    private WebElement registerButton;

    @FindBy(linkText = "Login")
    private WebElement loginButton;

    @FindBy(id = "input-email")
    private WebElement emailAddressField;




    public void clickMyAccountButton(){
        utils.clickOnAnElement(myAccountButton, MyUtils.EXPLICIT_WAIT_TIME);

    }

    public void clickRegisterButton(){
        utils.clickOnAnElement(registerButton, MyUtils.IMPLICIT_WAIT_TIME);
    }

    public void clickLoginButton(){
        utils.clickOnAnElement(loginButton, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public void enterEmailIntoEmailAddressField(String emailAddress){
        utils.typeTextIntoElement(emailAddressField, emailAddress, MyUtils.EXPLICIT_WAIT_TIME);

    }


}
