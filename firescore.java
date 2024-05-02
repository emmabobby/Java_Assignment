import java.util.Scanner;

public class firescore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter scores:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Score " + i + ": ");
            int score = scanner.nextInt();
            sum += score;
        }

        System.out.println("Sum of scores: " + sum);
    }
}