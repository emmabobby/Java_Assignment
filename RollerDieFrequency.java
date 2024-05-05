import java.security.secureRandom;

public class RollerDieFrequency {
	public static void main(String[] args) {

		SecureRandom randomNumbers = new secureRandom();
		int[] frequency = new int[7];

for(int roll = 1; roll<= 60_000_000; roll++) {
	++frequency[1 + randomNumbers.nextInt(6)];

}

System.out.printf("s%10s%n", "Face", "Frequency");

for (int face = 1; face < frequency.lenght; face++) {
	System.out.printf("%4d%10d%", face, frequency[face]);

}

}



}