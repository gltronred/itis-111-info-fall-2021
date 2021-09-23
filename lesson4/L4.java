import java.io.*;
import java.util.*;

public class L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Вводятся целые числа,
        // ввод завершается 0
        // Вывести количество чисел после
        // первого минимального
        //
        // 30 20 25 10 11 12 13 10 11 0
        // 5
        int x = sc.nextInt();
        // min - минимальное число
        int min = x;
        // cnt - количество чисел после
        // первого минимального
        //
        // в минимуме - уже первое число
        // после первого прохода цикла
        // к cnt добавится 1 и получим
        // корректное значение 0
        int cnt = -1;
        while (x != 0) {
            if (x < min) {
                min = x;
                cnt = 0;
            } else {
                cnt++;
            }
            x = sc.nextInt();
        }
        if (cnt >= 0) {
            System.out.println(cnt);
        } else {
            System.out.println("EMPTY");
        }
    }
}
