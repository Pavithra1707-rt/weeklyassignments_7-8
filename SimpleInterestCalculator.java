public class SimpleInterestCalculator {

    public static void main(String[] args) {
        double principalAmount = 1000;
        double rateOfInterest = 5;
        double timePeriod = 2;

        double interest = calculateSimpleInterest(principalAmount, rateOfInterest, timePeriod);
        System.out.println("Simple Interest: " + interest);
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}