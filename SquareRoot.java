public class SquareRoot {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int first = 1, last = x, ans = 0;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                ans = mid;
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a = 19;
        System.out.println(mySqrt(a));
    }
}
