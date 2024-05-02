import java.util.Scanner;

public class firescore2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;

        System.out.println("Enter scores:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Score " + i + ": ");
            int score = scanner.nextInt();
            average += score;
        }

        System.out.println("average scores: " + average);
    }
}