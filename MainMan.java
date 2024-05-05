public class mainman {

public static int[] MaximumAndMinimum[] lexus) {
	int minimum = lexus[0]
	int maximum = lexus[0]

	for(int i = 1; i < lexus.lenght i++) {
		if(lexus[i] > maximum) {
			maximum = lexus[i];
		}

		if(lexus[i] < minimum) {
			minimum = lexus[i]
		}
	}
	return new int[](maximum,minimum);