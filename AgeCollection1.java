import java.util.Scanner;

public class AgeCollection1 {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);


        int[]ages = new int[5];



        for(int counter = 0; counter < 5; counter++) {
            
	System.out.print("Enter age: ");
	int age = input.nextInt();

	ages[counter] = age;
        
	}
	

	for(int counter = 0; counter < 5; counter++){
	System.out.println(ages[counter]);
           
        }
    }
}