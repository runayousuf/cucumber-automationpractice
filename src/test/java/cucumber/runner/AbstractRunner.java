package cucumber.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(plugin = {"pretty",
        "json:build/cucumber-report.json",
        "de.monochromata.cucumber.report.PrettyReports:build/cucumber"},
        features = {"classpath:features"}, glue = {"cucumber.step"})
@RunWith(Cucumber.class)

public class AbstractRunner {
}
