//leetcode 153
public class FindMinimumInRotatedSortedArray {
public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] nums = { 3, 4, 5, 1, 2 };
        int result = findMinimumInRotatedSortedArray.findMin(nums);
        System.out.println(result);
    }

}
