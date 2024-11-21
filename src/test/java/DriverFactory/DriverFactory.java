package DriverFactory;

import PropertiesReader.PropertiesReader;
import Utilities.MyUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class DriverFactory {


   static  WebDriver driver;

    public static void initializeBrowser(String browserName) throws Exception {


        switch(browserName){

            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Edge" :
                driver = new EdgeDriver();
                break;
            case "firefox" :
                driver = new FirefoxDriver();
                break;

            default:
                throw  new Exception("Invalid browser specified. Please choose 'Chrome', 'Edge', or 'Firefox'.");

        }
        driver .manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(MyUtils.IMPLICIT_WAIT_TIME));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(MyUtils.PAGE_LOAD_TIMEOUT));

    }

    public static  WebDriver getDriver(){

        return driver;

    }

    public static String generateRandomEmail(){
        LocalDateTime dateAndTime = LocalDateTime.now();

        String formattedDate = dateAndTime.format(dateTimeFormatter);
        String dateAdnTime = formattedDate.replace(" ", "_").replace("-", "_");

        return "simba" + dateAdnTime + "@malinator.com";


    }
}
