import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculatorTest {
    @Test
    public void testConcat_validArgument_success() {
        // given:
        Calculator calculator = Calculator.instance.get();

        // when:
        int a = calculator.plus.apply(2, 2);
        int b = calculator.minus.apply(4, 2);
        int c = calculator.divide.apply(a, b);
        int d = calculator.pow.apply(c);

        // then:
        assertThat(a, is(equalTo(4)));
        assertThat(b, is(equalTo(2)));
        assertThat(c, is(equalTo(2)));
        assertThat(d, greaterThanOrEqualTo(3));
        assertThat(d, lessThanOrEqualTo(5));
    }
}
