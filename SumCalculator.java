public class SumCalculator {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;

        int result1 = addNumbers(firstNumber, secondNumber);
        int result2 = addNumbers(5, 15);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}