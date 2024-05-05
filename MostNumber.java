import java.util.*;

        public class MostNumber {
    public static void main(String[] args) {
        int[] input = {1, 1, 2, 3, 4};
        int mostOccurringNumber = findMostOccurringNumber(input);
        System.out.println("Most occurring number: " + mostOccurringNumber);
    }

    public static int findMostOccurringNumber(int[] array) {
        int mostOccurringNumber = array[0];
        int maximumCount = 0;

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int currentCount = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == currentNumber) {
                    currentCount++;
                }
            }

            if (currentCount > maximumCount) {
                maximumCount = currentCount;
                mostOccurringNumber = currentNumber;
            }
        }

        return mostOccurringNumber;
    }
}