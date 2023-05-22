package steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature", 
glue={"StepsDev"},
monochrome = true,


plugin = {"pretty","junit:target/report.xml",
                "json:target/cucumber.json",
                "html:target/htmlReport.html"}
)

public class TestRunner {

}
