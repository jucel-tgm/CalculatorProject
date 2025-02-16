package at.technikumwien;

public class CalculatorFactory {

    public Calculator createInstance(boolean simple) {
        if (simple)
            return new CalculatorSimpleImpl();
        else
            return new CalculatorExtendedImpl();

    }

}
