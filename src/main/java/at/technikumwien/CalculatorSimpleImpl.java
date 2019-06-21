package at.technikumwien;

public class CalculatorSimpleImpl implements Calculator {
    @Override
    public int sum(int... numbers) {
        if (numbers.length>2)
            throw new IllegalArgumentException("Nur 2 Zahlen erlaubt");
        return numbers[0]+numbers[1];
    }

    public static void main(String[] args){
        CalculatorSimpleImpl test = new CalculatorSimpleImpl();
        System.out.println(test.sum(4,2));
    }
}
