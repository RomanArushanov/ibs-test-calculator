package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    static Calculator calculator;

    @BeforeAll
    public static void init(){
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        int result = calculator.sum(2, 2);
        if (result != 4) {   // if 2 + 2 != 4
            Assertions.fail();
        }
    }

    @Test
    public void testMinus() {
        Assertions.assertEquals(0, calculator.substruction(2, 2));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2, calculator.division(6, 3));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(18, calculator.multiplication(6, 3));
    }

    @Test()
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        ArithmeticException thrown = Assertions
                .assertThrows(ArithmeticException.class, () -> {
                    calculator.division(6, 0);
                }, "ArithmeticException error was expected");

       Assertions.assertEquals("/ by zero", thrown.getMessage());
    }
}