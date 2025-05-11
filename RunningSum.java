//Leetcode 1480
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.
// Example 1:
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = sum += +nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
