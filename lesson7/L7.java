import java.io.*;
import java.util.*;

public class L7 {
    public static void main(String args[]) {
        int n = 4;
        int[][] a = new int[n][];
        for (int i=0; i<n; i++) {
            a[i] = new int[2*i+1];
            for (int j=0; j<2*i+1; j++) {
                a[i][j] = i+j;
            }
        }

        for (int i=0; i<n; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

        int m = 3;
        int[][] b = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                b[i][j] = i*j;
            }
        }

        for (int i=0; i<n; i++) {
            System.out.println(Arrays.toString(b[i]));
        }
    }
}
