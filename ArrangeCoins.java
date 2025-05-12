//leetcode 441
public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int low = 1, high = n, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long current = (long) mid * (mid + 1) / 2;

            if (current == n) {
                return mid;
            } else if (current < n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrangeCoins ac = new ArrangeCoins();
        int n = 441;
        int result = ac.arrangeCoins(n);
        System.out.println("The number of complete rows is: " + result);
    }
}
