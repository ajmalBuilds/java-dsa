public class RecursionPBinarySearchUsingRecursioractice {
    static int binarySearch(int[] nums, int low, int high, int target) {
        if(low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if(nums[mid] == target){
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, high, target);
        } else {
            return binarySearch(nums, low, mid - 1, target);
        }
    }
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5,6,7,8,9};
       int target = 8;
       int result = binarySearch(nums, 0, nums.length - 1, target);
         if(result == -1) {
              System.out.println("Element not found");
         } else {
              System.out.println("Element found at index: " + result);
         }
    }
}

// This code implements a binary search algorithm using recursion.
// The binary search algorithm is a classic example of a divide-and-conquer approach.
// It works by dividing the search space in half with each recursive call, significantly reducing the number of comparisons needed to find the target element.
// It searches for a target element in a sorted array and returns its index if found, or -1 if not found.
// The main method initializes an array and a target value, then calls the binarySearch method.
// The binarySearch method checks if the low index is greater than the high index, indicating that the target is not present.
// It calculates the mid index and compares the value at that index with the target.
// If the value is equal to the target, it returns the mid index.
// If the value is less than the target, it recursively searches the right half of the array.
// If the value is greater than the target, it recursively searches the left half of the array.
// The main method prints the result of the search.
// The binary search algorithm has a time complexity of O(log n), making it efficient for large datasets.
// The code is a simple implementation of binary search using recursion.
