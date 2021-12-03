import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/Features", glue={"StepDefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/Testreport.html"
        })

public class TestRunner extends AbstractTestNGCucumberTests {

}
