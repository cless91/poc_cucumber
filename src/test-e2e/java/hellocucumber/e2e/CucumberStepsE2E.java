package hellocucumber.e2e;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;



public class CucumberStepsE2E {
    @Autowired
    private Toto toto;

//    @Autowired
//    private PersonRepository personRepository;

//    @Given("e2e given")
//    public void today_is_Sunday() {
//        System.out.println("given " + toto.getK1());
//        System.out.println("given " + toto.getK2());
////        Person person = new Person(new PersonKey("toto", LocalDateTime.now(), UUID.randomUUID()),"tata",32.09);
////        personRepository.save(person);
//    }

    @When("e2e when")
    public void i_ask_whether_it_s_Friday_yet() {
        System.out.println("when " + toto.getK1());
        System.out.println("when " + toto.getK2());
    }

    @Then("e2e then")
    public void i_should_be_told() {
        System.out.println("then " + toto.getK1());
        System.out.println("then " + toto.getK2());
    }

    @When("e2e when2")
    public void e2eWhen2() {
        System.out.println("when2 " + toto.getK1());
        System.out.println("when2 " + toto.getK2());
    }

    @When("e2e then2")
    public void e2eThen2() {
        System.out.println("then2 " + toto.getK1());
        System.out.println("then2 " + toto.getK2());
    }

}
