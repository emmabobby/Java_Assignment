import java.util.Scanner;

public class Modules {

    public static void main(String[] arg) {

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number between 0 - 1000: ");
	int input = scanner.nextInt();

    	int lastNumber = input % 10;
	int holder = input / 10;
	
	int secondNumber = holder % 10;
	
	int firstNumber = holder / 10;
	int sum = lastNumber + secondNumber + firstNumber;



	

      
      
	System.out.println("The sum of the digit: "+sum);

    }
} 