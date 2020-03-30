package hellocucumber.e2e;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Toto {
    @Value("${k1}")
    private String k1;
    @Value("${k2}")
    private String k2;

    public String getK1() {
        return k1;
    }

    public String getK2() {
        return k2;
    }
}
