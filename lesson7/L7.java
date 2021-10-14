import java.io.*;
import java.util.*;

public class L7 {
    public static void main(String args[]) {
        // int n = 4;
        // int[][] a = new int[n][];
        // for (int i=0; i<n; i++) {
        //     a[i] = new int[2*i+1];
        //     for (int j=0; j<2*i+1; j++) {
        //         a[i][j] = i+j;
        //     }
        // }

        // for (int i=0; i<n; i++) {
        //     System.out.println(Arrays.toString(a[i]));
        // }

        // int m = 3;
        // int[][] b = new int[n][m];
        // for (int i=0; i<n; i++) {
        //     for (int j=0; j<m; j++) {
        //         b[i][j] = i*j;
        //     }
        // }

        // for (int i=0; i<n; i++) {
        //     System.out.println(Arrays.toString(b[i]));
        // }

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int[][] a = new int[n][m];
        // for (int i=0; i<n; i++) {
        //     for (int j=0; j<m; j++) {
        //         a[i][j] = sc.nextInt();
        //     }
        // }

        // int s0 = 0;
        // for (int j=0; j<m; j++) {
        //     s0 += a[0][j];
        // }

        // boolean f = true;
        // for (int i=0; i<n; i++) {
        //     int sj = 0;
        //     for (int j=0; j<m; j++) {
        //         sj += a[i][j];
        //     }
        //     f &= (sj == s0);
        // }

        // if (f) {
        //     System.out.println("YES " + s0);
        // } else {
        //     System.out.println("NO");
        // }

        // Заполнить массив - на главной диагонали 1,
        // на побочной 2 (если элемент и тут, и там - 1)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] = Math.abs(i-j);
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
