import java.util.Scanner;
   public class CreditLimitCalculator {
     public static void main(String[] args){
   
     Scanner input = new Scanner(System.in);

     System.out.print("Enter account number: ");
     int accountNumber = input.nextInt();

      System.out.print("Enter beginning balance: ");
	int beginningBalance = input.nextInt();

    
       System.out.print("Enter number item charged: ");
	int numberOfItemCharged = input.nextInt();

	System.out.print("Enter Number of credit applied: ");
	int numberOfCreditApplied = input.nextInt();

	System.out.print("Enter Allowed Credit Limit: ");
	int creditLimit = input.nextInt();


	int newBalance = beginningBalance + numberOfItemCharged - numberOfCreditApplied ;

	System.out.println("New balance is " +newBalance); 
	
	if(newBalance > creditLimit){
		System.out.println("credit limit exceeded");
	}
    
    }
}