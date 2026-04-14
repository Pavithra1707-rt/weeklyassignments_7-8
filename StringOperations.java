public class StringOperations {

    public static void main(String[] args) {
        String inputText = "Java Programming";

        printStringDetails(inputText);
    }

    public static void printStringDetails(String text) {
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
    }
}