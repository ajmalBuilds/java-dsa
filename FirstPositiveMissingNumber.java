//leetcode 41
public class FirstPositiveMissingNumber {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
    public static void main(String[] args) {
        FirstPositiveMissingNumber obj = new FirstPositiveMissingNumber();
        int[] nums = { 3, 4, -1, 1 };
        System.out.println(obj.firstMissingPositive(nums));
    }

}
