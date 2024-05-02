
import java.util.Scanner;

public class NokiaPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
	
        Nokia 3310 Menu
        Press
        1 -> Phone book
        2 -> Messages
        3 -> Chat
        4 -> Call register
        5 -> Tones
        6 -> Settings
        7 -> Call divert
        8 -> Games
        9 -> Calculator
        10 -> Reminders
        11 -> Clock
        12 -> Profiles
        13 -> SIM services
        """;

        int choice;
        do {
            System.out.println(menu);
            System.out.print("Select Option(or 0 to Exit): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    handlePhonebook(scanner);
                    break;
                }
                case 2 -> {
		    handleMessage(scanner);
		    break;
		}
                case 3 -> {
		    handleChat(scanner);
		    break;
		}
                case 4 -> {
		    handlecallRegister(scanner);
		    break;
		}
                case 5 -> {
		    handletones(scanner);
		    break;
		}
                case 6 -> {
		    handlesettings(scanner);
		    break;
		}
                case 7 -> System.out.println("Call divert");
                case 8 -> System.out.println("Games");
                case 9 -> System.out.println("Calculator");
                case 10 -> System.out.println("Reminders");
                case 11 -> {
		    handleclock(scanner);
		    break;
		}
                case 12 -> System.out.println("Profiles");
                case 13 -> System.out.println("SIM services");
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Enter a correct number");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void handlePhonebook(Scanner scanner) {
        String phonebookMenu = """
        Nokia 3310 Phonebook
        Press
        1 -> Search
        2 -> Service Nos.1
        3 -> Add name
        4 -> Erase
        5 -> Edit
        6 -> Assign tone
        7 -> Send b'card
        8 -> Options
        9 -> Speed dials
        10 -> Voice tags
        0 -> Go back to main menu
        """;

        int phonebookChoice;
        do {
            System.out.println(phonebookMenu);
            System.out.print("Enter your choice: ");
            phonebookChoice = scanner.nextInt();

            switch (phonebookChoice) {
                case 1 -> System.out.println("Search");
                case 2 -> System.out.println("Service Nos.1");
                case 3 -> System.out.println("Add name");
                case 4 -> System.out.println("Erase");
                case 5 -> System.out.println("Edit");
                case 6 -> System.out.println("Assign tone");
                case 7 -> System.out.println("Send b'card");
                case 8 -> {
                		String option = """
                		Nokia 3310 Option
               			Press
                		1 -> Type of view
                		2 -> Memory status
                		""";

                		System.out.println(option);
                		int uption = scanner.nextInt();

                	switch (uption) {
                    		case 1 -> System.out.println("Type of view");
                    		case 2 -> System.out.println("Memory status");
                    		default -> System.out.println("Enter a correct number");
                }
                break;
            }
                case 9 -> System.out.println("Speed dials");
                case 10 -> System.out.println("Voice tags");
                case 0 -> System.out.println("Going back to main menu...");
                default -> System.out.println("Enter a correct number");
            }
        } while (phonebookChoice != 0);
    }
	private static void handleMessage(Scanner scanner) {

	String messageMenu = """
	Nokia 3310 messages
	Press
	1 -> Write messages
	2 -> Inbox
	3 -> Out box
	4 -> Picture messages
	5 -> Template
	6 -> Smileys
	7 -> Message settings
	8 -> Info service
	9 -> Voice mailbox number
	10 -> Service command editor
 	""";
	int messageChoice;
	do {
	System.out.println(messageMenu);
	System.out.print("Enter your choice: ");
	messageChoice = scanner.nextInt();

	switch(messageChoice){
	case 1 -> System.out.println("Write messages");
	case 2 -> System.out.println("Inbox");
	case 3 -> System.out.println("Out box");
	case 4 -> System.out.println("Picture messages");
	case 5 -> System.out.println("Template");
	case 6 -> System.out.println("Smileys");
	case 7 -> {
			String messageSetting = """
			Nokia 3310 settings
			Press
			1 -> Set 1
			2 -> Common
 			""";

	System.out.println(messageSetting);
	int messageSet = scanner.nextInt();

	switch(messageSet){

	case 1 -> {
	String set = """
	Nokia 3310 settings
	Press
	1 -> Message center number
	2 -> Messages sent as
 	3 -> Messages validity
	""";

	System.out.println(set);
	int input = scanner.nextInt();

	switch(input){
	case 1 -> System.out.println("Message center number");
	case 2 -> System.out.println("Messages sent as");
	case 3 -> System.out.println("Messages validity");
	default -> System.out.println("Enter a correct number");
} break;
}
	case 2 -> {
	String common = """
	Nokia 3310 settings
	Press
	1 -> Delivery reports
	2 -> Reply via same centre
 	3 -> Character support
	""";

	System.out.println(common);
	int comon = scanner.nextInt();

	switch(comon){
	case 1 -> System.out.println("Delivery reports");
	case 2 -> System.out.println("Reply via same centre");
	case 3 -> System.out.println("Character support");
	default -> System.out.println("Enter a correct number");
}break;
}
	default -> System.out.println("Enter a correct number");
} break;
}
	case 8 -> System.out.println("Info service");
	case 9 -> System.out.println("Voice mailbox number");
	case 10 -> System.out.println("Service command editor");
	case 0 -> System.out.println("Going back to main menu...");
	default -> System.out.println("Enter a correct number");
	}	
} while (messageChoice != 0);
}
	private static void handleChat(Scanner scanner) {
    	String chatMenu = """
        Nokia 3310 settings
        Press
        1 -> Chat
        """;

    	int chatChoice;
    	do {
        System.out.println(chatMenu);
        System.out.print("Enter your choice: ");
        chatChoice = scanner.nextInt();

	switch (chatChoice) {
            case 1 -> System.out.println("chat");
            case 0 -> System.out.println("Going back to main menu...");
            default -> System.out.println("Enter a correct number");
        }
    } while (chatChoice != 0);
}

	private static void handlecallRegister(Scanner scanner) {

	String callRegister = """
	Nokia 3310 messages
	Press
	1 -> Missed calls
	2 -> Received calls
	3 -> Dailled numbers
	4 -> Erase recent call lists
	5 -> Show call duration
	6 -> Show call costs
	7 -> Call cost settings
	8 -> Prepaid credit
 	""";
	
	int callRegisterChoice;
	do {
	System.out.println(callRegister);
	System.out.print("Enter your choice: ");
	callRegisterChoice = scanner.nextInt();

	switch(callRegisterChoice){
	case 1 -> System.out.println("Missed calls");
	case 2 -> System.out.println("Received calls");
	case 3 -> System.out.println("Dailled numbers");
	case 4 -> System.out.println("Erase recent call lists");
	case 5 -> {
                String duration = """
                    Call duration options
                    Press
                    1 -> Last call duration
                    2 -> All calls duration
                    3 -> Received calls duration
                    4 -> Dialled calls duration
                    5 -> Clear timers
                    """;

                System.out.println(duration);
                int durationChoice = scanner.nextInt();

                switch (durationChoice) {
                    case 1 -> System.out.println("Last call duration");
                    case 2 -> System.out.println("All calls duration");
                    case 3 -> System.out.println("Received calls duration");
                    case 4 -> System.out.println("Dialled calls duration");
                    case 5 -> System.out.println("Clear timers");
                    default -> System.out.println("Enter a correct number");
  }break;
}	
	case 6 -> {
	String callCost = """
	Nokia 3310 messages
	Press
	1 -> Last call cost
	2 -> All call's cost
	3 -> Clear counters
 	""";

	System.out.println(callCost);
	int callCostChoice = scanner.nextInt();

	switch(callCostChoice){
	case 1 -> System.out.println("Last call cost");
	case 2 -> System.out.println("All call's cost");
	case 3 -> System.out.println("clear counter");
	default -> System.out.println("Enter a correct number");
} break;
}
	case 7 -> {
	String costSetting = """
	Nokia 3310 messages
	Press
	1 -> Call cost limit
	2 -> Show cost in
 	""";

	System.out.println(costSetting);
	int costSettingCoice = scanner.nextInt();

	switch(costSettingCoice){
	case 1 -> System.out.println("Call cost limit");
	case 2 -> System.out.println("Show cost in");
	default -> System.out.println("Enter a correct number");
} break;
}
	case 8 -> System.out.println("Prepaid credit");
	case 0 -> System.out.println("Going back to main menu...");
	default -> System.out.println("Enter a correct number");
	}
} while (callRegisterChoice != 0);
}
	private static void handletones(Scanner scanner) {
	String tone = """
	Nokia 3310 messages
	Press
	1 -> Ringing tone
	2 -> Ringing volume
	3 -> Incoming call alert
	4 -> Composer
	5 -> Message alert tone
	6 -> Keypad tones
	7 -> Warnning and game tones
	8 -> Vibrating alert
	9 -> Screen saver
 	""";
	
	int tonesChoice;
	do{
	System.out.println(tone);
	System.out.print("Enter your choice: ");
	tonesChoice = scanner.nextInt();

	switch(tonesChoice){
	case 1 -> System.out.println("Ringing tone");
	case 2 -> System.out.println("Ringing volume");
	case 3 -> System.out.println("Incoming call alert");
	case 4 -> System.out.println("Composer");
	case 5 -> System.out.println("Message alert tone");
	case 6 -> System.out.println("Keypad tones");
	case 7 -> System.out.println("Warnning and game tones");
	case 8 -> System.out.println("Vibrating alert");
	case 9 -> System.out.println("Screen saver");
	default -> System.out.println("Enter a correct number");
	}
} while (tonesChoice != 0);
}
	private static void handlesettings(Scanner scanner) {
	String settings = """
	Nokia 3310 messages
	Press
	1 -> Call settings
	2 -> Phone settings
	3 -> Security setting
	4 -> Restore factory settings
 	""";
	
	int settingChoice;
	do {
	System.out.println(settings);
	System.out.print("Enter your choice: ");
	settingChoice = scanner.nextInt();

	switch(settingChoice){
	case 1 -> {
	String callSettings = """
	Nokia 3310 messages
	Press
	1 -> Automatic redial
	2 -> Speed dialling
	3 -> Call waiting option
	4 -> Own number sending
	5 -> Phone line in use
	6 -> Automatic answer
 	""";

	System.out.println(callSettings);
	int input8 = scanner.nextInt();

	switch(input8){
	case 1 -> System.out.println("Automatic redial");
	case 2 -> System.out.println("Speed dialling");
	case 3 -> System.out.println("Call waiting option");
	case 4 -> System.out.println("Own number sending");
	case 5 -> System.out.println("Phone line in use");
	case 6 -> System.out.println("Automatic answer");
	default -> System.out.println("Enter a correct number");
	}break;
}
	case 2 -> {
	String phoneSettings = """
	Nokia 3310 messages
	Press
	1 -> Language
	2 -> Cell info display
	3 -> Welcome note
	4 -> Network selection
	5 -> light
	6 -> Confirm SIM service actions
 	""";

	System.out.println(phoneSettings);
	int input11 = scanner.nextInt();

	switch(input11){
	case 1 -> System.out.println("Language");
	case 2 -> System.out.println("Cell info display");
	case 3 -> System.out.println("Welcome note");
	case 4 -> System.out.println("Network selection");
	case 5 -> System.out.println("light");
	case 6 -> System.out.println("Confirm SIM service actions");
	default -> System.out.println("Enter a correct number");
  }break;
}
	case 3 -> {
	String securitySettings = """
	Nokia 3310 messages
	Press
	1 -> Pin code request
	2 -> Call barring service
	3 -> Fixed dialling service
	4 -> Closed user group
	5 -> Phone security
	6 -> Change accee codes
 	""";

	System.out.println(securitySettings);
	int input9 = scanner.nextInt();

	switch(input9){
	case 1 -> System.out.println("Pin code request");
	case 2 -> System.out.println("Call barring service");
	case 3 -> System.out.println("Fixed dialling service");
	case 4 -> System.out.println("Closed user group");
	case 5 -> System.out.println("Phone security");
	case 6 -> System.out.println("Change accee codes");
	default -> System.out.println("Enter a correct number");
	} break;
}
	case 4 -> System.out.println("Restore factory settings");
	default -> System.out.println("Enter a correct number");
	}
} while (settingChoice != 0);
}
	private static void handleclock(Scanner scanner) {
	String clock = """
	Nokia 3310 messages
	Press
	1 -> Alarm clock
	2 -> Clock settings
	3 -> Date setting
	4 -> Stopwatch
	5 -> Countdown timer
	6 -> Auto update of date and time
 	""";
	
	int clockCoice;
	do{
	System.out.println(clock);
	System.out.println("Clock");
	clockCoice = scanner.nextInt();

	switch(clockCoice){
	case 1 -> System.out.println("Alarm clock");
	case 2 -> System.out.println("Clock settings");
	case 3 -> System.out.println("Date setting");
	case 4 -> System.out.println("Stopwatch");
	case 5 -> System.out.println("Countdown timer");
	case 6 -> System.out.println("Auto update of date and time");
	default -> System.out.println("Enter a correct number");

}
} while (clockCoice != 0);
}
}