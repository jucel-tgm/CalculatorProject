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


public class CalculatorExtendedImplTest {

    private CalculatorExtendedImpl calc;

    @BeforeEach
    public void setUp() {
       calc = new CalculatorExtendedImpl();
    }

    @Test
    public void testSumOfFourNumbers() {
        int sum = calc.sum(4, 6, 8, 120);
        assertEquals(4 + 6 + 8 + 120, sum);
    }

    @Test
    public void testSumOfTenNumbers() {
        int sum = calc.sum(4, 6, 8, 120, 5, 6, 7, 8, 9, 10);
        assertEquals(4 + 6 + 8 + 120 + 5 + 6 + 7 + 8 + 9 + 10, sum);
    }
}
