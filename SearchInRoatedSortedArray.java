//leetcode 33
public class SearchInRoatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && nums[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && nums[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SearchInRoatedSortedArray searchInRoatedSortedArray = new SearchInRoatedSortedArray();
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = searchInRoatedSortedArray.search(nums, target);
        System.out.println(result);
    }
}
