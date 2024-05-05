import java.util.Scanner;

public class ArrayScore2{
    public static void main(String[] args) {
       
        int[] scores = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score: ");
            scores[i] = scanner.nextInt();
        }

        System.out.println("Array in vertical order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(scores[i]);
        }
    }
}