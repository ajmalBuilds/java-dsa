import java.util.Arrays;

public class BinarySearch2DArraySorted {
    public static int[] binarySearchFlattendArray(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length ;
        int first = 0;
        int last = row * col - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            int midValue = matrix[mid / col][mid % col];

            if (midValue == target) {
                return new int[]{mid / col,mid % col};
            } else if (midValue < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println(Arrays.toString(binarySearchFlattendArray(matrix, 14)));
    }
}
