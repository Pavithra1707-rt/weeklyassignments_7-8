public class FibonacciSeries {

    public static void main(String[] args) {
        int terms = 6;

        for (int i = 0; i < terms; i++) {
            System.out.print(generateFibonacci(i) + " ");
        }
    }

    public static int generateFibonacci(int position) {
        if (position == 0) return 0;
        if (position == 1) return 1;

        return generateFibonacci(position - 1) + generateFibonacci(position - 2);
    }
}