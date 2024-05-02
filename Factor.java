import java.util.Scanner;
    public class factor{
       public static void main(String[] args){
		 Scanner input = new Scanner(System.in);

			System.out.println("Enter a Number");
			int number = input.nextInt();
			
			int factor = 1 ;
			while(factor <= number ){
				
				if(number % factor == 0){
				System.out.println(factor);


    
				}
		factor++;
			}
	
        }
    }