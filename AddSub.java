public class AddSub {
    public static void main(String[] args) {
        int[] input = {2, 4, 5, 1, 6};
        int[] output = subtractSum(input);
        System.out.println(arrays.toString(output));
    }

    public static int[] subtractSum(int[] input) {
        int sum = 0;
        int n = input.length;

        for (int i = 0; i < n; i++) {
            sum += input[i];
        }

        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            output[i] = sum - input[i];
        }

        return output;
    }
}