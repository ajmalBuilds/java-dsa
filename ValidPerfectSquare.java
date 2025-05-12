//leetcode 367
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        long first = 1, last = num / 2;
        while (first <= last) {
            long mid = first + (last - first) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ValidPerfectSquare vps = new ValidPerfectSquare();
        int num = 16;
        boolean result = vps.isPerfectSquare(num);
        System.out.println("Is " + num + " a perfect square? " + result);
    }
}
