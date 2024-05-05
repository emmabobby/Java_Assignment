import java.util.Scanner;

public class Nokia3310{
	public static void main(String[]args){
		String menu = """
		Hi, Welcome
		press
		1 -> Phone book
		2 -> Message
		2 -> Chat
		4 -> Call register

		5 -> Ring tone
		6 -> Settings
		7 -> Call divert
		8 -> Games
		9 -> Calculator
		10 -> Reminders
		11 -> Clock
		12 -> Profile
		13 -> Sim service
		""";

		
		String phoneBook = """
		==========
		PHONEBOOK
		==========
		1 -> Search
		2 -> Service Nos
		3 -> Add name
		4 -> Erase
		5 -> Edit
		6 -> Assign tone
		7 -> Send b'card
		8 -> Options
		9 -> Speed dials
		10 -> Voice message
		""";

		String search = """
		==================
		Under construction
		==================
		""";

		String options = """
		1 -> Type of view
		2 -> Memory status
		""";

 
		String message = """
		==========
		MESSAGE
		==========
		1 -> Write message
		2 -> Inbox
		3 -> Outbox
		4 -> Picture messages
		5 -> Templates
		6 -> Smileys
		7 -> Message settings
		8 -> Info service
		9 -> Voice mailbox number
		10 -> service command editor
		""";

		String messageSettings = """
		1 -> Set 1
		2 -> Common
		""";

		String Set = """
		1 -> Message center number
		2 -> Message sent as
		3 -> Message validity
		""";

		String common = """
		1 -> Delivery reports
		2 -> Reply via same centre
		3 -> Character support
		""";

		String chat = """
		========
		CHAT
		========
		1 -> lexsus
		""";

	
		String callRegister = """
		==============
		CALL REGISTER
		==============
		1 -> Missed call
		2 -> Received calls
		3 -> Dialled numbers
		4 -> Erase recent call list
		5 -> show call's duration
		6 -> Show call cost
		7 -> Call cost settings
		8 -> Prepaid credit
		""";

		String showCallDuration = """
		1 -> last call duration
		2 -> All call's duration
		3 -> Received call's duration
		4 -> Dialled call's duration
		5 -> Clear timers
		""";

		String showCallcost = """
		1 -> last call cost
		2 -> All call's cost
		4 -> Clear counters
		""";

		String callCostSettings = """
		1 -> Call cost limit
		2 -> Show cost in 
		""";

		String tones = """
		=========
		TONES
		=========
		1 -> Ringing tone
		2 -> Ringing volume
		3 -> incoming call alert
		4 -> Composer
		5 -> Message alert tone
		6 -> Keypad tones
		7 -> Warning and game tones
		8 -> Vibrating alert
		9 -> Screen saver
		""";

		String settings = """
		===========
		SETTINGS
		===========
		1 -> Call settings
		2 -> Phone settings
		3 -> Security settings
		4 -> Restore factory settings
		""";

		String callSettings = """
		1 -> Automatic redial
		2 -> Speed dialling
		3 -> Call waiting options
		4 -> Own numbers sending
		5 -> Phone line in use
		6 -> Automatic answer
		""";

		String phoneSettings = """
		1 -> language 
		2 -> Cell info display
		3 -> Welcome note
		4 -> Network selection
		5 -> Light
		6 -> Confirm SIM service actions
		""";

		String securitysettings = """
		1 -> PIN code request
		2 -> Call baring service
		3 -> Fixed dialling
		4 -> Closed user group
		5 -> Phone security
		6 -> Change access codes
		""";

		String callDivert = """
		============
		CALL DIVERT
		============
		1 -> Stupid calls
		""";

		String games = """
		=========
		GAMES
		=========
		1 -> soccer
		""";

		String calculator = """
		============
		CALCULATOR
		============
		1 -> Scientific
		""";

		String reminder = """
		===========
		REMINDER
		===========
		1 -> Alexa
		""";

		String clock = """
		============
		CLOCK
		============
		1 -> Alarm clock
		2 -> Clock settings
		3 -> Date settings 
		4 -> Stopwatch
		5 -> Countdown timer
		6 -> Auto update of date and time
		""";

		String profiles = """
		=============
		PROFILES
		=============
		1 -> Photos
		""";

		String simServices = """
		============
		SIM SERVICE
		============
		1 -> mtn
		""";
	
		System.out.println(menu);

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("press: ");
		int keyboardInput = userInput.nextInt();

		switch (keyboardInput){
			case 1 -> System.out.println(phoneBook);

			case 2 -> System.out.println(message);

			case 3 -> System.out.println(chat);

			case 4 -> System.out.println(callRegister);

			case 5 -> System.out.println(tones);

			case 6 -> System.out.println(settings);

			case 7 -> System.out.println(callDivert);

			case 8 -> System.out.println(games);

			case 9 -> System.out.println(calculator);

			case 10 -> System.out.println(reminder);

			case 11 -> System.out.println(clock);
			
			case 12 -> System.out.println(profiles);
			
			case 13 -> System.out.println(simServices);
		
			default -> System.out.println(menu);
		}

		System.out.print("press: ");
		int phonebookInput = userInput.nextInt();

		switch(phonebookInput){
			case 1 -> System.out.println(search);
			case 2 -> System.out.println(search);
			case 3 -> System.out.println(search);
			case 4 -> System.out.println(search);
			case 5 -> System.out.println(search);
			case 6 -> System.out.println(search);
			case 7 -> System.out.println(search);
			case 8 -> System.out.println(search);
			case 9 -> System.out.println(search);
			case 10 -> System.out.println(search);
			case 11 -> System.out.println(search);
			case 12 -> System.out.println(search);
			case 13 -> System.out.println(search);




			}

		

		
		

	}

}
