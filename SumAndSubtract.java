public class ArraySumSubtract {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 6};
        
        int sum = 0;
     
        for(int num : arr) {
            sum += num;
        }
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sum - arr[i];
        }
        
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}