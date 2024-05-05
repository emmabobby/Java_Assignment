 import java.util.Scanner;

public class NameCollectionOne {
    public static void main(String[] args) {
        String[] names = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

                System.out.println("The names you entered are:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}