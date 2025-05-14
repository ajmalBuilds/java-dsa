//leetcode problem 442
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
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
                list.add(nums[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        FindAllDuplicatesInAnArray obj = new FindAllDuplicatesInAnArray();
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(obj.findDuplicates(nums));
    }
    
}
