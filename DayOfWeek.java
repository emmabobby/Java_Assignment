public class DayOfWeek{
	public static void main(String...args){
		printDayOfTheWeek(-1);
		printDayOfTheWeek(0);
		printDayOfTheWeek(1);
		printDayOfTheWeek(2);
		printDayOfTheWeek(3);
		printDayOfTheWeek(4);
		printDayOfTheWeek(5);
		printDayOfTheWeek(6);
		printDayOfTheWeek(7);
	}

		private static void printDayOfTheWeek(int day) {

			switch(day) {
			   case '0':
			    System.out.print("sunday");
			   case '1':
			    System.out.print("monday");
			    break;
			   case '2':
			    System.out.print("tuesday");
			    break;
			   case '3':
			    System.out.print("wenesday");
			    break;
			   case '4':
			    System.out.print("thursday");
			    break;
			   case '5':
			    System.out.print("friday");
			    break;
			   case '6':
			    System.out.print("saturday");
			    break;
			   default:
			    System.out.print("invalid day");
			    break;
			
			}

		}

	
	


 }