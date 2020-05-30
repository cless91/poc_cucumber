package hellocucumber.e2e;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;


public class CucumberGivenStepsE2E {
    @Autowired
    private Toto toto;

//    @Autowired
//    private PersonRepository personRepository;

    @Given("e2e given")
    public void today_is_Sunday() {
        System.out.println("given " + toto.getK1());
        System.out.println("given " + toto.getK2());
//        Person person = new Person(new PersonKey("toto", LocalDateTime.now(), UUID.randomUUID()),"tata",32.09);
//        personRepository.save(person);
    }

}
