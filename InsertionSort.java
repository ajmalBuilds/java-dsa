import java.util.Arrays;

public class InsertionSort {
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;   
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 1, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}