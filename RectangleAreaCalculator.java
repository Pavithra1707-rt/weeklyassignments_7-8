public class RectangleAreaCalculator {

    public static void main(String[] args) {
        int length = 5;
        int width = 3;

        int area = calculateArea(length, width);
        System.out.println("Area: " + area);
    }

    public static int calculateArea(int inputLength, int inputWidth) {
        return inputLength * inputWidth;
    }
}