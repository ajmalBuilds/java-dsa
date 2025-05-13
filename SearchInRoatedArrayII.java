//letcode 81
public class SearchInRoatedArrayII {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchInRoatedArrayII searchInRoatedArrayII = new SearchInRoatedArrayII();
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 0;
        boolean result = searchInRoatedArrayII.search(nums, target);
        System.out.println(result); 
    }

}
