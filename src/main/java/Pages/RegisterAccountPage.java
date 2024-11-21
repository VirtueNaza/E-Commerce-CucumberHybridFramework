package Pages;

import Utilities.CommonUtils;
import Utilities.MyUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage {
    WebDriver driver;
    CommonUtils utils;
    public RegisterAccountPage(WebDriver driver){

        this.driver = driver;
        this.utils = new CommonUtils(driver);

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "input-firstname")
    private WebElement firstNameTextField;

    @FindBy(id = "input-lastname")
    private WebElement lastNameTextField;

    @FindBy(id ="input-email")
    private WebElement emailTextField;

    @FindBy(id = "input-telephone")
    private WebElement telephoneTextField;

    @FindBy(id = "input-password")
    private WebElement passwordTextField;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmTextField;

    @FindBy(name = "newsletter")
    private WebElement newsLetterField;

    @FindBy(name = "agree")
    private WebElement privacyPolicyCheckBox;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@id='account-register']//div")
    private WebElement warningAlertField;

    @FindBy(xpath = "//div[text()='Password confirmation does not match passw']")
    private WebElement warningMessageOnPasswordConfirmTextField;

    @FindBy(linkText = "Login")
    private WebElement loginButton;




    public void enterFirstNameIntoFirstNameField(String firstName){
          utils.typeTextIntoElement(firstNameTextField, firstName, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public void enterLastNameIntoLastNameField(String lastName){
        utils.typeTextIntoElement(lastNameTextField, lastName, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public void typeEmailIntoEmailAddressField(String email){
        utils.typeTextIntoElement(emailTextField, email, MyUtils.EXPLICIT_WAIT_TIME );
    }

    public void typeTelephoneIntoTelephoneField(String telephoneNumber){
    utils.typeTextIntoElement(telephoneTextField, telephoneNumber, MyUtils.EXPLICIT_WAIT_TIME );}


    public  void typePasswordIntoPasswordField(String password){
        utils.typeTextIntoElement(passwordTextField, password, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public void typePasswordIntoPasswordConfirmField(String password){
        utils.typeTextIntoElement(passwordConfirmTextField, password, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public void clicksNoInNewsletterField(){
        utils.clickOnAnElement(newsLetterField, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public  void checkPrivacyPolicyCheckBox(){
        utils.clickOnAnElement(privacyPolicyCheckBox, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public void clickContinueButton(){
        utils.clickOnAnElement(continueButton, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public String getTextInWarningAlertField(){
        return utils.getText(warningAlertField, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public  String getWarningMessageFromPasswordConfirmField(){
        return utils.getText(warningMessageOnPasswordConfirmTextField, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public boolean loginButtonIsDisplayed(){
        utils.moveToElement(loginButton);
       return utils.isDisplayed(loginButton, MyUtils.EXPLICIT_WAIT_TIME);

    }

}
