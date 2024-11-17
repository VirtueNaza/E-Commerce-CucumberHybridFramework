package StepDefinitions;

import DriverFactory.DriverFactory;
import Pages.HomePage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;


public class Login {
    HomePage homePage;
    WebDriver driver;


    @And("selects login button")
    public void Selects_Login_Button(){
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);

        homePage.clickLoginButton();

    }

    @And("enters {string} into email address field in login page")
    public void entersEmailAddressIntoEmailAddressFieldInLoginPage(String emailAddress) {
        homePage.enterEmailIntoEmailAddressField(emailAddress);
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        
    }

    @And("enters correct {string} into password field")
    public void entersCorrectPasswordIntoPasswordField(int password) {
    }
}
