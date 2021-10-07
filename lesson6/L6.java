import java.io.*;
import java.util.*;

public class L6 {
    public static void main(String args[]) {
        // // Объявление и инициализация (указание размера массива)
        // int n = 3;
        // int[] a = new int[2*n];
        // double[] b = new double[2];
        // // Заполнение элементов массива
        // for (int i=0; i<2*n; i++) {
        //     a[i] = i;
        // }
        // // Для индексов вы можете использовать
        // // произвольные арифметические выражения
        // int k = 2;
        // b[2*k-3] = 1.3;
        // b[k-2] = 4.3;

        // // Вывод массива
        // for (int i=0; i<2*n; i++) {
        //     System.out.println(a[i]);
        // }
        // // Выдаёт ArrayIndexOutOfBoundsException:
        // // System.out.println(a[6]);
        // System.out.println(b[0]);
        // System.out.println(b[1]);
        // // Вывод массива в одну строку
        // // (но в фиксированном формате)
        // System.out.println(Arrays.toString(a));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = n-i;

            if (i % 2 == 0) {
                b[i] = i / 2 + 1;
            } else {
                // 1 -> n, 3 -> n-1, ...
                b[i] = n - i / 2;
            }

            c[i] = 1;
            for (int j=0; j<i; j++) {
                c[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
