import java.util.Scanner;
public class TotalTaxApp {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter amount here: ");
	double taxedAmount = input.nextDouble();

	if (taxedAmount < 30000){
	  System.out.printf("$%.1f",taxedAmount * (15/100f));
	} else if (taxedAmount >= 30000) {
	  System.out.printf("$%.1f",taxedAmount * (20/100f));
	};

	//System.out.printf("%.1f", taxedAmount);
	

	// 15% < 30000
	// 20% >=  30000

    }


}
