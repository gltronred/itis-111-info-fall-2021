import java.io.*;
import java.util.*;

public class L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Вводятся целые числа,
        // // ввод завершается 0
        // // Вывести количество чисел
        // // после первого максимального
        // // до последнего минимального
        // //
        // // 20 30 20 10 30 12 13 10 11 0
        // // 5
        // //
        // // 0
        // // EMPTY
        // //
        // // 1 0
        // // 0
        // //
        // // 10 5 1 20 30 0
        // // 0
        // int x = sc.nextInt();
        // // min - минимальное число
        // int min = x;
        // int max = x;
        // int n = 0;
        // // cnt - количество чисел после макс.
        // // до последнего минимального
        // int cnt = -1;
        // while (x != 0) {
        //     if (x <= min) {
        //         min = x;
        //         cnt = n;
        //     }
        //     n++;
        //     if (x > max) {
        //         max = x;
        //         n = 0;
        //         cnt = 0;
        //     }
        //     // // Отладочный вывод:
        //     // System.out.println(x + " min=" + min + " max=" + max + " n=" + n + " cnt=" + cnt);
        //     x = sc.nextInt();
        // }
        // if (cnt >= 0) {
        //     System.out.println(cnt);
        // } else {
        //     System.out.println("EMPTY");
        // }

        // Вводятся целые числа,
        // ввод завершается 0
        // Вывести число, второе по
        // абсолютному значению (строго меньше,
        // чем максимальные, но не меньше всех
        // остальных).
        // Абсолютное значение x - Math.abs(x)
        // Если второго значения нет, вывести NO
        //
        // 1 3 5 1 2 3 5 5 0
        // 3
        //
        // -1 -3 -5 -1 -2 -3 -5 -5 0
        // -3
        //
        // 0
        // NO
        //
        // 3 -3 3 0
        // NO
        //
        // -1 -2 -3 1 -2 -3 0
        // -2
        int x = sc.nextInt();
        boolean hasMax = false;
        int max = 0;
        boolean hasMax2 = false;
        int max2 = 0;
        while (x != 0) {
            if (Math.abs(x) > Math.abs(max) ||
                !hasMax) {
                if (hasMax) {
                    hasMax2 = true;
                    max2 = max;
                }
                hasMax = true;
                max = x;
            }
            if (Math.abs(max) > Math.abs(x) &&
                (Math.abs(x) >= Math.abs(max2) ||
                 !hasMax2)) {
                hasMax2 = true;
                max2 = x;
            }
            // System.out.println(x + " max=" + max + " max2=" + max2);
            x = sc.nextInt();
        }
        if (hasMax2) {
            System.out.println(max2);
        } else {
            System.out.println("NO");
        }
    }
}
