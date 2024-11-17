package StepDefinitions;

import DriverFactory.DriverFactory;
import Pages.AccountSuccessPage;
import Pages.HomePage;
import Pages.RegisterAccountPage;
import PropertiesReader.PropertiesReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

import static org.junit.Assert.*;

public class SignUp {
    WebDriver driver;
    PropertiesReader propertiesReader;
    HomePage homePage;
    RegisterAccountPage registerAccountPage;
    AccountSuccessPage accountSuccessPage;

    Properties property;

    @Given("user has launched the application")
    public void user_Has_Launched_The_Application() throws Exception {
        propertiesReader = new PropertiesReader();
        property= propertiesReader.readProperties();
        driver = DriverFactory.getDriver();

    assertEquals(property.getProperty("url"), driver.getCurrentUrl());
    }

    @When("user clicks on My Account button")
    public void userClicksOnMyAccountButton() {
    homePage = new HomePage(driver);
    homePage.clickMyAccountButton();

    }

    @And("selects Register")
    public void selectsRegister() {
    homePage.clickRegisterButton();
    }


    @And("enters first name into first name field")
    public void entersFirstNameIntoFirstNameField() {
        registerAccountPage = new RegisterAccountPage(driver);

        registerAccountPage.enterFirstNameIntoFirstNameField(property.getProperty("firstName"));
    }

    @And("enters last name into last name field")
    public void entersLastNameIntoLastNameField() {

        registerAccountPage.enterLastNameIntoLastNameField(property.getProperty("lastName"));
    }

    @And("enters email address into email address field")
    public void entersEmailAddressIntoEmailAddressField() {

        registerAccountPage.typeEmailIntoEmailAddressField(DriverFactory.generateRandomEmail());
    }


    @And("enters telephone into telephone field")
    public void entersTelephoneIntoTelephoneField() {

        registerAccountPage.typeTelephoneIntoTelephoneField(property.getProperty("telephone"));
    }

    @And("enters Password into Password field")
    public void entersPasswordIntoPasswordField() {

        registerAccountPage.typePasswordIntoPasswordField(property.getProperty("password"));
    }

    @And("enters Password into Password confirm field")
    public void entersPasswordIntoPasswordConfirmField() {

        registerAccountPage.typePasswordIntoPasswordConfirmField(property.getProperty("password"));
    }

    @And("selects Yes in Newsletter field")
    public void selectsYesInNewsletterField() {
        registerAccountPage.clicksNoInNewsletterField();
    }

    @And("checks Privacy policy checkbox")
    public void checksPrivacyPolicyCheckbox() {
        registerAccountPage.checkPrivacyPolicyCheckBox();
    }

    @And("clicks on Continue button")
    public void clicksOnContinueButton() {

        registerAccountPage.clickContinueButton();
    }

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        accountSuccessPage = new AccountSuccessPage(driver);

       // String actualSuccessMessageDisplayed = accountSuccessPage.verifySuccessMessageDisplayed();
        assertEquals(property.getProperty("successMessage"), accountSuccessPage.verifySuccessMessageDisplayed());

       // assertEquals(actualSuccessMessageDisplayed, property.getProperty("successMessage"));
    }

    @And("user should be signed in automatically")
    public void userShouldBeSignedInAutomatically() {

       // boolean logOutButtonIsDisplayed = accountSuccessPage.logOutButtonIsDisplayed();
        assertTrue(accountSuccessPage.logOutButtonIsDisplayed());

    }

    @And("enters incorrect Password into Password confirm field")
    public void entersIncorrectPasswordIntoPasswordConfirmField() {

        String password = property.getProperty("password");
        String incorrectPassword = password.toLowerCase();// converting text I'm inputing into the password field to all lower case to simulate a wrong password.

        registerAccountPage.typePasswordIntoPasswordConfirmField(incorrectPassword);
    }

    @Then("validation message should be displayed indicating passwords don't match")
    public void validationMessageShouldBeDisplayedIndicatingPasswordsDonTMatch() {

      // String  warningMessageDisplayed = registerAccountPage.getTextInWarningAlertField();
      // String warningMessageDisplayedOnPasswordConfirmField= registerAccountPage.getWarningMessageFromPasswordConfirmField();
       //assertEquals(property.getProperty("Warning"), registerAccountPage.getTextInWarningAlertField());
       assertEquals("Password confirmation does not match password!", registerAccountPage.getWarningMessageFromPasswordConfirmField());
       
       //assertTrue(warningMessageDisplayed.contains("Warning"));
       // assertEquals("Password confirmation does not match password!", warningMessageDisplayedOnPasswordConfirmField);
    }



    @And("user should not be able to sign up successfully.")
    public void userShouldNotBeAbleToSignUpSuccessfully() {
        assertTrue(registerAccountPage.loginButtonIsDisplayed());
    }
}
