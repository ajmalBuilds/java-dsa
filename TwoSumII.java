//leetcode 167
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            if (numbers[first] + numbers[last] == target) {
                return new int[] { first + 1, last + 1 };
            } else if (numbers[first] + numbers[last] < target) {
                first++;
            } else {
                last--;
            }
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        int[] arr = {5,8,11,12,13,15};
        int target = 19;
        TwoSumII twoSum = new TwoSumII();
        int[] result = twoSum.twoSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}