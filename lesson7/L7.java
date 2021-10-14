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

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int[] s = new int[m];
        for (int j=0; j<m; j++) {
            s[j] = 0;
            for (int i=0; i<n; i++) {
                s[j] += a[i][j];
            }
        }

        boolean f = true;
        for (int j=1; j<m; j++) {
            f &= (s[j] == s[0]);
        }

        if (f) {
            System.out.println("YES " + s[0]);
        } else {
            System.out.println("NO");
        }
    }
}
