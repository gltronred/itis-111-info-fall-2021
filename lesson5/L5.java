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
        //
        // Вычислите, используя схему Горнера:
        // P(x) = (...(a_n x + a_{n-1})x + ... +
        //      + a_1)x + a_0
        //
        // double y = sc.nextDouble();
        // int n = sc.nextInt();
        // double z = 0;
        // for (int k=n; k>=0; k--) {
        //     double a = sc.nextDouble();
        //     z *= y;
        //     z += a;
        // }
        // System.out.println(z);

        // Вводятся целые n и k
        // Вводятся n цифр числа в k-ичной
        // системе счисления, начиная со
        // старшей
        // Вывести это число в десятичной
        //
        // >    5 2
        // >    1 1 0 1 0
        // <    26
        //
        // >    2 3
        // >    2 1
        // <    7

        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // int z = 0;
        // for (int i=n-1; i>=0; i--) {
        //     int a = sc.nextInt();
        //     z *= k;
        //     z += a;
        // }
        // System.out.println(z);

        // \sum (-1)^k x^{2k} / (2k)!
        double x = sc.nextDouble();
        double s = 0;
        double p = 1;
        int k = 0;
        do {
            s += p;
            k++;
            p = -p;
            p *= x*x;
            p /= (2*k-1)*(2*k);
        } while (Math.abs(p) >= 1e-6);
        System.out.println(s);
        System.out.println(Math.cos(x));
        // 1e-6 = 10^(-6)
        // 1.23e4 = 1.23 * 10^4
    }
}
