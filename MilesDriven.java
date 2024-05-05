import java.util.Scanner;
public class MilesDriven {
   public static void main(String[] args) {

      Scanner input =  new Scanner(System.in);

	System.out.print("enter the miles driven: ");
	int  milesDriven = input.nextInt();

	System.out.print("enter thegallonUsed: ");
	int gallonUsed = input.nextInt();

	double calculate = (milesDriven * gallonUsed);
	System.out.println(calculate);

      }

}


	