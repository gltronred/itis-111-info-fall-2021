import java.io.*;
import java.util.*;

public class L6 {
    public static void main(String args[]) {
        // Объявление и инициализация (указание размера массива)
        int[] a = new int[6];
        double[] b = new double[2];
        // Заполнение элементов массива
        for (int i=0; i<6; i++) {
            a[i] = i;
        }
        // Для индексов вы можете использовать
        // произвольные арифметические выражения
        int k = 2;
        b[2*k-3] = 1.3;
        b[k-2] = 4.3;

        // Вывод массива
        for (int i=0; i<6; i++) {
            System.out.println(a[i]);
        }
        // Выдаёт ArrayIndexOutOfBoundsException:
        // System.out.println(a[6]);
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}
