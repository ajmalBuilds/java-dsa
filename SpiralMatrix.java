//LeetCode 54
// Given an m x n matrix, return all elements of the matrix in spiral order.

// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>(matrix.length * matrix[0].length);
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            if (top < bottom) {
                for (int j = right - 1; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }
            }
            if (left < right ) {
                for(int i = bottom - 1; i > top ; i--) {
                    list.add(matrix[i][left]);
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return list;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3}, {4,5,6,},{7,8,9}};
        System.out.println(spiralOrder(matrix).toString());
    }
}