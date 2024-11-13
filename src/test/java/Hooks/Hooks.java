package Hooks;

import DriverFactory.DriverFactory;
import PropertiesReader.PropertiesReader;
import io.cucumber.java.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        Properties property = propertiesReader.readProperties();
        DriverFactory.initializeBrowser(property.getProperty("browser"));
        driver = DriverFactory.getDriver();

    }

    @After
    public void tearDown(Scenario scenario){

        String testCaseName;


        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            testCaseName = scenario.getName();

            scenario.attach(screenshot,"img/png",testCaseName+"failed");

        }
        driver.quit();

    }
}
