public class ArrayKata3 {
    public static int sumOf(int[] array) {
        if (array == null) {
             new IllegalArgumentException("Array must not be null");
        }
        
        int sum = 0; // Initialize sum to 0
        
        for (int num : array) {
            sum += num;       }
        
        return sum;
    }
}