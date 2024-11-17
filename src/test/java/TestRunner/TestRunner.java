package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeatureFiles",
        glue = {"Hooks", "StepDefinitions"},
        plugin = {"pretty" , "html:target/cucumber-reports.html"},
        monochrome = true
)
public class TestRunner {


    public void TestingRunner(){

    }
}
