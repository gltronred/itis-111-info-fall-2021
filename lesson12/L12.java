import java.util.*;

public class L12 {
    public static void printSystem(double[][] a, double[] b) {
        for (int i=0; i<a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println(Arrays.toString(b));
        System.out.println();
    }
    // Меняем местами строки i1 и i2 в матрице a и векторе b
    public static void swap(double[][] a, double[] b, int i1, int i2) {
        double[] s = a[i1];
        a[i1] = a[i2];
        a[i2] = s;
        double t = b[i1];
        b[i1] = b[i2];
        b[i2] = t;
    }
    // Вычитание строки i2 из строки i1
    // с умножением на коэффициент k
    public static void sub(double[][] a, double[] b, int i1, int i2, double k) {
        for (int j=0; j<a[i1].length; j++) {
            a[i1][j] -= k*a[i2][j];
        }
    }
    public static double[] solve(double[][] a, double[] b) {
        return b;
    }
    public static void main(String[] args) {
        double[][] a = {
            {1,2,3},
            {2,4,7},
            {4,9,5}
        };
        double[] b = {14,31,37};

        // printSystem(a,b);
        // swap(a,b,0,1);
        // printSystem(a,b);
        // swap(a,b,0,1);
        // printSystem(a,b);

        // sub(a,b,1,0,2.0);
        // printSystem(a,b);

        double[] x = solve(a,b);
        System.out.println(Arrays.toString(x));
    }
}
