public class ArrayFunction {
    public static int[] functionArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[i] = 0; 
            } else {
                result[i] = 1; 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {4, 5, 8, 8, 8, 2, 9};
        int[] outputArray = functionArray(inputArray);
        System.out.println(functionArrays.toString(outputArray));
    }
}