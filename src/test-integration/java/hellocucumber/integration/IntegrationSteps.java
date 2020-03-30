package hellocucumber.integration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;


public class IntegrationSteps {
    @Given("integration given")
    public void today_is_Sunday() {
    }

    @When("integration when")
    public void i_ask_whether_it_s_Friday_yet() {

    }

    @Then("integration then")
    public void i_should_be_told() {
        assertThat(true).isEqualTo(true);
    }
}
