public class EvenNumberArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenArray = getEvenNumbers(inputArray);

        for (int num : evenArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] getEvenNumbers(int[] inputArray) {
       
        int evenCount = 0;
        for (int num : inputArray) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int num : inputArray) {
            if (num % 2 == 0) {
                evenArray[index] = num;
                index++;
            }
        }

        return evenArray;
    }
}