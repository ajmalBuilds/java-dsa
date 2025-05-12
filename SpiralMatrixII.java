import java.util.Arrays;

public class SpiralMatrixII {
        public int[][] generateMatrix(int n) {
            int[][] ans = new int[n][n];
            int top = 0, bottom = n - 1, left = 0, right = n - 1, count = 1;
    
            while (top <= bottom && left <= right) {
                for(int j = left; j <= right; j++) {
                    ans[top][j] = count++;
                }
                for(int i = top + 1; i <= bottom; i++) {
                    ans[i][right] = count++;
                }
                if (top < bottom ) {
                    for(int j = right - 1; j >= left; j--) {
                        ans[bottom][j] = count++;
                    }
                }
                if (left < right ) {
                    for(int i = bottom -1; i >= top + 1; i--) {
                        ans[i][left] = count++;
                    }
                }
    
                top++;bottom--;left++;right--;
            }
            return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        SpiralMatrixII spiralMatrix = new SpiralMatrixII();
        System.out.println(Arrays.deepToString(spiralMatrix.generateMatrix(n)));
    }
}
