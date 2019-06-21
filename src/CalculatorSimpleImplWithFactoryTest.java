package at.technikumwien;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorSimpleImplTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() {
        CalculatorFactory factory = new CalculatorFactory();
        calc = factory.createInstance(true);
    }
    @Test
    public void testSumOfTwoNumbers(){
        int sum = calc.sum(4,6);
        assertEquals(4+6,sum);
    }

    @Test
    public void testSumOfMoreThanTwoNumbers(){
        assertThrows(IllegalArgumentException.class, () -> calc.sum(4,5,6));

    }
}
