import java.io.*;
import java.util.*;

public class L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Вводятся целые числа,
        // ввод завершается 0
        // Вывести количество чисел до
        // последнего минимального
        //
        // 30 20 25 10 11 12 13 10 11 0
        // 7
        //
        // 0
        // EMPTY
        int x = sc.nextInt();
        // min - минимальное число
        int min = x;
        int n = 0;
        // cnt - количество чисел до
        // последнего минимального
        int cnt = -1;
        while (x != 0) {
            if (x <= min) {
                min = x;
                cnt = n;
            }
            n++;
            x = sc.nextInt();
        }
        if (cnt >= 0) {
            System.out.println(cnt);
        } else {
            System.out.println("EMPTY");
        }
    }
}
