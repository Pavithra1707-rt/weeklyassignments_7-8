public class MathOperations {

    public static void main(String[] args) {
        double number = 16;

        performMathOperations(number);
    }

    public static void performMathOperations(double inputNumber) {
        double squareRoot = Math.sqrt(inputNumber);
        double powerValue = Math.pow(inputNumber, 2);
        double randomValue = Math.random();

        System.out.println("Square Root: " + squareRoot);
        System.out.println("Power: " + powerValue);
        System.out.println("Random Value: " + randomValue);
    }
}