import java.util.Scanner
	public class BiggestNumbers {

       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            int largest = 0;
        	int secondLargest = 0;

        	int counter = 0;

        	while (counter < 10) {
            	System.out.println("Enter a number: ");
            	int number = scanner.nextInt();

            	if (number > largest) {
                	secondLargest = largest;
                	largest = number;
            	} 
			else if (number > secondLargest) {
                	secondLargest = number;
            	}

            	counter++;
        	}

 

        	System.out.println("Largest number is: " + largest);
        	System.out.println("Second largest number is: " + secondLargest);
       }
}