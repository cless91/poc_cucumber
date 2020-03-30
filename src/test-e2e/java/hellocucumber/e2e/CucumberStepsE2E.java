package hellocucumber.e2e;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;


public class CucumberStepsE2E {
    @Given("e2e given")
    public void today_is_Sunday() {
    }

    @When("e2e when")
    public void i_ask_whether_it_s_Friday_yet() {

    }

    @Then("e2e then")
    public void i_should_be_told() {
        assertThat(true).isEqualTo(true);
    }
}
