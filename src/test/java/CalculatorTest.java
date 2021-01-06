import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        // given:
        Calculator calculator = Calculator.instance.get();

        // when:
        int a = calculator.plus.apply(2, 2);
        int b = calculator.minus.apply(4, 2);
        int c = calculator.divide.apply(a, b);

        // then:
        Assertions.assertEquals(a, 4);
        Assertions.assertEquals(b, 2);
        Assertions.assertEquals(c, 2);
    }
}
