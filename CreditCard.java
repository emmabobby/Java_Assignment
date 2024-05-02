import java.util.Scanner;

public class CreditCard{
	
	
	public static void main(String...args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter creditcard Number");
	Long creditCard = scanner.nextLong();
	String converter = "";
	String cardHolder = creditCard + converter;
	int length = cardHolder.length();

	int[] numberBox = new int[length];
	for(int row = 0; row <= cardHolder.length(); row++){
	numberBox[row] = Integer.parseInt(String.valueOf(cardHolder.charAt(row)));
	
	}
	if(numberBox[0] == 4){
	String visaCardType = "VisaCard";

	}
	if(numberBox[0] == 5){
	String masterCardType = "masterCard";	

	}
	if(numberBox[0] == 3 && numberBox[1] == 7){
	String americanExpressCardType = "american ExpressCard";


	}
	if(numberBox[0] == 6){
	String discoverCard  = "discover Card";

	}

	for(int row = cardHolder.length()-1; row >= 0 ; row--){
	if(row % 2 == 0){
	int box = numberBox[row] * 2;
	if(box < 10){
	int doubleOfSecondDigit = box + box;

	}else{
	  String newBox = String.valueOf(box);
	  for(int col = 0; col < newBox.length(); col++){
	  int nextBox = Integer.parseInt(String.valueOf(newBox.charAt(row)));
	  int doubleOfSecondDigit = nextBox + nextBox;
	}

	}

	}
	for(int index = 0; index < cardHolder.length(); index++){
	if(row % 2 != 0){
	int sumOfOddPlaces = sumOfOddPlaces + numberBox[index];
	}
	}
	int sum = sumOfOddPlaces + doubleOfSecondDigit;
	
	if (sum % 10 == 0){
	String validity = "Valid";
	}else validity = "Invalid";
	
	if(numberBox[0] == 4){
	System.out.println("***Credit card type: "  + visaCardType);

	}
	if(numberBox[0] == 5){
	System.out.println("***Credit card type: " + masterCardType);

	}
	if(numberBox[0] == 3 && numberBox[1] ==7){
	System.out.println("***Credit card type: " +  americanExpressCardType);

	}
	if(number[0] == 6){
	System.out.println("***Credit card type: " + discoverCard);

	}


}
}}
