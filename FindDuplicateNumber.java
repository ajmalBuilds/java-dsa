public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
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
        for( i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindDuplicateNumber obj = new FindDuplicateNumber();
        int[] nums = { 1, 3, 5, 4, 2, 3 };
        System.out.println(obj.findDuplicate(nums));
    }
}
