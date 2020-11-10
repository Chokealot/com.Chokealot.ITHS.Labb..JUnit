package com.Chokealot.Labb2.jUnit;

import com.Chokealot.Labb2.jUnit.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    public static int tempIntForCompare;
    public static Calculator calculator = new Calculator();

    @Test
    @BeforeAll
    public static void testMessage()   {
        System.out.println("Initializing TestClass for 'com.Chokealot.Labb2.jUnit.Calculator'...");
    }

    @Test
    @BeforeEach
    public void testIfNull()    {
        assertNotNull(calculator);
    }

    @Test
    @AfterEach
    public void tesCheckResult() {
        System.out.println(tempIntForCompare);
    }

    @Test
    @AfterAll
    public static void testMessageAfter() {
        System.out.println("All tests has been preformed!");
    }

    @ParameterizedTest
    @ValueSource(ints = {24,110,7,88,3})
    public void testCalculatorAdd(int n) {
        assertEquals(4+n, calculator.add(4, n));
        tempIntForCompare = 4 + n;
    }

    @Test
    public void testCalculatorSubtract() {
        assertEquals(10, calculator.subtract(15,5));
        assertFalse(calculator.subtract(20, 5) != 15);
        tempIntForCompare = calculator.subtract(15,5);
    }

    @Test
    public void testCalculatorDivide()   {
        assertEquals(22, calculator.divide(44,2));
        assertNotNull(calculator.divide(10,2));
        tempIntForCompare = calculator.divide(44,2);
    }

    @Test
    @RepeatedTest(4)
    public void testCalculatorMultiple() {
        assertEquals(28, calculator.multiple(4,7));
        assertTrue(calculator.multiple(3,9) > calculator.multiple(3,8));
        tempIntForCompare = calculator.multiple(4,7);
    }
}
