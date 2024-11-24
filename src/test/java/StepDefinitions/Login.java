package StepDefinitions;

import DriverFactory.DriverFactory;
import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;


public class Login {
    HomePage homePage;
    LoginPage loginPage;
    WebDriver driver;
    AccountPage accountPage;


    @And("selects login button")
    public void Selects_Login_Button(){
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        homePage.clickLoginButton();

    }

    @And("enters {string} into email address field in login page")
    public void entersEmailAddressIntoEmailAddressFieldInLoginPage(String emailAddress) {
        loginPage.enterEmailIntoEmailAddressField(emailAddress);
    }


    @And("enters correct {int} into password field")
    public void entersCorrectPasswordIntoPasswordField(int password) {
        loginPage.enterPasswordIntoPasswordField(password);
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user should be signed in and navigated to account page")
    public void userShouldBeSignedInAndNavigatedToAccountPage() {
        accountPage = new AccountPage(driver);
        assertTrue(accountPage.accountBreadcrumbIsDisplayed());
        assertEquals("My Account", accountPage.verifyMyAccountHeaderText());
    }
}
