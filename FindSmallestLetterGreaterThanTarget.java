//leetcode 744
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return letters[low % letters.length];
    }
    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTarget finder = new FindSmallestLetterGreaterThanTarget();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char result = finder.nextGreatestLetter(letters, target);
        System.out.println("The smallest letter greater than " + target + " is: " + result);
    }
}
