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
        // int n = sc.nextInt();
        // int s = 0;
        // // for (int i=1; i<=n; i++) {
        // //     if (n % i == 0) {
        // //         s += i;
        // //     }
        // // }
        // //
        // // Math.sqrt
        // // Math.pow
        // for (int i=1; i*i <= n; i++) {
        //     if (n % i == 0) {
        //         s += i;
        //         if (i*i < n) {
        //             s += n/i;
        //         }
        //     }
        // }
        // System.out.println(s);

        // Вводится целое положительное N
        // Вывести, сколько чисел от 1 до N имеет
        // сумму собственных делителей,
        // меньших этого числа
        //
        // 8
        // 7
        // (1 - 0, 2 - 1, 3 - 1, 4 - 3,
        // 5 - 1, 6 - 6, 7 - 1, 8 - 7)
        //
        // 16
        // 14
        // (9 - 4, 10 - 8, 11 - 1, 12 - 16,
        // 13 - 1, 14 - 10, 15 - 9, 16 - 15)
        //
        // int n = sc.nextInt();
        // // подсчёт количества чисел,
        // // удовлетворяющих условию
        // int count = 0;
        // for (int i=1; i<=n; i++) {
        //     // посчитать сумму собственных
        //     // делителей в s
        //     int s = 0;
        //     for (int j=1; j<i; j++) {
        //         if (i % j == 0) {
        //             s += j;
        //         }
        //     }
        //     // проверка условия:
        //     if (s < i) {
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // Вводятся числа, ввод заканчивается,
        // когда ввели 0
        // Вывести YES, если все введённые
        // числа (до 0) - совершенные,
        // NO - если не все
        //
        // (совершенное число - сумма его
        // собственных делителей равна самому
        // числу; например, 6 = 1 + 2 + 3)
        //
        boolean f = true;
        // первое число
        int a = sc.nextInt();
        // пока числа не закончились
        while (a != 0) {
            // проверить совершенство a
            int s = 0;
            for (int i=1; i<a; i++) {
                if (a % i == 0) {
                    s += i;
                }
            }
            // обновить f
            f = f && (s == a);
            // перейти к следующему числу
            a = sc.nextInt();
        }
        if (f) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
