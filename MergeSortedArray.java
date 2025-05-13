import java.util.Arrays;

public class MergeSortedArray {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
          int[] arr = {1,2};
          swap(arr, 0, 1);
          System.out.println(Arrays.toString(arr)); 
    }
}
