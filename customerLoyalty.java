import java.util.Scanner;

public class customerLoyalty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our E-store Purchase Calculator!");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        double totalCost = 0;
        int itemCount = 10;
        String itemName;
        double itemPrice = 200;
        char continueShopping;

        do {
            System.out.print("Enter item name: ");
            itemName = scanner.next();
            System.out.print("Enter item price: ");
            itemPrice = scanner.nextDouble();

            totalCost += itemPrice;
            itemCount++;

            System.out.print("Do you want to continue shopping? (Y/N): ");
            continueShopping = scanner.next().charAt(0);
        } while (continueShopping == 'Y' || continueShopping == 'y');

        if (totalCost >= 200){
        	int discount = (total * 10) / 100;         }

                 System.out.println("customer name");
       		 System.out.println("Customer Name: " + customerName);
       		 System.out.println("Total Items Purchased: " + itemCount);
        	 System.out.println("Total Cost: " + total Cost");
		 System.out.println("No discount added");
       		 System.out.println("Thank you for the patronage!");
    }
}
