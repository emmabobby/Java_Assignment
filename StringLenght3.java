pimport java.util.Scanner;

public class StringLength3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        int stringLength = userInput.length();
        System.out.println("Length of the string: " + stringLength);
    }
}

