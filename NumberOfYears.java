import java.util.Scanner;

public class NumberOfYears {

    public static void main(String[] arg) {

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the number of minutes: ");
	int minutes = scanner.nextInt();

     
      int minutePerDay = 24 * 60;

	int minutesPerYear = minutePerDay * 365 ;
	
	int year = minutes /  minutesPerYear;

	int remainingMinutes = minutes % minutesPerYear;

      int days = remainingMinutes / minutePerDay;
      
      



	System.out.println(minutes  + "minutes is approximately" + year + " years and " + days + " dayss" );


    }
} 