import java.io.*;
import java.util.*;

public class L9 {
    public static void main(String[] args) {
import java.util.*;


public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 2) {
                    for (int u = 0; u < n; u++) {
                        if (a[u][j] != 2) {
                            a[u][j] = 1;
                        }


                    }
                    for (int v = 0; v < n; v++) {
                        if (a[i][v] != 2) {
                            a[i][v] = 1;
                        }

                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
