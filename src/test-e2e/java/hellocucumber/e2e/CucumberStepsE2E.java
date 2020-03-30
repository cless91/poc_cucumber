package hellocucumber.e2e;

import hellocucumber.e2e.springbootcassandra.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@ContextConfiguration(classes = {
        Toto.class,
        CassandraConfig.class,
        SslOptionsFactoryBean.class,
})
@TestPropertySource(properties = {"k1=val1"})
@ActiveProfiles({"e2e"})
public class CucumberStepsE2E {
    @Autowired
    private Toto toto;

    @Autowired
    private PersonRepository personRepository;

    @Given("e2e given")
    public void today_is_Sunday() {
        System.out.println("given1 " + toto.getK1());
        System.out.println("given2 " + toto.getK2());
        Person person = new Person(new PersonKey("toto", LocalDateTime.now(), UUID.randomUUID()),"tata",32.09);
        personRepository.save(person);
    }

    @When("e2e when")
    public void i_ask_whether_it_s_Friday_yet() {

    }

    @Then("e2e then")
    public void i_should_be_told() {
        assertThat(true).isEqualTo(true);
    }
}
