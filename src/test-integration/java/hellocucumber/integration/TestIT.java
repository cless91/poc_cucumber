package hellocucumber.integration;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestIT {
    @Test
    public void name() {
        Assertions.assertThat(true).isEqualTo(true);
    }
}
