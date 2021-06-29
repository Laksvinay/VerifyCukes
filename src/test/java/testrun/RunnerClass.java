package testrun;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;






@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/emre2e.feature",glue="verifyemr",plugin = { "pretty","html:target/cucumber-report.html"})

public class RunnerClass {

}
