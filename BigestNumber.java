import java.util.scanner

public class BiggestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int BiggestNumber = 0
        
      
     for(int i = 1; i <= 10; i++){
	System.out.print("Enter number "+i + " : " );
	int number = scanner.nextInt();
	
	if(number > BiggestNumber) {
	BiggestNumber = number;
	
    }
}
 System.out.println("The highest is: "+ BiggestNumber);
	
   }
}

     	    


 