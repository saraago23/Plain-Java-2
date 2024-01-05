package generics.u1.u3;


public class NumberCalculator {

    public static <T extends Number> double calculateResult(T number1, T number2) {

        double result = number1.doubleValue() + number2.doubleValue();
        return result;
    }

    public static void main(String[] args) {
        int intResult = (int) calculateResult(5, 10);
        System.out.println("Integer Result: " + intResult);

        double doubleResult = calculateResult(5.5, 10.5);
        System.out.println("Double Result: " + doubleResult);
    }
}

