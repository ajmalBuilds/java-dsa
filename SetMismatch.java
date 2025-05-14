//leetcode 645
import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[] { nums[i], i + 1 };
            }
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        SetMismatch obj = new SetMismatch();
        int[] nums = { 1, 2, 2, 4 };
        int[] result = obj.findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }
}
