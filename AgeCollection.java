 import java.util.Scanner;

public class AgeCollection {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);


        int[] age = new int[5];



        for(int counter = 0; counter < 5; counter++) {
            
	System.out.print("Enter age ");
	int age = input.nextInt();
	age[counter] = age;
        
	}
	



	for(int counter = 0; counter < 5; counter++){
	  System.out.println(age[counter]);
           
        }
    }
}