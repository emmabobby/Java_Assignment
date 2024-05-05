import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	 System.out.print("Enter Name");
	 String name = scanner.nextLine();

        System.out.print("Enter score: ");
        int score1 = scanner.nextInt();

	System.out.print("Enter score: ");
        int score2 = scanner.nextInt();

	System.out.print("Enter score: ");
        int score3 = scanner.nextInt();

        int sum = score1 + score2 + score3;
	
	
	if (sum <= 49) {
	System.out.printf("%s invalidResult ",sum);
} else{
System.out.printf("%s Pass by %d",studentName ,sum );

}
}
}