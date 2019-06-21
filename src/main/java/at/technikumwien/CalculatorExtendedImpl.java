package at.technikumwien;

public class CalculatorExtendedImpl implements Calculator {
    @Override
    public int sum(int... numbers) {
        int sum = 0;
        for (int i=0; i<numbers.length;i++)
            sum+=numbers[i];
        return sum;
    }
    public static void main(String[] args){
        CalculatorExtendedImpl test = new CalculatorExtendedImpl();
        System.out.println(test.sum(4,2,5,9));
    }
}
