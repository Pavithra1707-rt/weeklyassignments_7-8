public class AdvancedCalculator {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;

        int sumResult = add(number1, number2);
        int differenceResult = subtract(number1, number2);
        int productResult = multiply(number1, number2);

        System.out.println("Sum: " + sumResult);
        System.out.println("Difference: " + differenceResult);
        System.out.println("Product: " + productResult);
    }

    public static int add(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public static int subtract(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public static int multiply(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }
}