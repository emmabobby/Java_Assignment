import java.util.Scanner;

public class Pizza {
		private static final int SAPASIZE = 4;
		private static final int SMALLMONEY = 6;
		private static final int BIGBOYS = 8;
		private static final int ODOGWU = 12;
		private static final int SAPASIZEPRICE = 2000;
		private static final int SMALLMONEYPRICE = 2400;
		private static final int BIGBOYSPRICE = 3000;
		private static final int ODOGWUPRICE = 4200;
 
		public static int odogwuBoxSize(int people){
			int result = 0;
			for(int index = 0; index < Integer.MAX_VALUE;index++){
				if(index * ODOGWU >= people){
					result = index;
				break;

				}
				
				}
			return result;

		}

		public static int leftOverSlice(int people){
			int sizeOfBox = odogwuBoxSize(people);
			int slice = sizeOfBox * ODOGWU;
                          int result =0;
			
			if (people < slice){
				result = slice - people;}
			 else{
				result = people - slice;}
				return result;
			}

		public static int odogwuBoxSizePrice(int people){
			int sizeOfBox = odogwuBoxSize(people);
			return  ODOGWUPRICE * sizeOfBox;

		}
		public static void display(int people,String pizzaType){
                        String change = pizzaType.toLowerCase();

			int sizeOfBox = odogwuBoxSize(people);
			int  chops    = leftOverSlice(people);
			int  money   = odogwuBoxSizePrice(people);
			
			
			switch(change){
				case "odogwu":
					System.out.printf("""
							Number of Boxes          : %d
							Number of LeftOverSlices : %d
							Price                    : %d
							""",sizeOfBox,chops,money);
					break;
				default : System.out.print("unavailable");

			}
		}

public static void main(String... args){
display(45,"odogwu");
}

public static int bigBoysBoxSize (int chops){
	int result = 0;
	for(int index = 0; index < Integer.Max_Value;index++){
		if(index * BIGBOYS >= chops){
			result = index;
		break;

		}

	}


public static int bigBoysLeftOverSlice(int chops){
	int sizeOfBox = bigBoysBoxSize(chops);
	int slice = sizeOfBox * BIGBOYS;
	int result = 0;

	if(chops < slice ){
		result = slice -chops;}
		else{
			result = chops -slice;}
			return result;

	}
	

	public static int bigBoysSizePrice(int chops){
		int sizeOfBox = bigboysBoxSize(chops);
		return BIGBOYSPRICE * sizeOfbOX;


	}


public static int smallMoneyBoxSize (int Persons){
	int result = 0;
	for(int index = 0; index < Integer.Max_Value;index++){
		if(index * SMALLMONEY >= persons){
			result = index;
		break;

		}

	}


public static int smallMoneyLeftOverSlice(int persons){
	int sizeOfBox = smallMoneyBoxSize(persons);
	int slice = sizeOfBox * SMALLMONEY;
	int result = 0;

	if(persons < slice ){
		result = slice -persons;}
		else{
			result = persons -slice;}
			return result;

	}
	

	public static int smallMoneySizePrice(int persons){
		int sizeOfBox = smallMoneyBoxSize(persons);
		return SMALLMONEYPRICE * SIZEoFbOX;


	}


public static int sapasizeBoxSize (int lexus){
	int result = 0;
	for(int index = 0; index < Integer.Max_Value;index++){
		if(index * SAPASIZE >= lexus){
			result = index;
		break;

		}

	}


public static int sapasizeLeftOverSlice(int lexus){
	int sizeOfBox = sapasizeBoxSize(lexus);
	int slice = sizeOfBox * SAPASIZE;
	int result = 0;

	if(lexus < slice ){
		result = slice -lexus;}
		else{
			result = lexus -slice;}
			return result;

	}
	

	public static int sapaSizeSizePrice(int lexus){
		int sizeOfBox = sapaSizeBoxSize(lexus);
		return SAPASIZEPRICE * SIZEoFbOX;


	}
		}

	

	}



		}

	

	}







		

}
} 
	


