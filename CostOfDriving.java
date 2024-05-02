import java.util.Scanner;

public class CostOfDriving {

    public static void main(String[] arg) {

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the driving distance: ");
	double distance = scanner.nextDouble();

      System.out.print("Enter the miles per gallon: ");
      double milesPerGallon = scanner.nextDouble();

      System.out.print("Enter the the price of fuel per gallon: ");
      double price = scanner.nextDouble();

  	double pricePerGallon =  milesPerGallon / price;
	
	double costOfDriving = distance / pricePerGallon;
      
      
	System.out.printf("The cost of driving is $%.2f", costOfDriving);

    }
} 