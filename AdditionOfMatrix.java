import java.util.*;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.print("Enter size of Matrix A: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.print("Enter size of Matrix B: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        if (r1 == r2 && c1 == c2) {
            int[][] a = new int[r1][c1];
            int[][] b = new int[r2][c2];
            int[][] c = new int[r1][c1];

            System.out.println("Enter the elemets of the matrix A :");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elemets of the matrix B :");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("Resultant Matrix :");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Addition of given matrices not possible!");
        }

        sc.close();
    }
}
