import java.util.Scanner;

public class Switch{
public static void main(String[]args){
String prompt = """
Hi, Welcome
press
1 -> For English
2 -> For Yoruba
3 -> For Housa
""";

System.out.println(prompt);
Scanner KeyboardInput = new Scanner(System.in);
int userInput = KeyboardInput.nextInt();

switch(userInput){

 case 1 -> System.out.println("English");
 case 2 -> System.out.println("Yoruba");
 case 3 -> System.out.println("igbo");
 default -> System.out.println("Enter a correct number");
}
String ten = """
Hi, Welcome
press
1 -> For English
2 -> For Yoruba
3 -> For Hausa
""";

System.out.println(ten);
int ramInput = KeyboardInput.nextInt();

switch(userInput){

 case 1 -> System.out.println("Manager");
 case 2 -> System.out.println("Client");
 case 3 -> System.out.println("Job");
 default -> System.out.println("Finished");
}
String eleven = """
Hi, Welcome
press
1 -> For English
2 -> For Yoruba
3 -> For Hausa
""";

System.out.println(eleven);
int taxInput = KeyboardInput.nextInt();

switch(userInput){

 case 1 -> System.out.println("Tools");
 case 2 -> System.out.println("Details");
 case 3 -> System.out.println("Execute");
 default -> System.out.println("Done");
}
}
}