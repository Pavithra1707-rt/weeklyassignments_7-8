public class EvenOddChecker {

    public static void main(String[] args) {
        int number = 7; // input value
        checkEvenOdd(number);
    }

    public static void checkEvenOdd(int inputNumber) {
        if (inputNumber % 2 == 0) {
            System.out.println(inputNumber + " is Even");
        } else {
            System.out.println(inputNumber + " is Odd");
        }
    }
}