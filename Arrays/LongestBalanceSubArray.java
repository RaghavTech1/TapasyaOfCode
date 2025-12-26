package Arrays;
import java.util.*;

public class LongestBalanceSubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0;i <n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(longestBalancedSubarray(arr));
        input.close();
    }

    public static int longestBalancedSubarray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;

        // Prefix sum 0 at index -1
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            // Convert 0 to -1
            prefixSum += (arr[i] == 0) ? -1 : 1;

            // If prefix sum seen before, update max length
            if (map.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            } 
            // Store first occurrence
            else {
                map.put(prefixSum, i);
            }
        }
        return maxLength; 
    }
}
