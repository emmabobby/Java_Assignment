import java.util.scanner;

public class MainTest{
	public static void main(String...args){
		int[] scores = new int [10];

	Scanner scanner = new Scanner(System.in);
	
	for(int i = 0; i < 10; i++){
		System.out.print("Enter score: ");
		scores[i] = Scanner.nextInt();
	}
		System.out.print("Scores: ");
		for(int i = 0; i < 10; i++){
			System.out.println(scores[1] + " ");

	}

}
}