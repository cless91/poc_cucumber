package hellocucumber.e2e.txn;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import txn.User;
import txn.UserRepository;

public class UserStepDefinitions {

    @Autowired
    private UserRepository userRepository;

    private User currentUser;

    @Given("there is a user")
    public void there_is_a_user() {
        currentUser = userRepository.save(new User("John Doe"));
    }

    public User getCurrentUser() {
        return currentUser;
    }

}
