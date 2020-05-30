package hellocucumber.e2e;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ContextConfiguration(classes = {
        Toto.class,
//        CassandraConfig.class,
//        SslOptionsFactoryBean.class,
})
@TestPropertySource(properties = {"k1=val1"})
@ActiveProfiles({"e2e"})
@CucumberContextConfiguration
public class SpringContextConfiguration {
}
