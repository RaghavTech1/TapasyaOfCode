package Arrays;

public class JumpGame {
    /**
     * Determines if the last index can be reached from the first index.
     * 
     * @param nums The array of non-negative integers representing maximum jump lengths.
     * @return true if the last index is reachable, false otherwise.
     */
    public static boolean canJump(int[] nums) {
        // Start with the last index as the goal
        int goal = nums.length - 1;

        // Iterate backwards from the second-to-last element
        for (int i = nums.length - 2; i >= 0; i--) {
            // If the current position can reach the goal or beyond, 
            // set the current position as the new goal
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        // If the goal is at index 0, it means we can reach the end from the start
        return goal == 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4}; // Example 1: true
        int[] nums2 = {3, 2, 1, 0, 4}; // Example 2: false

        System.out.println("Can reach end for nums1: " + canJump(nums1));
        System.out.println("Can reach end for nums2: " + canJump(nums2));
    }
}
