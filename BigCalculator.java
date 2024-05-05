import java.util.Scanner;

public class BigCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = calculatePower(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }

    public static double calculatePower(double base, int exponent) {
        double result = 1;
       
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

	return result;
    }
}