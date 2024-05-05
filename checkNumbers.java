import java.util.Scanner;

public class checkNumbers{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int zeros = 0;

		while(true){
		System.out.println("Enter a number (press 0 to quit): ");
		int number =input.nextInt();

		if(number == 0){
				break;

		}else if(number > 0){
				positive++;

		}else {
				negative++;
	}
		
		
		

}System.out.println("the sum of positive number is: " + positive);
System.out.println("the sum of negative number is: " + negative);
System.out.println("the sum of zeros number is: " + zeros);
}

}