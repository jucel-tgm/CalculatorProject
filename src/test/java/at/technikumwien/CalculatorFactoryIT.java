package at.technikumwien;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@Tag("it")
public class CalculatorFactoryIT {

    private Calculator calc;

    @BeforeEach
    public void setUp() {
        CalculatorFactory factory = new CalculatorFactory();
        calc = factory.createInstance(true);
    }

    @Test
    public void testCreationOfSimpleCalculator(){
        assertThrows(IllegalArgumentException.class, () -> calc.sum(4,5,6));

    }
}
