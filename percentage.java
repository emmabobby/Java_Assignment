import java.util.Scanner;

public class customerLoyalty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our E-store Purchase Calculator!");

        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        double totalCost = 0;
        int itemCount = 0;
        String itemName;
        double itemPrice;
        char continueShopping;

        do {
            System.out.print("Enter item name: ");
            itemName = scanner.next();
            System.out.print("Enter item price: ");
            itemPrice = scanner.nextDouble();

            totalCost += itemPrice;
            itemCount++;

            System.out.print("Do you want to continue shopping? (YES/NO): ");
            continueShopping = scanner.next().charAt(0);
        } while (continueShopping == 'Y' || continueShopping == 'y');

        if (totalCost >= 200) {
            totalCost *= 0.9; // Apply 10% discount
        }

                 System.out.println("\n--- Receipt ---");
       		 System.out.println("Customer Name: " + customerName);
       		 System.out.println("Total Items Purchased: " + itemCount);
        	 System.out.println("Total Cost: " + totalCost + " naira");
       		 System.out.println("Thank you for shopping with us!");
    }
}
