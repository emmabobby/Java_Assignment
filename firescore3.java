import java.util.Scanner;

public class fireScore3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter scores:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            int score = scanner.nextInt();
            sum += score;
        }

        double average = (double) sum / 10;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);


    }
}