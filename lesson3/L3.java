import java.io.*;
import java.util.*;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for (int i=0; i<5; i++) {
        //     System.out.println(i);
        // }

        // Вводится целое неотрицательное N
        // Вывести N! = 1*2*...*N (по определению 0! = 1)
        //
        // int n = sc.nextInt();
        // int factorial = 1;
        // for (int i=1; i<=n; i++) {
        //     // i++;
        //     // то же, что
        //     // i = i + 1;
        //     factorial *= i;
        //     // factorial *= i;
        //     // то же, что
        //     // factorial = factorial * i;
        // }
        // System.out.println(factorial);

        // Вводится целое неотрицательное N
        // Вывести N!!
        // N!! =
        // = 1*3*5*...*N, если N - нечетное
        // = 2*4*6*...*N, если N - четное
        //
        // int n = sc.nextInt();
        // int factorial2 = 1;
        // for (int i=n; i>0; i-=2) {
        //     factorial2 *= i;
        // }
        // System.out.println(factorial2);

        // Вводится целое положительное N
        // Вывести сумму его делителей
        //
        // 8
        // 15
        // (потому что 1+2+4+8=15)
        //
        // 1
        // 1
        //
        // 4
        // 7
        // (потому что 1+2+4=7)
        //
        int n = sc.nextInt();
        int s = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        System.out.println(s);
    }
}
