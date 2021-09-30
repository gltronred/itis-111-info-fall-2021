import java.io.*;
import java.util.*;

public class L5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Вводятся вещественное y
        // Вводится неотрицательное целое n
        // Вводятся коэффициенты полинома
        // a_n a_{n-1} ... a_0
        // Вывести значение P(y) полинома
        // P(x) = a_n x^n + a_{n-1} x^{n-1} +
        // + ... + a_1 x + a_0
        // в точке y
        //
        // >   2.0 2
        // >   1.5 -3.0 5.0
        // <   5.0
        //
        // (1.5 x^2 - 3 x + 5 для x = 2.0)
        double y = sc.nextDouble();
        int n = sc.nextInt();
        double z = 0;
        for (int k=n; k>=0; k--) {
            double a = sc.nextDouble();
            double p = a;
            for (int i=0; i<k; i++) {
                p *= y;
            }
            z += p;
        }
        System.out.println(z);
    }
}
