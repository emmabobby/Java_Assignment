import java.util.Scanner;
public class customerLoyalty1 {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to E-store, Please enter customer Name:");
		String name = input.nextLine();


		int total =0;
		int count = 1;
		int discount = 10;

		while  (count <=10) {
			System.out.println("Please enter cost for item "   +  count);
			int cost = input.nextInt();
			count = count + 1;
			total += cost;
 		}


		double discounted = total * discount / 100;
		double discountedCost = total - discounted;



		System.out.println("Customer name:" + name);
		System.out.println("Original cost:" + total);



		if (total >=200) {
			System.out.println("The Discounted Cost is " + discountedCost);
		}
		else {
			System.out.println("no discount");
 		}

		System.out.println("Thank you for your patronage");
		}
	}