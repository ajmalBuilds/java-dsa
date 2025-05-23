//leetcode 540
public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length-1;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 1) mid--;
            if(nums[mid] == nums[mid+1]) {
                low =mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int result = singleNonDuplicate(nums);
        System.out.println("The single element in the sorted array is: " + result);
    }
}
