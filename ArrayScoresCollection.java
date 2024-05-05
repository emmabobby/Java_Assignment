 import java.util.Array;

public class ArrayScoresCollection {
    public static void main(String[] args) {
        int[] scores = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter scores: ");
            scores[i] = scanner.nextint();
        }
        for ( i = 0; i < 10; i++) {
            System.out.println(scores[i]);
        }
    }
}