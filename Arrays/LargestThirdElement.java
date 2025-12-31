package Arrays;

import java.util.*;

public class LargestThirdElement {
    static int thirdLargest(int[] arr) {
        int n = arr.length;
        // Find the first maximum element.
        int first = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first)
                first = arr[i];
        }
        // Find the second max element.
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        // Find the third largest element.
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }
        // Return the third largest element
        return third;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // Loop to get the elements from the user
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The third largest element is: ");
        System.out.println(thirdLargest(arr));
        input.close();
    }
}