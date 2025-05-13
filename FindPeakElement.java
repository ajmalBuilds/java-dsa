// LeetCode 162
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        FindPeakElement findPeakElement = new FindPeakElement();
        int[] nums = { 1, 2, 3, 1 };
        int result = findPeakElement.findPeakElement(nums);
        System.out.println(result);
    }
}