//rotating matrix 90 degrees to right
import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        System.out.print("Enter Row size of Matrix: ");
        row = sc.nextInt();
        System.out.print("Enter Col size of Matrix: ");
        col = sc.nextInt();

        int[][] a = new int[row][col];
        System.out.println("Enter the elemets of the matrix  :");
        for(int i = 0; i < row; i++ ) {
            for(int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The given matrix  :");
        for(int i = 0; i < row; i++ ) {
            for(int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        //transpose
        for(int i = 0; i < row; i++ ) {
            for(int j = 0; j < i; j++) {
                a[i][j] = a[i][j] + a[j][i] - (a[j][i] = a[i][j]);
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                int first = 0, last = col -1;
                while (first < last) {
                    a[i][first] = a[i][first] + a[i][last] - (a[i][last] = a[i][first]);
                    first++;
                    last--;
                }
            }
        }

        System.out.println("Matrix after rotating 90deg  :");
        for(int i = 0; i < row; i++ ) {
            for(int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
