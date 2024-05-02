import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);


        String[]names = new String[5];
	int[]grade = new int[5];



        for(int counter = 0; counter < 5; counter++) {
            
		System.out.print("Enter name: ");
		String name = input.nextLine();
		System.out.print("Enter grade: ");
		int gradeName = input.nextInt();
		names[counter] = name;
		grade[counter] = gradeName;
		input.nextLine();
        
	}
	

	for(int counterTwo = 0; counterTwo < 5; counterTwo++){
		System.out.println(names[counterTwo]);
		System.out.println(grade[counterTwo]);
           
        }
    }
}