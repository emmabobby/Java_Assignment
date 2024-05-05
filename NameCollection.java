import java.util.scanner;

public class NameCollection {
	public static void main(String[] args) {
		String[] names = new String[5];
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < names.Length; i++) {
			System.out.print("Enter name " + (i + 1) + ": ");
			names[1] = scanner.nextLine();
		}

			System.out.println("The names you entered are:");
		for(String name : names) {
			System.out.println(name);
		}


	}



}