package Pages;

import Utilities.CommonUtils;
import Utilities.MyUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    WebDriver driver;
    CommonUtils utils;
    public AccountPage(WebDriver driver){
        this.driver = driver;
        this.utils= new CommonUtils(driver);

        PageFactory.initElements(driver, this);

    }

@FindBy(linkText = "Account")
    private WebElement accountBreadcrumb;

    @FindBy(xpath = "//h2[text()='My Account']")
    private WebElement myAccountHeader;


    public  boolean accountBreadcrumbIsDisplayed(){
       return utils.isDisplayed(accountBreadcrumb, MyUtils.EXPLICIT_WAIT_TIME);
    }

    public String verifyMyAccountHeaderText(){
        return utils.getText(myAccountHeader, MyUtils.EXPLICIT_WAIT_TIME);
    }
}
