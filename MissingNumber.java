//leetcode 268

public class MissingNumber {
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
    static int findMissingNumber(int[] arr) {
        int i = 0, missing = arr.length;
        while(i < arr.length) {
            int correct = arr[i];
            // if(correct >= arr.length) {
            //     correct--;
            // }
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for(i = 0; i < arr.length; i++) {
            if(arr[i] != i) {
                missing = i;
                break;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 3, 0, 1 };
        System.out.println(findMissingNumber(arr));
    }
}
