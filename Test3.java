import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter score1: ");
        int score1 = scanner.nextInt();

        System.out.print("Enter score2: ");
        int score2 = scanner.nextInt();

        System.out.print("Enter score3: ");
        int score3 = scanner.nextInt();

        int sum = score1 + score2 + score3;

        if (sum >= 50 && sum <= 69) {
            System.out.printf("%s passed by B Your score is: %d%n", name, sum);
        } else if (sum >= 70 && sum <= 79) {
            System.out.printf("%s passed by B Your score is: %d%n", name, sum);
        } else if (sum >= 80 && sum <= 100) {
            System.out.printf("%s passed by A Your score is: %d%n", name, sum);
        } else {
            System.out.printf("%s You failed by D: %d%n", name, sum);
        }
    }
}
