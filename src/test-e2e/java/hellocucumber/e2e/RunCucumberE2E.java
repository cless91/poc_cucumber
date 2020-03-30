package hellocucumber.e2e;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test-e2e/resources"},
        tags = {"@e2e"})
public class RunCucumberE2E {
}
